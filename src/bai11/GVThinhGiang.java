package bai11;
import java.text.*;
public class GVThinhGiang extends GiangVien {
    public double sotietday;
    public double dongia;
    public static double ptthunhap=15;
    public GVThinhGiang(String hoten,String diachi,int loaigv,double sotietday,double dongia){
        super(hoten,diachi,loaigv);
        this.sotietday = sotietday;
        this.dongia = dongia;
    }
    @Override
    public double tinhLuong(){
        return sotietday*dongia*(1-ptthunhap/100);
    }
    @Override
    public String inThongTin(){//String hoten,String diachi,int loaigv){
        DecimalFormat df = new DecimalFormat("0.000");
        return super.inThongTin()+df.format(tinhLuong())+"\nSo tiet day: \t"+sotietday+"\nDon gia: \t"+df.format(dongia)+"\n% thu nhap: \t"+ptthunhap;
    }
}
