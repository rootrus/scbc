package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.sg */
public final /* synthetic */ class C5399sg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5411sl MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ C5399sg(C5411sl slVar, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = slVar;
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5411sl slVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((ServerProjectProvider.C128911) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(slVar.MediaBrowserCompat$MediaItem, (String) null, slVar.write, (String) null, (String) null, !this.read, false, (String) null, 72));
    }
}
