public class MaxNumber{
    public static void main(String args[])
    {
        int temp;
        int a[]= {50,20,10,60,40,30};
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j< a.length; j++)
            {
                if(a[i]> a[j])
		{
                    temp=a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println("Max Number is " + a[a.length-1]);
    }
}
