/*
 * @author XXXXX08
 *
 * @version 1.0 09/20/2020
 *
 * Title: Polymorphism Student, K12Student, CollegeStudent
 *
 * Semester: Fall 2020
 *
 * Lecturer's Name: C. Charters
 */

package classdistinctioncalculator;

import java.util.ArrayList;
import classdistinctioncalculator.Student;

/**
 *
 * @author XXXXX08
 */

public class CollegeStudent extends Student  {
    
    //These instance variables are in addition to the inherited instance variables of the Student superclass:
    private int yearInCollege;
    private String levelOfDistinction;
    private static int collegeStudentCount;
   
    
    public CollegeStudent(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades, int aYearInCollege)
    {
       //Code the constructor, referencing the superclass constructor for the inherited attributes, 
       //and then initialize the rest of the instance variables from this subclass.
       //Increment the static variable, collegeStudentCount.
        
        super(anId, aFirstName, aMiddleName,aLastName,aListOfGrades);
        yearInCollege = aYearInCollege;
        collegeStudentCount++;
    }    
    
    public void setYearInCollege(int aYearInCollege)
    {
        yearInCollege = aYearInCollege;
    }
    
    public int getYearInCollege()
    {
        return yearInCollege;
    }
    
    public void setLevelOfDistinction(String aLevelOfDistinction)
    {
        levelOfDistinction = aLevelOfDistinction;
    }
    
    public String getLevelOfDistinction()
    {
        return levelOfDistinction;
    }
    
    public static int getCollegeStudentCount()
    {
        return collegeStudentCount;
    }
    
    @Override
    public double calculateGPA()
    {
       double totGrades = 0;
       double avgGrade;
       ArrayList<Double> officialGrades = new ArrayList<Double>(getGrades());  
       
       for (int i = 0; i < getGrades().size();i++){
       
           totGrades += officialGrades.get(i);
       }
       
       avgGrade = totGrades/getGrades().size();
       
       if(avgGrade >= 98){
       
           setLevelOfDistinction("Summa Cum Laude");
       }else if(avgGrade >= 95){
       
           setLevelOfDistinction("Magna Cum Laude");
       }else if(avgGrade >= 90){
       
           setLevelOfDistinction("Cum Laude");
       }
      
       
       return Math.round(avgGrade);
       //return the avgGrade after you have rounded it to the nearest whole number
      
       
     
    }
        
    @Override
    public String toString()
    {
       //return all the values in the superclass plus the values in the subclass, referencing the superclass .toString()
       return super.toString() + "Current grades are: " + super.getGrades() + "---" + "\nYears"
               + " in College: " + yearInCollege + " ---" + " Rank in School: " + levelOfDistinction + " ---" + " GPA = " + calculateGPA()+"\n";
    }      
    
        //calculateYearsLeft() method calculates and returns number of years left in college.
   public int calculateYearsLeft()
    {
       
        //return the yearInCollege subtracted from 4, since 4 is usual number of years spent in college to get a bachelor's degree
       
        int yearsLeft = 4 - yearInCollege;
        return yearsLeft;
    }
   
   
}
