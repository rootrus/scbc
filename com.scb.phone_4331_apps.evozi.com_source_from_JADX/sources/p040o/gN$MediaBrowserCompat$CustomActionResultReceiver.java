package p040o;

import p040o.access$2300;

/* renamed from: o.gN$MediaBrowserCompat$CustomActionResultReceiver */
class gN$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ C4456gN read;

    private gN$MediaBrowserCompat$CustomActionResultReceiver(C4456gN gNVar) {
        this.read = gNVar;
    }

    /* synthetic */ gN$MediaBrowserCompat$CustomActionResultReceiver(C4456gN gNVar, byte b) {
        this(gNVar);
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        if (this.read.MediaBrowserCompat$ItemReceiver != null) {
            this.read.MediaBrowserCompat$ItemReceiver.read();
        }
    }
}
