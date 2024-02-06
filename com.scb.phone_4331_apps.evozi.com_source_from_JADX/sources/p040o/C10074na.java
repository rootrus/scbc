package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import org.threeten.p041bp.OffsetDateTime;
import p040o.writeUInt64NoTag;

/* renamed from: o.na */
public final /* synthetic */ class C10074na implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CalendarDay MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C5183qi write;

    public /* synthetic */ C10074na(C5183qi qiVar, CalendarDay calendarDay) {
        this.write = qiVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarDay;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStripHeight) obj).write(OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(this.MediaBrowserCompat$CustomActionResultReceiver.getCalendar()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok")));
    }
}
