class NewID
{
    String N;
    int A;
    
    NewID(String N, int a)
    {
        this.N=N;
        this.A=a;
        
    }
    
    void Display()
    {
        System.out.println("Name : " + N + "\t Age : " + A);
    }
    
    public static void main(String[] args)
    {
        ID P1 = new ID("AAA", 59);
        ID P2 = new ID("BBB", 35);
        ID P3 = new ID("CCC",58);
        P1.Display();
        P2.Display();
        P3.Display();
    }
    
    
}