package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;

public class ExitCommand implements  Command{
    @Override
    public void execute(Game game) {
        game.exit();
    }
}
