package com.prolificinteractive.materialcalendarview.format;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateFormatDayFormatter implements DayFormatter {
    private final DateFormat dateFormat;

    public DateFormatDayFormatter() {
        this.dateFormat = new SimpleDateFormat(KtaJsonExactionHelper.OBJECT, Locale.getDefault());
    }

    public DateFormatDayFormatter(DateFormat dateFormat2) {
        this.dateFormat = dateFormat2;
    }

    public String format(CalendarDay calendarDay) {
        return this.dateFormat.format(calendarDay.getDate());
    }
}
