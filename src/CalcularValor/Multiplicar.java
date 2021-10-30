package CalcularValor;

import java.util.function.UnaryOperator;

public class Multiplicar {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 30;
        int valor = 120;
        System.out.println("O resultado é :: " + calcularValorVezesTrinta.apply( 120));
    }
}
