class CallByRef
{
    static int x=1,y=2,s;
    
    public void Sum()
    {
        System.out.println("Original Values " + x + "\t" + y);
        s=x+y;
        System.out.println("Original Sum = " + s);
        CallByRef CBR = new CallByRef();
        Test(CBR);
        System.out.println("Value After Call : " + x + "\t" + y);
        s=x+y;
        System.out.println("Sum After Call : " + s);
    }
    
    public void Test(CallByRef CBR)
    {
        CBR.x=100;
        CBR.y=200;
        int p=x*y;
        System.out.println("x*y= " + p);
    }
}
