public class constructor {
  private String name ;
  constractor(){
    System.out.println("constructor is called !");
    name = "Amandeep !";
  }
  public static void main(String[] args) {
    constructor obj = new constructor();
    System.out.println("My name is : "+obj.name);
    
  }
}
