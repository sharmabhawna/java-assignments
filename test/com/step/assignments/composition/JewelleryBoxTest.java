package com.step.assignments.composition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JewelleryBoxTest {

    @Test
   void shouldReturnTotalNumberOfJewelleriesInsideAJewelleryBox() {
       Jewellery diamond_ring = new Jewellery("Diamond Ring");
       JewelleryBox jewelleryBox = new JewelleryBox(diamond_ring);
       Jewellery neckless = new Jewellery("neckless");
       JewelleryBox jewelleryBox1 = new JewelleryBox(neckless, jewelleryBox);

       assertEquals(2,jewelleryBox1.getJewelleriesCount());
   }

    @Test
    void shouldReturnTotalNumberOfJewelleries() {
        JewelleryBox _5thLevelBox = new JewelleryBox();

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery nacklace = new Jewellery("necklace");
        JewelleryBox _3rdLevelBox = new JewelleryBox(nacklace, _4thLevelBox);

        Jewellery ring = new Jewellery("ring");
        JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJewelleriesCount());
    }

    @Test
    @DisplayName("should return only one jewellery")
    void getNoOfJewellery() {
        Jewellery jewellery = new Jewellery("gold");
        JewelleryBox box = new JewelleryBox(jewellery);
        assertEquals(1, box.getJewelleriesCount());
    }

    @Test
    @DisplayName("should return only two jewellery")
    void getNoOfJewellery1() {
        Jewellery jewellery = new Jewellery("gold");
        JewelleryBox smallerBox = new JewelleryBox(jewellery);
        Jewellery anotherJewellery = new Jewellery("silver");
        JewelleryBox box = new JewelleryBox(anotherJewellery, smallerBox);
        assertEquals(2, box.getJewelleriesCount());
    }
}