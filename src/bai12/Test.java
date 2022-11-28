package bai12;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();sc.nextLine();
        Nguoi[] sv = new Nguoi[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap thong tin sinh vien thu "+(i+1)+": \n");
            int l;//biến dùng xác định loại sinh viên 
            do {
                System.out.print("Nhap loai sinh vien (1: SVCDCQ, 2: SVCDN): ");
                l = sc.nextInt();sc.nextLine();
            } while (l!=1&&l!=2);
            switch (l){
                case 1:
                    sv[i] = new SVCDCQ();
                    break;
                case 2: 
                    sv[i] = new SVCDN();
                    break;
            }
            if (l == 1) {
                sv[i].setLoaiSv("Cao Dang Chinh Quy");
                SVCDCQ svcq = new SVCDCQ();
                System.out.print("Nhap ho ten sinh vien thu "+(i+1)+": ");
                svcq.setHoTen(sc.nextLine());
                System.out.print("Nhap ngay sinh sinh vien thu "+(i+1)+": ");
                svcq.setNgaySinh(sc.nextLine());
                System.out.print("Nhap dia chi sinh vien thu "+(i+1)+": ");
                svcq.setDiaChi(sc.nextLine());
                System.out.print("Nhap tong diem kiem tra cua sinh vien thu "+(i+1)+": ");
                svcq.setTdkt(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap so mon kiem tra cua sinh vien thu "+(i+1)+": ");
                svcq.setSmkt(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap diem ket thuc hoc phan cua sinh vien thu "+(i+1)+": ");
                svcq.setDtkthp(sc.nextDouble());sc.nextLine();
                sv[i] = svcq;
            }
            else {
                sv[i].setLoaiSv("Cao dang nghe");
                SVCDN svn = new SVCDN();
                System.out.print("Nhap ho ten sinh vien thu "+(i+1)+": ");
                svn.setHoTen(sc.nextLine());
                System.out.print("Nhap ngay sinh sinh vien thu "+(i+1)+": ");
                svn.setNgaySinh(sc.nextLine());
                System.out.print("Nhap dia chi sinh vien thu "+(i+1)+": ");
                svn.setDiaChi(sc.nextLine());
                System.out.print("Nhap tong diem kiem tra cua sinh vien thu "+(i+1)+": ");
                svn.setTdkt(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap so mon kiem tra cua sinh vien thu "+(i+1)+": ");
                svn.setSmkt(sc.nextDouble());sc.nextLine();
                sv[i] = svn;
            }
        }
        System.out.println("\n\tThong tin cac sinh vien da nhap");
        for (int i=0;i<n;i++){
            System.out.print("\nThong tin sinh vien thu "+(i+1)+": \n");
            System.out.print(sv[i].inThongTin());
            System.out.print("\n");
        }
        /*
        SVCDN sv1 = new SVCDN("Nguyen Ngoc Ngan","11/11/1991","Ha Noi","Cao dang nghe",7.2,8);
        SVCDCQ sv2 = new SVCDCQ("Duong Mich","22/11/1991","Ha Giang","Cao dang chinh quy",9.9,9,10);
        System.out.println("Thong tin sinh vien cao dang nghe: \n"+sv1.inThongTin());
        System.out.println("\nThong tin sinh vien cao dang chinh quy: \n"+sv2.inThongTin());
        */
}
}
