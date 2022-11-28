package bai12;

import java.text.DecimalFormat;

public class SVCDN extends Nguoi {
    private double tdkt; // Tổng điểm kiểm tra
    private double smkt; // Số môn kiểm tra
    public SVCDN(){
        
    }
    public SVCDN(String hoten, String ngaysinh, String diachi, String loaisv, double tdkt, double smkt){
        super(hoten,ngaysinh,diachi,loaisv);
        this.tdkt = tdkt;
        this.smkt = smkt;
    }
    public void setTdkt(double tdkt){
        this.tdkt = tdkt;
    }
    public void setSmkt(double smkt){
        this.smkt = smkt;
    }
    
    @Override
    public double tinhDiem(){
        return tdkt/smkt;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+" Cao dang nghe"+"\nDiem trung binh: \t"+df.format(tinhDiem());
    }
}
