package p040o;

import android.os.Bundle;
import p040o.MediaSessionCompat$QueueItem;
import p040o.ParcelableVolumeInfo;

/* renamed from: o.ParcelableVolumeInfo$MediaBrowserCompat$ItemReceiver */
class ParcelableVolumeInfo$MediaBrowserCompat$ItemReceiver extends MediaSessionCompat$QueueItem.write {
    final /* synthetic */ ParcelableVolumeInfo IconCompatParcelizer;

    ParcelableVolumeInfo$MediaBrowserCompat$ItemReceiver(ParcelableVolumeInfo parcelableVolumeInfo) {
        this.IconCompatParcelizer = parcelableVolumeInfo;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, Bundle bundle) {
        if (this.IconCompatParcelizer.read != null) {
            this.IconCompatParcelizer.read.post(new ParcelableVolumeInfo.write(i, bundle));
        } else {
            this.IconCompatParcelizer.IconCompatParcelizer(i, bundle);
        }
    }
}
