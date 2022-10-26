package bai09;

import bai08.*;

public class Rectangle extends Shape{
    public int length;
    public int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(int length){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(int width){
        return width;
    }
  
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public String toString(){
        return "Dien tich hinh chu nhat la: "+getArea();
    }
}
