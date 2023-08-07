abstract class language {

  public void display(){
    System.out.println("This is the example for abstract class !");
  }
} 

public class abstractclass extends language {
  public static void main(String[] args) {
    abstractclass obj = new abstractclass();
    obj.display();
  }
  
}
