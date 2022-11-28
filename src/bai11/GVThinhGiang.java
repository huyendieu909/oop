package bai11;
import java.text.*;
public class GVThinhGiang extends GiangVien {
    private double sotietday;
    private double dongia;
    private static double ptthunhap=15;
    public GVThinhGiang(){
        
    }
    public GVThinhGiang(String hoten,String diachi,int loaigv,double sotietday,double dongia){
        super(hoten,diachi,loaigv);
        this.sotietday = sotietday;
        this.dongia = dongia;
    }
    public void setSoTietDay(double sotietday){
        this.sotietday = sotietday;
    }
    public void setDonGia(double dongia){
        this.dongia = dongia;
    }
    
    @Override
    public double tinhLuong(){
        return sotietday*dongia*(1-ptthunhap/100);
    }
    @Override
    public String inThongTin(){//String hoten,String diachi,int loaigv){
        DecimalFormat df = new DecimalFormat("0.000");
        return super.inThongTin()+"Thinh giang"+"\nLuong thang: \t"+df.format(tinhLuong())+"\nSo tiet day: \t"+sotietday+"\nDon gia: \t"+df.format(dongia)+"\n% thu nhap: \t"+ptthunhap;
    }
}
