public class Circle {
    private double radius;
    public static double PI = 3.14;
    
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return PI*radius*radius;
    }
    public double computePerimeter(){
        return 2*PI*radius;
    }

}
