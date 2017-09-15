package com.example.user.olympicsweekendhomework;

/**
 * Created by user on 15/09/2017.
 */

public abstract class Competitor {

    String name;
    CountryNames nationality;
    String sport;
    MedalType medal;

    public Competitor(String name, CountryNames nationality, String sport, MedalType medal) {
        this.name = name;
        this.nationality = nationality;
        this.sport = sport;
        this.medal = medal;
    }


    public String getName() {
        return name;
    }

    public CountryNames getNationality() {
        return nationality;
    }

    public MedalType getMedal() {
        return medal;
    }

    public String getSport() {
        return sport;
    }
}
