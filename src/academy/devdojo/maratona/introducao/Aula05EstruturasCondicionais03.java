package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 70000;
        double valorDaTaxa;
        if (salario <= 34712){
            valorDaTaxa = salario * 0.097;
        }
        else if(salario <= 68507){
            valorDaTaxa = salario * 0.3735;
        }
        else{
            valorDaTaxa = salario * 0.4950;
        }
        System.out.println(valorDaTaxa);
    }
}
