class a{
  public int harry(){
    return 4;
  }
  public void meth2() {
    System.out.println("I am a method");
  }
}

class b extends a{
  @Override
  public void meth2(){
    System.out.println("I am a method of class b");
  }
  //@Overrider
  public void meth3(){
    System.out.println("I am a method of class b");
  }
}


public class overriding {
  public static void main(String[] args) {
    a c = new a();
    c.meth2();

    b obj = new b();
    obj.meth2();
  }
  
}
