package org.example;

import java.util.Scanner;

public class ResumeMaker {

    private String firstName;
    private String lastName;
    private String phone;
    private String  id;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
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

    public String fullName(String firstName, String lastName){
        StringBuilder fullName = new StringBuilder();
        fullName.append(Character.toUpperCase(firstName.charAt(0)));
        for (int i = 1; i < firstName.length(); i++){
            fullName.append(Character.toLowerCase(firstName.charAt(i)));
        }
        fullName.append(" ");
        fullName.append(Character.toUpperCase(lastName.charAt(0)));
        for (int i = 1; i < lastName.length(); i++){
            fullName.append(Character.toLowerCase(lastName.charAt(i)));
        }
        return fullName.toString().trim();
    }

    public String phoneNumber(String phone){
        while (phone.length() != 10 || phone.charAt(0) != '9'){
            return "Error!";
        }
        return "0" + phone;
    }
    public int userId(String id){
        while(id.length() < 4 || id.length() > 13){
            return 1;
        }
        return Integer.parseInt(id);
    }
}
