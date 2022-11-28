package bai14;
import java.text.DecimalFormat;
public class CNKSP extends CongNhan {
    private int sosanpham;
    private double dongia;
    private double thuong;
    public CNKSP(){
        
    }
    public CNKSP(String hoten,String diachi,String ngaysinh,String loaicn,int sosanpham,double dongia,double thuong){
        super(hoten,diachi,ngaysinh,loaicn);
        this.sosanpham = sosanpham;
        this.dongia = dongia;
        this.thuong = thuong;
    }
    
    
    public void setSoSanPham(int sosanpham){
        this.sosanpham = sosanpham;
    }
    
    public void setDonGia(double dongia){
        this.dongia = dongia;
    }
    
    public void setThuongSp(double thuong){
        this.thuong = thuong;
    }

    public void nhapThongTin(String hoten,String diachi,String ngaysinh,String loaicn,int sosanpham,double dongia,double thuong){
        /*this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaicn = loaicn;*/
        this.sosanpham = sosanpham;
        this.dongia = dongia;
        this.thuong = thuong;
    }
    
    @Override
    public double tinhLuong(){
        if (sosanpham >= 1150) thuong = 1500000.0;
        else if (sosanpham >= 1100) thuong = 1000000.0;
        else thuong = 0.0;
        return sosanpham*dongia+thuong;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+"\nLoai cong nhan: "+"Khoan san pham"+"\nLuong thang: \t"+df.format(tinhLuong());
    }
}
