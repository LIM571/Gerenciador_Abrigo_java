import java.util.ArrayList;
import java.util.Scanner;

public class ItensAbrigos {
    private ArrayList<String> itens = new ArrayList<>();
    private ArrayList<String> itensHigiene = new ArrayList<>();
    private ArrayList<String> itensAlimentacao = new ArrayList<>();
    private ArrayList<String> itensRoupa = new ArrayList<>();
    private ArrayList<String> itensBrinquedos = new ArrayList<>();
    private ArrayList<String> itensGeral = new ArrayList<>();

    public void adicionarItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************\n" +
                "Escolha uma Categoria\n" +
                "1-Higiene \n" +
                "2-Alimentação \n" +
                "3-Roupas \n" +
                "4-Brinquedos \n" +
                "5-Outros itens \n" +
                "6-Mostrar listas \n" +
                "7-Sair \n"
        );
        int categoria = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (categoria) {
            case 1:
                System.out.println("Adicione um item de higiene: ");
                String produtoHigiene = scanner.nextLine();
                itensHigiene.add(produtoHigiene);
                itens.add(produtoHigiene);
                break;
            case 2:
                System.out.println("Adicione um item de alimentação: ");
                String produtoAlimentacao = scanner.nextLine();
                itensAlimentacao.add(produtoAlimentacao);
                itens.add(produtoAlimentacao);
                break;
            case 3:
                System.out.println("Adicione um item de vestuário: ");
                String produtoRoupa = scanner.nextLine();
                itensRoupa.add(produtoRoupa);
                itens.add(produtoRoupa);
                break;
            case 4:
                System.out.println("Adicione um brinquedo: ");
                String produtoBrinquedo = scanner.nextLine();
                itensBrinquedos.add(produtoBrinquedo);
                itens.add(produtoBrinquedo);
                break;
            case 5:
                System.out.println("Adicione outro item: ");
                String outroProduto = scanner.nextLine();
                itensGeral.add(outroProduto);
                itens.add(outroProduto);
                break;
            case 6:
                mostrarItens();
                break;
            case 7:
                System.out.println("Tchau :)");
                return;
        }
    }

    public void removerItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************\n" +
                "Escolha uma Categoria para remover\n" +
                "1-Higiene \n" +
                "2-Alimentação \n" +
                "3-Roupas \n" +
                "4-Brinquedos \n" +
                "5-Outros itens \n" +
                "6-Mostrar listas \n" +
                "7-Sair \n"
        );
        int categoria = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (categoria) {
            case 1:
                System.out.println("Remova um item de higiene: ");
                String produtoHigiene = scanner.nextLine();
                itensHigiene.remove(produtoHigiene);
                itens.remove(produtoHigiene);
                break;
            case 2:
                System.out.println("Remova um item de alimentação: ");
                String produtoAlimentacao = scanner.nextLine();
                itensAlimentacao.remove(produtoAlimentacao);
                itens.remove(produtoAlimentacao);
                break;
            case 3:
                System.out.println("Remova um item de vestuário: ");
                String produtoRoupa = scanner.nextLine();
                itensRoupa.remove(produtoRoupa);
                itens.remove(produtoRoupa);
                break;
            case 4:
                System.out.println("Remova um brinquedo: ");
                String produtoBrinquedo = scanner.nextLine();
                itensBrinquedos.remove(produtoBrinquedo);
                itens.remove(produtoBrinquedo);
                break;
            case 5:
                System.out.println("Remova outro item: ");
                String outroProduto = scanner.nextLine();
                itensGeral.remove(outroProduto);
                itens.remove(outroProduto);
                break;
            case 6:
                mostrarItens();
                break;
            case 7:
                System.out.println("Tchau :)");
                return;
        }
    }

    public void mostrarItens() {
        System.out.println("Mostrando todos os itens: \n");
        System.out.println("Higiene: " + itensHigiene + "\n");
        System.out.println("Alimentação: " + itensAlimentacao + "\n");
        System.out.println("Roupas: " + itensRoupa + "\n");
        System.out.println("Brinquedos: " + itensBrinquedos + "\n");
        System.out.println("Outros: " + itensGeral);
    }
}
