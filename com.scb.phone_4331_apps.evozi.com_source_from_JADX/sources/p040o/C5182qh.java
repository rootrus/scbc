package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import p040o.writeUInt64NoTag;

/* renamed from: o.qh */
public final /* synthetic */ class C5182qh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5183qi IconCompatParcelizer;
    private final /* synthetic */ CalendarDay MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C5182qh(C5183qi qiVar, CalendarDay calendarDay) {
        this.IconCompatParcelizer = qiVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarDay;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5183qi qiVar = this.IconCompatParcelizer;
        CalendarDay calendarDay = this.MediaBrowserCompat$CustomActionResultReceiver;
        getCarbonStripHeight getcarbonstripheight = (getCarbonStripHeight) obj;
        getcarbonstripheight.read(qiVar.write.MediaBrowserCompat$CustomActionResultReceiver(calendarDay));
        getcarbonstripheight.write(!qiVar.write.MediaBrowserCompat$CustomActionResultReceiver(calendarDay).equals(qiVar.write.MediaBrowserCompat$CustomActionResultReceiver(qiVar.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver)));
        getcarbonstripheight.MediaBrowserCompat$CustomActionResultReceiver(!qiVar.write.MediaBrowserCompat$CustomActionResultReceiver(calendarDay).equals(qiVar.write.MediaBrowserCompat$CustomActionResultReceiver(qiVar.IconCompatParcelizer.MediaBrowserCompat$MediaItem)));
    }
}
