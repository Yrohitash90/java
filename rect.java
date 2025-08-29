<<<<<<< HEAD
class rect1{
    int width,length;
    void getData(int x,int y){
        width=x;
        length=y;
    }

    int areaRect(){
        return width*length;
    }
}

public class rect{
    public static void main(String[] args) {
        rect1 r1=new rect1();
        r1.getData(5, 4);
        int area=r1.areaRect();
        System.out.println("area of rectangle="+area);
    }
=======
class rect1{
    int width,length;
    void getData(int x,int y){
        width=x;
        length=y;
    }

    int areaRect(){
        return width*length;
    }
}

public class rect{
    public static void main(String[] args) {
        rect1 r1=new rect1();
        r1.getData(5, 4);
        int area=r1.areaRect();
        System.out.println("area of rectangle="+area);
    }
>>>>>>> 8932b02 (updated)
}