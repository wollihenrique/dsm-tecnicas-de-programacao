import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);

       System.out.print("Digite seu nome: ");
       String nome = entrada.nextLine();

       System.out.print("Digite seua idade: ");
       String idade = entrada.nextLine();

       System.out.print("Digite seu curso: ");
       String curso = entrada.nextLine();

       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Nome: " + curso);
    }
}