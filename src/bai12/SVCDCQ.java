package bai12;

import java.text.DecimalFormat;

public class SVCDCQ extends Nguoi {
    private double tdkt; // Tổng điểm kiểm tra
    private double smkt; // Số môn kiểm tra
    private double dtkthp; // Điểm thi kết thúc học phần
    public SVCDCQ(){
        
    }
    public SVCDCQ(String hoten, String ngaysinh, String diachi, String loaisv, double tdkt, double smkt,double dtkthp){
        super(hoten,ngaysinh,diachi,loaisv);
        this.tdkt = tdkt;
        this.smkt = smkt;
        this.dtkthp = dtkthp;
    }
    public void setTdkt(double tdkt){
        this.tdkt = tdkt;
    }
    public void setSmkt(double smkt){
        this.smkt = smkt;
    }
    public void setDtkthp(double dtkthp){
        this.dtkthp = dtkthp;
    }
    
    @Override
    public double tinhDiem(){
        return (tdkt/smkt+dtkthp)/3;
    }
    @Override
    public String inThongTin(){
        DecimalFormat df = new DecimalFormat("0.00");
        return super.inThongTin()+" Cao dang chinh quy"+"\nDiem trung binh: \t"+df.format(tinhDiem());
    }
}
