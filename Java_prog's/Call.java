class Call
{
    public int Sum(int a, int b)
    {
       int s=a+b;
       return s;
    }
    
    public void main()
    {
        int m=25,n=50;
        int newsum = Sum(m,n);
        System.out.println("Sum =  " + newsum);
    }
}