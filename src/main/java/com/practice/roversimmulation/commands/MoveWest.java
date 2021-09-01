package com.practice.roversimmulation.commands;

import com.practice.roversimmulation.Rover;

public class MoveWest implements Command{
    private final Rover rover;

    public MoveWest(Rover rover) {
        this.rover = rover;
    }

    @Override
    public Rover execute() {
        return rover.moveWest();
    }
}
