/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.constant;

/**
 *
 * @author ruy_pa_
 */
public class ConstantOfStudent {
    private final static Integer MAX_NUMBER_OF_STUDENT= 100;
    private final static Integer LENGHT_OF_ID= 10;
    private final static Integer LENGHT_OF_NAMEUNI= 200;
    private final static Integer MIN_OF_STARTYEAR= 1900;
    private final static Double MIN_OF_AVGSCORE= 0.0,
                                MAX_OF_AVGSCORE= 10.0;
    private final static Double[] LIMIT_POINT= {3d, 5d, 6.5d, 7.5d, 9d};
    private final static String FILE_DIRECTORY_OF_STUDENT= "src/exercise/l0/file/STUDENT_DOCS.TXT";
    private final static String FILE_DIRECTORY_OUTPUT_FOR_STUDENT= "src/exercise/l0/file/STUDENT_STORAGE.TXT";

    public static String getFILE_DIRECTORY_OF_STUDENT() {
        return FILE_DIRECTORY_OF_STUDENT;
    }

    public static String getFILE_DIRECTORY_OUTPUT_FOR_STUDENT() {
        return FILE_DIRECTORY_OUTPUT_FOR_STUDENT;
    }

    public static Integer getMAX_NUMBER_OF_STUDENT() {
        return MAX_NUMBER_OF_STUDENT;
    }

    public static Integer getLENGHT_OF_ID() {
        return LENGHT_OF_ID;
    }

    public static Integer getLENGHT_OF_NAMEUNI() {
        return LENGHT_OF_NAMEUNI;
    }

    public static Integer getMIN_OF_STARTYEAR() {
        return MIN_OF_STARTYEAR;
    }

    public static Double getMIN_OF_AVGSCORE() {
        return MIN_OF_AVGSCORE;
    }

    public static Double getMAX_OF_AVGSCORE() {
        return MAX_OF_AVGSCORE;
    }

    public static Double[] getLIMIT_POINT() {
        return LIMIT_POINT;
    }
    
    
}
