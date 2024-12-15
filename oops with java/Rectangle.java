public class Rectangle {
    int a,b;
    void area(){
        int areaOf_rect=a*b;
        System.out.println("area of rectangle is :"+areaOf_rect);
    }
    void parameter(){
        int par=2*(a+b);
        System.out.println("parameter of rectangle :"+par);
    }
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.a=4;
        r.b=5;
        r.area();
        r.parameter();
    }
}