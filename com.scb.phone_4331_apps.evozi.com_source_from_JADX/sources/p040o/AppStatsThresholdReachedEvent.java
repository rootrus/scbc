package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsThresholdReachedEvent */
public final /* synthetic */ class AppStatsThresholdReachedEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ AppStatsThresholdReachedEvent(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCheckParameters) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
