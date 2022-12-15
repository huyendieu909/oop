package kt;
import java.util.*;
public class Vehicles implements Vehicle {
    Scanner sc = new Scanner(System.in);
    private String maker,model;
    private double price;
    public Vehicles(){
        
    }
    public Vehicles(String maker, String model, double price){
        this.maker = maker;
        this.model = model;
        this.price = price;
    }
    public void setMaker(String maker){
        this.maker = maker;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getMaker(){
        return maker;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    @Override 
    public void display(){
        System.out.print("Maker: "+this.getMaker()+"\nModel: "+this.getModel()+"\nPrice: "+this.getPrice());
    }
    @Override
    public void input(){
        in("Enter maker: ");this.setMaker(sc.nextLine());
        in("Enter model: ");this.setModel(sc.nextLine());
        in("Enter price: ");this.setPrice(sc.nextDouble());sc.nextLine();
    }
    static void in(String s){
        System.out.print(s);
    }
}
