class PosAndNeg
{
    public static void split(int a[])
    {
        int j=-1,k=-1;
        int N[]=new int[a.length];
        int P[]=new int[a.length];
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                N[++j]=a[i];
            }
            
            else
            {
                P[++k]=a[i];
            }
            
            
        }
        
        System.out.println("Array with Negative Values : ");
        
        if(j>=0)
            {
                for(int i=0;i<j;i++)
                {
                   System.out.print(N[i] + ""); 
                }
                
                System.out.println();
            }
            
            else
            {
                System.out.println("Not Available.");
            }
            
        System.out.println("Array with Positive Values : ");
        
        if(k>=0)
        {
            for(int i=0;i<k;i++)
            {
                System.out.println(P[i] + "" );
            }
            
            System.out.println();
        }
        
        else
        {
            System.out.println("Not Available.");
        }
        
       
         
    }
}