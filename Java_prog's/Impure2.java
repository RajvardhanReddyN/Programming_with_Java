class Impure2
{
    static int a=5,b=2;
    
    public static void Diff()
    {
        Impure2 ob=new Impure2();
        D(ob);
        int d = a-b;
        System.out.println("Difference = " + d);
    }
    
    public static void D(Impure2 v)
    {
        v.a=100;
        v.b=20;
    }
} 