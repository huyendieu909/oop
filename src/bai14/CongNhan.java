package bai14;
public abstract class CongNhan {
    public String hoten;
    public String diachi;
    public String ngaysinh;
    public String loaicn; 
    public CongNhan(String hoten,String diachi,String ngaysinh,String loaicn){
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;
    }
    public void nhapThongTin(String hoten,String diachi,String ngaysinh,String loaicn){
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;
    }
    public abstract double tinhLuong();
    public String inThongTin(){
        return "Ho ten nguoi cong nhan: \t"+hoten+"\nDia chi: \t"+diachi+"\nNgay sinh: \t"+ngaysinh;
    }
}
