
import java.util.Scanner;

class Grade

{
  public static void main(String[] args)
  
  {
     int G;
    
     Scanner S  = new Scanner(System.in);
     System.out.print("Enter the Marks to know the achieved Grade : ");
     G = S.nextInt();
     if(G>=89 && G<=100)
        {
          System.out.println("A+");
        }
    
     if(G>=77 && G<89)
        {
          System.out.println("A");
        }
    
     if(G>=66 && G<77)
        {
          System.out.println("B");
        }
     
     else if(G>=55 && G<66)
        {
          System.out.println("C");
        }
    
     else if(G>=44 && G<55)
        {
          System.out.println("D");
        }
     
     else if(G>=40 && G<44)
        {
          System.out.println("E");
        } 
     
     else
     {
        System.out.println("F");
     }
   
    }
  }


