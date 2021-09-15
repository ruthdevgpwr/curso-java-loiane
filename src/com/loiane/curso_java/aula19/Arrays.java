package com.loiane.curso_java.aula19;

public class Arrays {

    public static void main(String[] args) {

//        double tempDia01 = 31.3;
//        double tempDia02 = 32;
//        double tempDia03 = 33.7;
//        double tempDia04 = 34;
//        double tempDia05 = 33.1;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O tamanho do Array: " + temperaturas.length);
        System.out.println("Valores do array: " + temperaturas);
        //[D@5fd0d5ae - endereço da memória em que o Array está apontando

        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
        }

        //for melhorado
        //iterar o array
        for (double temp : temperaturas){
            System.out.println(temp);

        }

    }
}
