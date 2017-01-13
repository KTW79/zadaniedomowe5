package petlefor;

/**
 * Created by Kasia on 11.01.2017.
 */
public class FourBoard {
    public static void main(String[] args) {
        int[][] tab = new int[4][4];


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j]=i+j;
            }
        }

        for (int[] row : tab) {
            for (int cell : row) {//przypisz do każdej komórki liczbę z rzędu
                System.out.print(cell+" "); //wyświetl rząd i
            }
            System.out.println(); //nowa linia, następny rząd


        }
    }
}





        /*
        (Dodatkowe)	Napisz	program,	w	którym	zdefiniujesz	tablicę	dwuwymiarową	4x4.
        Korzystając	z	zagnieżdżonych	pętli	for	wypełnij	ją	liczbami	jak	przedstawiono
        poniżej:

0	1	2	3
1	2	3	4
2	3	4	5
3	4	5	6

korzystając	z	zagnieżdżonych	pętli	for-each	wyświetl	zawartość	tablicy	w
postaci	takiej	jak	powyżej.
         */



