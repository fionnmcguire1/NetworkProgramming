import java.net.*

public class myip
{
	public static void main (String[ ] args)
	{
		try
		{
			InetAddress = InetAddress.getByName(args[0]);
			System.out.print(address);
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}
}