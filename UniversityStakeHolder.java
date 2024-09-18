//N.K Nkidi 45979278
/**
 * Write a description of class UniversityStakeHolder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Abstract UniversityStakeHolder class
public abstract class UniversityStakeHolder implements Comparable<UniversityStakeHolder> {
    private String firstName;
    private String lastName;
    private int universityNumber;
    
    //Default Constructor
    protected UniversityStakeHolder() {}
    
    //Parameterized Constructor
    protected UniversityStakeHolder(String firstName ,  String lastName , int universityNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityNumber = universityNumber;
    }
    
    //Accessor/Getter methods
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getUniversityNumber() {
        return universityNumber;
    }

    //Mutator/Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setUniversityNumber(int universityNumber) {
        this.universityNumber = universityNumber;
    }
    
    //Abstract method
    public abstract void institutionRole();

    @Override
    public String toString() {
        return "\nStakeholder" +
                "\nFirst name: " + firstName + 
                "\nLast name: " + lastName + 
                "\nUniversity Number: " + universityNumber;
    }

    // Implement compareTo to compare UniversityStakeHolders based on universityNumber
    @Override
    public int compareTo(UniversityStakeHolder other) {
        return Integer.compare(this.universityNumber, other.universityNumber);
    }
}

