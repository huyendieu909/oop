package bai09;
public class Test {
    public static void main(String[] args){
        Shape s[] = new Shape[2];
        Rectangle hcn = new Rectangle(3,4,"Do");
        Triangle htg = new Triangle(5,5,"Xanh");
        s[0] = hcn;
        s[1] = htg;
        for (int i = 0; i<2; i++){
            if (s[i] instanceof Rectangle) System.out.println("Hinh chu nhat: \n"+s[i]);
        }
    }
}
