package bai05;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();sc.nextLine();
        SinhVien[] sv = new SinhVien[n];
        for (int i=0;i<n;i++){
            sv[i] = new SinhVien();
            System.out.print("Nhap ten sinh vien: ");
            sv[i].setTen(sc.nextLine());
            System.out.print("Nhap tuoi sinh vien: ");
            sv[i].setTuoi(sc.nextInt());sc.nextLine();
            int gt;//biến giới tính
            do {
                System.out.print("Nhap gioi tinh sinh vien(nam 1 nu 0): ");
                gt = sc.nextInt();sc.nextLine();
                sv[i].setGioiTinh(gt);
            } while (gt != 0 && gt!=1);
            System.out.print("Nhap lop: ");
            sv[i].setLop(sc.nextLine());
            System.out.print("Nhap nganh: ");
            sv[i].setNganh(sc.nextLine());
            System.out.println("Nhap thong tin truong: ");
            Truong tt = new Truong();
            System.out.print("Nhap ten truong: ");
            tt.setTen(sc.nextLine());
            System.out.print("Nhap dia chi truong: ");
            tt.setDiaChi(sc.nextLine());
            System.out.print("Nhap ten hieu truong: ");
            tt.setHieuTruong(sc.nextLine());
            sv[i].setTruong(tt);
        }
        System.out.println("\nThong tin sinh vien: \n");
        //Truong hla = new Truong("Hoa Lu A", "Hoa Lu, Ninh Binh","Khong ro");
        //SinhVien sv = new SinhVien("Huyen Dieu",19,'M',"12A","IT",hla);
        for (int i=0;i<n;i++){
            System.out.print("\nThong tin sinh vien thu "+(i+1)+": \n"+sv[i]);
        }
    }
}
