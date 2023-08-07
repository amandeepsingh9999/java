class first{
  int a;
  public int getA(){
    return a;
  }
  first (int a){
    this.a = a;
  }

public int returnone(){
    return 1 ;
  }

}
class second extends first{
  second(int c){
  super(c);
  System.out.println("I am a constructor ");
  }
}

public class superandthis {
  public static void main(String[] args) {
    first e = new first(65);
    second n = new second(4);
    System.out.println(e.getA());
 }
}
