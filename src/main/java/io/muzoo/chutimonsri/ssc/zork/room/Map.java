package io.muzoo.chutimonsri.ssc.zork.room;

public class Map {

    Item knife = new Item("knife", 10);
    Item sword = new Item("sword", 20);
    Item bazooka = new Item("bazooka", 40);

    Monster jack = new Monster(100,30,true);
    Monster rose = new Monster(100,25,true);

    Room kitchen = new Room("kitchen", knife, rose);
    Room bathroom = new Room("bathroom", sword, null);
    Room bedroom = new Room("bedroom", null, jack);
    Room yard = new Room("yard", bazooka,null);
    Room startRoom = kitchen;
    Room currentRoom = startRoom;

    public Map(){
        kitchen.setRooms(null, bathroom , null , bedroom);
        bathroom.setRooms(yard, null , null , kitchen);
        bedroom.setRooms(null, bathroom , null , null);
        yard.setRooms(bedroom, null , kitchen , null);
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
