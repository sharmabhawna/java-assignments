package com.step.assignments.assignment;

public class Main {

    public static void main(String[] args) {
        UnoCard wild_card = new UnoCard("wild card");
        System.out.println(wild_card.duplicate().getCardSignature());

        System.out.println("****************");

        DuplicateUnoCard number_card = new UnoCard("Number Card");
        System.out.println(number_card.duplicate().getCardSignature());

        System.out.println("****************");

        IdentityCard identityCard = new IdentityCard();
        System.out.println(identityCard.duplicate().getCardSignature());

        System.out.println("****************");

        DuplicateIdentityCard newIdentityCard = new IdentityCard();
        System.out.println(newIdentityCard.duplicate().getCardSignature());

    }
}
