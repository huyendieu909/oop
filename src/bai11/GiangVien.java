package bai11;

public abstract class GiangVien {
    public String hoten;
    public String diachi;
    public int loaigv; // loại 1 nếu là giảng viên cơ hữu và 2 là thỉnh giảng
    public GiangVien(String hoten,String diachi,int loaigv){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaigv = loaigv;
    }
    public void nhapThongTin(String hoten,String diachi,int loaigv){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaigv = loaigv;
    }
    public abstract double tinhLuong();
    public String inThongTin(){
        String loaigiangvien;
        if (loaigv == 1) loaigiangvien = "Giang vien co huu";
        else loaigiangvien = "Giang vien thinh giang";
        return "Ho ten giang vien: \t"+hoten+"\nDia chi: \t"+diachi+"\nLoai giang vien: \t"+loaigiangvien+"\nLuong thang: \t";
    }
}
