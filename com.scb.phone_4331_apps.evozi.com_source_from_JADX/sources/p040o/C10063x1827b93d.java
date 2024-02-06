package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nE$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C10063x1827b93d<V> implements writeUInt64NoTag.IconCompatParcelizer<getHighestVersionAsync> {
    private /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C5000nE write;

    C10063x1827b93d(C5000nE nEVar, Throwable th) {
        this.write = nEVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getHighestVersionAsync) obj).write(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }
}
