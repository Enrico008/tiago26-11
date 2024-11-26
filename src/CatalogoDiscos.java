import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoDiscos {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Disco> discos = new ArrayList<>();
    static ArrayList<Artista> artistas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Cadastrar Disco | 2. Cadastrar Artista | 3. Listar Tudo | 4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) discos.add(new Disco(le("Título"), Integer.parseInt(le("Ano")), le("Faixas")));
            else if (opcao == 2) artistas.add(new Artista(le("Nome"), le("Gênero")));
            else if (opcao == 3) listar();
            else if (opcao == 4) break;
        }
    }

    static String le(String mensagem) {
        System.out.println(mensagem + ":");
        return scanner.nextLine();
    }

    static void listar() {
        System.out.println("Discos:");
        for (Disco disco : discos)
            System.out.println("Título: " + disco.titulo + ", Ano: " + disco.ano + ", Faixas: " + disco.faixas);
        System.out.println("Artistas:");
        for (Artista artista : artistas)
            System.out.println("Nome: " + artista.nome + ", Gênero: " + artista.genero);
    }
}
