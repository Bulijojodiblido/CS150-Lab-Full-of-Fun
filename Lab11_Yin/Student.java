
/**
 * Student 
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String studentID;

    /**
     * Student Constructor
     *
     * @param fN fisrt name
     * @param lN lsst name
     * @param iD student ID
     */
    public Student(String fN, String lN, String iD)
    {
        firstName=fN;
        lastName=lN;
        studentID=iD;
    }
    
    /**
     * Student Constructor
     *
     * @param iD student ID
     */
    public Student(String iD)
    {
        studentID=iD;
    }

    
    /**
     * Getter of first name
     *
     * @return first name
     */
    public String getFN(){
        return firstName;
    }
    
    /**
     * Getter of last name
     *
     * @return last name
     */
    public String getLN(){
        return lastName;
    }
    
    /**
     * Getter of student ID
     *
     * @return student ID
     */
    public String getID(){
        return studentID;
    }
    
    /**
     * Setter of first name
     *
     * @param fN first name to set as
     */
    public void setFN(String fN){
        firstName=fN;
    }
    
    /**
     * Setter of last name
     *
     * @param lN last name to set as
     */
    public void setLN(String lN){
        lastName=lN;
    }
    
    /**
     * Setter of student ID
     *
     * @param iD student ID to set as
     */
    public void setID(String iD){
        studentID=iD;
    }
    
    public int hashCode(){
        return studentID.hashCode();
    }
    
    public boolean equals(Object b){
        return (studentID.compareTo(((Student)b).getID())==0);
    }
    
}
