/**
 * Created by fox on 19.09.17.
 */
public class Students {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String group;

    Students (String firstName, String lastName, String group, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.yearOfBirth=yearOfBirth;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getGroup() {return group;}
    public int getYearOfBirth() {return yearOfBirth;}

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

}
