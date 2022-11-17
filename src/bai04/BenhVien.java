package bai04;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;

    public BenhVien(){
        
    }
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }
    @Override
    public String toString() {
        return "Ten benh vien: \t" + this.ten + "\nDia chi: \t" + this.diaChi + "\nGiam doc: \t" + this.giamDoc;
    }
}