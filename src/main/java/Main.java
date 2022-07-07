import models.Jogos;
import models.Player;
import utils.Runner;

public class Main {

    /*
     * 3 opcoes
     * 2 jogadores
     * só pode escolher uma opcao
     * pedra > tesoura
     * papel > pedra
     * tesoura > papel
     */

    public static void main(String[] args) {
        final var playerOne = new Player("rafu");
        final var playerTwo = new Player("Eduardo");
        papelPlayerOne(playerOne, playerTwo);
    }

    private static void papelPlayerOne(Player playerOne, Player playerTwo) {
        playerOne.setJogo(Jogos.PAPEL);
        playerTwo.setJogo(Jogos.PEDRA);
        final var result = Runner.play(playerOne, playerTwo);
        if(result == null){
            System.out.println("Empate");
        }else{
            System.out.println("Vencedor: "+result.getNome());
        }
    }
}

