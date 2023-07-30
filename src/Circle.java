public class Circle implements Shape
{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public void display() {
        System.out.println("Circle Radius = " + radius);
    }
}
