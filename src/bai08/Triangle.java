package bai08;
public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(){
        
    }
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
  
    @Override
    public double getArea(){
        return base*height/2;
    }
    @Override
    public String toString(){
        return "\nLoai: hinh tam giac\n"+"Dien tich: "+getArea();
    }
}
