package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

    @Service
    public class TopTrumpsService {

        private ArrayList<Card> card;

        public TopTrumpsService(){

        }

        //Check Winner

        public String checkWinner(ArrayList<Card> cards){

            Card card  = cards.get(0);
            Card card2 = cards.get(1);

            if (card.getCardValue() < card2.getCardValue()) {
                return String.format("%s of %s wins!", card2.getRank(), card2.getSuit());
            } else if (card.getCardValue() > card2.getCardValue()){
                return String.format("%s of %s wins!", card.getRank(), card.getSuit());
            } else {
                return "You draw!";
            }

    }

}
