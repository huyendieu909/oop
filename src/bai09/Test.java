package bai09;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hinh: ");
        int n = sc.nextInt();sc.nextLine();
        Shape[] h = new Shape[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap thong tin hinh "+(i+1)+": \n");      
            int type;//biến để xác định hình i là tam giác hay tứ giác
            do {
                System.out.print("Nhap loai hinh (1: tam giac, 2: tu giac): ");
                type = sc.nextInt();sc.nextLine();
            } while (type != 1 && type != 2);
            switch (type){
                case 1:                  
                    System.out.print("Nhap canh day hinh tam giac: ");
                    double day = sc.nextDouble();sc.nextLine();
                    System.out.print("Nhap chieu cao hinh tam giac: ");
                    double cao = sc.nextDouble();sc.nextLine();
                    h[i] = new Triangle(day,cao);
                    System.out.print("Nhap mau sac: ");
                    h[i].setColor(sc.nextLine()); 
                    break;
                case 2: 
                                       
                    System.out.print("Nhap chieu dai hinh chu nhat: ");
                    double dai = sc.nextDouble();sc.nextLine();
                    System.out.print("Nhap chieu rong hinh chu nhat: ");
                    double rong = sc.nextDouble();sc.nextLine();
                    h[i] = new Rectangle(dai,rong);
                    System.out.print("Nhap mau sac: ");
                    String clr = sc.nextLine(); 
                    h[i].setColor(clr);
                    break;
            }
        }
        System.out.print("\n\tThong tin doi tuong thuoc lop Rectangle\n");
        for (int i = 0; i<n; i++){
            if (h[i] instanceof Rectangle){
                System.out.print("Hinh thu "+(i+1)+"\n");
                System.out.print("Mau sac: "+h[i].getColor());
                System.out.println(h[i]);
            }
        }
    }
}
