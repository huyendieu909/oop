package bai02;

import bai03.*;

public class DiaChi {
    public String thon;
    public String xa;
    public String huyen;
    public String tinh;

    public DiaChi() {
        this.thon = "";
        this.xa = "";
        this.huyen = "";
        this.tinh = "";
    }

    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getThon(String thon) {
        return thon;
    }

    public String getXa(String xa) {
        return xa;
    }

    public String getHuyen(String huyen) {
        return huyen;
    }

    public String getTinh(String tinh) {
        return tinh;
    }
    @Override
    public String toString() {
        return "\nThon: \t" + this.thon + "\nXa: \t" + this.xa + "\nHuyen: \t" + this.huyen + "\nTinh: \t" + this.tinh;
    }
}