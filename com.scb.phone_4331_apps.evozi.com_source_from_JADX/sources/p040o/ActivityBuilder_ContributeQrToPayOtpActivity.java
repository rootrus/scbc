package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.scb.phone.view.fragment.scheduledtransaction.CalendarDialogFragment;

/* renamed from: o.ActivityBuilder_ContributeQrToPayOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeQrToPayOtpActivity implements OnDateSelectedListener {
    private final /* synthetic */ setDiskUsed MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CalendarDialogFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeQrToPayOtpActivity(CalendarDialogFragment calendarDialogFragment, setDiskUsed setdiskused) {
        this.MediaBrowserCompat$ItemReceiver = calendarDialogFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = setdiskused;
    }

    public final void onDateSelected(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z) {
        this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver, calendarDay);
    }
}
