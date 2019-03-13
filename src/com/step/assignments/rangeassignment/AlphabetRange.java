package com.step.assignments.rangeassignment;

import java.util.ArrayList;

public class AlphabetRange implements Range<Character> {

    private ArrayList alphabets;

    public AlphabetRange(char startAlphabet, char endAlphabet) {
        this.alphabets = new ArrayList<Character>(endAlphabet - startAlphabet);
        initAlphabets(startAlphabet, endAlphabet);
    }

    private void initAlphabets(char startAlphabet, char endAlphabet) {
        while (startAlphabet <= endAlphabet){
            this.alphabets.add(startAlphabet);
            startAlphabet++;
        }
    }

    @Override
    public ArrayList getAll() {
        return this.alphabets;
    }

    @Override
    public boolean containsElement(Character alphabet) {
        int indexOfCharacter = this.alphabets.indexOf(alphabet);
        return indexOfCharacter > 0;
    }
}
