package bai05;

import bai04.*;

public class Nguoi {
    private String ten;
    private int tuoi;
    private int gioiTinh;

    public Nguoi() {
        this.ten = "";
        this.gioiTinh = 0;
        this.tuoi = 0;
    }

    public Nguoi(String ten, int tuoi, int gioiTinh) {
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

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }
    @Override
    public String toString() {
        String gt;
        if (gioiTinh == 1) gt = "nam";
        else gt = "nu";
        return "Ten: \t" + this.ten + "\nTuoi: \t" + this.tuoi + "\nGioi tinh: \t" + gt;
    }
}