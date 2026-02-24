package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia util ou nao
        // Considerando 1 como domingo
        byte dia = 2;
        boolean ehUtil = false;
        switch(dia)
        {
            case 1:
                ehUtil = false;
                break;
            case 2:
                ehUtil = true;
                break;
            case 3:
                ehUtil = true;
                break;
            case 4:
                ehUtil = true;
                break;
            case 5:
                ehUtil = true;
                break;
            case 6:
                ehUtil = true;
                break;
            case 7:
                ehUtil = false;
                break;
            default:
                System.out.println("Opcao Invalida");
        }
        if(ehUtil == true) {
            System.out.println("O dia indicado é útil");
        }
        else {
            System.out.println("O dia indicado não é útil");
        }


        // Outra maneira a pertir do Java 14

        switch (dia) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> throw new IllegalArgumentException("Unexpected value: " + dia);
        }
    }
}
