package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Item;

import java.util.Objects;

public class DropCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        Item item = game.player.getItem();
        if (game.player.hasItem()){
            if (Objects.equals(item.getItemName(), argument)){
                game.player.removeItem();
                System.out.println("You have dropped "+argument);
            }
            else {
                System.out.println("You are not carrying "+argument);
            }
        }
        else {
            System.out.println("You have no item in your bag");
        }


    }
}
