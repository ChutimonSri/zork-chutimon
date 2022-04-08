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
        if (game.currentRoom.hasItem()){
            if (!game.player.getItem().equals(game.currentRoom.getItem())){
                System.out.println("Use "+argument+" !!!");
            }else {
                System.out.println("The weapon is in current room");
                System.out.println("Please use \"take\" command");
            }
        }
        else {
            System.out.println("No item in the room");
        }
    }
}
