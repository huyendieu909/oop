package bai13;

public abstract class NguoiLaoDong {
    public String hoten;
    public String diachi;
    public String loaild; 
    public NguoiLaoDong(String hoten,String diachi,String loaild){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaild = loaild;
    }
    public void nhapThongTin(String hoten,String diachi,String loaild){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaild = loaild;
    }
    public abstract double tinhLuong();
    public String inThongTin(){
        return "Ho ten nguoi lao dong: \t"+hoten+"\nDia chi: \t"+diachi;
    }
}
