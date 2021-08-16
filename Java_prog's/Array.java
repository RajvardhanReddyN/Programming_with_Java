import java.util.Scanner;

class Array
{
    public static void main(String[] args)
    {
        int height[] = new int[5];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Elements : ");
        
        for(int i=0;i<5;i++)
        {
            height[i]=obj.nextInt();
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(height[i]+ ",");
        }
        
        
    }
}