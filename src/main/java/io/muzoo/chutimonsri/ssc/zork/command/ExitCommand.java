package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;

public class ExitCommand implements  Command{


    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public void execute(Game game, String argument) {
        game.exit();
    }
}
