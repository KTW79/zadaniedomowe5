package polastatyczne.zadanie1;



/**
 * Created by Kasia on 12.01.2017.
 */
public class ConverterTest {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            System.out.println(i + " dzień tygodnia to " + CalendarConverter.convertDayToString(i));

        }
    }
}
