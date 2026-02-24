package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 1000000
        for(long i = 0; i <= 1000000; i+=2){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
