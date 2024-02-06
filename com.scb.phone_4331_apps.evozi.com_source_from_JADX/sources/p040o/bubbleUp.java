package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.bubbleUp */
public final class bubbleUp extends constrainedSetMultimap<setColor, requiredProvider> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        String str;
        String str2;
        setColor setcolor = (setColor) obj;
        String str3 = "";
        String str4 = "THB".equals(setcolor.write) ? str3 : setcolor.write;
        requiredProvider read = requiredProvider.read();
        read.MediaBrowserCompat$ItemReceiver = setcolor.read;
        if (setcolor.RatingCompat != null) {
            str = IconCompatParcelizer("dd MMM yyyy", setcolor.RatingCompat);
        } else {
            str = "-";
        }
        read.MediaMetadataCompat = str;
        if (setcolor.MediaBrowserCompat$SearchResultReceiver != null) {
            str2 = write(setcolor.MediaBrowserCompat$SearchResultReceiver);
        } else {
            str2 = str3;
        }
        read.ParcelableVolumeInfo = str2;
        if (setcolor.MediaDescriptionCompat != null) {
            str3 = IconCompatParcelizer("dd MMM", setcolor.MediaDescriptionCompat);
        }
        read.f2929x50fd9e4a = str3;
        read.MediaBrowserCompat$MediaItem = setcolor.write;
        read.RatingCompat = setcolor.MediaBrowserCompat$CustomActionResultReceiver;
        read.MediaSessionCompat$Token = setcolor.MediaBrowserCompat$MediaItem;
        boolean z = false;
        read.read = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words), new Object[]{setcolor.MediaBrowserCompat$CustomActionResultReceiver, str4});
        read.IconCompatParcelizer = setcolor.MediaBrowserCompat$ItemReceiver;
        read.MediaDescriptionCompat = setcolor.RatingCompat == null && setcolor.MediaBrowserCompat$SearchResultReceiver == null;
        read.MediaBrowserCompat$SearchResultReceiver = "THB".equals(setcolor.write);
        if (setcolor.MediaBrowserCompat$SearchResultReceiver != null && setcolor.MediaBrowserCompat$SearchResultReceiver.doubleValue() < 0.0d) {
            z = true;
        }
        read.MediaBrowserCompat$CustomActionResultReceiver = z;
        return read;
    }

    @HmlPinActivity
    bubbleUp(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
