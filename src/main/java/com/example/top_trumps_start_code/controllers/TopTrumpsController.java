package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/toptrumps")

public class TopTrumpsController {

    @PostMapping
    public ResponseEntity<> newTopTrump(){
        return new ResponseEntity<>("New game!", HttpStatus.CREATED);
    }

}
