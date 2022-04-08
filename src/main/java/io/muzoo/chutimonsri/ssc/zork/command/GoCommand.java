package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Item;
import io.muzoo.chutimonsri.ssc.zork.room.Player;
import io.muzoo.chutimonsri.ssc.zork.room.Room;

public class GoCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        Player player =game.player;


        //check North
        if (argument.equalsIgnoreCase("north")) {
            if (game.currentRoom.getNorth()!=null){
                player.increaseHP();
                Room nextRoom = game.currentRoom.getNorth();
                Room previousRoom = game.currentRoom;
                game.currentRoom = nextRoom;
                System.out.println("We are at " + game.currentRoom.getRoomName());
                System.out.println(" ");
                if (game.currentRoom.getEast()!=null){
                    System.out.println("You can go East");
                }if (game.currentRoom.getWest()!=null){
                    System.out.println("You can go West");
                }if (game.currentRoom.getSouth()!=null) {
                    System.out.println("You can go South");
                }
                if (game.currentRoom.hasItem()) {
                    System.out.println("Item in this room: " + game.currentRoom.getItem().getItemName());
                    game.currentItem.setItemName(game.currentRoom.getItem().getItemName());
                }
            }else {
                System.out.println("There is no door in North");
            }
        }



        //check East
        if (argument.equalsIgnoreCase("east")){
            if (game.currentRoom.getEast()!=null){
                player.increaseHP();
                Room nextRoom = game.currentRoom.getEast();
                Room previousRoom = game.currentRoom;
                game.currentRoom = nextRoom;
                System.out.println("We are at " + game.currentRoom.getRoomName());
                System.out.println(" ");
                if (game.currentRoom.getNorth()!=null){
                    System.out.println("You can go North");
                }if (game.currentRoom.getWest()!=null){
                    System.out.println("You can go West");
                }if (game.currentRoom.getSouth()!=null) {
                    System.out.println("You can go South");
                }
                if (game.currentRoom.hasItem()) {
                    System.out.println("Item in this room: " + game.currentRoom.getItem().getItemName());
                    game.currentItem.setItemName(game.currentRoom.getItem().getItemName());
                }
            }
            else {
                System.out.println("There is no door in East");
            }
        }


        //check West
        if (argument.equalsIgnoreCase("west")){
            if (game.currentRoom.getWest()!=null){
                player.increaseHP();
                Room nextRoom = game.currentRoom.getWest();
                Room previousRoom = game.currentRoom;
                game.currentRoom = nextRoom;
                System.out.println("We are at " + game.currentRoom.getRoomName());
                System.out.println(" ");
                if (game.currentRoom.getEast()!=null){
                    System.out.println("You can go East");
                }if (game.currentRoom.getNorth()!=null){
                    System.out.println("You can go North");
                }if (game.currentRoom.getSouth()!=null) {
                    System.out.println("You can go South");
                }
                if (game.currentRoom.hasItem()) {
                    System.out.println("Item in this room: " + game.currentRoom.getItem().getItemName());
                    game.currentItem.setItemName(game.currentRoom.getItem().getItemName());
                }
            }
            else {
                System.out.println("There is no door in West");
            }
        }

        //check South
        if (argument.equalsIgnoreCase("south")){
            if (game.currentRoom.getSouth()!=null){
                player.increaseHP();
                Room nextRoom = game.currentRoom.getSouth();
                Room previousRoom = game.currentRoom;
                game.currentRoom = nextRoom;
                System.out.println("We are at " + game.currentRoom.getRoomName());
                System.out.println(" ");
                if (game.currentRoom.getEast()!=null){
                    System.out.println("You can go East");
                }if (game.currentRoom.getWest()!=null){
                    System.out.println("You can go West");
                }if (game.currentRoom.getNorth()!=null) {
                    System.out.println("You can go North");
                }
                if (game.currentRoom.hasItem()) {
                    System.out.println("Item in this room: " + game.currentRoom.getItem().getItemName());
                    game.currentItem.setItemName(game.currentRoom.getItem().getItemName());
                }
            }
            else{
                System.out.println("There is no door in South");
            }

        }
    }
}
