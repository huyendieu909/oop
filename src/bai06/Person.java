package bai06;


public class Person {
    public String name;
    public int age;
    public char gender;

    public Person() {
        name = "";
        age = 0;
        gender = ' ';
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
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName(String name) {
        return name;
    }
    public int getAge(int age) {
        return age;
    }
    public char getGender(char gender) {
        return gender;
    }

    @Override
    public String toString(){
        return "Ten: \t"+name+"\nTuoi: \t"+age+"\nGioi tinh: \t"+gender;
    }
}