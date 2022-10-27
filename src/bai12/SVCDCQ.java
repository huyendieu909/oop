package bai12;

import java.text.DecimalFormat;

public class SVCDCQ extends Nguoi {
    public double tdkt; // Tổng điểm kiểm tra
    public double smkt; // Số môn kiểm tra
    public double dtkthp; // Điểm thi kết thúc học phần
    public SVCDCQ(String hoten, String ngaysinh, String diachi, String loaisv, double tdkt, double smkt,double dtkthp){
        super(hoten,ngaysinh,diachi,loaisv);
        this.tdkt = tdkt;
        this.smkt = smkt;
        this.dtkthp = dtkthp;
    }
    @Override
    public double tinhDiem(){
        return (tdkt/smkt+dtkthp)/3;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+"\nDiem trung binh: \t"+df.format(tinhDiem());
    }
}
