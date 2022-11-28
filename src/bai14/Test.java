package bai14;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cong nhan: ");
        int n = sc.nextInt();sc.nextLine();
        CongNhan[] cn = new CongNhan[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap thong tin cong nhan thu "+(i+1)+": \n");
            int l;//biến dùng xác định loại công nhân 
            do {
                System.out.print("Nhap loai cong nhan (1: CNKSP, 2: CNTCN): ");
                l = sc.nextInt();sc.nextLine();
            } while (l!=1&&l!=2);
            switch (l){
                case 1:
                    cn[i] = new CNKSP();
                    break;
                case 2: 
                    cn[i] = new CNTCN();
                    break;
            }
            if (l == 1) {
                cn[i].setLoaiCn("khoan san pham");
                CNKSP cnsp = new CNKSP();
                System.out.print("Nhap ho ten cong nhan thu "+(i+1)+": ");
                cnsp.setHoTen(sc.nextLine());
                System.out.print("Nhap dia chi cong nhan thu "+(i+1)+": ");
                cnsp.setDiaChi(sc.nextLine());
                System.out.print("Nhap ngay sinh cong nhan thu "+(i+1)+": ");
                cnsp.setNgaySinh(sc.nextLine());
                System.out.print("Nhap so san pham cua cong nhan thu "+(i+1)+": ");
                cnsp.setSoSanPham(sc.nextInt());sc.nextLine();
                System.out.print("Nhap don gia san pham cua cong nhan thu "+(i+1)+": ");
                cnsp.setDonGia(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap thuong san pham cua cong nhan thu "+(i+1)+": ");
                cnsp.setThuongSp(sc.nextDouble());sc.nextLine();
                cn[i] = cnsp;
            }
            else {
                cn[i].setLoaiCn("tinh cong nhat");
                CNTCN cncn = new CNTCN();
                System.out.print("Nhap ho ten cong nhan thu "+(i+1)+": ");
                cncn.setHoTen(sc.nextLine());
                System.out.print("Nhap dia chi cong nhan thu "+(i+1)+": ");
                cncn.setDiaChi(sc.nextLine());
                System.out.print("Nhap ngay sinh cong nhan thu "+(i+1)+": ");
                cncn.setNgaySinh(sc.nextLine());
                System.out.print("Nhap so ngay cong cua cong nhan thu "+(i+1)+": ");
                cncn.setSoNgayCong(sc.nextInt());sc.nextLine();
                System.out.print("Nhap luong co ban cong nhan thu "+(i+1)+": ");
                cncn.setLuongCoBan(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap he so luong cua cong nhan thu "+(i+1)+": ");
                cncn.setHeSoLuong(sc.nextDouble());sc.nextLine();
                System.out.print("Nhap thuong ngay cong cua cong nhan thu "+(i+1)+": ");
                cncn.setThuongCn(sc.nextDouble());sc.nextLine();
                cn[i] = cncn;
            }
        }
        System.out.println("\nThong tin cac cong nhan da nhap");
        for (int i=0;i<n;i++){
            System.out.print(cn[i].inThongTin());
            System.out.print("\n");
        }
//        CNKSP cn1 = new CNKSP("Vo Song","Ha Noi","11/11/1991","khoan san pham",1100,500000.0,1f);
//        CNTCN cn2 = new CNTCN("Doraemon","Nhat Bon","3/9/2112","tinh cong nhat",20,5000000f,1.25,1f);
//        System.out.println("Thong tin cong nhan khoan san pham: \n"+cn1.inThongTin());
//        System.out.println("\nThong tin cong nhan tinh cong nhat: \n"+cn2.inThongTin());
    }
}