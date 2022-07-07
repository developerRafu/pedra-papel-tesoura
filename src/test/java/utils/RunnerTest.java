package utils;

import models.Jogos;
import models.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    final Player playerOne = new Player("Rafu");
    final Player playerTwo = new Player("Eduardo");

    @Test
    public void player_one_should_win_when_plays_pedra_and_player_two_plays_tesoura(){
        playerOne.setJogo(Jogos.PEDRA);
        playerTwo.setJogo(Jogos.TESOURA);
        final var result = Runner.play(playerOne, playerTwo);
        assertEquals("Rafu", result.getNome());
    }
}
