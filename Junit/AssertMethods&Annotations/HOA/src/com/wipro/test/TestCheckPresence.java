package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testPresenceTrue() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Wipro Technologies","Tech"));

    }

    @Test
    public void testPresenceFalse() {

        DailyTasks obj = new DailyTasks();

        assertFalse(obj.checkPresence("Wipro Technologies","Java"));

    }

}