package ru.netology.oop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    @Test
    public void shouldCreate(){
        Conditioner conditioner = new Conditioner();
        System.out.println("hello");
    }

    @Test
    public void shouldCheckFields(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.minTemperature);
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.currentTemperature);
        assertEquals(null, conditioner.name);
        assertFalse(conditioner.on);
    }
    @Disabled
    @Test
    public void shouldHavelNPE(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.name.length());
    }

    @Test
    public void shouldChangeField(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.currentTemperature);
        conditioner.currentTemperature = -100;
        assertEquals(-100, conditioner.currentTemperature);
    }

}
