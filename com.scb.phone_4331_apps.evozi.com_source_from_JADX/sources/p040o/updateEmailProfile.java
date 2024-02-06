package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.scb.phone.view.fragment.calendarlanding.CalendarFragment;

/* renamed from: o.updateEmailProfile */
public final /* synthetic */ class updateEmailProfile implements OnDateSelectedListener {
    private final /* synthetic */ CalendarFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ updateEmailProfile(CalendarFragment calendarFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarFragment;
    }

    public final void onDateSelected(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z) {
        CalendarFragment calendarFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        calendarFragment.calendarDialogPresenter.IconCompatParcelizer(calendarDay);
        calendarFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(calendarDay);
    }
}
