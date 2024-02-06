package p040o;

import p040o.nContextSetPriority;

/* renamed from: o.nContextSetPriority$MediaBrowserCompat$ItemReceiver */
class nContextSetPriority$MediaBrowserCompat$ItemReceiver extends nContextSetPriority.MediaDescriptionCompat {
    private /* synthetic */ nContextSetPriority IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    nContextSetPriority$MediaBrowserCompat$ItemReceiver(nContextSetPriority ncontextsetpriority) {
        super(ncontextsetpriority, (byte) 0);
        this.IconCompatParcelizer = ncontextsetpriority;
    }

    /* access modifiers changed from: protected */
    public final float MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer.MediaSessionCompat$QueueItem;
    }
}
