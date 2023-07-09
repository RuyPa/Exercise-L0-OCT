/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.service;

import exercise.l0.Model.Rank;
import exercise.l0.Model.Student;
import exercise.l0.constant.ConstantOfStudent;
import exercise.l0.controll.StudentControll1;
import exercise.l0.controll.StudentControll2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author ruy_pa_
 */
public class StudentService {
    
    private final static Scanner sc= new Scanner(System.in);

    
    public static void setStudentInfor(Student student)
    {
        PersonService.setPersonInfor(student);
        
        student.setUniversity(validateUniversity());
        student.setStartYear(validatStartYear());
        student.setAverageScore(validateAvgScore());
        student.setRank(validateRank(student.getAverageScore()));
    }


    private static String validateUniversity() 
    {
        
        System.out.println("Fill your university name:");
        String university;
        int maxLenght= ConstantOfStudent.getLENGHT_OF_NAMEUNI();
        while(true)
        {
            university= sc.nextLine().trim();
            if(university.length() == 0 || university.length() > maxLenght)
            {
                System.out.println("Fill yout university name with the lenght being more than 0 and less than " + maxLenght);
            }
            else
            {
                break;
            }
            
        }
        return university;
    }

    private static Date validatStartYear() 
    {
        System.out.println("Fill your start year:");
        Date startYear;
        int minStartYear= ConstantOfStudent.getMIN_OF_STARTYEAR();
        while(true)
        {
            try 
            {
                SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy");
                startYear= dateFormat.parse(sc.nextLine().trim());
                break;
            } catch (ParseException ex) {
                System.out.println("Fill your start year at university with 4 character and being more than " + minStartYear);
            }
        }
        
        return startYear;
    }

    private static Double validateAvgScore() 
    {
        System.out.println("Fill your average score:");
        double avgScore,
                minAvgScore= ConstantOfStudent.getMIN_OF_AVGSCORE(),
                maxAvgScore= ConstantOfStudent.getMAX_OF_AVGSCORE();
        while(true)
        {
            avgScore= Double.parseDouble(sc.nextLine().trim());
            if(avgScore< minAvgScore || avgScore > maxAvgScore)
            {
                System.out.println("Fill your average score being bigger than " + minAvgScore + " and less than " + maxAvgScore);
            }
            else
            {
                break;
            }
        }
        return avgScore;
    }
    
    public static Student findStudentById(String id)
    {
        try
        {
            for(Student st : StudentControll2.getStudents())
            {
                if(st.getIdStudent().equals(id))
                {
                    return st;
                }
            }
        }
        catch(NullPointerException np)
        {
            return null;
        }
        return null;
    }
    
    public static void updateStudent(Student student)
    {
        setStudentInfor(student);
    }
    
    public static String deleteStudent(String id)
    {
        int length= StudentControll1.getStudents().length;
        Student[] students= StudentControll1.getStudents();
        for(int i= 0; i< length - 1; i++)
        {
            if( students[i].getIdStudent().equals(id))
            {
                for(int j= i+ 1; j< length; j++)
                {
                    students[j-1]= students[j];
                }
                break;
            }
        }
        return "Delete successfully!";    
    }

    private static Rank validateRank(Double averageScore) 
    {    
        Rank rank= Rank.HIGH_DISTINCTION ;
        Rank[] ranks= Rank.values();
        Double[] limit_point= ConstantOfStudent.getLIMIT_POINT();
        for(int i= 0; i< limit_point.length; i++)
        {
            if(averageScore< limit_point[i] )
            {
                rank= ranks[i];
                break;
            }
        }
        return rank;
    }
}
                                                                                    