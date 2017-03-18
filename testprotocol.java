
import java.net.*;

public class testprotocol
{
	public static void main(String [] args)
	{
		testprotocol ("Http://www.dit.ie");
		testprotocol ("Https://www.dit.ie");
		testprotocol ("Http://dit.ie");
	}
	
	public static void testprotocol(String url)
	{
		try
		{
			URL u = new URL(url);
			System.out.print(u.getProtocol() + " is supported");
		}
		catch(Exception e)
		{
			System.out.print(url + " is not supported");
		}
	
	}
}