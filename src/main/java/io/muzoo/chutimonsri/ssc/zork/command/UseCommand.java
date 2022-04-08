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
        Item item=game.currentRoom.getItem();
        String itemInCurRoom=item.getItemName();
        if (!game.isExit() && (!Objects.equals(item.getItemName(), argument))){

            if ((game.player.getItemList().contains(argument))){
                game.player.setItem(item.setItemName(argument));
                System.out.println("Use "+item.setItemName(argument).getItemName()+" !!!");
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
