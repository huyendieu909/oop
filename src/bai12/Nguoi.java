package bai12;
public abstract class Nguoi {
    public String hoten;
    public String ngaysinh;
    public String diachi;
    public String loaisv;
    
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
    public String getHoTen(String hoten) {
        return hoten;
    }

    public String getDiaChi(String diachi) {
        return diachi;
    }

    public String getNgaySinh(String ngaysinh) {
        return ngaysinh;
    }
    
    public String getLoaiSv(String loaisv){
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
        return "Ho ten: \t" + this.hoten + "\nDia chi: \t" + this.diachi + "\nNgay sinh: \t" + this.ngaysinh+"\nLoai sinh vien: \t"+loaisv;
    }
}