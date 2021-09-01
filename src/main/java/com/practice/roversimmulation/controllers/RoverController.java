package com.practice.roversimmulation.controllers;

import com.practice.roversimmulation.services.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class RoverController {

    @Autowired
    RoverService roverService;

    @GetMapping(path = "/command")
    public ResponseEntity<String> runCommand(@RequestParam(name = "command") String command){
        return ResponseEntity.ok(roverService.execute(command));
    }

    @GetMapping(path = "/reset")
    public ResponseEntity<String> reset(){
        return  ResponseEntity.ok(roverService.reset());
    }
}
