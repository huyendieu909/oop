package bai04;

public class Nguoi {
    public String ten;
    public int tuoi;
    public char gioiTinh;

    public Nguoi() {
        this.ten = "";
        this.gioiTinh = (char)32;
        this.tuoi = 0;
    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen(String ten) {
        return ten;
    }

    public int getTuoi(int tuoi) {
        return tuoi;
    }

    public char getGioiTinh(char gioiTinh) {
        return gioiTinh;
    }
    @Override
    public String toString() {
        return "Ten: \t" + ten + "\nTuoi: \t" + this.tuoi + "\nGioi tinh: \t" + this.gioiTinh;
    }
}