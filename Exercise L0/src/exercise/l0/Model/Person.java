/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ruy_pa_
 */
public class Person {
    private long idPerson;
    private String name;
    private Date dateOfBirth;
    private String address;
    private double height;
    private double weight;
    private static long numberOfPerson;

    public Person() {
        this.idPerson= ++ Person.numberOfPerson;
    }

    public long getIdPerson() {
        return idPerson;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public static long getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void setNumberOfPerson(long numberOfPerson) {
        Person.numberOfPerson = numberOfPerson;
    }

    
    @Override
    public String toString()
    {
        return "Id Person: " + this.idPerson + "\n" +
                "Name: " + this.name + "\n" +
                "Date of birth: " + new SimpleDateFormat("yyyy-MM-dd").format(this.dateOfBirth) + "\n" + 
                "Address: " + this.address + "\n" +
                "Height: " + this.height + "\n" +
                "Weight: " + this.weight + "\n" ;
    }   
}
