package bai03;

public class Test {
    public static void main(String[] args) {
        DiaChi add = new DiaChi("Phong Phu", "Ninh Giang", "Hoa Lu", "Ninh Binh");
        NhanVien nv1 = new NhanVien("Quang Hai", add, "11/11/2002", 'M');
        System.out.println("Thong tin nhan vien: \n" + nv1);
    }
}