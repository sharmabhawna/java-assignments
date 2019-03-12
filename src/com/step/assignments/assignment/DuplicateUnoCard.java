package com.step.assignments.assignment;

public abstract class DuplicateUnoCard implements Duplicable<UnoCard>{

    @Override
    public UnoCard duplicate() {
        String cardSignature = this.getCardSignature();
        return new UnoCard(cardSignature);
    }

    public abstract String getCardSignature();
}
