package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int initialLife = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        sc.nextLine();
        Champion championA = new Champion(name, initialLife, attack, armor);

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        initialLife = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        Champion championB = new Champion(name, initialLife, attack, armor);
        System.out.println();

        System.out.print("Quantos turnos você deseja execultar? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.printf("Resultado do turno %d:%n", i+1);
            championA.takeDamage(championB);
            championB.takeDamage(championA);
            System.out.println(championA.status());
            System.out.println(championB.status());
            System.out.println();
            if(championA.getLife() <= 0 || championB.getLife() <= 0){
                break;
            }
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}
