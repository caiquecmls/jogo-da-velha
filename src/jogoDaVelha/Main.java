/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoDaVelha;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class Main {

    public static void main(String[] args) {
        char matriz[][] = new char[3][3];
        initialize(matriz);
        imprimirMatriz(matriz);
        int linha, coluna;
    }
    public static Scanner sc = new Scanner(System.in);

    public static char[][] initialize(char matrizA[][]) {
        char matriz[][] = new char[3][3];
        String auxiliar = " ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = auxiliar.charAt(0);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(char matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("| " + matriz[i][j] + " |");
            }
            System.out.println("");
        }
    }

}
