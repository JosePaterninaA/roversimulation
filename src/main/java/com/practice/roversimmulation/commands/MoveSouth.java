package com.practice.roversimmulation.commands;

import com.practice.roversimmulation.Rover;

public class MoveSouth implements Command{

    private final Rover rover;

    public MoveSouth(Rover rover) {
        this.rover = rover;
    }

    @Override
    public Rover execute() {
        return rover.moveSouth();
    }
}
