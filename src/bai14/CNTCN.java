package bai14;
import java.text.DecimalFormat;

public class CNTCN extends CongNhan {
    public int songaycong;
    public double luongcoban;
    public double hesoluong;
    public double thuong;
    public CNTCN(String hoten,String diachi,String ngaysinh,String loaicn,int songaycong,double luongcoban,double hesoluong,double thuong){
        super(hoten,diachi,ngaysinh,loaicn);
        this.songaycong = songaycong;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.thuong = thuong;
    }

    public void nhapThongTin(String hoten,String diachi,String ngaysinh,String loaicn,int songaycong,double luongcoban,double hesoluong,double thuong){
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;
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
        return super.inThongTin()+"\nLoai cong nhan: "+loaicn+"\nLuong thang: \t"+df.format(tinhLuong());
    }
}
