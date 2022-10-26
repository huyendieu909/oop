
package bai09;

import bai08.*;

public class Triangle extends Shape {
    public int base;
    public int height;
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getBase(int base){
        return base;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(int height){
        return height;
    }
  
    @Override
    public double getArea(){
        return base*height/2;
    }
    @Override
    public String toString(){
        return "Dien tich tam giac la: "+getArea();
    }
}
