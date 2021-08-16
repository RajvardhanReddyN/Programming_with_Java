class AmstrongNum
{
    public static void main(int n)
    {
        int x=n;
        int D=0;
        int Sum=0;
        
        while(n>0)
        {
            D=n%10;
            Sum=Sum+D*D*D;
            n=n/10;
            
        }
        
        if(x==Sum)
        {
            System.out.println("It is an Amstrong Number.");
        }
        
        else
        {
            System.out.println("It is not an Amstrong Number.");
        }
        
        
        
      
    }
}
