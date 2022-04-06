package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;

public class InfoCommand implements Command{
    @Override
    public void execute(Game game) {
        System.out.println("Print info");
    }
}
