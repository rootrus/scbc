package p040o;

import java.util.ArrayList;
import p040o.setLayoutResource;

/* renamed from: o.setLayoutResource$MediaBrowserCompat$MediaItem */
class setLayoutResource$MediaBrowserCompat$MediaItem implements setLayoutResource.MediaMetadataCompat {
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver = null;
    final /* synthetic */ setLayoutResource read;
    final int write;

    setLayoutResource$MediaBrowserCompat$MediaItem(setLayoutResource setlayoutresource, int i, int i2) {
        this.read = setlayoutresource;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = i2;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2) {
        setTitleMarginStart peekChildFragmentManager;
        if (this.read.MediaBrowserCompat$SearchResultReceiver != null && this.MediaBrowserCompat$CustomActionResultReceiver < 0 && this.MediaBrowserCompat$ItemReceiver == null && (peekChildFragmentManager = this.read.MediaBrowserCompat$SearchResultReceiver.peekChildFragmentManager()) != null && peekChildFragmentManager.MediaMetadataCompat()) {
            return false;
        }
        return this.read.MediaBrowserCompat$CustomActionResultReceiver(arrayList, arrayList2, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
