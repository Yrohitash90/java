class a{
    void display(){
    System.out.println("class a");
}
}

class b extends a{
    void show(){
    System.out.println("class b");
}
}

class single{
    public static void main(String args[]){
        b obj = new b();
        obj.display();
        obj.show(); 

    }
}