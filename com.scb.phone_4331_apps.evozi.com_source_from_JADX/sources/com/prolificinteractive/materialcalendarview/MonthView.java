package com.prolificinteractive.materialcalendarview;

import java.util.Calendar;
import java.util.Collection;

class MonthView extends CalendarPagerView {
    /* access modifiers changed from: protected */
    public int getRows() {
        return 7;
    }

    public MonthView(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i) {
        super(materialCalendarView, calendarDay, i);
    }

    /* access modifiers changed from: protected */
    public void buildDayViews(Collection<DayView> collection, Calendar calendar) {
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                addDayView(collection, calendar);
            }
        }
    }

    public CalendarDay getMonth() {
        return getFirstViewDay();
    }

    /* access modifiers changed from: protected */
    public boolean isDayEnabled(CalendarDay calendarDay) {
        return calendarDay.getMonth() == getFirstViewDay().getMonth();
    }
}
