package com.shezi.uyanda.cards.api.v1.dao;

import com.shezi.uyanda.cards.api.v1.model.Cards;
import org.springframework.data.repository.CrudRepository;

public interface CardsDao extends CrudRepository<Cards,Long> {
    Cards findByCardId(int cardId);
}
