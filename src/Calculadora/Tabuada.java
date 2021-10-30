package Calculadora;

import java.util.function.UnaryOperator;

public class Tabuada {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezesCinquenta = valor -> valor * 50;
        int valor = 8;
        System.out.println("O resultado é :: " + calcularValorVezesCinquenta.apply( 8));
    }

    //Esta tabuada, você pode acrescentar o algoritmo que desejar.
}
