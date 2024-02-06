package p040o;

import p040o.nContextSetPriority;

/* renamed from: o.nContextSetPriority$MediaBrowserCompat$CustomActionResultReceiver */
class C1398x111fa3d2 extends nContextSetPriority.MediaDescriptionCompat {
    private /* synthetic */ nContextSetPriority MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1398x111fa3d2(nContextSetPriority ncontextsetpriority) {
        super(ncontextsetpriority, (byte) 0);
        this.MediaBrowserCompat$ItemReceiver = ncontextsetpriority;
    }

    /* access modifiers changed from: protected */
    public final float MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem + this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat;
    }
}
