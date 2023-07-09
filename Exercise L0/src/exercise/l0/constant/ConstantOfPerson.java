/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.l0.constant;

/**
 *
 * @author ruy_pa_
 */
public class ConstantOfPerson {
    private final static Integer LENGHT_OF_NAME= 100;
    private final static Integer MAX_YEAR= 1900;
    private final static Integer LENGHT_OF_ADDRESS= 300;
    private final static Double MIN_OF_HEIGHT= 50.0,
                                MAX_OF_HEIGHT= 300.0;
    private final static Double MIN_OF_WEIGHT= 5.0,
                                MAX_OF_WEIGHT= 1000.0;
    private final static String FILE_DIRECTORY_OF_PERSON= "src/exercise/l0/file/PERSON_DOCS.TXT";

    public static String getFILE_DIRECTORY_OF_PERSON() {
        return FILE_DIRECTORY_OF_PERSON;
    }

    public static Integer getLENGHT_OF_NAME() {
        return LENGHT_OF_NAME;
    }

    public static Integer getMAX_YEAR() {
        return MAX_YEAR;
    }

    public static Integer getLENGHT_OF_ADDRESS() {
        return LENGHT_OF_ADDRESS;
    }

    public static Double getMIN_OF_HEIGHT() {
        return MIN_OF_HEIGHT;
    }

    public static Double getMAX_OF_HEIGHT() {
        return MAX_OF_HEIGHT;
    }

    public static Double getMIN_OF_WEIGHT() {
        return MIN_OF_WEIGHT;
    }

    public static Double getMAX_OF_WEIGHT() {
        return MAX_OF_WEIGHT;
    }
}
