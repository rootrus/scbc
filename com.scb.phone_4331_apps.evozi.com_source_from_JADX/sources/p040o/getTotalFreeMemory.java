package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getTotalFreeMemory */
public final /* synthetic */ class getTotalFreeMemory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;

    public /* synthetic */ getTotalFreeMemory(boolean z) {
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPayee) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
