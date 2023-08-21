package com.mycompany.ex5_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name + " received: " + evt.getNewValue());
    }
}

