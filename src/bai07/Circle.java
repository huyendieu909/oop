
package bai07;
import java.lang.Math;
public class Circle implements GeometricObject{
    public double radius = 1.0;
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(double radius){
        return radius;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
