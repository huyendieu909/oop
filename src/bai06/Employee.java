
package bai06;

public class Employee extends Person{
    private String employerName;
    private String dateHired;

    public Employee(){
    
    }
    public Employee(String name,int age,char gender,String employerName,String dateHired){
        super(name,age,gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }
    public void setEmployerName(String employerName){
        this.employerName = employerName;
    }
    public void setDateHired(String dateHired){
        this.dateHired = dateHired;
    }
    public String getEmployerName(){
        return employerName;
    }
    public String getDateHired(){
        return dateHired;
    }
    @Override
    public String toString(){
        return super.toString()+"\nTen chu: \t"+employerName+"\nNgay duoc thue: \t"+dateHired;
    }
}
