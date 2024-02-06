package com.prolificinteractive.materialcalendarview.format;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateFormatTitleFormatter implements TitleFormatter {
    private final DateFormat dateFormat;

    public DateFormatTitleFormatter() {
        this.dateFormat = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());
    }

    public DateFormatTitleFormatter(DateFormat dateFormat2) {
        this.dateFormat = dateFormat2;
    }

    public CharSequence format(CalendarDay calendarDay) {
        return this.dateFormat.format(calendarDay.getDate());
    }
}
