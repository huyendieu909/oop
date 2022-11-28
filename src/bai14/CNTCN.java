package bai14;
import java.text.DecimalFormat;

public class CNTCN extends CongNhan {
    private int songaycong;
    private double luongcoban;
    private double hesoluong;
    private double thuong;
    public CNTCN(){
        
    }
    public CNTCN(String hoten,String diachi,String ngaysinh,String loaicn,int songaycong,double luongcoban,double hesoluong,double thuong){
        super(hoten,diachi,ngaysinh,loaicn);
        this.songaycong = songaycong;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.thuong = thuong;
    }
    
    public void setSoNgayCong(int songaycong){
        this.songaycong = songaycong;
    }

    public void setLuongCoBan(double luongcoban){
        this.luongcoban = luongcoban;
    }

    public void setHeSoLuong(double hesoluong){
        this.hesoluong = hesoluong;
    }
    
    public void setThuongCn(double thuong){
        this.thuong = thuong;
    }

    public void nhapThongTin(String hoten,String diachi,String ngaysinh,String loaicn,int songaycong,double luongcoban,double hesoluong,double thuong){
        /*this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;*/
        this.songaycong = songaycong;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.thuong = thuong;
    }
    
    @Override
    public double tinhLuong(){
        if (songaycong >= 20) thuong = 1.2*luongcoban;
        else thuong = 0.0;
        return hesoluong*luongcoban+thuong;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+"\nLoai cong nhan: "+"Tinh cong nhat"+"\nLuong thang: \t"+df.format(tinhLuong());
    }
}
