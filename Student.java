//N.K Nkidi 45979278
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Student class
public class Student extends UniversityStakeHolder {
    private double studentFees;
    private String qualification;
    private int yearOfStudy;
    
    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(String firstName, String lastName, int universityNumber, double studentFees, int yearOfStudy, String qualification) {
        super(firstName, lastName, universityNumber);
        this.studentFees = studentFees;
        this.yearOfStudy = yearOfStudy;
        this.qualification = qualification;
    }

    // Accessor/Getter methods
    public String getFirstName() {
        return super.getFirstName();
    }
    
    public String getLastName() {
        return super.getLastName();
    }

    public double getStudentFees() {
        return studentFees;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
    
    public String getQualification() {
        return qualification;
    }

    // Mutator/Setter methods
    public void setStudentFees(double studentFees) {
        this.studentFees = studentFees;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    // Implementing the institutionRole method
    @Override
    public void institutionRole() {
        System.out.println("Institution role: Attending classes, studying, and producing excellent academic records.");
    }
    
    @Override
    public String toString() {
        return "\nStudent" +
                "\nFirst name: " + getFirstName() + 
                "\nLast name: " + getLastName() + 
                "\nUniversity Number: " + getUniversityNumber() + 
                "\nStudent fees: R" + studentFees + 
                "\nYear of Study: " + yearOfStudy + 
                "\nQualification: " + qualification;
    }
}