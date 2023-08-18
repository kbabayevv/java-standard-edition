package enumpractice.service;

import enumpractice.exception.CustomException;
import enumpractice.model.Card;

import static enumpractice.config.CardConfig.cards;
import static enumpractice.enummodel.ErrorMessage.CARD_NOT_FOUND;

public class CardService {
    public Card getCardByPan(String pan) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getPan().equals(pan)) {
                return cards.get(i);
            }
        }
        throw new CustomException(CARD_NOT_FOUND.getValue(pan));
    }
}
