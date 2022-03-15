package com.br.eti.emanuel.exemplotrycatch;

import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args) {

        boolean continueLoop = true;

        int[] matrizA = new int[3];
        Scanner t = new Scanner(System.in);
        int posicao;
        int valor;

        do {
            try {
                System.out.println("Escolha a posição da matriz: ");
                posicao = t.nextInt();

                System.out.println("Informe o valor: ");
                valor = t.nextInt();
                matrizA[posicao] = valor;
                continueLoop = false;

                System.out.println("Elemento da matriz " + posicao + " : " + valor);
                
            } catch (ArrayIndexOutOfBoundsException erro) {///erro é o nome da var dada ao problema no prompt 

                System.out.println("Exception: " + erro);
                System.out.println("Maximo de elemento possivel atingido, selecione até o 3 \n\n");
            }

        } while (continueLoop);
        
    }
}
