package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.prolificinteractive.materialcalendarview.CalendarPagerView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import com.prolificinteractive.materialcalendarview.format.TitleFormatter;
import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.onActivityCreated;

abstract class CalendarPagerAdapter<V extends CalendarPagerView> extends onActivityCreated {
    private Integer color = null;
    private final ArrayDeque<V> currentViews;
    private Integer dateTextAppearance = null;
    private DayFormatter dayFormatter = DayFormatter.DEFAULT;
    private List<DecoratorResult> decoratorResults = null;
    private List<DayViewDecorator> decorators = new ArrayList();
    private int dividerColor = 0;
    private int dividerSize = 0;
    private boolean enableWeekDivider = false;
    private boolean enableWeekOfMonthDivider = false;
    private CalendarDay maxDate = null;
    protected final MaterialCalendarView mcv;
    private CalendarDay minDate = null;
    private DateRangeIndex rangeIndex;
    private List<CalendarDay> selectedDates = new ArrayList();
    private boolean selectionEnabled = true;
    @MaterialCalendarView.ShowOtherDates
    private int showOtherDates = 4;
    private TitleFormatter titleFormatter = null;
    private final CalendarDay today;
    private WeekDayFormatter weekDayFormatter = WeekDayFormatter.DEFAULT;
    private Integer weekDayTextAppearance = null;

    /* access modifiers changed from: protected */
    public abstract DateRangeIndex createRangeIndex(CalendarDay calendarDay, CalendarDay calendarDay2);

    /* access modifiers changed from: protected */
    public abstract V createView(int i);

    /* access modifiers changed from: protected */
    public abstract int indexOf(V v);

    /* access modifiers changed from: protected */
    public abstract boolean isInstanceOfView(Object obj);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    CalendarPagerAdapter(MaterialCalendarView materialCalendarView) {
        this.mcv = materialCalendarView;
        this.today = CalendarDay.today();
        ArrayDeque<V> arrayDeque = new ArrayDeque<>();
        this.currentViews = arrayDeque;
        arrayDeque.iterator();
        setRangeDates((CalendarDay) null, (CalendarDay) null);
    }

    public void setDecorators(List<DayViewDecorator> list) {
        this.decorators = list;
        invalidateDecorators();
    }

