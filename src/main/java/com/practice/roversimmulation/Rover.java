package com.practice.roversimmulation;

public class Rover {

    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Rover moveNorth() {
        position.moveNorth();
        return this;
    }

    public Rover moveSouth() {
        position.moveSouth();
        return this;
    }

    public Rover moveEast() {
        position.moveEast();
        return this;
    }

    public Rover moveWest() {
        position.moveWest();
        return this;
    }
}
