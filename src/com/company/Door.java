package com.company;

import java.awt.*;

public class Door extends  MapSite{

    public boolean isOpen;
    private Room room1;
    private Room room2;
    public String code;


    public Door(Room r1, Room r2, String code, int x, int y, boolean open){

        room1 = r1;
        room2 = r2;
        this.code = code;
        open = isOpen;

        this.setBounds(x,y, 34,33);
        this.setBackground(new Color(139,69,19));

    }

    public void enter(){

        System.out.println(room1 + "es" + room2 + "kozott");
    }

    public Room OtherSideFrom(Room r){

        if (r == room1){
            return room2;
        }
        return room1;
    }

}
