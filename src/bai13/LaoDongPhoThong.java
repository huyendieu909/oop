package bai13;

import java.text.DecimalFormat;

public class LaoDongPhoThong extends NguoiLaoDong {
    public int songaycong;
    public double dongia;
    public double thuong;
    public LaoDongPhoThong(String hoten,String diachi,String loaild,int songaycong,double dongia,double thuong){
        super(hoten,diachi,loaild);
        this.songaycong = songaycong;
        this.dongia = dongia;
        this.thuong = thuong;
    }

    public void nhapThongTin(String hoten,String diachi,String loaild,int songaycong,double dongia,double thuong){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaild = loaild;
        this.songaycong = songaycong;
        this.dongia = dongia;
        this.thuong = thuong;
    }
    
    @Override
    public double tinhLuong(){
        if (songaycong >= 25) thuong = 1000000.0;
        else if (songaycong > 15 && songaycong < 25) thuong = 700000.0;
        else thuong = 0.0;
        return songaycong*dongia+thuong;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+"\nLoai lao dong: \t"+loaild+"\nLuong thang: \t"+df.format(tinhLuong());
    }
}
