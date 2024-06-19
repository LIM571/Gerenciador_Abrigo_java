import java.util.Scanner;

public class Abrigo {
    private String nome;
    private String localizacao;
    private int numVoluntarios;
    private int numAbrigados;
    private Voluntarios voluntarios;
    private ItensAbrigos itensAbrigo; // Adicionado para gerenciar itens

    public Abrigo(String nome, String localizacao, int numVoluntarios, int numAbrigados) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.numVoluntarios = numVoluntarios;
        this.numAbrigados = numAbrigados;
        this.voluntarios = new Voluntarios();
        this.voluntarios.numVoluntarios = numVoluntarios; // Inicializa com o valor passado no construtor
        this.itensAbrigo = new ItensAbrigos(); // Inicializa os itens do abrigo
    }

    public static Abrigo criarAbrigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do abrigo: ");
        String nomeAbrigo = scanner.nextLine();
        System.out.println("Insira o local do Abrigo: ");
        String localAbrigo = scanner.nextLine();
        System.out.println("Insira o número de voluntários: ");
        int numVoluntarios = scanner.nextInt();
        System.out.println("Insira o número de abrigados: ");
        int numAbrigados = scanner.nextInt();

        System.out.println("Abrigo criado com sucesso!");

        return new Abrigo(nomeAbrigo, localAbrigo, numVoluntarios, numAbrigados);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Número de Voluntários: " + voluntarios.getNumVoluntarios());
        System.out.println("Número de Abrigados: " + numAbrigados);
    }

    public String getNome() {
        return nome;
    }

    public Voluntarios getVoluntarios() {
        return voluntarios;
    }

    public ItensAbrigos getItensAbrigo() {
        return itensAbrigo;
    }

    public void adicionarAbrigado(int quantidade) {
        numAbrigados += quantidade;
        System.out.println("Número de abrigados atualizado: " + numAbrigados);
    }

    public void removerAbrigado(int quantidade) {
        numAbrigados -= quantidade;
        System.out.println("Número de abrigados atualizado: " + numAbrigados);
    }
}
