import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        Scanner input = new Scanner(System.in);
        String cep = input.nextLine();
        input.close();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
    }

}

