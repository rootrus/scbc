package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.CheckDetector */
public final /* synthetic */ class CheckDetector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AnalyticsReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ CheckDetector(AnalyticsReceiver analyticsReceiver, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = analyticsReceiver;
        this.write = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6394xa3a265ac) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.get(this.write), this.write + 1);
    }
}
