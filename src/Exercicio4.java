//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio4 { 

    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        double nota1; // Aloca na memoria um espaço para a variável nota1
        double nota2; // Aloca na memoria um espaço para a variável nota2
        double nota3; // Aloca na memoria um espaço para a variável nota3
        double nota4; // Aloca na memoria um espaço para a variável nota4
        double media; // Aloca na memoria um espaço para a variável media

        System.out.println("Nota 1: "); // Imprime na tela a mensagem
        nota1 = enterScanner.nextInt(); //Grava o valor digitado na variável nota1
        System.out.println("Nota 2: "); // Imprime na tela a mensagem
        nota2 = enterScanner.nextInt(); //Grava o valor digitado na variável nota2
        System.out.println("Nota 3: "); // Imprime na tela a mensagem
        nota3 = enterScanner.nextInt(); //Grava o valor digitado na variável nota3
        System.out.println("Nota 4: "); // Imprime na tela a mensagem
        nota4 = enterScanner.nextInt(); //Grava o valor digitado na variável nota4

        media = ( nota1 + nota2 + nota3 + nota4 ) / 4; // Calcula a média das notas
        System.out.println("A média das notas é: " + media); // Imprime na tela a mensagem
        enterScanner.close(); //Encerra as entradas do teclado
    }
}