package com.practice.roversimmulation.commands;

import com.practice.roversimmulation.Rover;

public class MoveNorth implements  Command{
    private final Rover rover;

    public MoveNorth(Rover rover) {
        this.rover = rover;
    }


    @Override
    public Rover execute() {
        return rover.moveNorth();
    }
}
