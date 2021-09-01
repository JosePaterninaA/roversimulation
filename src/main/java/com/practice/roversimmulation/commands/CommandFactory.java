package com.practice.roversimmulation.commands;

import com.practice.roversimmulation.Rover;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private Rover rover;
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private Map<String, Command> commands;

    public CommandFactory(Rover rover) {
        initializeCommands(rover);
    }

    private void initializeCommands(Rover rover) {
        commands = new HashMap<>();
        commands.put(NORTH, new MoveNorth(rover));
        commands.put(SOUTH, new MoveSouth(rover));
        commands.put(EAST, new MoveEast(rover));
        commands.put(WEST, new MoveWest(rover));
    }

    public Command commandFrom(String command){
        return commands.get(command);
    }
}
