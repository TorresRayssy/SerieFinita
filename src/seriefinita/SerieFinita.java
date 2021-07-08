package seriefinita;

import java.util.Scanner;

public class SerieFinita {

    public static void main(String[] args) {
        int n = 1, s;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o final da série numérica: ");
        s = teclado.nextInt();

        for (n = 1; n <= s; n += 2) {
            System.out.println(" " + n);

        }
    }
}
