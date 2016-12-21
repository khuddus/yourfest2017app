package com.usharama.yourfest.models;

/**
 * Created by KRISHNA PRANATI on 20-Dec-16.
 */

public class Event {
    public String getEventName() {
        return eventName;
    }

    public Event(String eventName, String description, int drawable) {
        this.eventName = eventName;
        this.description = description;
        this.drawable = drawable;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String eventName;
    String description;
    int drawable;

}
