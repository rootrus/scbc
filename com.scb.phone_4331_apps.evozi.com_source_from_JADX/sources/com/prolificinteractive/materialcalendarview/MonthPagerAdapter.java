package com.prolificinteractive.materialcalendarview;

import p040o.setButtonDrawable;

class MonthPagerAdapter extends CalendarPagerAdapter<MonthView> {
    MonthPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* access modifiers changed from: protected */
    public MonthView createView(int i) {
        return new MonthView(this.mcv, getItem(i), this.mcv.getFirstDayOfWeek());
    }

    /* access modifiers changed from: protected */
    public int indexOf(MonthView monthView) {
        return getRangeIndex().indexOf(monthView.getMonth());
    }

    /* access modifiers changed from: protected */
    public boolean isInstanceOfView(Object obj) {
        return obj instanceof MonthView;
    }

    /* access modifiers changed from: protected */
    public DateRangeIndex createRangeIndex(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new Monthly(calendarDay, calendarDay2);
    }

    public static class Monthly implements DateRangeIndex {
        private final int count;
        private setButtonDrawable<CalendarDay> dayCache = new setButtonDrawable<>();
        private final CalendarDay min;

        public Monthly(CalendarDay calendarDay, CalendarDay calendarDay2) {
            this.min = CalendarDay.from(calendarDay.getYear(), calendarDay.getMonth(), 1);
            this.count = indexOf(CalendarDay.from(calendarDay2.getYear(), calendarDay2.getMonth(), 1)) + 1;
        }

        public int getCount() {
            return this.count;
        }

        public int indexOf(CalendarDay calendarDay) {
            return ((calendarDay.getYear() - this.min.getYear()) * 12) + (calendarDay.getMonth() - this.min.getMonth());
        }

        public CalendarDay getItem(int i) {
            CalendarDay MediaBrowserCompat$CustomActionResultReceiver = this.dayCache.MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                return MediaBrowserCompat$CustomActionResultReceiver;
            }
            int year = this.min.getYear() + (i / 12);
            int month = this.min.getMonth() + (i % 12);
            if (month >= 12) {
                year++;
                month -= 12;
            }
            CalendarDay from = CalendarDay.from(year, month, 1);
            this.dayCache.read(i, from);
            return from;
        }
    }
}
