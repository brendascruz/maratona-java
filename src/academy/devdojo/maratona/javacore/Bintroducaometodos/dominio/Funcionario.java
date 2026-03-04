package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Idade do funcionario: "+this.idade);
        for(int i = 0; i < 3; i++){
            System.out.println("Salario "+i+": "+this.salario[i]);
        }
    }

    public void imprimeMedia(){
        double media = 0;
        for(int i = 0; i < 3; i++){
            media += this.salario[i];
        }
        media = media / 3;
        System.out.println("Media = "+media);
    }
}
