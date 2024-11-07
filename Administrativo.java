// subclasse
import java.util.Scanner;
/*a subclasse Administrativo, que herda da superclasse Funcionarios. 
Ela tem dois atributos adicionais: cargo e salario */
class Administrativo extends Funcionarios {
     private String cargo;
     private double salario;

     //para ler os dados específicos de Administrativo
     public void lerDados(Scanner sc) {
          super.lerDados(sc); //da superclasse para ler os dados comuns
          System.out.print("Digite o cargo: ");
          this.cargo = sc.nextLine();
          System.out.print("Digite o salário: ");
          this.salario = sc.nextDouble();
          sc.nextLine();
     }

     //para exibir os dados de Administrativo
     @Override
     public void mostrarDados() {
          super.mostrarDados(); // Exibe os dados comuns
          System.out.println("Cargo: " + cargo);
          System.out.println("Salário: " + salario);
     }
}
