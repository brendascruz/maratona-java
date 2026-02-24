package academy.devdojo.maratona.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int [3];
        for(int i = 0; i < idades.length; i++){
            idades[i] = i;
        }
        // idade : idades -> para cada idade dentro de idades
        // idade é a variável temporária que vai
        // receber cada valor do array
        for (int idade : idades) {
            System.out.println(idade);
        }
    }
}
