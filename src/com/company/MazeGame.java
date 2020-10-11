package com.company;

public class MazeGame {

    public Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();


        Room r1 = factory.makeRoom(1, 40, 40); // (3,0)
        Room r2 = factory.makeRoom(2, 40, 80);  //(2,0)
        Room r3 = factory.makeRoom(3, 40, 120); //(1,0)
        Room r4 = factory.makeRoom(4, 40, 160);//(0,0)
        Room r5 = factory.makeRoom(5, 80, 40); //(3,1)
        Room r6 = factory.makeRoom(6, 120, 40); //(3,2)
        Room r7 = factory.makeRoom(7, 160, 40);//(3,3)
        Room r8 = factory.makeRoom(8, 80, 80);//(2,1)
        Room r9 = factory.makeRoom(9, 80, 120); //(1,1)
        Room r10 = factory.makeRoom(10, 80, 160); //(0,1)

        Room r11 = factory.makeRoom(11, 120, 80); //(2,2)
        Room r12 = factory.makeRoom(12, 120, 120); //(1,2)
        Room r13 = factory.makeRoom(13, 120, 160); //(0,2)
        Room r14 = factory.makeRoom(14, 160, 80); //(2,3)
        Room r15 = factory.makeRoom(15, 160, 120); //(1,3)
        Room r16 = factory.makeRoom(16, 160, 160); //(0,3)

        Player player = new Player(r1);
        Treasure treasure = new Treasure(r16);

        Door door1 = factory.makeDoor(r1, r2, "123", 40, 70, true);
        Door door2 = factory.makeDoor(r3, r4, "123", 40, 150, true);
        Door door3 = factory.makeDoor(r1, r5, "123", 60, 40, true);
        Door door4 = factory.makeDoor(r2, r3, "123", 40, 110, true);
        Door door5 = factory.makeDoor(r6, r11, "123", 120, 70, true);
        Door door6 = factory.makeDoor(r5, r6, "123", 100, 40, true);
        Door door7 = factory.makeDoor(r11, r14, "123", 150, 80, true);
        Door door8 = factory.makeDoor(r14, r15, "123", 160, 85, true);
        Door door9 = factory.makeDoor(r15, r16, "123", 160, 130, true);


        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        aMaze.addRoom(r3);
        aMaze.addRoom(r4);
        aMaze.addRoom(r5);
        aMaze.addRoom(r6);
        aMaze.addRoom(r7);
        aMaze.addRoom(r8);
        aMaze.addRoom(r9);
        aMaze.addRoom(r10);
        aMaze.addRoom(r11);
        aMaze.addRoom(r12);
        aMaze.addRoom(r13);
        aMaze.addRoom(r14);
        aMaze.addRoom(r15);
        aMaze.addRoom(r16);

        aMaze.addDoor(door1);
        aMaze.addDoor(door2);
        aMaze.addDoor(door3);
        aMaze.addDoor(door4);
        aMaze.addDoor(door5);
        aMaze.addDoor(door6);
        aMaze.addDoor(door7);
        aMaze.addDoor(door8);
        aMaze.addDoor(door9);
        aMaze.addPlayer(player);

        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East, door3);
        r1.setSide(Direction.South, door1);
        r1.setSide(Direction.West, factory.makeWall());

        r2.setSide(Direction.North, door1);
        r2.setSide(Direction.East, factory.makeWall());
        r2.setSide(Direction.South, door4);
        r2.setSide(Direction.West, factory.makeWall());

        r3.setSide(Direction.North, door4);
        r3.setSide(Direction.West, factory.makeWall());
        r3.setSide(Direction.East, factory.makeWall());
        r3.setSide(Direction.South, door2);

        r4.setSide(Direction.North, door2);
        r4.setSide(Direction.East, factory.makeWall());
        r4.setSide(Direction.South, factory.makeWall());
        r4.setSide(Direction.West, factory.makeWall());

        r5.setSide(Direction.North, factory.makeWall());
        r5.setSide(Direction.East, door6);
        r5.setSide(Direction.South, factory.makeWall());
        r5.setSide(Direction.West, door3);

        r6.setSide(Direction.North, factory.makeWall());
        r6.setSide(Direction.East, factory.makeWall());
        r6.setSide(Direction.South, door5);
        r6.setSide(Direction.West, door6);

        r7.setSide(Direction.North, factory.makeWall());
        r7.setSide(Direction.East, factory.makeWall());
        r7.setSide(Direction.South, factory.makeWall());
        r7.setSide(Direction.West, factory.makeWall());

        r8.setSide(Direction.North, factory.makeWall());
        r8.setSide(Direction.East, factory.makeWall());
        r8.setSide(Direction.South, factory.makeWall());
        r8.setSide(Direction.West, factory.makeWall());

        r9.setSide(Direction.North, factory.makeWall());
        r9.setSide(Direction.East, factory.makeWall());
        r9.setSide(Direction.South, factory.makeWall());
        r9.setSide(Direction.West, factory.makeWall());

        r10.setSide(Direction.North, factory.makeWall());
        r10.setSide(Direction.East, factory.makeWall());
        r10.setSide(Direction.South, factory.makeWall());
        r10.setSide(Direction.West, factory.makeWall());

        r11.setSide(Direction.North, door5);
        r11.setSide(Direction.East, door7);
        r11.setSide(Direction.South, factory.makeWall());
        r11.setSide(Direction.West, factory.makeWall());

        r12.setSide(Direction.North, factory.makeWall());
        r12.setSide(Direction.East, factory.makeWall());
        r12.setSide(Direction.South, factory.makeWall());
        r12.setSide(Direction.West, factory.makeWall());

        r13.setSide(Direction.North, factory.makeWall());
        r13.setSide(Direction.East, factory.makeWall());
        r13.setSide(Direction.South, factory.makeWall());
        r13.setSide(Direction.West, factory.makeWall());

        r14.setSide(Direction.North, factory.makeWall());
        r14.setSide(Direction.East, factory.makeWall());
        r14.setSide(Direction.South, door8);
        r14.setSide(Direction.West, door7);

        r15.setSide(Direction.North, factory.makeWall());
        r15.setSide(Direction.East, factory.makeWall());
        r15.setSide(Direction.South, door9);
        r15.setSide(Direction.West, factory.makeWall());

        r16.setSide(Direction.North, factory.makeWall());
        r16.setSide(Direction.East, factory.makeWall());
        r16.setSide(Direction.South, factory.makeWall());
        r16.setSide(Direction.West, factory.makeWall());


        return aMaze;
    }
}
