import java.util.Scanner;

public class Voluntarios {
    boolean PrecisaDeVoluntarios;
    int numVoluntarios;

    public Voluntarios() {
        this.numVoluntarios = 0; // Inicializa o número de voluntários como 0
    }

    private int adicionarVoluntario() {
        System.out.println("Número atual: " + numVoluntarios);
        System.out.println("Escolha quantos voluntários você irá adicionar:");
        Scanner receberVoluntarios = new Scanner(System.in);
        int addVoluntarios = receberVoluntarios.nextInt();
        numVoluntarios += addVoluntarios;
        System.out.println("Número atualizado: " + numVoluntarios);
        return numVoluntarios;
    }

    int getAdicionarVoluntario() {
        return adicionarVoluntario();
    }

    private int removerVoluntario() {
        System.out.println("Número atual: " + numVoluntarios);
        System.out.println("Escolha quantos voluntários você irá remover:");
        Scanner retirarVoluntarios = new Scanner(System.in);
        int removeVoluntarios = retirarVoluntarios.nextInt();
        numVoluntarios -= removeVoluntarios;
        System.out.println("Número atualizado: " + numVoluntarios);
        return numVoluntarios;
    }

    int getRemoverVoluntario() {
        return removerVoluntario();
    }

    public int getNumVoluntarios() {
        return numVoluntarios;
    }
}
