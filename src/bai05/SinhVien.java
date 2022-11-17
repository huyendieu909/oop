
package bai05;

public class SinhVien extends Nguoi{
    private String lop;
    private String nganh;
    private Truong truong;
    public SinhVien(){
        
    }
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong){
        super(ten,tuoi,gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public String getLop(String lop) {
        return lop;
    }

    public String getNganh(String nganh) {
        return nganh;
    }

    public Truong getTruong(Truong truong) {
        return truong;
    }
    @Override
    public String toString(){
        return super.toString()+"\nLop: \t"+lop+"\nNganh: \t"+nganh+"\nTruong: \t\n"+truong;
    }
}
