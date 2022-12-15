package bai14;
public abstract class CongNhan {
    private String hoten;
    private String diachi;
    private String ngaysinh;
    private String loaicn; //
    public CongNhan(){
        
    }
    public CongNhan(String hoten,String diachi,String ngaysinh,String loaicn){
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;
    }
    public void setHoTen(String hoten){
        this.hoten = hoten;
    }
    public void setDiaChi(String diachi){
        this.diachi = diachi;
    }
    public void setLoaiCn(String loaicn){
        this.loaicn = loaicn;
    }
    public void setNgaySinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public void nhapThongTin(String hoten,String diachi,String ngaysinh,String loaicn){
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;
    }
//    public abstract void setSoNgayCong(int songaycong);
//    public abstract void setLuongCoBan(double luongcoban);
//    public abstract void setHeSoLuong(double hesoluong);
//    public abstract void setThuongCn(double thuong);
//    public abstract void setSoSanPham(int sosanpham);
//    public abstract void setDonGia(double dongia);
//    public abstract void setThuongSp(double thuong);
    public abstract double tinhLuong();
    public String inThongTin(){
        return "Ho ten nguoi cong nhan: \t"+hoten+"\nDia chi: \t"+diachi+"\nNgay sinh: \t"+ngaysinh;
    }
}
