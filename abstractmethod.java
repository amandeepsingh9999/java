abstract class animal {
  abstract void makesound();
}

class cat extends animal{
  public void makesound(){
    System.out.println("Meow");
  }
}

public class abstractmethod {
  public static void main(String[] args) {
    
  
  cat obj = new cat();
  obj.makesound();
}
}

