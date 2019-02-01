package Person;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String age;
    private Address address;
    private ArrayList<PhoneNumbers> phoneNumbers;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getPhoneNumbersInfo() {
        String sPhoneNumbers = "";
        for (PhoneNumbers phoneNumber : phoneNumbers)
            sPhoneNumbers += " " + phoneNumber.getType() + " " + phoneNumber.getNumber() + "\n";
        return sPhoneNumbers;
    }

    public void setPhoneNumbers(ArrayList phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getPersonInfo() {
        return "Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "--------------------------------------\n" +
                "Address: \n" +
                "" + address.getAdressInfo() + "\n" +
                "--------------------------------------\n" +
                "Phone Numbers: \n" +
                "" + getPhoneNumbersInfo() +
                "--------------------------------------";
    }
}
