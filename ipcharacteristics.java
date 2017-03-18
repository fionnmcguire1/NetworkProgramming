
import java.net.*;

public class ipcharacteristics
{
	public static void main(String [ ] args)
	{
		try
		{
			InetAddress address = InetAddress.getByName(args[0]);
			
			if(address.isAnyLocalAddress())
			System.out.print("its a local address");
			
			
			
			
			if(address.isLoopbackAddress())
			System.out.print("its a loopback address");
			
			if(address.isMulticastAddress())
			System.out.print("its a multicast address");

		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}