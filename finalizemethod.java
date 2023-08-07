public class finalizemethod {
  public static void main(String[] args) {
   finalizemethod obj = new finalizemethod();
    System.out.println(obj.hashCode());
    obj = null ;
    System.gc();
    System.out.println("End Of The Garbage Collector !");
      
    
  }

  protected void finalize(){
    System.out.println("Finalize Methos Called !");
  }
}



