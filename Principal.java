import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de funcionário: ");
        System.out.println("1 - Professor");
        System.out.println("2 - Administrativo");
        int opcao = sc.nextInt();
        sc.nextLine();

//uma variável do tipo Funcionarios q e usada p/ armazenar professorese administrativos.
        Funcionarios funcionario;
        // Usando switch para escolher o tipo de funcionário
        switch (opcao) {
            case 1:
                funcionario = new Professor();
                funcionario.lerDados(sc); // Chama o método lerDados() da subclasse
                break;
            case 2:
                funcionario = new Administrativo();
                funcionario.lerDados(sc); // Chama o método lerDados() da subclasse
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }

        // Exibe os dados do funcionário
        funcionario.mostrarDados();
    }
}

