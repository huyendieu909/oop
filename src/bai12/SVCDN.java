package bai12;

import java.text.DecimalFormat;

public class SVCDN extends Nguoi {
    public double tdkt; // Tổng điểm kiểm tra
    public double smkt; // Số môn kiểm tra
    public SVCDN(String hoten, String ngaysinh, String diachi, String loaisv, double tdkt, double smkt){
        super(hoten,ngaysinh,diachi,loaisv);
        this.tdkt = tdkt;
        this.smkt = smkt;
    }
    @Override
    public double tinhDiem(){
        return tdkt/smkt;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+"\nDiem trung binh: \t"+df.format(tinhDiem());
    }
}
