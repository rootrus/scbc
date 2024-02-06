package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nE$MediaBrowserCompat$SearchResultReceiver */
public final class nE$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getHighestVersionAsync> {
    private /* synthetic */ C5000nE read;

    public nE$MediaBrowserCompat$SearchResultReceiver(C5000nE nEVar) {
        this.read = nEVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getHighestVersionAsync) obj).MediaBrowserCompat$ItemReceiver(C5000nE.MediaMetadataCompat(this.read));
    }
}
