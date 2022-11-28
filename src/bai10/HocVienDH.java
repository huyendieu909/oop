package bai10;
public class HocVienDH extends HocVien {
    private int dongiadh;
    private int sobuoihoc;
    public HocVienDH(){
        
    }
    public HocVienDH(String hoten,String diachi,int loaiut,String loaict,int dongiadh,int sobuoihoc){
        super(hoten, diachi, loaiut, loaict);
        this.dongiadh = dongiadh;
        this.sobuoihoc = sobuoihoc;
    }
    
    @Override
    public void setSoBuoiHoc(int sobuoihoc){
        this.sobuoihoc = sobuoihoc;
    }
    
    @Override
    public void setDonGia(int dongiadh){
        this.dongiadh = dongiadh;
    }
    
    @Override
    public int hocPhi(){
        int uutien;
        if (loaiut == 1) uutien = 1000000;
        else uutien = 500000;
        return sobuoihoc*dongiadh-uutien;
    }
    
    @Override
    public String inThongTin(){
        return super.inThongTin()+" do hoa: \t"+hocPhi()+"\nSo buoi da hoc: \t"+sobuoihoc+"\nDon gia: \t"+dongiadh;
    }
}
