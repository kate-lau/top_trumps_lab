package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {


@PostMapping
    public ResponseEntity<String> newTopTrump(){
        return new ResponseEntity<>("New game!", HttpStatus.CREATED);
    }

@GetMapping
    public ResponseEntity<String>getCardStatus(){
        return new ResponseEntity<>("Game",HttpStatus.OK);
    }


@PatchMapping
        public ResponseEntity<Card> processCard(@RequestBody ArrayList<Card> cards) {
        TopTrumpsService TopTrumpsService = new TopTrumpsService();
        String result = TopTrumpsService.checkWinner(cards);
         return new ResponseEntity<>(result, HttpStatus.OK);
    }

//
//    @PatchMapping
//    public ResponseEntity<Card> processCard(@RequestBody ArrayList<Card> cards) {
//        Card result = TopTrumpsService.checkWinner(cards);
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
}
