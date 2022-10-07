package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player; //TODO add variable type
    private long numberToGuess numberToGuess; //TODO add variable type
    private long max_try;

    public Simulation(Player player) {
        this.player = player;
        this.numberToGuess = 0;
        this.max_try = 0;
    }

    public void initialize(long numberToGuess, long max_try) {
        this.numberToGuess = numberToGuess;
        this.max_try = maxTry;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long userGuess = player.askNextGuess();

        if (userGuess == numberToGuess) return true;
        else {
            player.respond(userGuess < numberToGuess);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
    }
}
