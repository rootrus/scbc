package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getLowContrastBackgroundDetection */
public final /* synthetic */ class getLowContrastBackgroundDetection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getLowContrastBackgroundDetection(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getRestrictiveEndorsement) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
