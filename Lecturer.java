//N.K Nkidi 45979278
/**
 * Write a description of class Professor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Lecturer class
public class Lecturer extends UniversityStakeHolder {
    private String faculty;
     
    public Lecturer() {}
    
    //Parameterized Constructor
    public Lecturer(String firstName, String lastName, int universityNumber, String faculty) {
        super(firstName, lastName, universityNumber);
        this.faculty = faculty;
    }
    
    //Accessor/Getter methods
    public String getFaculty() {
        return faculty;
    }
    
    //Mutator/Setter methods
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    //Implementing the institutionRole method
    @Override
    public void institutionRole() {
        System.out.println("Institution role: Teaching, student support, administrative duties, and conducting research.");
    }
    
    @Override
    public String toString() {
        return "\nLecturer" +
                "\nFirst name: " + getFirstName() + 
                "\nLast name: " + getLastName() + 
                "\nUniversity Number: " + getUniversityNumber() + 
                "\nFaculty: " + faculty;
    }
}
