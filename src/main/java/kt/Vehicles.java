package kt;
public class Vehicles {
    private String maker;
    private String model;
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
}
