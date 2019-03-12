package com.step.assignments.assignment;

public abstract class DuplicateIdentityCard implements Duplicable<IdentityCard> {

    @Override
    public IdentityCard duplicate() {
        return new IdentityCard();
    }

    public abstract String getCardSignature();
}
