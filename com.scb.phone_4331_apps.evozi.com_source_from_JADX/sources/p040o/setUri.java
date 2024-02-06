package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUri */
public final /* synthetic */ class setUri implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ logBadConfigError MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ OffsetDateTime MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setUri(logBadConfigError logbadconfigerror, OffsetDateTime offsetDateTime) {
        this.MediaBrowserCompat$CustomActionResultReceiver = logbadconfigerror;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory.IconCompatParcelizer) obj).read(CalendarDay.from(CheckCaptureActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver)));
    }
}
