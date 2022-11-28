package bai3;
public class StringTooLongException extends Exception{
    public StringTooLongException(){
        
    }
    public StringTooLongException(String message){
        super(message);
    }
}
