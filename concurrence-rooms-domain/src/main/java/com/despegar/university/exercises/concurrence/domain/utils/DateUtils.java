package com.despegar.university.exercises.concurrence.domain.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;

import static org.joda.time.format.DateTimeFormat.forPattern;

public class DateUtils {

    private static final DateTimeFormatter DTF = forPattern("yyyy-MM-dd");
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    public static Date toDate(LocalDateTime date) {
        return date != null ? date.toDate() : null;
    }

    public static Date toDate(String date) {
        return DTF.parseLocalDateTime(date).toDate();
    }

    public static Date toDate(String date, DateTimeFormatter fromFormat) {
        return date != null ? fromFormat.parseLocalDateTime(date).toDate() : null;
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return date != null ? LocalDateTime.fromDateFields(date) : null;
    }

    public static String toString(LocalDateTime date) {
        return date != null ? SDF.format(date.toDate()) : null;
    }

}
