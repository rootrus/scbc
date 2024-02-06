package com.prolificinteractive.materialcalendarview;

interface DateRangeIndex {
    int getCount();

    CalendarDay getItem(int i);

    int indexOf(CalendarDay calendarDay);
}
