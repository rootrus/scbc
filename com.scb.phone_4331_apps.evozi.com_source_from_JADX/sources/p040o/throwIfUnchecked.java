package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.throwIfUnchecked */
public final /* synthetic */ class throwIfUnchecked implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doOpenSession MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ throwIfUnchecked(doOpenSession doopensession) {
        this.MediaBrowserCompat$CustomActionResultReceiver = doopensession;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCardNumber) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
    }
}
