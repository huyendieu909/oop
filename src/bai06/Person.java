package bai06;


public class Person {
    private String name;
    private int age;
    private int gender;

    public Person() {
        name = "";
        age = 0;
        gender = 0;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getGender() {
        return gender;
    }

    @Override
    public String toString(){
        String gt;
        if (gender==0) gt = "nu";
        else gt = "nam";
        return "Ten: \t"+name+"\nTuoi: \t"+age+"\nGioi tinh: \t"+gt;
    }
}