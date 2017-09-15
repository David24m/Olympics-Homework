package com.example.user.olympicsweekendhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 15/09/2017.
 */
public class TeamTest {

    Team team;

    @Before
    public void before() {
        team = new Team("Team GB Football", CountryNames.UK, "Football", MedalType.Bronze);
    }



    @Test
    public void getName() throws Exception {
        assertEquals("Team GB Football", team.getName());
    }

    @Test
    public void getNationality() throws Exception {
        assertEquals(CountryNames.UK, team.getNationality());
    }

    @Test
    public void getMedal() throws Exception {
        assertEquals("Football", team.getSport());
    }

    @Test
    public void getSport() throws Exception {
        assertEquals(MedalType.Bronze, team.getMedal());
    }

}