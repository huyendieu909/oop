package bai13;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguoi lao dong: ");
        int n = sc.nextInt();sc.nextLine();
        NguoiLaoDong[] cn = new NguoiLaoDong[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap thong tin nguoi lao dong thu "+(i+1)+": \n");
            int l;//biến dùng xác định loại người lao động
            do {
                System.out.print("Nhap loai nguoi lao dong (1: Ki Su, 2: Lao dong pho thong): ");
                l = sc.nextInt();sc.nextLine();
            } while (l!=1&&l!=2);
            switch (l){
                case 1:
                    cn[i] = new KiSu();
                    break;
                case 2: 
                    cn[i] = new LaoDongPhoThong();
                    break;
            }
            if (l == 1) {
                cn[i].setLoaiLd("ki su");
                KiSu ks = new KiSu();
                System.out.print("Nhap ho ten nguoi lao dong thu "+(i+1)+": ");
                ks.setHoTen(sc.nextLine());
                System.out.print("Nhap dia chi nguoi lao dong thu "+(i+1)+": ");
                ks.setDiaChi(sc.nextLine());
                System.out.print("Nhap luong co ban cua nguoi lao dong thu "+(i+1)+": ");
                ks.setLuongCoBan(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap he so luong cua nguoi lao dong thu "+(i+1)+": ");
                ks.setHeSoLuong(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap thuong cua nguoi lao dong thu "+(i+1)+": ");
                ks.setThuong(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap so ngay cong cua nguoi lao dong thu "+(i+1)+": ");
                ks.setSoNgayCong(sc.nextInt());sc.nextLine();
                cn[i] = ks;
            }
            else {
                cn[i].setLoaiLd("lao dong pho thong");
                LaoDongPhoThong ldpt = new LaoDongPhoThong();
                System.out.print("Nhap ho ten nguoi lao dong thu "+(i+1)+": ");
                ldpt.setHoTen(sc.nextLine());
                System.out.print("Nhap dia chi nguoi lao dong thu "+(i+1)+": ");
                ldpt.setDiaChi(sc.nextLine());
                System.out.print("Nhap so ngay cong cua nguoi lao dong thu "+(i+1)+": ");
                ldpt.setSoNgayCong(sc.nextInt());sc.nextLine();
                System.out.print("Nhap don gia cua nguoi lao dong thu "+(i+1)+": ");
                ldpt.setDonGia(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap thuong ngay cong cua nguoi lao dong thu "+(i+1)+": ");
                ldpt.setThuong(sc.nextDouble());sc.nextLine();
                cn[i] = ldpt;
            }
        }
        System.out.println("\nThong tin cac nguoi lao dong da nhap");
        for (int i=0;i<n;i++){
            System.out.print(cn[i].inThongTin());
            System.out.print("\n");
        }
        
//        LaoDongPhoThong nld = new LaoDongPhoThong("Vo Song","Ha Noi, Viet Nam","pho thong",20,500000f,1f);
//        KiSu ks = new KiSu("Quy Lem","Thu Dau Mot","ki su",5000000f,1.2,1f,20);
//        System.out.println("Thong tin nguoi lao dong: \n"+nld.inThongTin());
//        System.out.println("\nThong tin ki su: \n"+ks.inThongTin());
    }
}
