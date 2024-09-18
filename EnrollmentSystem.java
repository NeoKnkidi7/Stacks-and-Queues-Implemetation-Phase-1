
/**
 * Write a description of class EnrollmentSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnrollmentSystem
{
    private QueueAsMyLinkedList<Student> theEnrollmentQueue;
    private StackAsMyLinkedList<String> theStack;
    private StackAsMyLinkedList<String> theRedoStack;

    public EnrollmentSystem() {
        theEnrollmentQueue = new QueueAsMyLinkedList<>();
        theStack = new StackAsMyLinkedList<>();
        theRedoStack = new StackAsMyLinkedList<>();
    }

    //Method to Enroll a new student
    public void enrollmentOfStudent(Student student) {
        theEnrollmentQueue.enqueue(student);
        theStack.push("Currently pnrolled: " + student.getFirstName() + " " + student.getLastName());
        // Clear the redo stack on a new action
        theRedoStack.clear(); 
        //Displaying enrolled Student
        System.out.println(student.getFirstName() + " " + student.getLastName() + " has been enrolled.");
    }

    // Method to Process the next student in the queue
    public void processingOfNextStudent() {
        Student student = theEnrollmentQueue.dequeue();
        if (student != null) {
            theStack.push("Student processed: " + student.getFirstName() + " " + student.getLastName());
            // Clear the redo stack on a new action
            theRedoStack.clear(); 
            System.out.println("Student processed: " + student.getFirstName() + " " + student.getLastName());
        } else {
            System.out.println("No students available  to process.");
        }
    }

    //Method to  undo the last action
    public void undoingLastAction() {
        if (!theStack.toString().equals("[]")) {
            String lastAction = theStack.pop();
            theRedoStack.push(lastAction);
            System.out.println("Undoing action: " + lastAction);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    //Method ro redo the last undone action
    public void redoingLastAction() {
        if (!theRedoStack.toString().equals("[]")) {
            String lastUndoneAction = theRedoStack.pop();
            theStack.push(lastUndoneAction);
            System.out.println("Redoing action: " + lastUndoneAction);
        } else {
            System.out.println("No actions to redo.");
        }
    }

    // Method to display the current output state of the system
    public void displayalOfOutputStateSystem() {
        System.out.println("\nCurrent Enrollment Queue: " + theEnrollmentQueue.toString());
        System.out.println("Current Stack: " + theStack.toString());
        System.out.println("Redo Stack: " + theRedoStack.toString());
    }
    
    
    
}
