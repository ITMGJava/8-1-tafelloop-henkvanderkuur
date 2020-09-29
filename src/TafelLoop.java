import java.util.Scanner;

public class TafelLoop {

    public static void main(String[] args) {
        var eenkeer = 1;
        while (eenkeer > 0) {
            System.out.println();
            System.out.print("Welk getal wil je vermenigvuldigen met 1 tot en met 10? ");
            var s = new Scanner(System.in);
            var tafelgetal = s.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + tafelgetal + " = " + i * tafelgetal);
            }
            System.out.println();
            System.out.print("NOG EEN KEER? (ja of nee):  ");
            var n = new Scanner(System.in);
            var nogeenkeer = n.nextLine();
            nogeenkeer = nogeenkeer.toLowerCase();
            if (nogeenkeer.equals("nee")) {
                System.out.println();
                System.out.println("BEDANKT EN TOT ZIENS!");
                System.out.println();
                System.out.println();
                eenkeer = eenkeer - 1;
            }
        }
    }
}

