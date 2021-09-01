package com.practice.roversimmulation.services;

import com.practice.roversimmulation.Entity.Registry;
import com.practice.roversimmulation.Position;
import com.practice.roversimmulation.Rover;
import com.practice.roversimmulation.commands.CommandFactory;
import com.practice.roversimmulation.repositories.CommandRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
public class RoverService {

    private Rover rover;
    private final String NORTH_COMMAND = "N";
    private final String SOUTH_COMMAND = "S";
    private final String EAST_COMMAND = "E";
    private final String WEST_COMMAND = "W";
    private static final String INTO_CHARACTERS = "";

    @Autowired
    CommandRegistry commandRegistry;
    
    public RoverService() {
        rover = new Rover(new Position(0,0));
    }

    public String execute(String input) {
        for (String command : commandsFrom(input)){
            rover = new CommandFactory(rover).commandFrom(command).execute();
            persistCommand(command);
        }
        return formatCoordinate();
    }

    private Registry persistCommand(String command){
        Registry registry = new Registry();
        registry.setCommand(command);
        registry.setLocalDate(LocalDate.now());
        registry.setLocalTime(LocalTime.now());
        return commandRegistry.save(registry);
    }

    public String reset(){
        rover.reset();
        persistCommand("Reset");
        return formatCoordinate();
    }

    private boolean isMoveNorth(String command) {
        return NORTH_COMMAND.equals(command);
    }

    private boolean isMoveSouth(String command) {
        return SOUTH_COMMAND.equals(command);
    }

    private boolean isMoveEast(String command) {
        return EAST_COMMAND.equals(command);
    }

    private boolean isMoveWest(String command) {
        return WEST_COMMAND.equals(command);
    }

    private String[] commandsFrom(String input) {
        return input.split(INTO_CHARACTERS);
    }

    private String formatCoordinate() {
        return rover.getPosition().toString();
    }
}
