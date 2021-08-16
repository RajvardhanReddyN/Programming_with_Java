class Sum1
{
    public static void ser(int x, int n)
    {
        double Sum=0;
        double y=0;
        int fact=1;
        
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            y=Math.pow(x,i)/fact;
            Sum=Sum+y;
        }
        
        System.out.println("Sum =  " + Sum);
    }
}