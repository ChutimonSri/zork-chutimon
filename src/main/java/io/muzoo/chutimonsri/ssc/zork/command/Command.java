package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;

public interface Command {

    int numArgs();

    void execute(Game game, String argument);
}
