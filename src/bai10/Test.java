package bai10;
import java.util.*;
public class Test {
    public static void main(String[] args){
        int n;
        System.out.print("Nhap so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();sc.nextLine();
        HocVien hv[] = new HocVien[n];
        for (int i = 0;i < n;i++){
            System.out.print("Nhap loai hoc vien (do hoa thi nhap 1, lap trinh thi nhap 2): ");
            // đồ họa thì nhập 1, lập trình thì nhập 2
            int x = sc.nextInt();sc.nextLine();
            //tùy vào loại sinh viên mà khởi tạo cho các trường họp
            switch (x){
                case 1:
                    hv[i] = new HocVienDH();
                    break;
                case 2: 
                    hv[i] = new HocVienLT();
                    break;
            }
            //nhập thông tin sinh viên bắt đầu từ đây
            System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
            System.out.print("\tNhap ho ten: ");
            hv[i].setHoTen(sc.nextLine());
            System.out.print("\tNhap dia chi: ");
            hv[i].setDiaChi(sc.nextLine());
            System.out.print("\tLoai uu tien(1 hay 2): ");
            hv[i].setLoaiUt(sc.nextInt());sc.nextLine();
            System.out.print("\tNhap chuong trinh: ");
            hv[i].setLoaiCt(sc.nextLine());
            if (x == 1){
                hv[i] = (HocVienDH) hv[i];
                System.out.print("\tNhap so buoi da hoc: ");
                hv[i].setSoBuoiHoc(sc.nextInt());sc.nextLine();
                System.out.print("\tNhap don gia: ");
                hv[i].setDonGia(sc.nextInt());sc.nextLine();
            }
            if (x == 2){
                hv[i] = (HocVienLT) hv[i];
                System.out.print("\tNhap so buoi da hoc: ");
                hv[i].setSoBuoiHoc(sc.nextInt());sc.nextLine();
                System.out.print("\tNhap don gia: ");
                hv[i].setDonGia(sc.nextInt());sc.nextLine();
            }
        }
        //in thông tin sinh viên ra màn hình
        System.out.print("\n\n Thong tin sinh vien da nhap: \n");
        for (int i = 0;i<n;i++){
            System.out.print(hv[i].inThongTin());
        }
        /*HocVienDH dh1 = new HocVienDH("Duong De", "Viet Nam", 1, "Lap Trinh",20000,100);
        hv[0] = dh1;
        HocVienLT lt1 = new HocVienLT("Van Manh", "Binh Hoa", 2, "Do hoa",20000,200);
        hv[1] = lt1;*/
        //System.out.println("Thong tin sinh vien do hoa: \n"+hv[0].inThongTin());
        //System.out.println("Thong tin sinh vien lap trinh: \n"+hv[1].inThongTin());
    }
}
