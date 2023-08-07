class general{
  int sqaure(int i){
    return i*i;
  }
}

class circle{
  general gen;
  double d = 3.1;
  double area(int r){
    gen = new general();
    int sqr = gen.sqaure(r);
    return d*sqr;
  }
}

public class aggregation {
  public static void main(String[] args) {
    circle c = new circle();
    double t = c.area(5);
    System.out.println("Area of the circle is : "+t);
  }
}
