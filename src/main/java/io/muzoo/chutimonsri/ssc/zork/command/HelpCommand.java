package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;

import java.util.Map;

public class HelpCommand implements Command{
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public void execute(Game game, String argument) {
        Map<CommandType, Command> commandMap = CommandFactory.getCommandMap();
        for (Map.Entry<CommandType, Command> entry : commandMap.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
}
