package p040o;

import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsRequest */
public final /* synthetic */ class SettingsRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ListenableFutureTask MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ SettingsRequest(ListenableFutureTask listenableFutureTask, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = listenableFutureTask;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
