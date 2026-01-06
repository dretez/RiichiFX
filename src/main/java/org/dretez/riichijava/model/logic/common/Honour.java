package org.dretez.riichijava.model.logic.common;

public interface Honour<T extends Honour<T>> {
    T next();
    int typeOrder();
}
