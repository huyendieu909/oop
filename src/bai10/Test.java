package bai10;

public class Test {
    public static void main(String[] args){
        HocVien hv[] = new HocVien[2];
        HocVienDH dh1 = new HocVienDH("Duong De", "Viet Nam", 1, "Lap Trinh",20000,100);
        hv[0] = dh1;
        HocVienLT lt1 = new HocVienLT("Van Manh", "Binh Hoa", 2, "Do hoa",20000,200);
        hv[1] = lt1;
        System.out.println("Thong tin sinh vien do hoa: \n"+hv[0].inThongTin());
        System.out.println("Thong tin sinh vien lap trinh: \n"+hv[1].inThongTin());
    }
}
