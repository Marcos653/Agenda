/*
Faça um programa em Java para simular uma parte do funcionamento de 
uma agenda de contatos. Você deverá ter as opções de incluir uma pessoa 
e listar todas as pessoas cadastradas. Cada pessoa terá nome, sobrenome e
telefone de contato. O número máximo de contatos que podem ser salvos é 
definido por você. Fique à vontade.
 */
package agend;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Agend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
 
    System.out.println("quantos funcionarios você adicionará ? ");
    int funcionarioDesejados = sc.nextInt();
    

    Pessoa[] pessoas = new Pessoa[funcionarioDesejados];
    
    int funcionarioMax = 0;
    int opcao;
    
    
    do {      
      System.out.println("Escolha uma opção:");
      System.out.println("0 - Finalizar programa");      
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar  todos os cadastrados");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER q fica na entrada

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
            funcionarioMax++;
            for(int i =0; i < pessoas.length; i++){
                Pessoa pessoa = new Pessoa();
                    
                System.out.println("Escreva o nome ");
                pessoa.setNome(sc.nextLine());
                pessoas[i] = pessoa;
            }
          break;
        case 2:
            for(int i =0; i < pessoas.length; i++){
                System.out.println("Nome: " + pessoas[i].getNome());
            }
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0 && funcionarioMax <= funcionarioDesejados);

    sc.close();        
        
    }
    
}
