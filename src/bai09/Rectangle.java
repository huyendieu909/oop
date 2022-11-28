package bai09;
public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(){
        
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
  
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public String toString(){
        return "\nLoai: hinh chu nhat\n"+"Dien tich: "+getArea();
    }
}