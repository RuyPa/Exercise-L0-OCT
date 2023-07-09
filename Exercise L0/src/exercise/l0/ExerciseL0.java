/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.l0;

import exercise.l0.controll.StudentControll2;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author ruy_pa_
 */
public class ExerciseL0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("__________MENU__________" + "\n" +
                           "1. Creat a student" + "\n" +
                           "2. Find student by id" + "\n" +
                           "3. Update student" + "\n" +
                           "4. Delete student" + "\n" +
                           "5. Show percent of each rank" + "\n" +
                           "6. Show percent of distince average Score" + "\n" +
                           "7. Show students by rank" + "\n" + 
                           "8. Cancle system" + "\n"
        );
        
        while(true)
        {

            
            int option= 0;
            
            try {
                option= Integer.parseInt(sc.nextLine().trim());
                
                
                switch(option)
                {
                    case 1:
                        StudentControll2.createStudent();
                        System.out.println("choose another option");
                        break;
                    
                    case 2:
                        StudentControll2.readStudent(sc);
                        System.out.println("choose another option");
                        break;
                        
                    case 3:
                        StudentControll2.updateStudent(sc);
                        System.out.println("choose another option");
                        break;
                        
                    case 4:
                        StudentControll2.deleteStudent(sc);
                        System.out.println("choose another option");
                        break;
                    
                    case 5:
                        StudentControll2.showPercentOfRank();
                        System.out.println("choose another option");
                        break;
                                
                    case 6:
                        StudentControll2.showPercentOfAverageCore();
                        System.out.println("choose another option");
                        break;
                        
                    case 7:
                        StudentControll2.showStudentsByRank(sc);
                        System.out.println("choose another option");
                        break;
                        
                    case 8:
                        StudentControll2.storeStudentsInformation();
                        return;
                        
                    default:
                        System.out.println("number out of control");
                }
                
                
            } 
            catch (NumberFormatException e) {
                System.out.println("Fill the number");
            }
            

        }
        
        
        
    } 
}
