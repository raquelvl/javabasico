package p2.exemplos;

import java.util.Scanner;

/*
 * "Ler 3 números inteiros da entrada, imprimir o menor
 * e o maior"
 *
 * Autor: Jacques Sauvé
 */
public class MinMax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();
        int mínimo;
        int máximo;
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    mínimo = n2;
                } else {
                    mínimo = n3;
                }
                máximo = n1;
            } else {
                if (n1 < n2) {
                    mínimo = n1;
                } else {
                    mínimo = n2;
                }
                máximo = n3;
            }
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    mínimo = n1;
                } else {
                    mínimo = n3;
                }
                máximo = n2;
            } else {
                if (n1 < n2) {
                    mínimo = n1;
                } else {
                    mínimo = n3;
                }
                máximo = n3;
            }
        }
        sc.close();
        System.out.println("O menor numero eh: " + mínimo);
        System.out.println("O maior numero eh: " + máximo);
    }
}
