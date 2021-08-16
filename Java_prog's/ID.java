class ID
{
    String Name;
    int Age;
    
    ID(String N, int a)
    {
        this.Name=N;
        this.Age=a;
        
    }
    
    void Display()
    {
        System.out.println("Name : " + Name + "\t Age : " + Age);
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
