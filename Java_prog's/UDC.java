class UDC
{
    static int l,b,h,vol;
    
    public void value(UDC RD)
    {
        RD.l=4;
        RD.b=3;
        RD.h=2;
        
    }
    
    public void calc()
    {
        UDC RD = new UDC();
        value(RD);
        vol=l*b*h;
    }
    
    void display()
    {
        System.out.println("Volume of Cuboid : " + vol);
    }
    
    public static void main(String[] args)
    {
        UDC obj = new UDC();
        obj.calc();
        obj.display();
        
        
    }
}