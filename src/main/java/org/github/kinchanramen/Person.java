package org.github.kinchanramen;

public class Person {
    private String name;
    private int age;
    private String country;
    private String gender;
    public Person(String name,int age,String country,String gender){
        this.name=name;
        this.age=age;
        this.country=country;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
