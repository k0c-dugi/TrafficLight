package com.example.demo1;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;
    //Bunun yapılış sebebi, değeri sadece bir string olarak tutmak istememek ve
    //Dönüş işlemini kolaylaştırmaktır

    public Direction turnRight() {
        Direction[] directions = values();
        return directions[(this.ordinal() + 1) % directions.length];
    }

    public Direction turnLeft() {
        Direction[] directions = values();
        return directions[(this.ordinal() - 1 + directions.length) % directions.length];
    }
}


