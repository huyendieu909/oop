package bai2;
public class ThoiGian {
    private int ngay,thang,nam;
    int a,b,c;
    public ThoiGian(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        a = ngay;
        b = thang;
        c = nam;
        try {
            checkDate();
        }
        catch (InvalidDateException e){
            System.out.print(e);
        }
        finally {
            System.out.print("\nNgay thang nam ban vua nhap: "+ngay+"/"+thang+"/"+nam);
        }
    }
    
    void checkDate() throws InvalidDateException{
        if (a > 31 || a < 1)
            throw new InvalidDateException("Ngay da bi nhap sai!\n");
        if (b > 12 || b < 1)
            throw new InvalidDateException("Thang da bi nhap sai!\n");
        if (c < 0)
            throw new InvalidDateException("Nam da bi nhap sai!\n");
        if (a >= 31 && (b == 2 || b == 4|| b == 6|| b == 9 || b == 11))
            throw new InvalidDateException("Thang "+b+" khong the lon hon 30 ngay!\n");
        if ((a>28)&&b == 2&&(c % 4 != 0))
            throw new InvalidDateException("Nam "+c+" khong phai nam nhuan nen thang 2 chi co 28 ngay");
    }
    
    public void setNgay(int ngay){
        this.ngay = ngay;
    }
    public void setThang(int thang){
        this.thang = thang;
    }
    public void setNam(int nam){
        this.nam = nam;
    }
    public ThoiGian(){
        
    }
    
}
