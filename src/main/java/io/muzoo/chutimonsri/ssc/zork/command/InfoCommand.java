package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Maps;
import io.muzoo.chutimonsri.ssc.zork.room.Monster;
import io.muzoo.chutimonsri.ssc.zork.room.Player;
import io.muzoo.chutimonsri.ssc.zork.room.Room;

public class InfoCommand implements Command{

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public void execute(Game game, String argument) {
        Player player=game.player;
        Monster jack=game.map.getJack();
        Monster rose=game.map.getRose();
        Room room = game.currentRoom;

        System.out.println("********************");
        System.out.println("Player's Info");
        System.out.println(" ");
        System.out.println("Player's HP: " +  player.getCurrentHP() + " / " + player.getMaxHP());
        System.out.println("Player's Attack Power: " + player.getAttackPower());
        System.out.println("********************");
        System.out.println("Monster's Info");
        System.out.println(" ");
        System.out.println("Jack: " +  jack.getCurrentHP() + " / " + jack.getMaxHP());
        System.out.println("Jack: " + jack.getAttackPower());
        System.out.println("");
        System.out.println("Rose: " +  rose.getCurrentHP() + " / " + rose.getMaxHP());
        System.out.println("Rose: " + rose.getAttackPower());
        System.out.println("********************");
        System.out.println("Room's Info");
        System.out.println("");
        System.out.println("Now, you are in "+room.getRoomName()+"!!!");
        if (room.hasItem() && room.getItem().getItemName()!=null){
            System.out.println("This room has: "+room.getItem().getItemName());
        }
    }
}
