/*
Author Fionn Mcguire
Date start 4th nov
Date end 

Lab 8 

*/


import java.net.*;
import java.io.*;
/*server with 10 clients on port 5000*/
 
public class MultipleClientServer {
 
        public static void main(String[] args) {
                // TODO Auto-generated method stub
                ServerSocket server = null; // Creating ServerSocket
               
                try {
                        server = new ServerSocket(5000, 10); // Creating server socket, port 5k with 10 clients
                        System.out.println("Server: 5000");
                       
                }// end try
                catch (Exception e){
                        System.out.println(e);
                }
               
                // Indefinite loop
                while(true) {
                        try {
                                System.out.println("Client");
                                Socket client = server.accept(); // accepting client - Waits for client
                                // Creating a ConnectionThread object 't'
                                ConnectionThread t = new ConnectionThread(client); // Passes client as they wanna connect to server
                                // starting multi threading
                                t.start(); // Goes to ConnectionThread CLass below
                        }// end try
                       
                        catch (Exception e){
                                System.out.println(e);
                        }
                }// end while
 
 
        }
 
} // end class
 
class ConnectionThread extends Thread {
        private Socket Connection;
       
        public ConnectionThread(Socket con)
        {
                Connection = con; // Saving the client to this private socket ' Connection'
        }
        public void run()
        {
                        try 
                        {
                                // Creating the read/write objects to use on the Server
                                ObjectOutputStream out = new ObjectOutputStream(Connection.getOutputStream());
                                ObjectInputStream in = new ObjectInputStream(Connection.getInputStream());
                                String message = "Connected";
                               
                                // Communicating with the server
                                
                                
                                
                                out.writeObject(message);
                                message = (String) in.readObject(); // Reading server
                                System.out.println("Client Data " + message);
                                // Closing client  Connection
                                Connection.close();
                               
                        }
                        catch (Exception e)
                        {
                                System.out.println(e);
                        }
                }
       
}