package bai13;
public abstract class NguoiLaoDong {
    private String hoten;
    private String diachi;
    public String loaild; 
    public NguoiLaoDong(){
        
    }
    public NguoiLaoDong(String hoten,String diachi,String loaild){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaild = loaild;
    }
    public void setHoTen(String hoten){
        this.hoten = hoten;
    }
    public void setDiaChi(String diachi){
        this.diachi = diachi;
    }
    public void setLoaiLd(String loaild){
        this.loaild = loaild;
    }

    public abstract double tinhLuong();
    public String inThongTin(){
        return "Ho ten nguoi lao dong: \t"+hoten+"\nDia chi: \t"+diachi;
    }
}
