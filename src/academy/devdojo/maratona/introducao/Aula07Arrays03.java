package academy.devdojo.maratona.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {67, 69};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};
        for(int numero : numeros2){
            System.out.println(numero);
        }
        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
