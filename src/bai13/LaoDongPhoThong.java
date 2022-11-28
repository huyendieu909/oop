package bai13;
import java.text.DecimalFormat;
public class LaoDongPhoThong extends NguoiLaoDong {
    private int songaycong;
    private double dongia;
    private double thuong;
    public LaoDongPhoThong(){
        
    }
    public LaoDongPhoThong(String hoten,String diachi,String loaild,int songaycong,double dongia,double thuong){
        super(hoten,diachi,loaild);
        this.songaycong = songaycong;
        this.dongia = dongia;
        this.thuong = thuong;
    }
    public void setSoNgayCong(int songaycong){
        this.songaycong = songaycong;
    }
    public void setDonGia(double dongia){
        this.dongia = dongia;
    }
    public void setThuong(double thuong){
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
        return super.inThongTin()+"\nLoai lao dong: \t"+"lao dong pho thong"+"\nLuong thang: \t"+df.format(tinhLuong());
    }
}
