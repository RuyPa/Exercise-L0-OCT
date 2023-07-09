/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.service;

import exercise.l0.Model.Person;
import exercise.l0.Model.Student;
import exercise.l0.constant.ConstantOfPerson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ruy_pa_
 */
public class PersonService {
    
    public static Scanner sc= new Scanner(System.in);
    
    public static void setPersonInfor(Student student) 
    {

        Person person= student;
        
        person.setName(validateName());
        person.setAddress(validateAddress());
        person.setDateOfBirth(validateDateOfBirth());
        person.setHeight(validateHeight());
        person.setWeight(validateWeight());
        
        
    }

    private static String validateName() 
    {
        System.out.println("Fill your name:");
        String name;
        int maxlenght= ConstantOfPerson.getLENGHT_OF_NAME();
        while(true)
        {
            name = sc.nextLine();
            if(name.length()> maxlenght || name.length()== 0)
            {
                System.out.println("please fill your name with lenght being equal to, or less than " + maxlenght);
            }
            else
            {
                break;
            }
        }        
        return name;
    }

    private static String validateAddress() 
    {
        System.out.println("Fill your address:");
        String address;
        int maxlenght= ConstantOfPerson.getLENGHT_OF_ADDRESS();
        while(true)
        {
            address= sc.nextLine();
            if(address.length()> maxlenght || address.length()== 0)
            {
                System.out.println("please fill your address with lenght being equal to, or less than " + maxlenght);
            }
            else
            {
                break;
            }
        }        
        return address;
    }
//
    private static Date validateDateOfBirth(){
        System.out.println("Fill your date of birth:");
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        Date date= new Date();
        while(true)
        {
            
            String stringDate= sc.nextLine();
            if(Integer.parseInt(stringDate.substring(0,4))<   1900 || stringDate.length()== 0)
            {
                System.out.println("Fill your date being equal to, or more than 1900");
            }
            else
            {
                try {
                    date= dateFormat.parse(stringDate);
                    break;
                } catch (ParseException ex) {
                    System.out.println("Fill your date of birth with correct format: " + "yyyy-MM-dd");
                }
            }
        }
        
        
        return date;
    }
//
    private static double validateHeight() 
    {
        System.out.println("Fill your height:");
        Double height, 
               minHeight= ConstantOfPerson.getMIN_OF_HEIGHT(),
               maxHeight= ConstantOfPerson.getMAX_OF_HEIGHT();
        while(true)
        {
            height= Double.valueOf(sc.nextLine().trim());
            if(height< minHeight || height > maxHeight)
            {
                System.out.println("Fill yout height more than " + minHeight+ " and less than "+ maxHeight);
            }
            else
            {
                break;
            }
            
        }
        return height;
    }

    private static double validateWeight() 
    {
        System.out.println("Fill your weight:");
        Double weight, 
               minWeight= ConstantOfPerson.getMIN_OF_WEIGHT(),
               maxWeight= ConstantOfPerson.getMAX_OF_WEIGHT();
        while(true)
        {
            weight= Double.valueOf(sc.nextLine().trim());
            if(weight< minWeight || weight > maxWeight)
            {
                System.out.println("Fill yout height more than " + minWeight+ " and less than "+ maxWeight);
            }
            else
            {
                break;
            } 
        }
        return weight;
    }
}
