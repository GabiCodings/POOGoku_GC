package org.example;

public class Aluni {
    Integer matricula;
    String nome;
    double nota1_prova;
    double  nota2_prova;
    double nota_trabalho;

    public void calcularMedia () {
        double media = ((nota1_prova * 2.5) + (nota2_prova * 2.5) + (nota_trabalho * 2))/7;

        if (media >= 6) {
            System.out.println("pazo");
        } else {
            System.out.println("nao pazo");
        }
    }


}
