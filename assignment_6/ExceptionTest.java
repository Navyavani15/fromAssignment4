package assignment_6;

public class ExceptionTest {
	public static void main(String args[])
	{
		int result;
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
			result=a/b;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("no input recived");
		}
		catch(NumberFormatException aee)
		{
			System.out.println("only intergers are allowed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division with zero is not possible");
		}
		
		
	}
	

}
