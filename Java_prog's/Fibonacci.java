import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args)
    {
        int N,next=0,first=0,second=1;
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the required limit : ");
        N = obj.nextInt();
        
        if(N<0)
        {
            System.out.println("Fibonacci doesn't exist for negative limits.");
        }
        
        else
        {
            for(int i=0;i<N;i++)
            {
                next=first+second;
                first=second;
                second=next;
            }
            
            
        }
        
        System.out.println("Answer : " + next);
    }
}