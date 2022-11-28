package bai08;
public abstract class Shape {
    private String color;
    public Shape(){
        color = "";
    }
    public Shape(String color){
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    @Override
    public String toString(){
        return "Mau: \t";
    }
}
