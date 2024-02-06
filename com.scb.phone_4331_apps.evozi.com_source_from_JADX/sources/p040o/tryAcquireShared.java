package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.Locale;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.tryAcquireShared */
public final class tryAcquireShared extends constrainedListMultimap {
    @HmlPinActivity
    public tryAcquireShared(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final parseEventExecution write(parseEvent parseevent, isScrollGesturesEnabled isscrollgesturesenabled, newWeakInterner newweakinterner) {
        String str;
        String str2;
        OffsetDateTime offsetDateTime;
        parseEventExecution read = parseEventExecution.read();
        read.RatingCompat = isscrollgesturesenabled.read;
        String str3 = "";
        if (isscrollgesturesenabled.write == null) {
            str = str3;
        } else {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", isscrollgesturesenabled.write);
        }
        read.MediaMetadataCompat = str;
        if (isscrollgesturesenabled.IconCompatParcelizer == null) {
            str2 = str3;
        } else {
            str2 = IconCompatParcelizer("dd MMM yyyy - HH:mm", isscrollgesturesenabled.IconCompatParcelizer);
        }
        read.ParcelableVolumeInfo = str2;
        read.MediaBrowserCompat$CustomActionResultReceiver = parseevent.write;
        read.MediaBrowserCompat$ItemReceiver = parseevent.IconCompatParcelizer;
        read.write = parseevent.read;
        read.MediaDescriptionCompat = write(newweakinterner.read);
        read.read = parseevent.MediaBrowserCompat$ItemReceiver;
        read.MediaBrowserCompat$SearchResultReceiver = parseevent.MediaBrowserCompat$MediaItem;
        read.MediaBrowserCompat$MediaItem = parseevent.RatingCompat;
        if (!(isscrollgesturesenabled.IconCompatParcelizer == null || (offsetDateTime = isscrollgesturesenabled.IconCompatParcelizer) == null)) {
            str3 = offsetDateTime.format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd HH-mm-ss", Locale.ENGLISH));
        }
        read.MediaSessionCompat$ResultReceiverWrapper = str3;
        read.IconCompatParcelizer = parseevent.MediaBrowserCompat$CustomActionResultReceiver;
        return read;
    }
}
