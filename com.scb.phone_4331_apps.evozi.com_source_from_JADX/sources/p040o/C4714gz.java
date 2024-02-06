package p040o;

import p040o.LocalProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.gz */
public final /* synthetic */ class C4714gz implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4767hi MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C4714gz(C4767hi hiVar, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = hiVar;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4767hi hiVar = this.MediaBrowserCompat$ItemReceiver;
        ((LocalProjectProvider.VersionTable) obj).write(hiVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
