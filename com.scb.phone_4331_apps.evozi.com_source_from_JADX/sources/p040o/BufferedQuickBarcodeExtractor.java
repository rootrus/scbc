package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import org.threeten.p041bp.OffsetDateTime;
import p040o.writeUInt64NoTag;

/* renamed from: o.BufferedQuickBarcodeExtractor */
public final /* synthetic */ class BufferedQuickBarcodeExtractor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CalendarDay read;
    private final /* synthetic */ C5183qi write;

    public /* synthetic */ BufferedQuickBarcodeExtractor(C5183qi qiVar, CalendarDay calendarDay) {
        this.write = qiVar;
        this.read = calendarDay;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStripHeight) obj).write(this.write.write.IconCompatParcelizer("dd MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(this.read.getCalendar()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"))));
    }
}
