/*a ) Desenvolva o seguinte aplicativo:
- Crie uma superclasse chamada Funcionários, com as seguintes características:
i. Nome;
ii. Endereço;
iii. Telefone.
- Crie uma subclasse chamada Professor, com as seguintes características:
i. Disciplina Ministrada (basta uma);
ii. Valor da hora/aula.
- Crie outra subclasse chamada Administrativo, com as seguintes cartacterísticas:
i. Cargo;
ii. Salário.
- Crie uma classe principal que:
i. Le o nome de um funcionário;
ii. Usa um switch para que escolha entre professor e administrativo;
iii. Le e mostra todos os dados de um funcionário com base na opção escolhida.*/

import java.util.Scanner;
// superclasse
class Funcionarios {
     protected String nome; //O PROTECTED = pode ser acessado por subclasses
     protected String endereco;
     protected String telefone;

     // le a entrada do user p/ nome e armazena no atributo nome
     public void lerDados(Scanner sc) {
          System.out.print("Digite o nome: ");
          this.nome = sc.nextLine();
          System.out.print("Digite o endereço: ");
          this.endereco = sc.nextLine();
          System.out.print("Digite o telefone: ");
          this.telefone = sc.nextLine();
     }

     public void mostrarDados() {
          System.out.println("Nome: " + nome);
          System.out.println("Endereço: " + endereco);
          System.out.println("Telefone: " + telefone);
     }
}