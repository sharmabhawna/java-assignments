package com.step.assignments.lists;

import java.util.List;
import java.util.NoSuchElementException;

public class Iterator {
    private List list;
    private int currentIndex;

    public Iterator(List list) {
        this.list = list;
        this.currentIndex = -1;
    }

    public boolean hasNext(){
        return this.currentIndex + 1 < this.list.size();
    }

    public Object next(){
        if(this.hasNext()){
            this.currentIndex++;
            return list.get(this.currentIndex);
        }
        throw new NoSuchElementException();
    }

}
