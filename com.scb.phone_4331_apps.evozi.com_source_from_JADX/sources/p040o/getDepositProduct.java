package p040o;

import android.content.res.Resources;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.scb.phone.R;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: o.getDepositProduct */
public final class getDepositProduct implements DayViewDecorator {
    private final HashSet<CalendarDay> IconCompatParcelizer;
    private final Resources MediaBrowserCompat$CustomActionResultReceiver;
    private final int write = R.color.f67252131099881;

    public getDepositProduct(Resources resources, Collection<CalendarDay> collection) {
        this.MediaBrowserCompat$CustomActionResultReceiver = resources;
        this.IconCompatParcelizer = new HashSet<>(collection);
    }

    public final boolean shouldDecorate(CalendarDay calendarDay) {
        return this.IconCompatParcelizer.contains(calendarDay);
    }

    public final void decorate(DayViewFacade dayViewFacade) {
        dayViewFacade.addSpan(new confirmRegistration((float) this.MediaBrowserCompat$CustomActionResultReceiver.getDimensionPixelOffset(R.dimen.f74432131165886), (float) this.MediaBrowserCompat$CustomActionResultReceiver.getDimensionPixelOffset(R.dimen.f74442131165887), R.color.f67252131099881));
    }
}
