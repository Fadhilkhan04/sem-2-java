package threat;


class mythread1 implements Runnable{
  
  public void run() {
    int i=0;
    while (i<1000){
      System.out.println("Iam thread 1 not threat");
      i++;
    }
  }
}
class mythread2 implements Runnable{
  public void run() {
    int i=0;
    while (i<1000){
      System.out.println("Iam thread 2 not threat");
      i++;
    }
  }
}



public class Main {
  public static void main(String args[]) {
    
    mythread1 R1 = new mythread1( );
    Thread t1 =  new Thread(R1);
    
    mythread2 R2 = new mythread2( );
    Thread t2 = new Thread(R2);

    t1.start();
    t2.start();
  }
}