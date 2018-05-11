package com.despegar.university.exercises.concurrence.domain.utils;

import static org.testng.Assert.assertEquals;

import org.joda.time.LocalDateTime;
import org.testng.annotations.Test;

@Test
public class DateUtilsTest {

    public void toStringTest() {
        String expected = "2015-01-10";

        LocalDateTime date = new LocalDateTime(2015, 01, 10, 12, 00);
        String actual = DateUtils.toString(date);

        assertEquals(actual, expected);
    }

}
