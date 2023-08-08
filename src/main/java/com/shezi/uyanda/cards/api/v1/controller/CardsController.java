package com.shezi.uyanda.cards.api.v1.controller;

import com.shezi.uyanda.cards.api.v1.handler.CardHandler;
import com.shezi.uyanda.cards.api.v1.model.CardRequest;
import com.shezi.uyanda.cards.api.v1.model.CardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cards/")
public class CardsController {
    private final CardHandler cardHandler;

    @Autowired
    public CardsController(CardHandler aCardHandler){
        this.cardHandler = aCardHandler;
    }

    @RequestMapping(value = "/getCards", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CardResponse getCards(@RequestBody CardRequest request){
        return cardHandler.getCards(request);
    }
}
