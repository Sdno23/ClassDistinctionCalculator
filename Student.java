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
import classdistinctioncalculator.StudentCalculations;

/**
 *
 * @author XXXXX08
 */

public abstract class  Student implements StudentCalculations  {
    
    private String idNum;
    private String firstName;
    private String middleName;
    private String lastName;
    private ArrayList<Double> grades;
    
    public Student(String anId, String aFirst, String aMiddle, String aLast, ArrayList<Double> ListOfGrades)
    {
        idNum = anId;
        firstName = aFirst;
        middleName = aMiddle;
        lastName = aLast;
        grades = new ArrayList<Double>(ListOfGrades);
    }
    
    public String getId()
    {
        return idNum;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getMiddleName()
    {
        return middleName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public ArrayList getGrades()
    {
        return grades;
    }
    
    public void setId(String anId)
    {
        idNum = anId;
    }
    
    public void setFirstName(String aFirst)
    {
        firstName = aFirst;
    }
    
    public void setMiddleName(String aMiddle)
    {
        middleName = aMiddle;
    }
    
    public void setLastName(String aLast)
    {
        lastName = aLast;
    }
    
    public void setGrades(ArrayList ListOfGrades)
    {
        grades = ListOfGrades;
    }
    
    public String toString()
    {
        return idNum + " " + "--- " + lastName + ", " + firstName + " "+ middleName + " " + " --- ";
    }
    public abstract double calculateGPA();
   
   
    
    public abstract int calculateYearsLeft();
    //This is an abstract method that must be coded "concretely" in each of the subclasses.
    
   
    }
