package enumpractice.model;

import enumpractice.enummodel.CardType;

public class Card {
    private CardType cardType;
    private String holder;
    private String pan;

    public Card(CardType cardType, String holder, String pan) {
        this.cardType = cardType;
        this.holder = holder;
        this.pan = pan;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getHolder() {
        return holder;
    }

    public String getPan() {
        return pan;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardType=" + cardType +
                ", holder='" + holder + '\'' +
                ", pan='" + pan + '\'' +
                '}';
    }
}
