package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;
import com.scb.phone.view.fragment.calendarlanding.CalendarFragment;

/* renamed from: o.swapTiles */
public final /* synthetic */ class swapTiles implements OnMonthChangedListener {
    private final /* synthetic */ CalendarFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ swapTiles(CalendarFragment calendarFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarFragment;
    }

    public final void onMonthChanged(MaterialCalendarView materialCalendarView, CalendarDay calendarDay) {
        C5183qi qiVar = this.MediaBrowserCompat$CustomActionResultReceiver.calendarDialogPresenter;
        C5182qh qhVar = new C5182qh(qiVar, calendarDay);
        if (qiVar.RatingCompat != null) {
            qhVar.IconCompatParcelizer(qiVar.RatingCompat);
        }
    }
}
