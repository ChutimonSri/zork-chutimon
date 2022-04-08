package io.muzoo.chutimonsri.ssc.zork.room;

import io.muzoo.chutimonsri.ssc.zork.Game;

public class Maps {


    Item knife = new Item("knife", 10);
    Item sword = new Item("sword", 20);
    Item bazooka = new Item("bazooka", 40);

    Monster jack = new Monster("Jack",100,30,true);
    Monster rose = new Monster("Rose",100,25,true);


    Room kitchen = new Room("kitchen", knife, jack);
    Room bathroom = new Room("bathroom", sword, null);
    Room bedroom = new Room("bedroom", null, rose);
    Room yard = new Room("yard", bazooka,null);
    Room startRoom = kitchen;
    Room currentRoom = startRoom;

    public Maps(){
        kitchen.setRooms(null, bathroom , null , bedroom);
        bathroom.setRooms(yard, null , null , kitchen);
        bedroom.setRooms(null, bathroom , null , null);
        yard.setRooms(bedroom, null , kitchen , null);
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }


    public Monster getJack() {
        return jack;
    }

    public Monster getRose() {
        return rose;
    }
}
