import java.net.*;

public class iptest
{
	public static void main (String[]args)
	{
		try
		{
			InetAddress address = InetAddress.getByName(args [0]);
			byte [] array=address.getAddress();
			if(array.length ==4)
				System.out.print("ip4 address");

			else if (array.length==16)
				System.out.print("ip6 address");
		}

		catch (Exception e)
		{
			System.out.print(e);
		}
	}
}