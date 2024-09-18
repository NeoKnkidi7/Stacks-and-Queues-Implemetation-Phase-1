//N.K Nkidi 45979278
/**
 * Write a description of class universityTestProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class universityTestProgram
{
    public static void main(String[] args) {
        UniversityStakeHolder student = new Student("Neo", "Nkidi",45979278, 456769 , 2 , "Bachelor of Science in IT");
        UniversityStakeHolder lecturer = new Lecturer("Dr. Katleho", "Nkwali" ,20385046, "Faculty of Mathematics and Computer Science");

    
        //Institution role(Polymorphism
        student.institutionRole();
        lecturer.institutionRole();

        // toString explicit call
        System.out.println(student.toString());
        System.out.println(lecturer.toString());

        // toString implicit call
        System.out.println(student);
        System.out.println(lecturer);
        
        //creating new 2 student instances
        Student student2 = new Student("Alice", "Mbele",46998238, 456769 , 1 , "Bachelor of Pharmacy");
        Student student3 = new Student("Josh", "Connor",56699272, 456769 , 3 , "Bachelor of Medicine and Bachelor of Surgery");
        
        //creating new 2 lecturer instances
        Lecturer lecturer2 = new Lecturer("Mr John", "Snyman" ,16375949, "Faculty of Health Sciences");
        Lecturer lecturer3 = new Lecturer("Miss Zamukuhle", "Moloi" ,12475229, "Faculty of Education");
        
        //Creating an array of stakeholders
        UniversityStakeHolder stakeholders[] = new UniversityStakeHolder[6];
        stakeholders[0] = student;
        stakeholders[1] = lecturer;
        stakeholders[2] = student2;
        stakeholders[3] = student3;
        stakeholders[4] = lecturer2;
        stakeholders[5] = lecturer3;
        
        //Displaying institution roloe for each stakeholder
        for (int i = 0; i < stakeholders.length; i++) {
            System.out.println("\n Stakeholder[" + i + "]: " + stakeholders[i]);
            stakeholders[i].institutionRole();
        }
        
        //Comparing student intsances that have the sasme values but different addresses as they are different intsances
        Student student4 = new Student("Jenny", "Mokoena", 56095838, 5000.0, 2 , "Bachelor of Forensic Science");
        Student student5 = new Student("Jenny", "Mokoena", 56095838, 5000.0, 2 ,"Bachelor of Forensic Science");
        
        //Comparing using the .equals method in a if-else statement
        if(student4.equals(student5))
        {
            System.out.println("\n Student4 == Student5");
        }
        else{
            System.out.println("\n Student4 != Student5");
            
        }
        
        
    }
   
}
