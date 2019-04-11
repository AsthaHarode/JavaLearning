class Fibonacci{
public static void main(String args[])
{
	int first=0, second=1;
	System.out.print("Fibonacci series is: " + first+ " "+ second+" ");
	for(int i=1; i<10; i++)
	{
		int fib= first + second;
		System.out.print(fib + " ");
		first= second;
		second= fib;	
	}
	
}
}