
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee implements Comparable<Employee>
{
    private String firstName;
    private String lastName;
    private int birthYear;    
    
    
    public Employee(String f, String l, int year)
    {
        firstName = f;
        lastName = l;
        birthYear = year;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getBirthYear() {return birthYear;}  
    
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " " + getBirthYear();
    }
    
    public int compareTo(Employee other) {
        if(getLastName().equals(other.getLastName())) {
            if(getFirstName().equals(other.getFirstName())) {
                return getBirthYear()-other.getBirthYear();
            }
            else return getFirstName().compareTo(other.getFirstName());
        }
        else return getLastName().compareTo(other.getLastName());
    }
}
