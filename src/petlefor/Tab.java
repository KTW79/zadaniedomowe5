package petlefor;

import java.util.Random;

/**
 * Created by Kasia on 11.01.2017.
 */
public class Tab {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();


        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
            System.out.println("Miejsce w tabeli: " + i + " Wygenerowane liczby: " + tab[i]);
        }

        System.out.println("Wielkość tablicy = " + tab.length);
        int mniejsze = 0;
        int wieksze = 0;
        int parzyste = 0;
        int nieparzyste = 0;

        for (int los: tab) {//int los liczba tymczasowa jakaś
            if (los < 50) {
                mniejsze = mniejsze+1;}
            if (los > 50) {
                wieksze = wieksze+1;}
            if (los % 2 == 0) {
                parzyste = parzyste+1;
            } else {
                nieparzyste = nieparzyste+1;}
        }
        System.out.println("Ilość liczb mniejszych od 50 to: " + mniejsze);
        System.out.println("Ilość liczb większych od 50 to: " + wieksze );
        System.out.println("Ilość liczb parzystych to: " + parzyste );
        System.out.println("Ilość liczb nieparzystych to: " + nieparzyste );

    }
}



    /*
    Napisz	program,	w	którym	utworzysz	tablicę	100	liczb	całkowitych.	Przy	użyciu	pętli	for
    uzupełnij	ją	najpierw	losowymi	liczbami.	Następnie	w	pętli	for-each	policz:
    a. ilość liczb	mniejszych	od	50
    b. ilość	liczb	większych	od	50
    c. ilość	liczb	parzystych
    d. ilość	liczb	nieparzystych
    Do	utworzenia	liczby	losowej	wykorzystaj	metodę	nextInt()	klasy	Random.
    Przykład	wykorzystania:	Random random = new Random(); int los = random.nextInt(1000);
    metoda	nextInt()	zwróci	pseudolosową	liczbę	z	przedziału	0-999
     */



