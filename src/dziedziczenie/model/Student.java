package dziedziczenie.model;

/**
 * Created by Kasia on 12.01.2017.
 */
public class Student extends SchoolMemb{
    private int indexNumber;

    public Student(String firstName, String lastName, int indexNumber) {
        super(firstName,lastName);
        this.indexNumber = indexNumber;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\nNumer indeksu: " + indexNumber);
    }


    public double getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}


