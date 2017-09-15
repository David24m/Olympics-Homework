package com.example.user.olympicsweekendhomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Event {

    ArrayList<Competitor> competitors;
    String sport;
    int eventSize;

    public Event(String sport, int eventSize) {
        this.competitors = new ArrayList<>();
        this.sport = sport;
        this.eventSize = eventSize;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public boolean addCompetitors(Competitor competitor) {
        if((competitors.size() < eventSize) && (competitor.getSport().equals(sport))) {
            competitors.add(competitor);
            return true;
        } else {
            return false;
        }
    }

    public void removeCompetitors(Competitor competitor) {
        competitors.remove(competitor);
    }

    public String getSport() {
        return sport;
    }
}
