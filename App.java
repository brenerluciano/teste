import java.util.Scanner;

import Classes.Pessoa;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("70212343454", "Brener", 22, "Rua oscavo lobato");

        System.out.println(pessoa.getNome() + " está ");
        pessoa.comer();
        System.out.println("Com " + pessoa.getIdade() + " Anos.");
        scanner.close();
    }
    
}

