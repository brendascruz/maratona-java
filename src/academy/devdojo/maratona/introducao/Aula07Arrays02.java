package academy.devdojo.maratona.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String [3];
        nomes[0] = "Maki";
        nomes[1] = "Itadori";
        nomes[2] = "Gojo";

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
