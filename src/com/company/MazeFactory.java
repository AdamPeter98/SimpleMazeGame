package com.company;

public class MazeFactory implements AbstractFactory {
    @Override
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    public Room makeRoom(int roomNr, int x, int y) {
        return new Room(roomNr,x,y);
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    public Door makeDoor(Room r1, Room r2, String code, int x, int y, boolean open) {
        return new Door(r1, r2, code, x, y, open);    }
}
