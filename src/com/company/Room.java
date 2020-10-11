package com.company;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.WindowListener;

public class Room  extends  MapSite{
    private int roomNumber;
    public static final Color ROOM_COLOR = new Color(192,192,192);
    public static final Color WALL_COLOR = new Color(47,79,79);



    private MapSite north;
    private MapSite south;
    private MapSite east;
    private MapSite west;


    public Room(int roomNr, int x, int y) {

        roomNumber = roomNr;
        this.setBounds(x,y, 37,37);
        this.setBorder(new MatteBorder(4,4,4,4,WALL_COLOR));
        this.setBackground(ROOM_COLOR);
        System.out.println("Room " + roomNumber + " created");
    }

    public void enter() {

        System.out.println("You enterd in a room");
    }


    public void setSide(Direction d, MapSite site) {

        if (d == Direction.North) {
            north = site;
        } else if (d == Direction.South) {
            south = site;
        } else if (d == Direction.East) {
            east = site;
        } else if (d == Direction.West) {
            west = site;
        }
        //System.out.println("setting " + d.toString() + " side of " + this.toString() + " to " + site.toString());
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public MapSite getSide(Direction d) {

        MapSite result = null;
        if (d == Direction.North) {
            result = north;
        } else if (d == Direction.South) {
            result = south;
        } else if (d == Direction.East) {
            result = east;
        } else if (d == Direction.West) {
            result = west;
        }

        return result;



    }
}
