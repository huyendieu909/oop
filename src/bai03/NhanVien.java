package bai03;

public class NhanVien {
    public String name;
    public DiaChi address;
    public String dob;
    public char gender;

    public NhanVien() {
        this.name = "";
        this.dob = "";
        this.gender = (char)32;
    }

    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName(String name) {
        return name;
    }

    public DiaChi getAddress(DiaChi address) {
        return address;
    }

    public String getDob(String dob) {
        return dob;
    }

    public char getGender(char gender) {
        return gender;
    }
    @Override
    public String toString() {
        return "Ten nhan vien: \t" + this.name + "\nDia chi: \t" + this.address + "\nNgay sinh: \t" + this.dob + "\nGioi tinh: \t" + this.gender;
    }
}