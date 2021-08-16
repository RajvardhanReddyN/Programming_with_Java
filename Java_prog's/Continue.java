//Progarm to print the multiples of a given number

class Continue

{
    public static void main( int m, int n )
    {
        int i;
        for(i=0;i<=n;i++)
        {
            if(i%m!=0)
            {
                continue;
            }
        }
        
        System.out.println(i);
    }
}