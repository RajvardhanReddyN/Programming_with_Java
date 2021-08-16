class Sum3
{
    public static void main(int n,int x)
    
    {
        double Sum=0;
        
        for(int i=1,m=2;i<=n;i++,m+=3)
        {
            Sum = Sum + (double)x/m;
        }
        
        System.out.println("Sum = " + Sum);
    }
}