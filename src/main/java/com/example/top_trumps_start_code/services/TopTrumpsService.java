package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public class TopTrumpsService {

    @Service
    public class TopTrumpsService {

        private ArrayList<Card> card;

        public TopTrumpsService(){

        }

        public String checkWinner(ArrayList<Card> Cards){

            Card card  = null;
            Card card2 = null;

            if (card.getCardValue() < card2.getCardValue()) {
                return String.format("%s of %s wins!", card2.getRank(), card2.getSuit());
            } else {
                return String.format("%s of %s wins!", card.getRank(), card.getSuit());
            }

    }


}
