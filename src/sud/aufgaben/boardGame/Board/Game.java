package boardGame.Board;

import java.util.HashMap;
import java.util.Map;

import boardGame.Characters.Players.Knight;
import boardGame.Characters.Players.Mercenary;
import boardGame.Characters.Players.Player;
import boardGame.Characters.Players.Wizard;
import boardGame.Weapons.SwordBehavior;

public class Game {
    private Board board;
    private boolean inProgress;

    private Map<String, Player> players;

    public Game() {
        this.board = new Board(20, 20);

        Map<String, Player> players = new HashMap<>();
    }

    public Game addPlayer(Player player) {
        if (this.inProgress) {
            System.out.println("Game in progress, can't add new players");
            return this;
        }

        players.put(player.getName(), player);
        return this;
    }

    public Map<String, Player> getPlayers() {
        return this.players;
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.addPlayer(new Wizard("Gandalf"))
            .addPlayer(new Knight("Sir Camelot"))
            .addPlayer(new Mercenary("Fred"));

        game.getPlayers().get("Gandalf");
        Player sirCamelot = game.getPlayers().get("Sir Camelot");
    }
}