    public void invalidateDecorators() {
        this.decoratorResults = new ArrayList();
        for (DayViewDecorator next : this.decorators) {
            DayViewFacade dayViewFacade = new DayViewFacade();
            next.decorate(dayViewFacade);
            if (dayViewFacade.isDecorated()) {
                this.decoratorResults.add(new DecoratorResult(next, dayViewFacade));
            }
        }
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setDayViewDecorators(this.decoratorResults);
        }
    }

    public int getCount() {
        return this.rangeIndex.getCount();
    }

    public CharSequence getPageTitle(int i) {
        TitleFormatter titleFormatter2 = this.titleFormatter;
        return titleFormatter2 == null ? "" : titleFormatter2.format(getItem(i));
    }

    public CalendarPagerAdapter<?> migrateStateAndReturn(CalendarPagerAdapter<?> calendarPagerAdapter) {
        calendarPagerAdapter.titleFormatter = this.titleFormatter;
        calendarPagerAdapter.color = this.color;
        calendarPagerAdapter.dateTextAppearance = this.dateTextAppearance;
        calendarPagerAdapter.weekDayTextAppearance = this.weekDayTextAppearance;
        calendarPagerAdapter.showOtherDates = this.showOtherDates;
        calendarPagerAdapter.minDate = this.minDate;
        calendarPagerAdapter.maxDate = this.maxDate;
        calendarPagerAdapter.selectedDates = this.selectedDates;
        calendarPagerAdapter.weekDayFormatter = this.weekDayFormatter;
        calendarPagerAdapter.dayFormatter = this.dayFormatter;
        calendarPagerAdapter.decorators = this.decorators;
        calendarPagerAdapter.decoratorResults = this.decoratorResults;
        calendarPagerAdapter.selectionEnabled = this.selectionEnabled;
        calendarPagerAdapter.enableWeekDivider = this.enableWeekDivider;
        calendarPagerAdapter.enableWeekOfMonthDivider = this.enableWeekOfMonthDivider;
        calendarPagerAdapter.dividerColor = this.dividerColor;
        calendarPagerAdapter.dividerSize = this.dividerSize;
        return calendarPagerAdapter;
    }

    public int getIndexForDay(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return getCount() / 2;
        }
        CalendarDay calendarDay2 = this.minDate;
        if (calendarDay2 != null && calendarDay.isBefore(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.maxDate;
        if (calendarDay3 == null || !calendarDay.isAfter(calendarDay3)) {
            return this.rangeIndex.indexOf(calendarDay);
        }
        return getCount() - 1;
    }

    public boolean isEnableWeekDivider() {
        return this.enableWeekDivider;
    }

    public boolean isEnableWeekOfMonthDivider() {
        return this.enableWeekOfMonthDivider;
    }

    public float getDividerSize() {
        return (float) this.dividerSize;
    }

    public int getDividerColor() {
        return this.dividerColor;
    }

    public int getItemPosition(Object obj) {
        int indexOf;
        if (!isInstanceOfView(obj)) {
            return -2;
        }
        CalendarPagerView calendarPagerView = (CalendarPagerView) obj;
        if (calendarPagerView.getFirstViewDay() != null && (indexOf = indexOf(calendarPagerView)) >= 0) {
            return indexOf;
        }
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        CalendarPagerView createView = createView(i);
        createView.setContentDescription(this.mcv.getCalendarContentDescription());
        createView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        createView.setSelectionEnabled(this.selectionEnabled);
        createView.setWeekDayFormatter(this.weekDayFormatter);
        createView.setDayFormatter(this.dayFormatter);
        Integer num = this.color;
        if (num != null) {
            createView.setSelectionColor(num.intValue());
        }
        Integer num2 = this.dateTextAppearance;
        if (num2 != null) {
            createView.setDateTextAppearance(num2.intValue());
        }
        Integer num3 = this.weekDayTextAppearance;
        if (num3 != null) {
            createView.setWeekDayTextAppearance(num3.intValue());
        }
        createView.setShowOtherDates(this.showOtherDates);
        createView.setMinimumDate(this.minDate);
        createView.setMaximumDate(this.maxDate);
        createView.setSelectedDates(this.selectedDates);
        createView.setEnableWeekDivider(this.enableWeekDivider);
        createView.setEnableWeekOfMonthDivider(this.enableWeekOfMonthDivider);
        createView.setDividerColor(this.dividerColor);
        createView.setDividerSize(this.dividerSize);
        viewGroup.addView(createView);
        this.currentViews.add(createView);
        createView.setDayViewDecorators(this.decoratorResults);
        return createView;
    }

    public void setSelectionEnabled(boolean z) {
        this.selectionEnabled = z;
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setSelectionEnabled(this.selectionEnabled);
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        CalendarPagerView calendarPagerView = (CalendarPagerView) obj;
        this.currentViews.remove(calendarPagerView);
        viewGroup.removeView(calendarPagerView);
    }

    public void setTitleFormatter(TitleFormatter titleFormatter2) {
        this.titleFormatter = titleFormatter2;
    }

    public void setSelectionColor(int i) {
        this.color = Integer.valueOf(i);
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setSelectionColor(i);
        }
    }

    public void setDateTextAppearance(int i) {
        if (i != 0) {
            this.dateTextAppearance = Integer.valueOf(i);
            Iterator<V> it = this.currentViews.iterator();
            while (it.hasNext()) {
                ((CalendarPagerView) it.next()).setDateTextAppearance(i);
            }
        }
    }

    public void setShowOtherDates(@MaterialCalendarView.ShowOtherDates int i) {
        this.showOtherDates = i;
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setShowOtherDates(i);
        }
    }

    public void setWeekDayFormatter(WeekDayFormatter weekDayFormatter2) {
        this.weekDayFormatter = weekDayFormatter2;
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setWeekDayFormatter(weekDayFormatter2);
        }
    }

    public void setDayFormatter(DayFormatter dayFormatter2) {
        this.dayFormatter = dayFormatter2;
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setDayFormatter(dayFormatter2);
        }
    }

    @MaterialCalendarView.ShowOtherDates
    public int getShowOtherDates() {
        return this.showOtherDates;
    }

    public void setWeekDayTextAppearance(int i) {
        if (i != 0) {
            this.weekDayTextAppearance = Integer.valueOf(i);
            Iterator<V> it = this.currentViews.iterator();
            while (it.hasNext()) {
                ((CalendarPagerView) it.next()).setWeekDayTextAppearance(i);
            }
        }
    }

    public void setRangeDates(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.minDate = calendarDay;
        this.maxDate = calendarDay2;
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            CalendarPagerView calendarPagerView = (CalendarPagerView) it.next();
            calendarPagerView.setMinimumDate(calendarDay);
            calendarPagerView.setMaximumDate(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.from(this.today.getYear() - 200, this.today.getMonth(), this.today.getDay());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.from(this.today.getYear() + DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, this.today.getMonth(), this.today.getDay());
        }
        this.rangeIndex = createRangeIndex(calendarDay, calendarDay2);
        notifyDataSetChanged();
        invalidateSelectedDates();
    }

    public void setEnableWeekDivider(boolean z) {
        this.enableWeekDivider = z;
    }

    public void setEnableWeekOfMonthDivider(boolean z) {
        this.enableWeekOfMonthDivider = z;
    }

    public void setDividerSize(int i) {
        this.dividerSize = i;
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
    }

    public DateRangeIndex getRangeIndex() {
        return this.rangeIndex;
    }

    public void clearSelections() {
        this.selectedDates.clear();
        invalidateSelectedDates();
    }

    public void setDateSelected(CalendarDay calendarDay, boolean z) {
        if (z) {
            if (!this.selectedDates.contains(calendarDay)) {
                this.selectedDates.add(calendarDay);
                invalidateSelectedDates();
            }
        } else if (this.selectedDates.contains(calendarDay)) {
            this.selectedDates.remove(calendarDay);
            invalidateSelectedDates();
        }
    }

    private void invalidateSelectedDates() {
        validateSelectedDates();
        Iterator<V> it = this.currentViews.iterator();
        while (it.hasNext()) {
            ((CalendarPagerView) it.next()).setSelectedDates(this.selectedDates);
        }
    }

    private void validateSelectedDates() {
        CalendarDay calendarDay;
        int i = 0;
        while (i < this.selectedDates.size()) {
            CalendarDay calendarDay2 = this.selectedDates.get(i);
            CalendarDay calendarDay3 = this.minDate;
            if ((calendarDay3 != null && calendarDay3.isAfter(calendarDay2)) || ((calendarDay = this.maxDate) != null && calendarDay.isBefore(calendarDay2))) {
                this.selectedDates.remove(i);
                this.mcv.onDateUnselected(calendarDay2);
                i--;
            }
            i++;
        }
    }

    public CalendarDay getItem(int i) {
        return this.rangeIndex.getItem(i);
    }

    public List<CalendarDay> getSelectedDates() {
        return Collections.unmodifiableList(this.selectedDates);
    }

    /* access modifiers changed from: protected */
    public int getDateTextAppearance() {
        Integer num = this.dateTextAppearance;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int getWeekDayTextAppearance() {
        Integer num = this.weekDayTextAppearance;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
