package com.loiane.curso_java.aula49;

public class FinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " /" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
                System.exit(0);
            }
            finally {
                System.out.println("Essa liha é impressa sempre após o try e o catch");
                System.out.println();
            }
        }
    }
}
