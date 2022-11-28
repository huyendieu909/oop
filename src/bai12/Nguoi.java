package bai12;
public abstract class Nguoi {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String loaisv;
    
    public Nguoi() {
        this.hoten = "";
        this.ngaysinh = "";
        this.diachi = "";
        this.loaisv = "";
    }

    public Nguoi(String hoten, String ngaysinh, String diachi, String loaisv) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaisv = loaisv;
    }

    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }

    public void setDiaChi(String diachi) {
        this.diachi = diachi;
    }

    public void setNgaySinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setLoaiSv(String loaisv){
        this.loaisv = loaisv;
    }
    public String getHoTen() {
        return hoten;
    }

    public String getDiaChi() {
        return diachi;
    }

    public String getNgaySinh() {
        return ngaysinh;
    }
    
    public String getLoaiSv(){
        return loaisv;
    }
    public void nhapThongTin(String hoten,String ngaysinh,String diachi,String loaisv){
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaisv = loaisv;
    }
    public abstract double tinhDiem();

    public String inThongTin() {
        return "Ho ten: \t" + this.hoten + "\nDia chi: \t" + this.diachi + "\nNgay sinh: \t" + this.ngaysinh+"\nLoai sinh vien: \t";
    }
}