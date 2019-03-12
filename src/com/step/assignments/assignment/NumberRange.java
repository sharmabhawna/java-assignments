package com.step.assignments.assignment;

import java.util.ArrayList;

public class NumberRange implements Range<Integer> {

    private ArrayList range;

    public NumberRange(int start, int end) {
        this.range = new ArrayList<Integer>(end - start);
        initializeRange(start, end);
    }

    private void initializeRange(int start, int end) {
        while (start <= end){
            this.range.add(start);
            start++;
        }
    }

    @Override
    public ArrayList getAll() {
        return this.range;
    }

    @Override
    public boolean containsElement(Integer number) {
        int indexOfNumber = this.range.indexOf(number);
        return indexOfNumber > 0;
    }
}
