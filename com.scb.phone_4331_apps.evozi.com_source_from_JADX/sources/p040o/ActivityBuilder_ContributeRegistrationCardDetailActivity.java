package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;
import com.scb.phone.view.fragment.scheduledtransaction.CalendarDialogFragment;

/* renamed from: o.ActivityBuilder_ContributeRegistrationCardDetailActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRegistrationCardDetailActivity implements OnMonthChangedListener {
    private final /* synthetic */ CalendarDialogFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeRegistrationCardDetailActivity(CalendarDialogFragment calendarDialogFragment) {
        this.MediaBrowserCompat$ItemReceiver = calendarDialogFragment;
    }

    public final void onMonthChanged(MaterialCalendarView materialCalendarView, CalendarDay calendarDay) {
        C5183qi qiVar = this.MediaBrowserCompat$ItemReceiver.calendarDialogPresenter;
        C5182qh qhVar = new C5182qh(qiVar, calendarDay);
        if (qiVar.RatingCompat != null) {
            qhVar.IconCompatParcelizer(qiVar.RatingCompat);
        }
    }
}
