package com.practice.roversimmulation.controllers;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class RoverController {
    @GetMapping(path = "/command")
    public ResponseEntity<String> runCommand(@RequestParam(name = "command") String command){
        return ResponseEntity.ok(command);
    }
}
