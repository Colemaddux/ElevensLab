package com.colemaddux.elevenslab.test;

import com.colemaddux.elevenslab.Card;

/**
 * Created by Cole Maddux on 1/12/2017.
 */
public class CardTester {

    public static void main(String[] args) {
        Card card1 = new Card("King","Clubs",13);
        Card card2 = new Card("King","Clubs",13);
        Card card3 = new Card("Ace","Hearts",14);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());

        System.out.println(card1.matches(card2));
        System.out.println(card2.matches(card3));
    }
}
