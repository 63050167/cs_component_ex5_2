package com.mycompany.ex5_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    private String scoreLine;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String newScoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = newScoreLine;
        propertyChangeSupport.firePropertyChange("scoreLine", oldScoreLine, newScoreLine);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}

