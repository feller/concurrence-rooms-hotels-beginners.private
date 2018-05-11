package com.despegar.university.exercises.concurrence.service.editor;

import static com.despegar.university.exercises.concurrence.domain.utils.DateUtils.toLocalDateTime;
import static org.apache.commons.lang.StringUtils.isNotBlank;

import java.beans.PropertyEditorSupport;

import org.joda.time.format.DateTimeFormat;

public class DateEditor
    extends PropertyEditorSupport {

    private static final String DATE_PATTERN = "yyyy-MM-dd";

    @Override
    public void setAsText(String text) {
        if (isNotBlank(text)) {
            this.setValue(toLocalDateTime(DateTimeFormat.forPattern(DATE_PATTERN).parseLocalDateTime(text).toDate()));
        }
    }
}
