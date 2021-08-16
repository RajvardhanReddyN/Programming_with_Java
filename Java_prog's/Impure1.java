class Impure1
{
    public static int main()
    {
        int x=-10;
        
        if(x>0)
        {
            return --x;
        }
        
        else
        {
            return ++x;
        }
    }
}