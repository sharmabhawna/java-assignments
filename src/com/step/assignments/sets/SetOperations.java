package com.step.assignments.sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static<T,S> Set union(Set<T> firstSet, Set<S> secondSet){
        Set union = new HashSet(firstSet);
        union.addAll(secondSet);
        return union;
    }

    public static<T> Set<T> intersection(Set<T> firstSet, Set<T> secondSet) {
        Set intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        return intersection;
    }

    public static<T> Set<T> difference(Set<T> firstSet, Set<T> secondSet) {
        Set difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);
        return difference;
    }

}
