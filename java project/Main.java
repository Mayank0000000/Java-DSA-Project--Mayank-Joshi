package com.company;

public class Main {

    public static void main(String[] args) {
        Player1 player = new Player1("Mayank","sword",500);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();

//        player.heal();

        Player2 player2 = new Player2("Harshk","machinegun",80,true);
        player2.damageByGun2();
        player2.heal();
    }
}
