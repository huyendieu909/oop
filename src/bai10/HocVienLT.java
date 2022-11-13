package bai10;
public class HocVienLT extends HocVien {
    public int dongialt;
    public int sobuoihoc;
    public HocVienLT(){
        
    }
    public HocVienLT(String hoten,String diachi,int loaiut,String loaict,int dongialt,int sobuoihoc){
        super(hoten, diachi, loaiut, loaict);
        this.dongialt = dongialt;
        this.sobuoihoc = sobuoihoc;
    }
    
    @Override
    public void setSoBuoiHoc(int sobuoihoc){
        this.sobuoihoc = sobuoihoc;
    }
    
    @Override
    public void setDonGia(int dongialt){
        this.dongialt = dongialt;
    }
    
    @Override
    public int hocPhi(){
        int uutien;
        if (loaiut == 1) uutien = 1000000;
        else uutien = 800000;
        return sobuoihoc*dongialt-uutien;
    }
    
    @Override
    public String inThongTin(){
        return super.inThongTin()+" lap trinh: \t"+hocPhi()+"\nSo buoi da hoc: \t"+sobuoihoc+"\nDon gia: \t"+dongialt;
    }
}
