package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Item;

import java.util.Objects;

public class UseCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        String itemInCurRoom=game.currentRoom.getItem().getItemName();
        if (!game.isExit() && (!Objects.equals(game.currentRoom.getItem().getItemName(), argument))){

            if ((game.player.getItemList().contains(argument))){
                game.player.setItem(game.currentRoom.getItem().setItemName(argument));
                System.out.println("Use "+game.currentRoom.getItem().setItemName(argument).getItemName()+" !!!");
            }
            else {
                System.out.println("You do not have "+itemInCurRoom+" in your bag");
            }
        }
        else {
            System.out.println("The weapon is in current room");
            System.out.println("Please use \"take\" command");
        }

    }
}
