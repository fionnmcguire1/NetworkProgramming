//Part 3 thread prog to show thread join

class ThreadJoin extends Thread
{
	public void sum()
	{
		system.out.println("Thread starter"+ Thread.currentThread().getName());
	}
	public static void main (String[] args)
	{
		ThreadJoin thread1 = new ThreadJoin();
		ThreadJoin thread2 = new ThreadJoin();
		ThreadJoin thread3 = new ThreadJoin();
		thread1.start();
		thread1.join();
		system.out.println("thread-0-status" + thread1.isAlive());
		
		thread2.start();
		thread2.join();
		system.out.println("thread-1-status" + thread2.isAlive());
	}
}