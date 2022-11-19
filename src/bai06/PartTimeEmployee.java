
package bai06;

public class PartTimeEmployee extends Employee{
    private int hoursPerWeek;
    public PartTimeEmployee(){
    
    }
    public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hoursPerWeek){
        super(name,age,gender,employerName,dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }
    public void setHoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek = hoursPerWeek;
    }
    
    public int getHoursPerWeek(){
        return hoursPerWeek;
    }
    @Override
    public String toString(){
        return super.toString()+"\nSo gio lam viec trong tuan: \t"+hoursPerWeek;
    }
}
