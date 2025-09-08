abstract class bca{
    int i=5;
    void fun1(){
        System.out.println("fun1 class");
    }
}

class student extends bca{
    void fun2(){
        System.out.println("child claasss "+i);
    }
}

public class inheritence{
    public static void main(String[] args) {
        student obj=new student();
        obj.fun1();
        obj.fun2();
    }
}