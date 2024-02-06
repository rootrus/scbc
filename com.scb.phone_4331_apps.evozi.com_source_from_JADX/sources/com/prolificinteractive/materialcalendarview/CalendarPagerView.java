package com.prolificinteractive.materialcalendarview;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

abstract class CalendarPagerView extends ViewGroup implements View.OnClickListener {
    protected static final int DAY_NAMES_ROW = 1;
    protected static final int DEFAULT_DAYS_IN_WEEK = 7;
    protected static final int DEFAULT_MAX_WEEKS = 6;
    private static final Calendar tempWorkingCalendar = CalendarUtils.getInstance();
    private final Collection<DayView> dayViews = new ArrayList();
    private final ArrayList<DecoratorResult> decoratorResults = new ArrayList<>();
    private int dividerColor = 0;
    private int dividerSize = 0;
    private boolean enableWeekDivider;
    private boolean enableWeekOfMonthDivider;
    private int firstDayOfWeek;
    private CalendarDay firstViewDay;
    private CalendarDay maxDate = null;
    private MaterialCalendarView mcv;
    private CalendarDay minDate = null;
    @MaterialCalendarView.ShowOtherDates
    protected int showOtherDates = 4;
    private final ArrayList<WeekDayView> weekDayViews = new ArrayList<>();

    /* access modifiers changed from: protected */
    public abstract void buildDayViews(Collection<DayView> collection, Calendar calendar);

    /* access modifiers changed from: protected */
    public abstract int getRows();

    /* access modifiers changed from: protected */
    public abstract boolean isDayEnabled(CalendarDay calendarDay);

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CalendarPagerView(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i) {
        super(materialCalendarView.getContext());
        this.mcv = materialCalendarView;
        this.firstViewDay = calendarDay;
        this.firstDayOfWeek = i;
        setClipChildren(false);
        setClipToPadding(false);
        buildWeekDays(resetAndGetWorkingCalendar());
        buildDayViews(this.dayViews, resetAndGetWorkingCalendar());
    }

    private void buildWeekDays(Calendar calendar) {
        for (int i = 0; i < 7; i++) {
            WeekDayView weekDayView = new WeekDayView(getContext(), CalendarUtils.getDayOfWeek(calendar));
            this.weekDayViews.add(weekDayView);
            addView(weekDayView);
            calendar.add(5, 1);
        }
    }

    /* access modifiers changed from: protected */
    public void addDayView(Collection<DayView> collection, Calendar calendar) {
        DayView dayView = new DayView(getContext(), CalendarDay.from(calendar));
        dayView.setOnClickListener(this);
        collection.add(dayView);
        addView(dayView, new LayoutParams());
        calendar.add(5, 1);
    }

    /* access modifiers changed from: protected */
    public Calendar resetAndGetWorkingCalendar() {
        getFirstViewDay().copyTo(tempWorkingCalendar);
        tempWorkingCalendar.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek2 = getFirstDayOfWeek() - CalendarUtils.getDayOfWeek(tempWorkingCalendar);
        if (!MaterialCalendarView.showOtherMonths(this.showOtherDates) ? firstDayOfWeek2 > 0 : firstDayOfWeek2 >= 0) {
            firstDayOfWeek2 -= 7;
        }
        tempWorkingCalendar.add(5, firstDayOfWeek2);
        return tempWorkingCalendar;
    }

    /* access modifiers changed from: protected */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    public void setDayViewDecorators(List<DecoratorResult> list) {
        this.decoratorResults.clear();
        if (list != null) {
            this.decoratorResults.addAll(list);
        }
        invalidateDecorators();
    }

    public void setWeekDayTextAppearance(int i) {
        Iterator<WeekDayView> it = this.weekDayViews.iterator();
        while (it.hasNext()) {
            it.next().setTextAppearance(getContext(), i);
        }
    }

    public void setDateTextAppearance(int i) {
        for (DayView textAppearance : this.dayViews) {
            textAppearance.setTextAppearance(getContext(), i);
        }
    }

    public void setShowOtherDates(@MaterialCalendarView.ShowOtherDates int i) {
        this.showOtherDates = i;
        updateUi();
    }

    public void setSelectionEnabled(boolean z) {
        for (DayView next : this.dayViews) {
            next.setOnClickListener(z ? this : null);
            next.setClickable(z);
        }
    }

