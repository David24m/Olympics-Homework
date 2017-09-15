package com.example.user.olympicsweekendhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 15/09/2017.
 */
public class EventTest {

    Event event;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Athlete athlete5;


    @Before
    public void before() {
        event = new Event("100 Metres Butterfly", 4);
        athlete1 = new Athlete("Michael Phelps", CountryNames.USA, "100 Metres Butterfly", MedalType.Gold);
        athlete2 = new Athlete("Ian Thorpe", CountryNames.Australia, "100 Metres Butterfky", MedalType.None);
        athlete3 = new Athlete("Adam Peaty", CountryNames.UK, "100 Metres Butterfly", MedalType.Silver);
        athlete4 = new Athlete("Alexander Popov", CountryNames.Russia, "100 Metres Butterfly", MedalType.Bronze);
        athlete5 = new Athlete("Yannick Agnel", CountryNames.France, "100 Metres Butterfly", MedalType.None);
    }

    @Test
    public void startWithZeroCompetitors() throws Exception {
        assertEquals(0, event.getCompetitors().size());
    }

    @Test
    public void addASoloAthlete() throws Exception {
        event.addCompetitors(athlete1);
        assertEquals(1, event.getCompetitors().size());
    }

    @Test
    public void addATeamToAnEvent() throws Exception {
        Team team;
        Event event;
        event = new Event("Team Gymnastics", 5);
        team = new Team("Team China", CountryNames.China, "Team Gymnastics", MedalType.Silver);
        event.addCompetitors(team);
        assertEquals(1, event.getCompetitors().size());
    }

    @Test
    public void canRemoveAthletesFromEvent() {
        event.addCompetitors(athlete1);
        event.addCompetitors(athlete2);
        event.removeCompetitors(athlete2);
        assertEquals(1, event.getCompetitors().size());
    }

    @Test
    public void getSport() throws Exception {
        assertEquals("100 Metres Butterfly", event.getSport());
    }

    @Test
    public void eventWillHaveALimitOfPlayersInvolved() {
        event.addCompetitors(athlete1);
        event.addCompetitors(athlete2);
        event.addCompetitors(athlete3);
        event.addCompetitors(athlete4);
        event.addCompetitors(athlete5);
        assertEquals(4, event.getCompetitors().size());
    }

    @Test
    public void teamEventWillHaveLimitOfTeams() {
        Team team1;
        Team team2;
        Team team3;
        Event event;
        event = new Event("Football", 2);
        team1 = new Team("Team GB Football", CountryNames.UK, "Football", MedalType.Silver);
        team2 = new Team("Germany Football", CountryNames.Germany, "Football", MedalType.Gold);
        team3 = new Team("France Football", CountryNames.France, "Football", MedalType.None);
        event.addCompetitors(team1);
        event.addCompetitors(team2);
        event.addCompetitors(team3);
        assertEquals(2, event.getCompetitors().size());
    }

}