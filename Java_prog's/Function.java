class Function
{
  double A;
  
  void Area(int l)
  {
    A=l*l;
    System.out.println("Area of the Square is = " + A);
    
  }
  
  void Area(double r)
  {
    A=3.14*r*r;
    System.out.println("Area of the Circle is = " + A);
    
  }
  
  void Area(int ba,double hei)
  {
    A=ba*hei;
    System.out.println("Area of the Parallelogram is = " + A);
    
  }
  
  
  
  
  
}
