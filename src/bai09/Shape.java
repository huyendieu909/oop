package bai09;
import java.util.*;
public abstract class Shape {
    private String color;
    Scanner sc = new Scanner(System.in);
    public Shape(){
        color = "";
    }
//    public Shape(String color){
//        this.color = color;
//    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void nhapThongTin(){
        sop("Enter color: ");
        setColor(sc.nextLine());
    }
    public abstract double getArea();
    @Override
    public String toString(){
        return "Mau: \t"+color;
    }
    static void sop(String s){
        System.out.print(s);
    }
}
