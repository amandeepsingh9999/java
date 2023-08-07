  public class overloading {
      static void foo(){
      System.out.println("Good Morning !");
    } 
      static void foo(int a){
      System.out.println("the given integer is : "+a);
    }
      static void foo(int a, int b){
      System.out.println("The sum of given integer is : ");
      return a+b;
    }
      public static void main(String[] args) {
        foo();
        foo(2);
        foo(2,1);
      }
  }

