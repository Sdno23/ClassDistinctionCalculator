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

public class K12Student extends Student {
    
    private int yearsK12School;
    private double standing;
    private static int k12StudentTotal;
   
    
    public K12Student(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades, int aYearInK12School)
    {
       //Call the super class constructor, then initialize the instance variables of this subclass.
       //Increment the static variable, k12StudentCount.
       super(anId, aFirstName, aMiddleName, aLastName, aListOfGrades);
       yearsK12School = aYearInK12School;
       k12StudentTotal++;
        
    }    
    
    public void setYearInK12School(int aYearInK12School)
    {
        yearsK12School = aYearInK12School;
    }
    
    public int getYearInK12School()
    {
        return yearsK12School;
    }
    
    public void setRank(double aStanding)
    {
        standing = aStanding;
    }
    
    public double getRank()
    {
        return standing;
    }
    
    public static int getK12StudentCount()
    {
        return k12StudentTotal;
    }
    
    @Override
    public double calculateGPA()
    {
       double totGrades = 0;
       double avgGrades;
       ArrayList<Double> officialGrades = new ArrayList<Double>(getGrades());  //copy the arrayList from the instance variable to this local variable.
      
      for (int i = 0; i < getGrades().size(); i++){
      
      totGrades += officialGrades.get(i);
      }
      
      avgGrades = totGrades/getGrades().size();
       
      if (avgGrades >= 90){ //avgGrades >= 90 ---> .10 (as in top 10%)
          setRank(10);
     }
      
      else if (avgGrades >= 80){ //avgGrades >= 80 ---> .20
          setRank(20);
     }
      
      else if(avgGrades >= 70){ //avgGrades >= 70 ---> .30
         setRank(30);
     }
      
      else if(avgGrades >= 60){ //avgGrades >= 60 ---> .40
         setRank(40);
     }
      
      else if(avgGrades >= 50){ //avgGrades >= 50 ---> .50
         setRank(50);
     }
      
     else if(avgGrades >= 40){ //avgGrades >= 40 ---> .60
         setRank(60);
     }
     
     else if(avgGrades >= 30){ //avgGrades >= 30 ---> .70
         setRank(70);
     }
     
     else if(avgGrades >= 20){ //avgGrades >= 20 ---> .80
         setRank(80);
     }
     
     else if(avgGrades >= 10){ //avgGrades >= 10 ---> .90
         setRank(90);
     }
     
     else{                     //avgGrades < 10 --->  1
         setRank(100);
     }
     
     return Math.round(avgGrades); //return the avgGrade rounded to the nearest whole number:  
    }
        
  @Override
    public String toString()
    {
         //return all the values in the superclass plus the values in the subclass, referencing the superclass .toString()
        return super.toString() + "current grades are: " + super.getGrades() + " ---" + " \nYears in grade school: " + yearsK12School + " ---" 
                + " Class Standing: " + getRank() + "th percentile" + " ---" + " Grade Point Average: " + calculateGPA()+"\n";
    }  
    
    @Override
    
    
         //calculateYearsLeft() method calculates and returns number of years left in school.
    public int calculateYearsLeft()
    {

       //return the yearInK12School subtracted from 12, since 12 is usual number of years spent in K - 12
        
        int yearLeft = 12 - yearsK12School;
        return yearLeft;
    }
    
   
}
