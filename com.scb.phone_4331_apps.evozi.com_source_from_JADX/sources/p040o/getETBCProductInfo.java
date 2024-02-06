package p040o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.scb.phone.R;

/* renamed from: o.getETBCProductInfo */
public final class getETBCProductInfo implements DayViewDecorator {
    private Resources MediaBrowserCompat$CustomActionResultReceiver;
    private final CalendarDay write;

    public getETBCProductInfo(Resources resources, CalendarDay calendarDay) {
        this.MediaBrowserCompat$CustomActionResultReceiver = resources;
        this.write = calendarDay;
    }

    public final boolean shouldDecorate(CalendarDay calendarDay) {
        CalendarDay calendarDay2 = this.write;
        return calendarDay2 != null && calendarDay.equals(calendarDay2);
    }

    public final void decorate(DayViewFacade dayViewFacade) {
        Drawable read = ContentFrameLayout.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.drawable.shape_circle_light_purple, (Resources.Theme) null);
        if (read != null) {
            dayViewFacade.setBackgroundDrawable(read);
        }
        dayViewFacade.setDaysDisabled(true);
    }
}
