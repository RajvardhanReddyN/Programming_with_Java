class Calling
{
  public static void vol(int l, int b, int h)
  {
    int v;
    v=l*b*h;
    System.out.println("Volume = " + v);
  }
  
  public static void main(String[] args)
  {
    Calling object = new Calling();
    object.vol(13, 14, 15);
  }
}
