package com.step.assignments.cardassigment;

public class UnoCard extends DuplicateUnoCard {

    private String cardSignature;

    public UnoCard(String cardSignature) {
        this.cardSignature = cardSignature;
    }

    public String getCardSignature() {
        return cardSignature;
    }

}
