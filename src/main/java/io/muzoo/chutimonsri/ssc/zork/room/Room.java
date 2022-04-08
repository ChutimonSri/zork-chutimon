package io.muzoo.chutimonsri.ssc.zork.room;

import java.util.HashMap;
import java.util.Map;

public class Room {

    private Monster monster;
    private Item item;
    private String roomName;
    public Map<String,Room> nextRooms=new HashMap<>();

    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(String roomName, Item item, Monster monster){
        this.roomName = roomName;
        this.item = item;
        this.monster = monster;
    }

    public void setRooms(Room north, Room east, Room west, Room south){
        this.north = north;
        this.east = east;
        this.west = west;
        this.south = south;
    }

    public String getRoomName() {
        return roomName;
    }

    public Monster getMonster() {
        return monster;
    }

    public Item getItem() {
        return item;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }

    public void removeItem(){
        this.item = null;
    }


    public boolean hasItem(){
        return this.item != null;
    }

    public boolean hasMonster(){
        return this.monster != null;
    }

}
