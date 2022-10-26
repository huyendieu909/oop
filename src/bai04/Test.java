package bai04;

public class Test {
    public static void main(String[] args) {
        BenhVien bachmai = new BenhVien("Bach Mai", "Ha Noi", "Quy");
        BenhNhan bn = new BenhNhan("Anh nao day", 19, 'M', "Ngao da", "Giai doan cuoi", bachmai);
        System.out.println("Thong tin benh nhan: \n" + bn);
    }
}