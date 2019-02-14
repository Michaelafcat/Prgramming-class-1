package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//most of this assignment is trying to read the existing code to understand how it works,
        //a sk a classmate or instructor if you are unsure how the code works.


        //generate a new player
        Player Player1 = new Player();

        //create main game loop that continues until the player has no health
        while (Player1.getHealth() > 00) {

            //generate a new enemy( the level of the enemy should be the player's level)
            Enemy Enemy = new Enemy(Player1.getPlayerLevel());
            //create battle loop that should continue while both the player and enemy are alive
            while (Player1.getHealth() > 0 && Enemy.getHealth() > 0) {
                //gets player's input on what to do (use one of the methods to do this)
                Player1.menu(Enemy);
                //has the enemy take damage
                Enemy.takeDamage(Player1);

                //has the player take damage
                Player1.takeDamage(Enemy);
            }


            //once the player is dead print out the player's level and how much xp they had.
            System.out.println("Player Level = " + Player1.getPlayerLevel());
            System.out.println("Player Xp " + Player1.getXp());

        }
    }}

