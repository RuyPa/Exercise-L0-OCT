/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.controll;

import exercise.l0.Model.Rank;
import exercise.l0.Model.Student;
import exercise.l0.constant.ConstantOfStudent;
import exercise.l0.service.StudentService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author ruy_pa_
 */
public class StudentControll2 {
    private static List<Student> students= new ArrayList<>();
    private static Comparator<Student> sortListStudent;
    
    public static void createStudent()
    {
        Student student= new Student();
        StudentService.setStudentInfor(student);
        students.add(student);
        System.out.println("Create successfully!");
        System.out.println(student);
    }
    
    public static void readStudent(Scanner sc)
    {
        while(true)
        {
            System.out.println("Fill the id of student you want to find:");
            String id= sc.nextLine();
            Student student= StudentService.findStudentById(id);
            if(student== null)
            {
                System.out.println("Student is not found");
            }
            else
            {
                System.out.println("Student is found:");
                System.out.println(student);
                break;
            }
        }

    }
    
    public static void updateStudent(Scanner sc)
    {
        while(true)
        {
            System.out.println("Fill the id of student you want to update:");
            String id= sc.nextLine();
            Student student= StudentService.findStudentById(id);
            if(student== null)
            {
                System.out.println("Student is not found");
            }
            else
            {
                StudentService.setStudentInfor(student);
                System.out.println("Update successfully!");
                System.out.println(student);
                break;
            }
        }
    }
    
    public static void deleteStudent(Scanner sc)
    {
        while(true)
        {
            System.out.println("Fill the id of student you want to delete:");
            String id= sc.nextLine();
            Student student= StudentService.findStudentById(id);
            if(student== null)
            {
                System.out.println("Student is not found");
            }
            else
            {
                students.remove(student);
                System.out.println("Delete successfully");
                break;
            }
        }
    }
    
    public static void showPercentOfRank()
    {
//       su dung map de gan so luong sinh vien tuong ung voi tuong loai hoc luc 
        Map<Rank, Integer> map;
        
//        list nay muc dich de xep cac loai hoc luc dua vao % tu cao den thap
        List<Rank> ranks= new ArrayList<>(Arrays.asList(Rank.values()));
        
//        add all hoc luc vao map, voi key la hoc luc va value la so luong sinh vien
// ung voi moi hoc luc, mac dinh = 0
        map = new EnumMap<>(Rank.class);       
        for(Rank rank: Rank.values())
        {
            map.put(rank, 0);
        }
        
//        index all sinh vien, sinh vien co hoc luc nao thi cong them vao value cua key tuong ung
        for(Student student: students)
        {
            int curentlyNumber= map.get(student.getRank());
            map.put(student.getRank(), curentlyNumber+ 1 );
        }
        
//        xep lai list da de cap o tren, dua vao vao value cua tung hoc luc
        Collections.sort(ranks, (Rank truoc, Rank sau) -> map.get(sau)- map.get(truoc));
        
        System.out.println("Percent of each rank:");
        for(Rank rank: ranks)
        {
            System.out.println(rank+ ": "+ 100* map.get(rank)/ students.size()+ "%");
        }
    }
    
    
    public static void showPercentOfAverageCore()
    {
        Map<Double, Integer> map= new HashMap<>();
//        dung hashset de luu nhung gia tri diem rieng biet
        Collection<Double> distinceAvgScore= new HashSet<>();
        for(Student student: students )
        {
            distinceAvgScore.add(student.getAverageScore());
        }
//        chuyen sang array de co the index
        ArrayList<Double> listAvgScore= new ArrayList<>(distinceAvgScore);
        
//            dat so luong cua moi diem ban dau = 0
        for(Double d: listAvgScore)
        {
            map.put(d, 0);
        }
        
//        them so luong cho tung loai diem
        for(Student student: students)
        {
            int currentNumberOfAvgScore= map.get(student.getAverageScore());
            map.put(student.getAverageScore(), currentNumberOfAvgScore+ 1);
        }
        
        System.out.println("Average score and its percent:");
        for(Double avgScore: distinceAvgScore)
        {
            System.out.println(avgScore+ ": "+ 100* map.get(avgScore)/ students.size()+ "%");
        }
    }
    
    
    public static void showStudentsByRank(Scanner sc)
    {
        System.out.println("choose your rank you want to see (VERY_POOR, POOR, AVERAGE, CREDIT, DISTINCTON, HIGH_DISTINCTION)");
        String rank= sc.nextLine();
        for(Student student : students)
        {
            if(student.getRank().toString().equals(rank))
            {
                System.out.println(student);
            }
        }
    }
    
    public static void storeStudentsInformation()
    {
        try 
        {
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(
                                                   new FileOutputStream(
                                               ConstantOfStudent.getFILE_DIRECTORY_OUTPUT_FOR_STUDENT()));
            objectOutputStream.writeObject(students);

        } 
        catch (IOException ex) 
        {
        }
    }
    
    
    public static List<Student> getStudents()
    {
        return students;
    }
}
