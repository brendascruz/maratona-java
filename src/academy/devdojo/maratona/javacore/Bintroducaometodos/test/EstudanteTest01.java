package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("###################");
        // Apos a mudanca dentro do imprime
        System.out.println(estudante01.nome);
        System.out.println(estudante02.nome);
        // Quando o parametro é do tipo referencia
        // Qualquer mudança no parametro afeta o objeto
        // O chamado se refere a onde o objeto esta guardado
        // Diferente do tipo primitivo ele muda os valores dentro
        // Estudante.nome = "Brenda" usado ali muda o valor do nome
        // Pois ele esta mexendo no local do objeto


    }
}
