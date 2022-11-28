package bai11;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so giang vien: ");
        int n = sc.nextInt();sc.nextLine();
        GiangVien[] gv = new GiangVien[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap thong tin giang vien thu "+(i+1)+": \n");
            int l;//biến dùng xác định loại công nhân 
            do {
                System.out.print("Nhap loai giang vien (1: Co huu, 2: Thinh giang): ");
                l = sc.nextInt();sc.nextLine();
            } while (l!=1&&l!=2);
            switch (l){
                case 1:
                    gv[i] = new GVCoHuu();
                    break;
                case 2: 
                    gv[i] = new GVThinhGiang();
                    break;
            }
            if (l == 1) {
                gv[i].setLoaiGv(1);
                GVCoHuu gvch = new GVCoHuu();
                System.out.print("Nhap ho ten giang vien thu "+(i+1)+": ");
                gvch.setHoTen(sc.nextLine());
                System.out.print("Nhap dia chi giang vien thu "+(i+1)+": ");
                gvch.setDiaChi(sc.nextLine());
                System.out.print("Nhap luong co ban cua giang vien thu "+(i+1)+": ");
                gvch.setLuongCoBan(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap he so luong cua giang vien thu "+(i+1)+": ");
                gvch.setHeSoLuong(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap tham nien cua giang vien thu "+(i+1)+": ");
                gvch.setThamNien(sc.nextDouble());sc.nextLine();
                gv[i] = gvch;
            }
            else {
                gv[i].setLoaiGv(2);
                GVThinhGiang gvtg = new GVThinhGiang();
                System.out.print("Nhap ho ten giang vien thu "+(i+1)+": ");
                gvtg.setHoTen(sc.nextLine());
                System.out.print("Nhap dia chi giang vien thu "+(i+1)+": ");
                gvtg.setDiaChi(sc.nextLine());
                System.out.print("Nhap so tiet day cua giang vien thu "+(i+1)+": ");
                gvtg.setSoTietDay(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap don gia giang vien thu "+(i+1)+": ");
                gvtg.setDonGia(sc.nextDouble());sc.nextLine();
                gv[i] = gvtg;
            }
        }
        System.out.println("\n\tThong tin cac giang vien da nhap");
        for (int i=0;i<n;i++){
            System.out.print("Thong tin giang vien thu "+(i+1)+": \n");
            System.out.print(gv[i].inThongTin());
            System.out.print("\n");
        }
//        GVCoHuu gv1 = new GVCoHuu("Nguyen Huu Thang", "Ha Nam", 1, 1234000.0, 1.23, 10.0);
//        GVThinhGiang gv2 = new GVThinhGiang("Pham Mai Khanh","Ha Noi",2,100,30000.0);
//        System.out.println("Thong tin giang vien co huu: \n"+gv1.inThongTin());
//        System.out.println("\nThong tin giang vien thinh giang: \n"+gv2.inThongTin());
    }
}
