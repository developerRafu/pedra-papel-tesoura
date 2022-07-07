package utils;

import models.Jogos;
import models.Player;

import java.util.Random;

public class Runner {

    public static Player play(final Player playerOne, final Player playerTwo) {
        return ganhaDe(playerOne, playerTwo);
    }

    private static Player ganhaDe(Player playerOne, Player playerTwo) {

        if(playerOne.getJogo().getVantagemSobre() == playerTwo.getJogo().getId()){
            return playerOne;
        }

        if(playerTwo.getJogo().getVantagemSobre() == playerOne.getJogo().getId()){
            return playerTwo;
        }

        return null;
    }

    public static Jogos randomPlay() {
        final var random = new Random();
        return Jogos.of(random.nextInt(2));
    }
}
