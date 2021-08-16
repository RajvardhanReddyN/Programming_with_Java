import java.util.Scanner;

class GuessingGame

{
    public static void main(String[] args)
    
    {
        
        int R = (int)(Math.random()*10+1);
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a Positive Number below 10 : ");
        int N = S.nextInt();
        int Count=1;
        
        while(N!=R)
        {
            Count++;
            if(N<R)
            {
                System.out.println(N + " is smaller than the correct answer.");
            }
            
            if(N>R)
            {
                System.out.println( N + " is larger than the correct answer.");
            }
            
            System.out.println("Enter another Number : ");
            N=S.nextInt();
        }
        
        if(Count==1)
        {
            System.out.println("*****\n Congratulations !!!!");
        }
        
        else if(Count==3)
        {
            System.out.println("***\n Congratulations !!!!");
        }
        
         else if(Count==1)
        {
            System.out.println("*\n Congratulations !!!!");
        }
        
        else
        {
            System.out.println("You Win !!!!");
        }
        
    }
}