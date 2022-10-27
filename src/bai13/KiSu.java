package bai13;

import java.text.DecimalFormat;

public class KiSu extends NguoiLaoDong {
    public double luongcoban;
    public double hesoluong;
    public double thuong;
    public int songaycong;
    public KiSu(String hoten,String diachi,String loaild,double luongcoban,double hesoluong,double thuong,int songaycong){
        super(hoten,diachi,loaild);
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.thuong = thuong;
        this.songaycong = songaycong;
    }
    public void nhapThongTin(String hoten,String diachi,String loaild,double luongcoban,double hesoluong,double thuong,int songaycong){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaild = loaild;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.thuong = thuong;
        this.songaycong = songaycong;
    }
    
    @Override
    public double tinhLuong(){
        if (songaycong >= 25) thuong = 2000000.0;
        else if (songaycong > 15 && songaycong < 25) thuong = 1000000.0;
        else thuong = 500000.0;
        return luongcoban*hesoluong+thuong;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+"\nLoai lao dong: \t"+loaild+"\nLuong thang: \t"+df.format(tinhLuong());
    }
}
