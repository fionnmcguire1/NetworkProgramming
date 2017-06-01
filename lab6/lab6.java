//Lecture 6 net prog

public class testThread 
{
	public static void main(string[]args)
	{
		printThread thread1, thread2, thread3, thread4;
		thread1 = new PrintThread ("thread 1");
		thread2 = new PrintThread ("thread 2");
		thread3 = new PrintThread ("thread 3");
		thread4 = new PrintThread ("thread 4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}

class PrintThread 
{
	public PrintThread ( String name)
	{
		super(name);
		system.out.println(getname() + "constructor");
	}
	public void run()
	{
		system.out.println(getname()+ "is running");
	}
}