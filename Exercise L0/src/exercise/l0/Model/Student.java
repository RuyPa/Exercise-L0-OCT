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
public class Student extends Person {
    private String idStudent;
    private String university;
    private Date startYear;
    private Double averageScore;
    private Rank rank;
    private static long numberOfStudent;

    public Student() {
        super();
        this.idStudent= String.format("%010d", ++ numberOfStudent);
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getUniversity() {
        return university;
    }

    public Date getStartYear() {
        return startYear;
    }

    public Double getAverageScore() {
        return averageScore;
    }


    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    

    
    
    @Override
    public String toString()
    {
        return  super.toString() +
                "Id Student: " + this.idStudent + "\n" +
                "Name of University: " + this.university + "\n" +
                "Start year: " + new SimpleDateFormat("yyyy").format(this.startYear) + "\n" + 
                "Average Score: " + this.averageScore + "\n" +
                "Rank: " + this.rank;
    } 
}
