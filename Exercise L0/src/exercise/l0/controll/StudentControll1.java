/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.controll;

import exercise.l0.Model.Person;
import exercise.l0.Model.Student;
import exercise.l0.constant.ConstantOfStudent;

import exercise.l0.service.StudentService;
import java.util.Scanner;

/**
 *
 * @author ruy_pa_
 */
public class StudentControll1 {
    private static Student[] students= new Student[ConstantOfStudent.getMAX_NUMBER_OF_STUDENT()];
    private static int currentNumberOfStudent;
    
    public static void createStudent()
    {
        if(currentNumberOfStudent== ConstantOfStudent.getMAX_NUMBER_OF_STUDENT())
        {
            System.out.println("The number of student is full");
        }
        else
        {
            Student student= new Student();
            StudentService.setStudentInfor(student);
            students[currentNumberOfStudent++]= student;
            System.out.println("Create successfully");
            System.out.println(students[currentNumberOfStudent-1]);
        }
    }
    
    public static void readStudent(Scanner sc)
    {
        System.out.println("Fill your id needed to find:");
        String idStudent= sc.nextLine();
        Student student= StudentService.findStudentById(idStudent);
        if(student!= null)
        {   
            System.out.println("the student information is found:");
            System.out.println(student);
        }
        else
        {
            System.out.println("The student information is not found");
        }
    }
    
    public static void updateStudent(Scanner sc)
    {
        while(true)
        {
            System.out.println("Fill your id you want to update");
            String id= sc.nextLine();
            Student student= StudentService.findStudentById(id);
            if(student!= null)
            {
                StudentService.updateStudent(student);
                System.out.println("Update successfully!");
                System.out.println(student);
                break;
            }
            else
            {
                System.out.println("Fill your id againts");
            }
        }
    }
    
    public static void deleteStudent(Scanner sc)
    {
        while(true)
        {
            System.out.println("Fill your id you want to delete");
            String id= sc.nextLine();
            Student student= StudentService.findStudentById(id);
            if(student!= null)
            {
                System.out.println(StudentService.deleteStudent(id));
                break;
            }
            else
            {
                System.out.println("Fill your id againts");
            }
        }

    }

    public static Student[] getStudents() {
        return students;
    }  
}