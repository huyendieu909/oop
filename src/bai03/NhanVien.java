package bai03;

public class NhanVien {
    public String name;
    public DiaChi address;
    public String dob;
    public String gender;

    public NhanVien() {
        this.name = "";
        this.dob = "";
        this.gender = "";
    }

    public NhanVien(String name, DiaChi address, String dob, String gender) {
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

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Ten nhan vien: \t" + this.name + "\nDia chi: \t" + this.address + "\nNgay sinh: \t" + this.dob + "\nGioi tinh: \t" + this.gender;
    }
}