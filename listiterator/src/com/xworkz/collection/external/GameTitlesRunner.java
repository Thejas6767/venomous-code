package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GameTitlesRunner {
    public static void main(String[] args) {
        List<String> gameList = new ArrayList<>();
        gameList.add("Elden Ring");
        gameList.add("Zelda");
        gameList.add("Halo");
        gameList.add("Gears");
        gameList.add("Doom");

        ListIterator<String> gameIterator = gameList.listIterator();

        while (gameIterator.hasNext()) {
            String game = gameIterator.next();

            if (game.equals("Zelda")) {
                gameIterator.add("Metroid");
            }
            if (game.equals("Gears")) {
                gameIterator.add("Mass Effect");
            }
            System.out.println(game);
        }
        System.out.println("Final list of game titles===" + gameList);
    }
}
