interface interface1{
    int x=5;
    void fun1();
}


interface interface2 extends interface1{
    int x=6;
    void fun2();
}

class class1 implements interface2{
    int z=2;

    public void fun1(){
        System.out.println("fun1");
    }

    public void fun2(){
        System.out.println("fun2");
    }

}

class interfac{
    public static void main(String[] args){
        class1 obj=new class1();
        System.out.println(obj.z);
        obj.fun1();
        obj.fun2();
    }
}