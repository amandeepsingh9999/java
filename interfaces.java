interface Animal{
  void Function();
  // in this keyword call interface in which it is not allowed
  // write the body of any function 
  // they all are public and they cannot be changed.   
}

class A implements Animal{
  public void Function(){
    System.out.println("The function executed !");
  }
}

public class interfaces{
  public static void main(String[] args) {
   A obj = new A();
   obj.Function();
  }
}





