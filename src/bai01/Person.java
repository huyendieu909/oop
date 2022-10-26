package bai01;

public class Person {
    public String name;
    public String dob;
    public String pob;
    public char gender;
    public String email;
    public String phone;

    public Person() {
        this.name = "";
        this.dob = "";
        this.pob = "";
        this.gender = (char)32;
        this.email = "";
        this.phone = "";
    }

    public Person(String name, String dob, String pob, char gender, String email, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName(String name) {
        return name;
    }

    public String getDob(String dob) {
        return dob;
    }

    public String getPob(String pob) {
        return pob;
    }

    public char getGender(char gender) {
        return gender;
    }

    public String getEmail(String email) {
        return email;
    }

    public String getPhone(String phone) {
        return phone;
    }
    @Override
    public String toString(){
        return "Ten: \t"+name+"\nNgay sinh: \t"+dob+"\nNoi sinh: \t"+pob+"\nGioi tinh: \t"+gender+"\nEmail: \t"+email+ "\nSDT: \t"+phone;
    }
}