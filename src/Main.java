import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Traziti unos velicine polja u koje korisnik kasnije unosi vrijednosti pojedinog elementa polja. Potrebno je ispisati maximalnu vrijednost elementa polja.
        // Npr, 3 je velicina polja te je korisnik unjeo 1,3,5. Program treba pronaci najvecu vrijednost te u obom slucaju ispisati 5.

        Scanner scanner = new Scanner(System.in);

        int[] arrayIntegera = new int[3];

        for (int i = 0; i < arrayIntegera.length; i++) {
            System.out.println("Unesi broj: ");
            arrayIntegera[i] = scanner.nextInt();
        }

        int maxInt = arrayIntegera[0];

        for (int broj : arrayIntegera) {
            if (broj > maxInt) {
                maxInt = broj;
            }
        }
        System.out.println("Najveći broj u polju je: " + maxInt);
    }
}