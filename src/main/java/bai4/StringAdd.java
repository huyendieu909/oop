package bai4;

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
        finally{
            System.out.print("Tiep tuc chuong trinh\n");
        }
    }
    void checkS() throws StringTooLongException{
        if (s.length() > 20)
            throw new StringTooLongException("Chuoi vuot qua 20 ki tu!\n");
    }
}
