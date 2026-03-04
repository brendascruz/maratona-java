package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Brenda";
        funcionario.idade = 18;
        funcionario.salario = new double[3];
        funcionario.salario[0] = 2900;
        funcionario.salario[1] = 3600;
        funcionario.salario[2] = 1600;
        funcionario.imprime();
        funcionario.imprimeMedia();
    }




}
