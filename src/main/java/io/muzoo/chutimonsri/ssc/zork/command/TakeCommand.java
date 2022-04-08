package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Item;

public class TakeCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        Item item=game.currentRoom.getItem();
        if (!game.isExit() && game.currentRoom.hasItem()){
            game.player.setItem(item);
            game.currentRoom.removeItem();
            System.out.println("You have taken "+item.getItemName());
        }

    }
}
