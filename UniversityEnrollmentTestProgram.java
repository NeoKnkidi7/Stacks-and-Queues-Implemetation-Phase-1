
/**
 * Write a description of class UniversityEnrollmentTestProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniversityEnrollmentTestProgram
{
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new EnrollmentSystem();

        //Student side
        //Craeting student objects 
        Student student1 = new Student("Neo", "Nkidi", 45979278, 45000.0, 2, "Bachelor of Science in IT");
        Student student2 = new Student("Alice", "Mbele", 46998238, 52000.0, 1, "Bachelor of Pharmacy");
        Student student3 = new Student("Zamokuhle", "Moloi", 56699272, 60000.0, 3, "Bachelor of Education");

        //Populating enrollment with student objects
        enrollmentSystem.enrollmentOfStudent(student1);
        enrollmentSystem.enrollmentOfStudent(student2);
        enrollmentSystem.enrollmentOfStudent(student3);

        // Displaying thes system state
        enrollmentSystem.displayalOfOutputStateSystem();

        // Processing the students
        enrollmentSystem.processingOfNextStudent();
        enrollmentSystem.processingOfNextStudent();

        // Displaying thes system state
        enrollmentSystem.displayalOfOutputStateSystem();

        // Undoing the last action
        enrollmentSystem.undoingLastAction();
        
        // Displaying thes system state
        enrollmentSystem.displayalOfOutputStateSystem();

        // Redoing the last undone action
        enrollmentSystem.redoingLastAction();

        // Displaying thes system state
        enrollmentSystem.displayalOfOutputStateSystem();
        
        
        
        
    }
}
