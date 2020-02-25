package com.example.demo.service.dao;

import com.example.demo.model.Cards;
import com.example.demo.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionScoped;

/**
 * Created by Osagie Erhabor on 25/02/2020.
 */
@Service
@TransactionScoped
public class CardService {
    private final CardsRepository cardsRepository;

    @Autowired
    public CardService(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    public Cards findCardsByCardId(Long cardId){
        return cardsRepository.findCardsByCardId(cardId);
    }
}
