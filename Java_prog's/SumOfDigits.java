class SumOfDigits
{
    public static void main(int n)
    {
        int D=0;
        int Sum=0;
        
        while(n>0)
        {
            D=n%10;
            Sum=Sum+D;
            n=n/10;
            
        }
        
        System.out.println("Sum of the Digits = " + Sum);
    }
}