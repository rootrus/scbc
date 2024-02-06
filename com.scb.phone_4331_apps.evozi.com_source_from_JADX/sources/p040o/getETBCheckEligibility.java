package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

/* renamed from: o.getETBCheckEligibility */
public final class getETBCheckEligibility implements DayViewDecorator {
    private final CalendarDay MediaBrowserCompat$CustomActionResultReceiver;
    private final CalendarDay read;

    public getETBCheckEligibility(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarDay;
        this.read = calendarDay2;
    }

    public final boolean shouldDecorate(CalendarDay calendarDay) {
        return calendarDay.isBefore(this.MediaBrowserCompat$CustomActionResultReceiver) || calendarDay.equals(this.MediaBrowserCompat$CustomActionResultReceiver) || calendarDay.isAfter(this.read);
    }

    public final void decorate(DayViewFacade dayViewFacade) {
        dayViewFacade.setDaysDisabled(true);
    }
}
