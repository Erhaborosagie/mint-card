package com.example.demo.controller;

import com.example.demo.model.Cards;
import com.example.demo.service.dao.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Osagie Erhabor on 25/02/2020.
 */
@RestController
@RequestMapping("/card-scheme/")
public class cardsController {
    private final CardService cardService;

    public cardsController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("verify/{cardId}")
    public Cards findCardsByCardId(@PathVariable Long cardId){
        return cardService.findCardsByCardId(cardId);
    }
}