    public void setSelectionColor(int i) {
        for (DayView selectionColor : this.dayViews) {
            selectionColor.setSelectionColor(i);
        }
    }

    public void setWeekDayFormatter(WeekDayFormatter weekDayFormatter) {
        Iterator<WeekDayView> it = this.weekDayViews.iterator();
        while (it.hasNext()) {
            it.next().setWeekDayFormatter(weekDayFormatter);
        }
    }

    public void setDayFormatter(DayFormatter dayFormatter) {
        for (DayView dayFormatter2 : this.dayViews) {
            dayFormatter2.setDayFormatter(dayFormatter);
        }
    }

    public void setMinimumDate(CalendarDay calendarDay) {
        this.minDate = calendarDay;
        updateUi();
    }

    public void setMaximumDate(CalendarDay calendarDay) {
        this.maxDate = calendarDay;
        updateUi();
    }

    public void setEnableWeekDivider(boolean z) {
        this.enableWeekDivider = z;
        updateUi();
    }

    public void setEnableWeekOfMonthDivider(boolean z) {
        this.enableWeekOfMonthDivider = z;
        updateUi();
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
        updateUi();
    }

    public void setDividerSize(int i) {
        this.dividerSize = i;
        updateUi();
    }

    public void setSelectedDates(Collection<CalendarDay> collection) {
        for (DayView next : this.dayViews) {
            next.setChecked(collection != null && collection.contains(next.getDate()));
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void updateUi() {
        for (DayView next : this.dayViews) {
            CalendarDay date = next.getDate();
            next.setupSelection(this.showOtherDates, date.isInRange(this.minDate, this.maxDate), isDayEnabled(date));
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void invalidateDecorators() {
        DayViewFacade dayViewFacade = new DayViewFacade();
        for (DayView next : this.dayViews) {
            dayViewFacade.reset();
            Iterator<DecoratorResult> it = this.decoratorResults.iterator();
            while (it.hasNext()) {
                DecoratorResult next2 = it.next();
                if (next2.decorator.shouldDecorate(next.getDate())) {
                    next2.result.applyTo(dayViewFacade);
                }
            }
            next.applyFacade(dayViewFacade);
        }
    }

    public void onClick(View view) {
        if (view instanceof DayView) {
            this.mcv.onDateClicked((DayView) view);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 0 || mode == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        int i3 = size / 7;
        int rows = size2 / getRows();
        setMeasuredDimension(size, size2 + (getDividerHeight() * (getRows() - (this.enableWeekDivider ? 1 : 2))));
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(rows, 1073741824));
        }
    }

    private int getDividerHeight() {
        if (this.enableWeekDivider || this.enableWeekOfMonthDivider) {
            return this.dividerSize;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        ArrayList<View> arrayList = new ArrayList<>();
        int i5 = this.dividerSize;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth() + i6;
            int measuredHeight = childAt.getMeasuredHeight() + i7;
            childAt.layout(i6, i7, measuredWidth, measuredHeight);
            if (i8 % 7 == 6) {
                if (i8 > 7 || !this.enableWeekDivider) {
                    i7 = measuredHeight;
                } else {
                    View view = new View(getContext());
                    view.setBackgroundColor(this.dividerColor);
                    int i9 = measuredHeight + i5;
                    view.layout(0, measuredHeight, getMeasuredWidth(), i9);
                    arrayList.add(view);
                    i7 = i9;
                }
                if (i8 <= 7 || !this.enableWeekOfMonthDivider) {
                    i6 = 0;
                } else {
                    View view2 = new View(getContext());
                    view2.setBackgroundColor(this.dividerColor);
                    int i10 = i7 + i5;
                    view2.layout(0, i7, getMeasuredWidth(), i10);
                    arrayList.add(view2);
                    i6 = 0;
                    i7 = i10;
                }
            } else {
                i6 = measuredWidth;
            }
        }
        if (!arrayList.isEmpty()) {
            for (View addView : arrayList) {
                addView(addView);
            }
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(CalendarPagerView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CalendarPagerView.class.getName());
    }

    /* access modifiers changed from: protected */
    public CalendarDay getFirstViewDay() {
        return this.firstViewDay;
    }

    protected static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams() {
            super(-2, -2);
        }
    }
}
