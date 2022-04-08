package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Item;

import java.util.Objects;

public class TakeCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        if (!game.isExit() && (Objects.equals(game.currentRoom.getItem().getItemName(), argument))){
            game.player.setItem(game.currentItem);
            game.currentRoom.removeItem();
            System.out.println("You have taken "+game.currentItem.getItemName());
        }
        else {
            System.out.println("The room does not have "+game.currentItem.getItemName());
        }

    }
}
