package com.prolificinteractive.materialcalendarview.format;

import com.prolificinteractive.materialcalendarview.CalendarUtils;
import java.util.Calendar;
import java.util.Locale;

public class CalendarWeekDayFormatter implements WeekDayFormatter {
    private final Calendar calendar;

    public CalendarWeekDayFormatter(Calendar calendar2) {
        calendar2.get(7);
        this.calendar = calendar2;
    }

    public CalendarWeekDayFormatter() {
        this(CalendarUtils.getInstance());
    }

    public CharSequence format(int i) {
        this.calendar.set(7, i);
        return this.calendar.getDisplayName(7, 1, Locale.getDefault());
    }
}
