class floydalpha
{
    public static void main(String[] args)
    {
        char a='A';
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                System.out.print(Character.toUpperCase(a) + " ");
                else
                System.out.print(Character.toLowerCase(a) + " ");
                a++;    
            }    
                
            
            
        }
            
    }
}
