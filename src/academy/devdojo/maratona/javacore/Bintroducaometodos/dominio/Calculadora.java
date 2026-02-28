package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(69 - 2);
    }

    public void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
}
