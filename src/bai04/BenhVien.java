package bai04;

public class BenhVien {
    public String ten;
    public String diaChi;
    public String giamDoc;

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

    public String getTen(String ten) {
        return ten;
    }

    public int getDiaChi(int diaChi) {
        return diaChi;
    }

    public String getGiamDoc(String giamDoc) {
        return giamDoc;
    }
    @Override
    public String toString() {
        return "Ten benh vien: \t" + this.ten + "\nDia chi: \t" + this.diaChi + "\nGiam doc: \t" + this.giamDoc;
    }
}