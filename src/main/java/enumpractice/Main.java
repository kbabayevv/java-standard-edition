package enumpractice;

import enumpractice.model.Card;
import enumpractice.service.CardService;

public class Main {
    public static void main(String[] args) {
        CardService cardService = new CardService();
        Card card = cardService.getCardByPan("41677389654654");
        System.out.println(card);
        Card card2 = cardService.getCardByPan("65656235465653");
        System.out.println(card2);
    }
}
