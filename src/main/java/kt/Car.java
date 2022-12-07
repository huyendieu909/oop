package kt;
import java.util.*;
public class Car extends Vehicles implements Vehicle{
    private String color;
    public Car(){
        
    }
    public Car(String maker, String model, double price, String color){
        super(maker,model,price);
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        in("Enter color: ");
        this.color = sc.nextLine();
    }
    
    @Override
    public void display(){
        in("Maker: "+getMaker()+"\n");
        in("Model: "+getModel()+"\n");
        in("Price: "+getPrice()+"\n");
        in("Color: "+color+"\n");
    }
    
    static void in(String s){
        System.out.print(s);
    }
}

