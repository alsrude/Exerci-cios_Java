// Crie um gerador de personagens de videogame. Peça o nome do guerreiro, sua classe (Mago, Arqueiro, Ladino),
// sua idade e seus pontos de força. No final, exiba um "card" detalhado com as caracteristicas do personagem.

import java.util.Scanner;

public class Rpg {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do seu guerreiro: ");
        String nome_do_guerreiro = input.nextLine();

        System.out.println("Temos as seguintes classes: Mago, Guerreiro, Ladino");

        System.out.print("Escolha sua classe: ");
        String cls = input.nextLine();

        System.out.print("Qual sua idade: ");
        String idade = input.nextLine();

        System.out.print("Quantos pontos de força: ");
        String forca = input.nextLine();

        System.out.println("\n=================================");
        System.out.println("       CARD DO PERSONAGEM        ");
        System.out.println("=================================");
        System.out.println(" Nome: " + nome_do_guerreiro);
        System.out.println(" Classe: " + cls);
        System.out.println(" Idade: " + idade + " anos");
        System.out.println(" Força: " + forca + " pts");

        input.close();
    }
}
