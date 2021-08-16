class Sum5
{
    public static void ser(int n)
    {
        double Sum=0;
        int S=0;
        int D=1;
        
        for(int i=1;i<=n;i++)
        
        {
          S=S+i;
          D=D*i;
          Sum=Sum+(double)S/D;
        }
        
        System.out.println("Sum = " + Sum);
    }
}