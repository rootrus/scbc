package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import p040o.Iterables;
import p040o.writeSessionApp;

/* renamed from: o.synchronizedSortedSetMultimap */
public final class synchronizedSortedSetMultimap extends constrainedSetMultimap<synchronizedSortedSetMultimap$MediaBrowserCompat$ItemReceiver, writeSessionApp> {
    @HmlPinActivity
    synchronizedSortedSetMultimap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: write */
    public final writeSessionApp MediaBrowserCompat$ItemReceiver(synchronizedSortedSetMultimap$MediaBrowserCompat$ItemReceiver synchronizedsortedsetmultimap_mediabrowsercompat_itemreceiver) {
        String str;
        int i;
        String str2;
        activate activate = synchronizedsortedsetmultimap_mediabrowsercompat_itemreceiver.read;
        int i2 = synchronizedsortedsetmultimap_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        String format = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words_with_separator), new Object[]{activate.MediaDescriptionCompat, activate.RatingCompat});
        String str3 = activate.MediaSessionCompat$ResultReceiverWrapper;
        if (isFlat.CREDIT == activate.MediaBrowserCompat$CustomActionResultReceiver) {
            str = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.credit_value), new Object[]{write(Double.valueOf(activate.MediaBrowserCompat$ItemReceiver))});
        } else {
            str = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_value), new Object[]{write(Double.valueOf(activate.MediaBrowserCompat$ItemReceiver))});
        }
        finalizeSession MediaBrowserCompat$CustomActionResultReceiver = finalizeSession.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str3;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = ((long) i2) << 1;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = format;
        if (isFlat.CREDIT == activate.MediaBrowserCompat$CustomActionResultReceiver) {
            i = Iterables.C35273.read.light_green;
        } else {
            i = Iterables.C35273.read.light_red;
        }
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = i;
        MediaBrowserCompat$CustomActionResultReceiver.read = str;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = activate.write;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = TextUtils.isEmpty(activate.write) ? writeSessionApp.read.NO_ANNOTATION : writeSessionApp.read.HAVE_ANNOTATION;
        if (activate.MediaBrowserCompat$MediaItem == null) {
            str2 = "";
        } else {
            str2 = IconCompatParcelizer("dd MMM - HH:mm", activate.MediaBrowserCompat$MediaItem);
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = str2;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
