//part 2 lab6 netprog

class MathThread
{
	public static void main(String[]args)
	
	mathPow mp = new mathPow();
	mathSqrt ms = new mathSqrt();
	mathFloor mf = new mathFloor();
	
	mp.start();
	ms.start();
	mf.start();
}

class mathPow extends Thread
{
	public void run()
	{
		system.out.println("calculate power"+ math.pow(2,3));
	}
}

class mathSqrt extends Thread
{
	public void run()
	{
		system.out.println("calculate Sqrt"+ math.sqrt(900));
	}
}

class mathFloor extends Thread
{
	public void run()
	{
		system.out.println("calculate Floor"+ math.floor(9.4));
	}
}

class ThreadStatus extends Threads 
{
	public void run()
	{
		system.out.println("I am in Run function and thread status" + Thread.CurrentThread().isAlive());
	}
	public static void main (String[] args)
	{
		ThreadStatus t = new ThreadStatus();
		t.start();
		t.join();
		system.out.println("I am in main function and thread status"+ t.isAlive());
	}
}



