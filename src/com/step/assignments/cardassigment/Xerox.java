package com.step.assignments.cardassigment;

public class Xerox {

    public static <O extends Duplicable<D> ,D>  D getXerox(O entity){
        return entity.duplicate();
    }

        public static void main(String[] args) {
            UnoCard wild_card = new UnoCard("wild card");
            System.out.println("Original: " + wild_card.getCardSignature());
            System.out.println("Duplicate: " + getXerox(wild_card).getCardSignature());


            DuplicateUnoCard number_card = new UnoCard("Number card");
            System.out.println("Original: " + number_card.getCardSignature());
            System.out.println("Duplicate: " + getXerox(number_card).getCardSignature());


            IdentityCard identityCard = new IdentityCard();
            System.out.println("Original: " + identityCard.getCardSignature());
            System.out.println("Duplicate: " + getXerox(identityCard).getCardSignature());


            DuplicateIdentityCard newIdentityCard = new IdentityCard();
            System.out.println("Original: " + ((IdentityCard) newIdentityCard).getCardSignature());
            System.out.println("Duplicate: " + getXerox(newIdentityCard).getCardSignature());

        }
}
