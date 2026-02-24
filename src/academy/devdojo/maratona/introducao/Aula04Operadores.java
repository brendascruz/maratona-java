package academy.devdojo.maratona.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);
        //Diferentes usos do operador '+'
        //System.out.println(numero01+numero02+"Valor "+numero01+numero02);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);

        // && (AND) || (OU) ! (NÃO)
        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlay = 5000F;
        boolean isPlayCincoCompravel = valorTotalCorrente > valorPlay || valorTotalPoupanca > valorPlay;
        System.out.println("isPlayCincoCompravel "+isPlayCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; //3600
        System.out.println("bonus "+bonus);

        // ++ --
        int cont = 0;
        cont++;
        cont--;
        ++cont;
        --cont;
        int cont2 = 0;
        System.out.println(cont2++); //primeiro executa e depois incrementa
        System.out.println(++cont2); //incremente e depois executa
    }
}
