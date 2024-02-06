package p040o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.scb.phone.R;

/* renamed from: o.getOpenAccountProductDetail */
public final class getOpenAccountProductDetail implements DayViewDecorator {
    private final CalendarDay MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private Resources write;

    public getOpenAccountProductDetail(Resources resources, CalendarDay calendarDay, boolean z) {
        this.write = resources;
        this.MediaBrowserCompat$ItemReceiver = calendarDay;
        this.read = z;
    }

    public final boolean shouldDecorate(CalendarDay calendarDay) {
        CalendarDay calendarDay2 = this.MediaBrowserCompat$ItemReceiver;
        return calendarDay2 != null && calendarDay.equals(calendarDay2);
    }

    public final void decorate(DayViewFacade dayViewFacade) {
        Drawable read2 = ContentFrameLayout.read(this.write, R.drawable.shape_circle_purple_border, (Resources.Theme) null);
        if (read2 != null) {
            dayViewFacade.setBackgroundDrawable(read2);
            dayViewFacade.setDaysDisabled(this.read);
        }
    }
}
