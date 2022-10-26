package bai10;
public class HocVienDH extends HocVien {
    public int dongiadh;
    public int sobuoihoc;
    public HocVienDH(String hoten,String diachi,int loaiut,String loaict,int dongiadh,int sobuoihoc){
        super(hoten, diachi, loaiut, loaict);
        this.dongiadh = dongiadh;
        this.sobuoihoc = sobuoihoc;
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
