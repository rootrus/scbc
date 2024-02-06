package com.prolificinteractive.materialcalendarview;

import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.CalendarPagerView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;
import java.util.Calendar;
import java.util.Collection;

public class WeekView extends CalendarPagerView {
    /* access modifiers changed from: protected */
    public int getRows() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public boolean isDayEnabled(CalendarDay calendarDay) {
        return true;
    }

    public /* bridge */ /* synthetic */ CalendarPagerView.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    public /* bridge */ /* synthetic */ void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i) {
        super.setDateTextAppearance(i);
    }

    public /* bridge */ /* synthetic */ void setDayFormatter(DayFormatter dayFormatter) {
        super.setDayFormatter(dayFormatter);
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

    public /* bridge */ /* synthetic */ void setMaximumDate(CalendarDay calendarDay) {
        super.setMaximumDate(calendarDay);
    }

    public /* bridge */ /* synthetic */ void setMinimumDate(CalendarDay calendarDay) {
        super.setMinimumDate(calendarDay);
    }

    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
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

    public /* bridge */ /* synthetic */ void setWeekDayFormatter(WeekDayFormatter weekDayFormatter) {
        super.setWeekDayFormatter(weekDayFormatter);
    }

    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i) {
        super.setWeekDayTextAppearance(i);
    }

    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }

    public WeekView(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i) {
        super(materialCalendarView, calendarDay, i);
    }

    /* access modifiers changed from: protected */
    public void buildDayViews(Collection<DayView> collection, Calendar calendar) {
        for (int i = 0; i < 7; i++) {
            addDayView(collection, calendar);
        }
    }
}
