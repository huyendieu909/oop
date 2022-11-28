package bai11;

public abstract class GiangVien {
    private String hoten;
    private String diachi;
    private int loaigv; // loại 1 nếu là giảng viên cơ hữu và 2 là thỉnh giảng
    public GiangVien(){
        
    }
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
    public void setHoTen(String hoten){
        this.hoten = hoten;
    }
    public void setDiaChi(String diachi){
        this.diachi = diachi;
    }
    public void setLoaiGv(int loaigv){
        this.loaigv = loaigv;
    }
    
    public abstract double tinhLuong();
    public String inThongTin(){
        String loaigiangvien;
        if (loaigv == 1) loaigiangvien = "Giang vien co huu";
        else loaigiangvien = "Giang vien thinh giang";
        return "Ho ten giang vien: \t"+hoten+"\nDia chi: \t"+diachi+"\nLoai giang vien: \t";
    }
}
