package com.step.assignments.rangeassignment;

import java.util.ArrayList;

public interface Range<T> {

    public ArrayList getAll();

    public boolean containsElement(T element);
}
