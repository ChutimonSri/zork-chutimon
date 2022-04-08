package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Player;
import io.muzoo.chutimonsri.ssc.zork.room.Room;

public class GoCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        Room currentRoom = game.currentRoom;
        Player player =game.player;

        //check North
        if (argument.equalsIgnoreCase("north")) {
            if (currentRoom.getNorth()!=null){
                player.increaseHP();
                Room nextRoom = currentRoom.getNorth();
                Room previousRoom = currentRoom;
                currentRoom = nextRoom;
                System.out.println("We are at " + currentRoom.getRoomName());
                System.out.println(" ");
                if (currentRoom.getEast()!=null){
                    System.out.println("You can go East");
                }if (currentRoom.getWest()!=null){
                    System.out.println("You can go West");
                }if (currentRoom.getSouth()!=null) {
                    System.out.println("You can go South");
                }
            }else {
                System.out.println("There is no door in North");
            }
        }



        //check East
        if (argument.equalsIgnoreCase("east")){
            if (currentRoom.getEast()!=null){
                player.increaseHP();
                Room nextRoom = currentRoom.getEast();
                Room previousRoom = currentRoom;
                currentRoom = nextRoom;
                System.out.println("We are at " + currentRoom.getRoomName());
                System.out.println(" ");
                if (currentRoom.getNorth()!=null){
                    System.out.println("You can go North");
                }if (currentRoom.getWest()!=null){
                    System.out.println("You can go West");
                }if (currentRoom.getSouth()!=null) {
                    System.out.println("You can go South");
                }
            }
            else {
                System.out.println("There is no door in East");
            }
        }


        //check West
        if (argument.equalsIgnoreCase("west")){
            if (currentRoom.getWest()!=null){
                player.increaseHP();
                Room nextRoom = currentRoom.getWest();
                Room previousRoom = currentRoom;
                currentRoom = nextRoom;
                System.out.println("We are at " + currentRoom.getRoomName());
                System.out.println(" ");
                if (currentRoom.getEast()!=null){
                    System.out.println("You can go East");
                }if (currentRoom.getNorth()!=null){
                    System.out.println("You can go North");
                }if (currentRoom.getSouth()!=null) {
                    System.out.println("You can go South");
                }
            }
            else {
                System.out.println("There is no door in West");
            }
        }

        //check South
        if (argument.equalsIgnoreCase("south")){
            if (currentRoom.getSouth()!=null){
                player.increaseHP();
                Room nextRoom = currentRoom.getSouth();
                Room previousRoom = currentRoom;
                currentRoom = nextRoom;
                System.out.println("We are at " + currentRoom.getRoomName());
                System.out.println(" ");
                if (currentRoom.getEast()!=null){
                    System.out.println("You can go East");
                }if (currentRoom.getWest()!=null){
                    System.out.println("You can go West");
                }if (currentRoom.getNorth()!=null) {
                    System.out.println("You can go North");
                }
            }
            else{
                System.out.println("There is no door in South");
            }

        }
    }
}
