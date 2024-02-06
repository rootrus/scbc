package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.scb.phone.view.fragment.calendarlanding.CalendarFragment;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.setUserLanguage */
public final /* synthetic */ class setUserLanguage implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ OffsetDateTime write;

    public /* synthetic */ setUserLanguage(OffsetDateTime offsetDateTime) {
        this.write = offsetDateTime;
    }

    public final boolean write(Object obj) {
        return CalendarFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, (CalendarDay) obj);
    }
}
