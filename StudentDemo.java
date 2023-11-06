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
import classdistinctioncalculator.Student;
import classdistinctioncalculator.K12Student;
import classdistinctioncalculator.CollegeStudent;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author XXXXX08
 */

public class StudentDemo {

    Student allStudents[] = new Student[6];

    public static void main(String[] args) 
    {
       
        StudentDemo aDemo = new StudentDemo();
        aDemo.createStudents();
        aDemo.computeGPA();
        aDemo.summarizeTotals();
        
    }
    
    public void createStudents()
    {
        //Hard-code the values that will be used to create K12Student and CollegeStudent objects. 
        //Then, place each object into the array called myStudents.
        
        //For each object created, first create an arrayList of double grades, and add grades to the arrayList.
        //Then, create a K12Student object or a CollegeStudent object, using the arrayList of grades, and hard-coding the rest of the values.
        
        //Once the K12Student object or the CollegeStudent object is created, put it in the array called myStudents.

        ArrayList <Double> AGrades = new ArrayList<>();
        
        AGrades.add(100.0);
        AGrades.add(96.2);
        AGrades.add(85.3);
        AGrades.add(97.7);
        AGrades.add(99.6);
        Student Adriana = new K12Student ("2756389", "Adriana", "Alexandra", "Suarez", AGrades, 12);
        allStudents[0] = Adriana;
        
        ArrayList <Double> DGrades = new ArrayList<>();
        
        DGrades.add(98.0);
        DGrades.add(88.7);
        DGrades.add(86.9);
        DGrades.add(79.2);
        DGrades.add(76.4);
        Student Diana = new K12Student ("6498763", "Diana", "Monica", "Sanchez", DGrades, 8);
        allStudents[1] = Diana;
        
        ArrayList <Double> EGrades = new ArrayList<>();
        
        EGrades.add(70.5);
        EGrades.add(54.7);
        EGrades.add(53.8);
        EGrades.add(76.3);
        EGrades.add(62.2);
        Student Edward = new K12Student("5896277", "Edward", "Carlos", "Morales", EGrades, 1);
        allStudents[2] = Edward;
        
        ArrayList <Double> MGrades = new ArrayList<>();
        
        MGrades.add(95.6);
        MGrades.add(97.5);
        MGrades.add(99.5);
        MGrades.add(99.9);
        MGrades.add(94.8);
        Student Maria = new CollegeStudent("7613824", "Maria", " ", "Navarrete Aguirre", MGrades, 4);
        allStudents[3] = Maria;
        
        ArrayList <Double> RGrades = new ArrayList<>();
        
        RGrades.add(91.0);
        RGrades.add(92.3);
        RGrades.add(93.1);
        RGrades.add(92.7);
        RGrades.add(90.5);
        Student Marcos = new CollegeStudent("1268237", "Marcos", "Gerardo", "Rodriguez", RGrades, 1);
        allStudents[4] = Marcos;
        
        ArrayList <Double> FGrades = new ArrayList<>();
        
        FGrades.add(99.0);
        FGrades.add(96.2);
        FGrades.add(98.7);
        FGrades.add(97.3);
        FGrades.add(100.0);
        Student Steven = new CollegeStudent("4859464","Steven", "Nicholas", "Flores", FGrades, 2);
        allStudents[5] = Steven;
    }
    
    
    public void computeGPA()
    {
       //Iterate through the entire array of Student objects,  and 
       //polymorphically call the calculateGPA() method for each of the objects.
        for (Student stu: allStudents){
        
        stu.calculateGPA();
            System.out.println(stu);
        }
            
       
    }
    
    public void summarizeTotals()
    {
       //Print out the total number of college students created and the total number of K12 students.
       //Hint:  Use the static variable that was incremented by the constructor of each class
        System.out.println("Total number of K-12 students: " + K12Student.getK12StudentCount()); //same
        System.out.println("Total number of college students: "+CollegeStudent.getCollegeStudentCount()); //smae

        
        
        
    }
}
