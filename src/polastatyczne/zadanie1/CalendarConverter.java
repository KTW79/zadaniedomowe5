package polastatyczne.zadanie1;

/**
 * Created by Kasia on 12.01.2017.
 */
public class CalendarConverter {

    public static final int MONDAY =1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String Day;


    public static String convertDayToString(int	dayNumber){
        switch (dayNumber){
            case 1:
                Day = "poniedziałek.";
                break;
            case 2:
                Day = "wtorek.";
                break;
            case 3:
                Day = "środa.";
                break;
            case 4:
                Day = "czwartek.";
                break;
            case 5:
                Day = "piątek.";
                break;
            case 6:
                Day = "sobota.";
                break;
            case 7:
                Day = "niedziela.";
                break;
        }

        return Day;
    }
}


    /*
    tej	zdefiniuj	także	statyczną	metodę	o	sygnaturze:	String	convertDayToString
    (int	dayNumber)	która	przyjmuje	liczbę	reprezentującą	dzień	tygodnia	i
    zwraca	dzień	tygodnia	w	postaci	Stringa.	Np.	dla	argumentu	1	powinna	zwrócić
    "Poniedziałek".	W	metodzie	wykorzystaj	konstrukcję	switch	oraz	wcześniej	zdefiniowane	stałe.
     */



