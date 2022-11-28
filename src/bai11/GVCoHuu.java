package bai11;
import java.text.*;
public class GVCoHuu extends GiangVien {
    private double luongcoban;
    private double hesoluong;
    private double thamnien; // số năm đã công tác, dùng tính phụ cấp
    public GVCoHuu(){
        
    }
    public GVCoHuu(String hoten,String diachi,int loaigv,double luongcoban,double hesoluong,double thamnien){
        super(hoten,diachi,loaigv);
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
    }
    public void setLuongCoBan(double luongcoban){
        this.luongcoban = luongcoban;
    }
    public void setHeSoLuong(double hesoluong){
        this.hesoluong = hesoluong;
    }
    public void setThamNien(double thamnien){
        this.thamnien = thamnien;
    }
    
    @Override
    public double tinhLuong(){
        double phucap = 0;
        if (thamnien >= 5) phucap = thamnien*luongcoban/100;
        return luongcoban*hesoluong+phucap;
    }
    @Override
    public String inThongTin(){//String hoten,String diachi,int loaigv){
        double phucap = 0;
        if (thamnien >= 5) phucap = thamnien*luongcoban/100;
        DecimalFormat df = new DecimalFormat("0.000");
        return super.inThongTin()+"Co huu"+"\nLuong thang: \t"+df.format(tinhLuong())+"\nLuong co ban: \t"+df.format(luongcoban)+"\nHe so luong: \t"+df.format(hesoluong)+"\nPhu cap: \t"+df.format(phucap);
    }
}
