package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: o.getParentIndex */
public final class getParentIndex extends constrainedSetMultimap<getPattern, isDirectInjection> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        String str;
        String str2;
        getPattern getpattern = (getPattern) obj;
        isDirectInjection MediaBrowserCompat$ItemReceiver = isDirectInjection.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = getpattern.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = getpattern.MediaDescriptionCompat;
        String str3 = "";
        if (getpattern.MediaBrowserCompat$MediaItem == null) {
            str = str3;
        } else {
            str = IconCompatParcelizer("dd MMM", getpattern.MediaBrowserCompat$MediaItem);
        }
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = str;
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = write(getpattern.MediaBrowserCompat$SearchResultReceiver);
        if (!TextUtils.isEmpty(getpattern.write)) {
            str2 = getpattern.write;
        } else {
            str2 = "-";
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = str2;
        if (getpattern.RatingCompat != null) {
            str3 = IconCompatParcelizer("dd MMM yyyy", getpattern.RatingCompat);
        }
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = str3;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = getpattern.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.RatingCompat = write(getpattern.read);
        boolean z = false;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words), new Object[]{write(getpattern.read), getpattern.MediaBrowserCompat$CustomActionResultReceiver});
        MediaBrowserCompat$ItemReceiver.read = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words), new Object[]{write(getpattern.MediaBrowserCompat$SearchResultReceiver), getpattern.MediaDescriptionCompat});
        if (getpattern.MediaBrowserCompat$SearchResultReceiver != null && getpattern.MediaBrowserCompat$SearchResultReceiver.doubleValue() < 0.0d) {
            z = true;
        }
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = z;
        return MediaBrowserCompat$ItemReceiver;
    }

    @HmlPinActivity
    getParentIndex(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
