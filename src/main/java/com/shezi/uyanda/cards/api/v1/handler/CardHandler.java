package com.shezi.uyanda.cards.api.v1.handler;

import com.shezi.uyanda.cards.api.v1.dao.CardsDao;
import com.shezi.uyanda.cards.api.v1.model.Cards;
import com.shezi.uyanda.cards.api.v1.model.CardRequest;
import com.shezi.uyanda.cards.api.v1.model.CardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = CardHandler.BEAN_NAME)
public class CardHandler {
    private final CardsDao cardsDao;

    public static final String BEAN_NAME = "handler.CardHandler";

    @Autowired
    public CardHandler(final CardsDao aCardsDao){
        this.cardsDao = aCardsDao;
    }


    public CardResponse getCards(CardRequest request){
        return mapToResponse(cardsDao.findByCardId(request.getCardId()));
    }

    private CardResponse mapToResponse(Cards cards) {
        CardResponse response = new CardResponse();
        response.setCards(cards);
        return response;
    }
}
