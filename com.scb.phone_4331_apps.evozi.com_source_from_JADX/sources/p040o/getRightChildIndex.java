package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.getRightChildIndex */
public final class getRightChildIndex extends constrainedSetMultimap<getStartCap, getInterface> {
    private getParentIndex read;

    @HmlPinActivity
    getRightChildIndex(Resources resources, getParentIndex getparentindex, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        this.read = getparentindex;
    }

    /* renamed from: IconCompatParcelizer */
    public final getInterface MediaBrowserCompat$ItemReceiver(getStartCap getstartcap) {
        String str;
        getInterface MediaBrowserCompat$CustomActionResultReceiver = getInterface.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = getstartcap.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.read = String.valueOf(getstartcap.write);
        if (getstartcap.read == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM", getstartcap.read);
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = write(getstartcap.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = this.read.MediaBrowserCompat$ItemReceiver(getstartcap.MediaBrowserCompat$MediaItem);
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
