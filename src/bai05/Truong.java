
package bai05;

public class Truong {
    public String ten;
    public String diaChi;
    public String hieuTruong;
    public Truong(){
        ten = "";
        diaChi = "";
        hieuTruong = "";
    }
    public Truong(String ten, String diaChi, String hieuTruong){
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public void setHieuTruong(String hieuTruong){
        this.hieuTruong = hieuTruong;
    }
    public String getTen(){
        return ten;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public String getHieuTruong(){
        return hieuTruong;
    }
    @Override
    public String toString(){
        return "Ten truong: \t"+ten+"\nDia chi: \t"+diaChi+"\nTen hieu truong: \t"+hieuTruong;
    }
}
