package bai3;

public class StringAdd {
    String s;
    public StringAdd(){
        
    }
    public StringAdd(String s){
        this.s = s;
        try {
            checkS();
            System.out.print("Chuoi vua nhap: "+s+"\n");
        }
        catch (StringTooLongException e){
            System.out.print(e);
        }
    }
    void checkS() throws StringTooLongException{
        if (s.length() > 30)
            throw new StringTooLongException("Chuoi vuot qua 30 ki tu!\nChuong trinh ket thuc.");
    }
}
