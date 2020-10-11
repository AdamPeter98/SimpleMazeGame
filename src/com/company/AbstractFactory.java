package com.company;

public interface AbstractFactory {

    Maze makeMaze();
    Room makeRoom(int roomNr, int x, int y);
    Wall makeWall();
    Door makeDoor(Room r1, Room r2, String code, int x, int y, boolean open);
}
