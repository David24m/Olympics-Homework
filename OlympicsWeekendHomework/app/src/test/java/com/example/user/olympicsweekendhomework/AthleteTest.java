package com.example.user.olympicsweekendhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 15/09/2017.
 */
public class AthleteTest {

    Athlete athlete;

    @Before
    public void before() {
        athlete = new Athlete("Usain Bolt", CountryNames.Jamaica, "100 Metres", MedalType.Gold);
    }



    @Test
    public void getName() throws Exception {
        assertEquals("Usain Bolt", athlete.getName());
    }

    @Test
    public void getNationality() throws Exception {
        assertEquals(CountryNames.Jamaica, athlete.getNationality());
    }

    @Test
    public void getMedal() throws Exception {
        assertEquals("100 Metres", athlete.getSport());
    }

    @Test
    public void getSport() throws Exception {
        assertEquals(MedalType.Gold, athlete.getMedal());
    }

}