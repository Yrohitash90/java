class process11 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("process1:"+i);
        }
    }
}

class process22 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("process1:"+i);
        }
    }
}


public class multiT2 {
   public static void main(String[] args) {
       process11 p1=new process11();
       process22 p2=new process22();
       p1.start();
       p2.start();
   } 
}
