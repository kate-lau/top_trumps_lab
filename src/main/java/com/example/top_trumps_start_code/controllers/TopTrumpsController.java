package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {

    @Autowired
    private TopTrumpsService topTrumpsService;

    @PostMapping("/compare")
    public String compareCards(@RequestBody ArrayList<Card> cards) {
        if (cards.size() != 2) {
            return "Two cards are required!";
        }
        return topTrumpsService.checkWinner(cards);
    }
}
