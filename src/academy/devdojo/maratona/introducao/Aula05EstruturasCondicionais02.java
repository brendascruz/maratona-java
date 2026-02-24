package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // Operador Ternario
        // Doar se salario > 5000
        double salario = 2000;

        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas um dia terei";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);


    }
}
