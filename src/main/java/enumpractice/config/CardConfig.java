package enumpractice.config;

import enumpractice.model.Card;

import java.util.List;

import static enumpractice.enummodel.CardType.MASTER;
import static enumpractice.enummodel.CardType.VISA;

public class CardConfig {
    public static final List<Card> cards = List.of(new Card(MASTER,
                    "Orxan Rehimov",
                    "41677389654654"),
            new Card(VISA,
                    "Kamran Babayev",
                    "87946545664456"));
}
