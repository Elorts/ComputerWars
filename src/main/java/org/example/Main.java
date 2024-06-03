package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Integer computer1 = 0;
    Integer computer2 = 0;

    boolean won = false;

    Random random = new Random();
    Integer army1;
    Integer army2;

    while (!won) {
        army1 = random.nextInt(10) + 1;
        army2 = random.nextInt(10) + 1;

        if (army1 > army2) {
            System.out.println("Army 1 won the battle" + computer1 );
            computer1++;
            if (computer1 == 10) won = true;
        } else if (army1 < army2) {
            System.out.println("Army 2 won the battle" + computer2 );
            computer2++;
            if (computer2 == 10) won = true;
        } else {
            System.out.println("No one won the battle!");
        }
    }
        System.out.println("Computer 1:" + computer1 + " Computer 2:" + computer2);

    }
}