package bai09;
public abstract class Shape {
    public String color;
    public Shape(){
        color = "";
    }
    public Shape(String color){
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public abstract double getArea();
    @Override
    public String toString(){
        return "Mau: \t"+color;
    }
}
