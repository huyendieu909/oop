package bai5;
public class Luong {
    double luong;
    public Luong(double luong){
        this.luong = luong;
        try {
            checkLuong();
            System.out.print("Muc luong hop le!");
        } catch (OutOfRangeException e){
            System.out.print(e);
        }
    }
    void checkLuong() throws OutOfRangeException{
        if (luong < 5000000 || luong > 20000000)
            throw new OutOfRangeException("Luong nam ngoai pham vi!");
    }
}
