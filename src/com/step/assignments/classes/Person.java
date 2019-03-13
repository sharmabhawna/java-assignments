package com.step.assignments.classes;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0 || age > 100){
            this.age = 0;
        }
    }

    public boolean isTeen(){
        boolean isTeen = false;
        if(this.age > 12 && this.age < 20){
            isTeen = true;
        }
        return isTeen;
    }

    public String getFullName(){
        String delimiter = " ";
        if(this.firstName.isEmpty() || this.lastName.isEmpty()){
            delimiter = "";
        }
        return this.firstName + delimiter + this.lastName;
    }
}
