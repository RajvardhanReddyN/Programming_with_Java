class CallByValue
{
    public static void main(String[] args)
    {
        int a = 100;
        System.out.println("Value before Call : " + a);
        Test(a);
        System.out.println("Value after Call : " + a);
        
    }
    
    public static void Test(int m)
    {
        System.out.println("Value at the Beginning : " + m);
        m=500;
        System.out.println("Value at the End : " + m);
    }
}
