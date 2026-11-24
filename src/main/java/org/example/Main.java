package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluni aluno = new Aluni();
        aluno.nota1_prova = 8;
        aluno.nota2_prova = 7;
        aluno.nota_trabalho = 5;

        aluno.calcularMedia();

    }
}