package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import org.threeten.p041bp.OffsetDateTime;
import p040o.writeUInt64NoTag;

/* renamed from: o.BufferedQuickFaceExtractor */
public final /* synthetic */ class BufferedQuickFaceExtractor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5183qi read;
    private final /* synthetic */ CalendarDay write;

    public /* synthetic */ BufferedQuickFaceExtractor(C5183qi qiVar, CalendarDay calendarDay) {
        this.read = qiVar;
        this.write = calendarDay;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStripHeight) obj).IconCompatParcelizer(this.read.write.IconCompatParcelizer("dd MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(this.write.getCalendar()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"))));
    }
}
