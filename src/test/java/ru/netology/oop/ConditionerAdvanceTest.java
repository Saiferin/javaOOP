package ru.netology.oop;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerAdvanceTest {

    @Test
    public void shouldGetAndSet(){
        ConditionerAdvance conditioner = new ConditionerAdvance();
        String expectedName = "Кондишин";
        assertNull(conditioner.getName());
        conditioner.setName(expectedName);
        assertEquals(expectedName,conditioner.getName());
    }

    @Test
    public void shouldCheckChangeTemperature(){
        ConditionerAdvance conditioner = new ConditionerAdvance();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(0, conditioner.getCurrentTemperature());

    }

}
