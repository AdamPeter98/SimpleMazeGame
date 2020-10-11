package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Player extends JPanel implements KeyListener {

    private Room current;


    public Player(Room r){

        this.setBackground(Color.red);
        current = r;
        this.setBounds(5, 5, 10, 10);
        r.add(this);
    }



    private void move(Direction direction){




        MapSite p = current.getSide(direction);
        System.out.println(current.getY());
        System.out.println(current.getX());

        if(current.getX() == 160 && current.getY() == 160){
            System.out.println("You found a real treasure");
        }


        if (p instanceof Wall){
            System.out.println("Ouch, wall!");
        }
        else if (p instanceof Door){
            if (((Door)p).isOpen){
                current.remove(this);
                current.repaint();
                current = ((Door)p).OtherSideFrom(current);

                current.add(this);
                current.repaint();
            }
            else{
                System.out.println("Please give me the code");
                Scanner sc = new Scanner(System.in);
                String i = sc.nextLine();
                if (i.equals(((Door)p).code)){
                    current.remove(this);
                    current.repaint();
                    current = ((Door)p).OtherSideFrom(current);
                    current.add(this);
                    current.repaint();
                    ((Door)p).isOpen = true;
                }else {
                    System.out.println("Wrong codeq");
                }

            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            move(Direction.West);
        }

        if (key == KeyEvent.VK_RIGHT) {
            move(Direction.East);
        }

        if (key == KeyEvent.VK_UP) {
            move(Direction.North);
        }

        if (key == KeyEvent.VK_DOWN) {
            move(Direction.South);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public int getPanel(){
        return current.getRoomNumber();
    }
}
