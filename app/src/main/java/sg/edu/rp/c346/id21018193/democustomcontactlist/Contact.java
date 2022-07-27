package sg.edu.rp.c346.id21018193.democustomcontactlist;

public class Contact {

    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public Contact(String name, int countryCode, int phoneNum, char gender){
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String toString() {
        return "Contact {" +
                "name ='" + name + '\'' +
                ", gender ='" + gender + '\'' +
                ", country code ='" + countryCode + '\'' +
                ", phone number ='" + phoneNum + '\'' +
                '}';
    }
}
