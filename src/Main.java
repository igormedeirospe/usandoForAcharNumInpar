//algoritimo que solicita um número inteiro positivo ao usuario e no final
//imprima os numeros inpares do 1 até o numero que o usuario digitou

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        int digiteNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo"));

        for (int i = 1; i <= digiteNumero; i++) {
            if (i % 2 == 1){
                System.out.println("Impar: " + i);
            }

        }


    }
}