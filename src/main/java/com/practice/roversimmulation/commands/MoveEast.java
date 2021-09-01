package com.practice.roversimmulation.commands;

import com.practice.roversimmulation.Rover;

public class MoveEast implements Command{
    private final Rover rover;

    public MoveEast(Rover rover) {
        this.rover = rover;
    }

    @Override
    public Rover execute() {
        return rover.moveEast();
    }
}
