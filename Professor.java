//subclasse
import java.util.Scanner;
/*subclasse Professor, q herda da classe Funcionarios. 
Além dos atributos herdados, criar os atributos disciplina e valorHoraAula.*/
class Professor extends Funcionarios {
     private String disciplina;
     private double valorHoraAula;

     //ler os dados específicos de Professor
     public void lerDados(Scanner sc) {
          super.lerDados(sc); // Chama o método da superclasse para ler dados comuns
          System.out.print("Digite a disciplina ministrada: ");
          this.disciplina = sc.nextLine();
          System.out.print("Digite o valor da hora/aula: ");
          this.valorHoraAula = sc.nextDouble();
          sc.nextLine();
     }

     //exibir os dados de Professor
     @Override //o método está sobrescrevendo o da superclasse.
     public void mostrarDados() {
          super.mostrarDados(); // Exibe os dados comuns
          System.out.println("Disciplina Ministrada: " + disciplina);
          System.out.println("Valor da Hora/Aula: " + valorHoraAula);
     }
}
