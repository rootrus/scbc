package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setVibrationEnabled */
public final /* synthetic */ class setVibrationEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean write;

    public /* synthetic */ setVibrationEnabled(boolean z) {
        this.write = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionListener) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}
