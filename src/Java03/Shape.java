package Java03;

abstract class Shape {
    abstract void RectangleArea(float lenght,float breadth);
    abstract void SquareArea(float side);
    abstract void CircleArea(float radius);
}
class Area extends Shape{
    double Area=0;
    @Override
    void RectangleArea(float lenght, float breadth) {
        Area=lenght*breadth;
        System.out.println("Area of rectangle: "+Area);
    }
    void SquareArea(float side){
        Area=side*side;
        System.out.println("Area of Square: "+Area);
    }
    void CircleArea(float radius){
        Area=3.14*(radius*radius);
        System.out.println("Area of Circle: "+Area);
    }
}
class Shapes{
    public static void main(String[] args) {
        Area a=new Area();
        a.RectangleArea(4.8f,7f);
        a.SquareArea(9f);
        a.CircleArea(6);
    }
}