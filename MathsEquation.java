import maths.java;
public class MathsEquation
{
	
	public static void main(String[] args)
	{
		thread1 = new MotherThread(20,40,80);
	
	}	
}	
class MotherThread
{
		public MotherThread(double var1, double var2, double var3)
		{
			super(var1,var2,var3);
			/*var1 = 80;
			var2 = 20;
			var3 = 40;*/
			
			System.out.println("p = sin(%d) + cos(%d) + tan(%d)",var1,var2,var3);
		}
		
		public void run()
		{
			class Sin
			{
				public Sin(double var1)
				{
					sin_answer = Math.sin(Math.toRadians(var1));
					return sin_answer;
				}
			}
			class Cos
			{
				public Cos(double var2)
				{
					cos_answer = Math.cos(Math.toRadians(var2));
					return cos_answer;
				}
			}
			class Tan
			{
				public Tan(double var3)
				{
					tan_answer = Math.tan(Math.toRadians(var3));
					return tan_answer;
				}
			}
			
			p = sin_answer+cos_answer+tan_answer;
			System.Out.println(p);
			
		}
		
		
}
	
	
