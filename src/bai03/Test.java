package bai03;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        int n = sc.nextInt();sc.nextLine();
        NhanVien[] p = new NhanVien[n];
        for (int i=0;i<n;i++){
            p[i] = new NhanVien();
            System.out.print("\nNhap thong tin nhan vien thu "+(i+1)+": \n");
            System.out.print("Nhap ten: ");
            p[i].setName(sc.nextLine());
            System.out.print("Nhap ngay sinh: ");
            p[i].setDob(sc.nextLine());
            System.out.print("Nhap gioi tinh: ");
            p[i].setGender(sc.nextLine());
            System.out.print("Nhap dia chi: \n");
            System.out.print("Nhap thon: ");
            String thon = sc.nextLine();
            System.out.print("Nhap xa: ");
            String xa = sc.nextLine();
            System.out.print("Nhap huyen: ");
            String huyen = sc.nextLine();
            System.out.print("Nhap tinh: ");
            String tinh = sc.nextLine();
            DiaChi add = new DiaChi(thon,xa,huyen,tinh);
            p[i].setAddress(add);
        }
        System.out.print("\n\tThong tin nhan vien da nhap\n");
        for (int i=0;i<n;i++){
            System.out.print("Thong tin nhan vien thu "+(i+1)+": \n"+p[i]);
            System.out.println();
        }
//        DiaChi add = new DiaChi("Phong Phu", "Ninh Giang", "Hoa Lu", "Ninh Binh");
//        NhanVien nv1 = new NhanVien("Quang Hai", add, "11/11/2002", 'M');
//        System.out.println("Thong tin nhan vien: \n" + nv1);
    }
}