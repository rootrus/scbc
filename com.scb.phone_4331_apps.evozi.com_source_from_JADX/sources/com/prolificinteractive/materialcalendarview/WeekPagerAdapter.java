package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import com.prolificinteractive.materialcalendarview.format.TitleFormatter;
import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WeekPagerAdapter extends CalendarPagerAdapter<WeekView> {
    public /* bridge */ /* synthetic */ void clearSelections() {
        super.clearSelections();
    }

    public /* bridge */ /* synthetic */ void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
    }

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public /* bridge */ /* synthetic */ int getDividerColor() {
        return super.getDividerColor();
    }

    public /* bridge */ /* synthetic */ float getDividerSize() {
        return super.getDividerSize();
    }

    public /* bridge */ /* synthetic */ int getIndexForDay(CalendarDay calendarDay) {
        return super.getIndexForDay(calendarDay);
    }

    public /* bridge */ /* synthetic */ CalendarDay getItem(int i) {
        return super.getItem(i);
    }

    public /* bridge */ /* synthetic */ int getItemPosition(Object obj) {
        return super.getItemPosition(obj);
    }

    public /* bridge */ /* synthetic */ CharSequence getPageTitle(int i) {
        return super.getPageTitle(i);
    }

    public /* bridge */ /* synthetic */ DateRangeIndex getRangeIndex() {
        return super.getRangeIndex();
    }

    public /* bridge */ /* synthetic */ List getSelectedDates() {
        return super.getSelectedDates();
    }

    @MaterialCalendarView.ShowOtherDates
    public /* bridge */ /* synthetic */ int getShowOtherDates() {
        return super.getShowOtherDates();
    }

    public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }

    public /* bridge */ /* synthetic */ void invalidateDecorators() {
        super.invalidateDecorators();
    }

    public /* bridge */ /* synthetic */ boolean isEnableWeekDivider() {
        return super.isEnableWeekDivider();
    }

    public /* bridge */ /* synthetic */ boolean isEnableWeekOfMonthDivider() {
        return super.isEnableWeekOfMonthDivider();
    }

    public /* bridge */ /* synthetic */ boolean isViewFromObject(View view, Object obj) {
        return super.isViewFromObject(view, obj);
    }

    public /* bridge */ /* synthetic */ CalendarPagerAdapter migrateStateAndReturn(CalendarPagerAdapter calendarPagerAdapter) {
        return super.migrateStateAndReturn(calendarPagerAdapter);
    }

    public /* bridge */ /* synthetic */ void setDateSelected(CalendarDay calendarDay, boolean z) {
        super.setDateSelected(calendarDay, z);
    }

    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i) {
        super.setDateTextAppearance(i);
    }

    public /* bridge */ /* synthetic */ void setDayFormatter(DayFormatter dayFormatter) {
        super.setDayFormatter(dayFormatter);
    }

    public /* bridge */ /* synthetic */ void setDecorators(List list) {
        super.setDecorators(list);
    }

    public /* bridge */ /* synthetic */ void setDividerColor(int i) {
        super.setDividerColor(i);
    }

    public /* bridge */ /* synthetic */ void setDividerSize(int i) {
        super.setDividerSize(i);
    }

    public /* bridge */ /* synthetic */ void setEnableWeekDivider(boolean z) {
        super.setEnableWeekDivider(z);
    }

    public /* bridge */ /* synthetic */ void setEnableWeekOfMonthDivider(boolean z) {
        super.setEnableWeekOfMonthDivider(z);
    }

    public /* bridge */ /* synthetic */ void setRangeDates(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.setRangeDates(calendarDay, calendarDay2);
    }

    public /* bridge */ /* synthetic */ void setSelectionColor(int i) {
        super.setSelectionColor(i);
    }

    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z) {
        super.setSelectionEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setShowOtherDates(@MaterialCalendarView.ShowOtherDates int i) {
        super.setShowOtherDates(i);
    }

    public /* bridge */ /* synthetic */ void setTitleFormatter(TitleFormatter titleFormatter) {
        super.setTitleFormatter(titleFormatter);
    }

    public /* bridge */ /* synthetic */ void setWeekDayFormatter(WeekDayFormatter weekDayFormatter) {
        super.setWeekDayFormatter(weekDayFormatter);
    }

    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i) {
        super.setWeekDayTextAppearance(i);
    }

    public WeekPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* access modifiers changed from: protected */
    public WeekView createView(int i) {
        return new WeekView(this.mcv, getItem(i), this.mcv.getFirstDayOfWeek());
    }

    /* access modifiers changed from: protected */
    public int indexOf(WeekView weekView) {
        return getRangeIndex().indexOf(weekView.getFirstViewDay());
    }

    /* access modifiers changed from: protected */
    public boolean isInstanceOfView(Object obj) {
        return obj instanceof WeekView;
    }

    /* access modifiers changed from: protected */
    public DateRangeIndex createRangeIndex(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new Weekly(calendarDay, calendarDay2, this.mcv.getFirstDayOfWeek());
    }

    public static class Weekly implements DateRangeIndex {
        private static final int DAYS_IN_WEEK = 7;
        private final int count;
        private final CalendarDay min;

        public Weekly(CalendarDay calendarDay, CalendarDay calendarDay2, int i) {
            CalendarDay firstDayOfWeek = getFirstDayOfWeek(calendarDay, i);
            this.min = firstDayOfWeek;
            this.count = weekNumberDifference(firstDayOfWeek, calendarDay2) + 1;
        }

        public int getCount() {
            return this.count;
        }

        public int indexOf(CalendarDay calendarDay) {
            return weekNumberDifference(this.min, calendarDay);
        }

        public CalendarDay getItem(int i) {
            return CalendarDay.from(new Date(this.min.getDate().getTime() + TimeUnit.MILLISECONDS.convert((long) (i * 7), TimeUnit.DAYS)));
        }

        private int weekNumberDifference(CalendarDay calendarDay, CalendarDay calendarDay2) {
            return (int) (TimeUnit.DAYS.convert(((calendarDay2.getDate().getTime() - calendarDay.getDate().getTime()) + ((long) calendarDay2.getCalendar().get(16))) - ((long) calendarDay.getCalendar().get(16)), TimeUnit.MILLISECONDS) / 7);
        }

        private CalendarDay getFirstDayOfWeek(CalendarDay calendarDay, int i) {
            Calendar instance = Calendar.getInstance();
            calendarDay.copyTo(instance);
            while (instance.get(7) != i) {
                instance.add(7, -1);
            }
            return CalendarDay.from(instance);
        }
    }
}
