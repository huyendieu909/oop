package bai04;
public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;

    public BenhNhan(){
        
    }
    public BenhNhan(String ten, int tuoi, int gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    public String getTienSu() {
        return this.tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTien su: \t" + this.tienSu + "\nChan doan: \t" + this.chanDoan + "\n" + this.benhVien;
    }
}