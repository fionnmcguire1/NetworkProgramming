import java.net.*;

public class spamchecker
{
	public static void main(String [] args)
	{
		try
		{
			String website = Sbl.Spamhaus.org;
			System.out.print("Enter an IP");
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String IP1 = bufferRead.readLine();
			
			System.out.print("Enter a second IP");
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String IP2 = bufferRead.readLine();
			
			String qurey1;
			query1 = IP1 + website;
			if(InetAddress.getByName(query1) == true)
				System.out.print(IP1 + "is spam");
			else
				System.out.print(IP1 + "appears legit");
			
			String qurey2;
			query1 = IP2 + website;
			if(InetAddress.getByName(query2) == true)
				System.out.print(IP2 + "is spam");
			else
				System.out.print(IP2 + "appears legit");
		
		}
		catch(Exemption e)
		{
			
			
		}
	}
}