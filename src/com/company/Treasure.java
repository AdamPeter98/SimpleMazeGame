package com.company;

import javax.swing.*;
import java.awt.*;

public class Treasure extends JPanel {


    private Room current;


    public Treasure(Room room) {

        this.setBackground(Color.YELLOW);
        current = room;
        this.setBounds(5, 5, 10, 10);
        room.add(this);
    }


}
