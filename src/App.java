import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o seu cep: ");

        String cep = leia.nextLine();

        String enderecoEncontrado = ConsumoMaps.mostrarNoMaps(cep);

        System.out.println("O cep informado corresponde a: ");

        System.out.println(enderecoEncontrado);

        leia.close();
    }
}
