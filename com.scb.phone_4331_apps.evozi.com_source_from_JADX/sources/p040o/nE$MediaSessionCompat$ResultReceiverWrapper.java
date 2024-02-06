package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nE$MediaSessionCompat$ResultReceiverWrapper */
final class nE$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<getHighestVersionAsync> {
    private /* synthetic */ C5000nE MediaBrowserCompat$ItemReceiver;

    nE$MediaSessionCompat$ResultReceiverWrapper(C5000nE nEVar) {
        this.MediaBrowserCompat$ItemReceiver = nEVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        RegularImmutableBiMap MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        ((getHighestVersionAsync) obj).write(MediaBrowserCompat$CustomActionResultReceiver.read((String) null, MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource), access$2300.write.JUST_DISMISS));
    }
}
