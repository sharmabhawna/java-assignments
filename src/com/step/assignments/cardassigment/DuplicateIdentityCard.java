package com.step.assignments.cardassigment;

public abstract class DuplicateIdentityCard implements Duplicable<IdentityCard> {

    @Override
    public IdentityCard duplicate() {
        return new IdentityCard();
    }

}
