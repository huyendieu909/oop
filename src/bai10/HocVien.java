package bai10;
public abstract class HocVien {
    public String hoten;
    public String diachi;
    public String loaict; // loại chương trình
    public int loaiut; // loại ưu tiên gồm 2 loại 1 và 2
    public HocVien(String hoten,String diachi,int loaiut,String loaict){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaiut = loaiut;
        this.loaict = loaict;
    }
    public void nhapThongTin(String hoten,String diachi,int loaiut,String loaict){
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaiut = loaiut;
        this.loaict = loaict;
    }
    public abstract int hocPhi();
    public String inThongTin(){
        return "Ho va ten: \t"+hoten+"\nDia chi: \t"+diachi+"\nLoai uu tien: \t"+loaiut+"\nLoai chuong trinh dang ky: \t"+loaict+"\nHoc phi";//+hocPhi();
    }
}
