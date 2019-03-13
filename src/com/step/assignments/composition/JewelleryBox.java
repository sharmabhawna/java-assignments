package com.step.assignments.composition;

public class JewelleryBox {

    private Jewellery jewellery;
    private JewelleryBox jewelleryBox;

    public JewelleryBox(){
    }

    public JewelleryBox(Jewellery jewellery) {
//        this.jewellery = jewellery;
        this(jewellery, new JewelleryBox());
    }

    public JewelleryBox(JewelleryBox jewelleryBox) {
        this.jewelleryBox = jewelleryBox;
    }

    public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox) {
        this.jewellery = jewellery;
        this.jewelleryBox = jewelleryBox;
    }

    int getJewelleriesCount(){
        int totalJewelleries = 0;
        if(this.jewellery != null){
             totalJewelleries += 1;
        }
        if(this.jewelleryBox != null){
            totalJewelleries += this.jewelleryBox.getJewelleriesCount();
        }
        return totalJewelleries;
    }
}
