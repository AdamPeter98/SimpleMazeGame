package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Maze extends JFrame {

    public static final int FRAME_WIDTH = 350;
    public static final int FRAME_HEIGHT = 350;


    public Set _rooms = new HashSet();
    public Set _doors = new HashSet();




    public Maze(){
        super();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setVisible(true);

    }

    public void addRoom(Room room){
        if (room !=null){
            _rooms.add(room);
            this.add(room);
        }
    }

    public void addDoor(Door door){
        _doors.add(door);
        this.add(door);
    }

    public void addPlayer(Player player)
    {
        this.addKeyListener(player);
    }

}
