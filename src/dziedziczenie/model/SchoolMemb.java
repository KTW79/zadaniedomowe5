package dziedziczenie.model;

/**
 * Created by Kasia on 12.01.2017.
 */
public class SchoolMemb {
    private String firstName;
    private String lastName;

    public SchoolMemb(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void show(){
        System.out.print("\nImię: " + firstName + "\nNazwisko: " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
