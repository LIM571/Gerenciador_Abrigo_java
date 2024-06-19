import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItensAbrigos meusItens = new ItensAbrigos();
        ArrayList<Abrigo> meusAbrigos = new ArrayList<>();
        boolean sair = false;

        while (!sair) {
            System.out.println("********************\n" +
                    "1-Consultar abrigos\n" +
                    "2-Criar abrigos\n" +
                    "3-Gerenciar meu Abrigo\n" +
                    "4-Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    if (!meusAbrigos.isEmpty()) {
                        for (int i = 0; i < meusAbrigos.size(); i++) {
                            System.out.println("Abrigo " + (i + 1) + ":");
                            meusAbrigos.get(i).mostrarInformacoes();
                        }
                    } else {
                        System.out.println("Nenhum abrigo criado ainda.");
                    }
                    break;
                case 2:
                    System.out.println("Criador de Abrigo");
                    Abrigo novoAbrigo = Abrigo.criarAbrigo();
                    meusAbrigos.add(novoAbrigo);
                    System.out.println("Abrigo criado com sucesso!");
                    break;
                case 3:
                    if (meusAbrigos.isEmpty()) {
                        System.out.println("Nenhum abrigo criado ainda. Crie um abrigo primeiro.");
                        break;
                    }

                    System.out.println("Selecione o número do abrigo que deseja gerenciar: ");
                    for (int i = 0; i < meusAbrigos.size(); i++) {
                        System.out.println((i + 1) + " - " + meusAbrigos.get(i).getNome());
                    }

                    int abrigoSelecionado = scanner.nextInt() - 1;
                    if (abrigoSelecionado < 0 || abrigoSelecionado >= meusAbrigos.size()) {
                        System.out.println("Abrigo inválido.");
                        break;
                    }

                    Abrigo abrigoAtual = meusAbrigos.get(abrigoSelecionado);
                    boolean sairGerenciar = false;
                    while (!sairGerenciar) {
                        System.out.println("Gerenciador de abrigo");
                        System.out.println(
                                "Escolha uma opção: \n" +
                                        "1-Adicionar Voluntários\n" +
                                        "2-Remover Voluntários\n" +
                                        "3-Ver Número de Voluntários\n" +
                                        "4-Adicionar Abrigados\n" +
                                        "5-Remover Abrigados \n" +
                                        "6-Gerenciar Itens\n" +
                                        "7-Sair"
                        );

                        int gerenciarVoluntarios = scanner.nextInt();

                        switch (gerenciarVoluntarios) {
                            case 1:
                                abrigoAtual.getVoluntarios().getAdicionarVoluntario();
                                break;
                            case 2:
                                abrigoAtual.getVoluntarios().getRemoverVoluntario();
                                break;
                            case 3:
                                System.out.println("Número de voluntários atual: " + abrigoAtual.getVoluntarios().getNumVoluntarios());
                                break;
                            case 4:
                                System.out.println("Quantos abrigados você deseja adicionar?");
                                int numAbrigados = scanner.nextInt();
                                abrigoAtual.adicionarAbrigado(numAbrigados);
                                break;
                            case 5:
                                System.out.println("Quantos abrigados você deseja remover?");
                                numAbrigados = scanner.nextInt();
                                abrigoAtual.removerAbrigado(numAbrigados);
                                break;
                            case 6:
                                gerenciarItens(abrigoAtual.getItensAbrigo());
                                break;
                            case 7:
                                sairGerenciar = true;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tchau");
                    sair = true;
                    break;
            }
        }
    }

    private static void gerenciarItens(ItensAbrigos itensAbrigos) {
        Scanner scanner = new Scanner(System.in);
        boolean sairGerenciarItens = false;
        while (!sairGerenciarItens) {
            System.out.println(
                    "Gerenciar Itens\n" +
                            "1-Adicionar Item\n" +
                            "2-Remover Item\n" +
                            "3-Mostrar Itens\n" +
                            "4-Sair"
            );

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    itensAbrigos.adicionarItem();
                    break;
                case 2:
                    itensAbrigos.removerItem();
                    break;
                case 3:
                    itensAbrigos.mostrarItens();
                    break;
                case 4:
                    sairGerenciarItens = true;
                    break;
            }
        }
    }
}
