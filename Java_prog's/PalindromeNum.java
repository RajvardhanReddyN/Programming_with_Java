class PalindromeNum
{
    public static void main(int n)
    {
        int x=n;
        int D,R=0;
       
        
        while(n>0)
        {
            D=n%10;
            R=R*10+D;
            n=n/10;
            
        }
        
        if(R==x)
        {
            System.out.println("It is a Palindorme Number.");
        }
        
        else
        {
            System.out.println("It is not a Palindrome Number.");
        }
        
        
        
      
    }
}
