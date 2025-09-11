package MultiThreading_method_class;

class process1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("P1:"+i);
        }
    }
}

class process2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("P2:"+i);
        }
    }
}

public class mtm {
    public static void main(String[] args) {
        process1 p1 = new process1();
        process2 p2 = new process2();
        p1.start();
        p2.start();
    }
}
