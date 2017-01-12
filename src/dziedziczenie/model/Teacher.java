package dziedziczenie.model;

/**
 * Created by Kasia on 12.01.2017.
 */
public class Teacher extends SchoolMemb{

    private String academicDegree;

    public Teacher(String firstName, String lastName, String academicDegree) {
        super(firstName,lastName);
        this.academicDegree = academicDegree;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\nStopień naukowy: " + academicDegree);
    }


    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }
}
