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
                    h[i] = new Triangle();
                    h[i].nhapThongTin();
                    break;
                case 2: 
                    h[i] = new Rectangle();
                    h[i].nhapThongTin();
                    break;
            }
        }
        
        System.out.print("\n\tThong tin doi tuong thuoc lop Rectangle\n");
        for (int i = 0; i<n; i++){
            if (h[i] instanceof Rectangle){
                System.out.print("Hinh thu "+(i+1)+"\n");
                System.out.println(h[i]);
            }
        }
    }
}
