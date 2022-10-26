package bai07;

public class Test {
    public static void main(String[] args){
        ResizableCircle c = new ResizableCircle(1.0);
        System.out.print("Chu vi hinh tron: \t"+c.getPerimeter());
        System.out.print("\nDien tich hinh tron: \t"+c.getArea());
        c.resize(20);
        System.out.print("Chu vi hinh tron sau khi resize: \t"+c.getPerimeter());
        System.out.print("\nDien tich hinh tron sau khi resize: \t"+c.getArea());
//        System.out.print("Chu vi hinh tron sau khi resize: \t"+c.resize(20).getPerimeter(1.0));
//        System.out.print("\nDien tich hinh tron sau khi resize: \t"+c.getArea(c.resize(20)));
    }
}
