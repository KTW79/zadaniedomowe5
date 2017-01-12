package petlefor;

/**
 * Created by Kasia on 11.01.2017.
 */
public class ListNumb {
    public static void main(String[] args) {
        //Korzystając	z	pętli	for	wyświetl	wszystkie	liczby	z	przedziału	[0;	100],	które	są
        // jednocześnie	podzielne	przez	3	i	5	(np.	15).
        int[] tab = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}