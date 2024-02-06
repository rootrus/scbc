package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setStabilityThresholdEnabled */
public final /* synthetic */ class setStabilityThresholdEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;

    public /* synthetic */ setStabilityThresholdEnabled(boolean z) {
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1352hA) obj).MediaBrowserCompat$ItemReceiver(this.read);
    }
}
