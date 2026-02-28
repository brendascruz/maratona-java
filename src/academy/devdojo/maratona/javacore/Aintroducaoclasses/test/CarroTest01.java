package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Grauzinho";
        carro1.modelo = "Ford Ka";
        carro1.ano = 2014;

        carro2.nome = "BebeMuito";
        carro2.modelo = "Dodge RAM";
        carro2.ano = 2019;

        System.out.println("Carro 1 ");
        System.out.println("Nome: "+carro1.nome + " Idade: " + carro1.ano + " Modelo: " + carro1.modelo);
        System.out.println("Carro 2 ");
        System.out.println("Nome: "+carro2.nome + " Idade: " + carro2.ano + " Modelo: " + carro2.modelo);
    }
}
