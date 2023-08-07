class A{
  int age ;

  public void show(){
    System.out.println("In show");
  }

  static class B{
    public void get(){
      System.out.println("In get");
    }
  }

}

public class innerclass {
  public static void main(String[] args) {
    
    A obj = new A();
    obj.show();
    
    A.B obj1 = new A.B();
    obj1.get();


  }
}

