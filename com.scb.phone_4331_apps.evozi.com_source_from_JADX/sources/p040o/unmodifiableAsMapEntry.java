package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Iterables;

/* renamed from: o.unmodifiableAsMapEntry */
public final class unmodifiableAsMapEntry extends constrainedSetMultimap<C5440xe8e92d2, writeSessionDevice> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        C5440xe8e92d2 unmodifiableasmapentry_mediabrowsercompat_customactionresultreceiver = (C5440xe8e92d2) obj;
        return write(unmodifiableasmapentry_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer, unmodifiableasmapentry_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlPinActivity
    unmodifiableAsMapEntry(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    public writeSessionDevice write(getSnippet getsnippet, int i) {
        int i2;
        String str;
        String read = read(Double.valueOf(getsnippet.write));
        double d = getsnippet.write;
        if (d > 0.0d) {
            i2 = Iterables.C35273.read.light_green;
        } else if (d < 0.0d) {
            i2 = Iterables.C35273.read.light_red;
        } else {
            i2 = Iterables.C35273.read.fake_black;
        }
        writeSessionDevice write = writeSessionDevice.write();
        String str2 = "";
        if (getsnippet.MediaBrowserCompat$CustomActionResultReceiver == null) {
            str = str2;
        } else {
            str = IconCompatParcelizer("dd MMM yyyy", getsnippet.MediaBrowserCompat$CustomActionResultReceiver);
        }
        write.MediaBrowserCompat$ItemReceiver = str;
        write.MediaSessionCompat$Token = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words), new Object[]{String.valueOf(getsnippet.MediaBrowserCompat$SearchResultReceiver), getsnippet.MediaBrowserCompat$MediaItem});
        write.MediaSessionCompat$QueueItem = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format), new Object[]{MediaBrowserCompat$ItemReceiver(Double.valueOf(getsnippet.MediaDescriptionCompat)), this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage)});
        write.f2977x50fd9e4a = write(Double.valueOf(getsnippet.MediaBrowserCompat$ItemReceiver));
        write.ParcelableVolumeInfo = getsnippet.read;
        write.MediaMetadataCompat = ((long) i) << 1;
        write.MediaBrowserCompat$SearchResultReceiver = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words), new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deposit_detail_fixed_title_prefix), Integer.valueOf(getsnippet.read)});
        write.read = read;
        write.RatingCompat = i2;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words);
        Object[] objArr = new Object[2];
        objArr[0] = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deposit_detail_fixed_maturity_date);
        if (getsnippet.RatingCompat != null) {
            str2 = IconCompatParcelizer("dd MMM yyyy", getsnippet.RatingCompat);
        }
        objArr[1] = str2;
        write.MediaDescriptionCompat = String.format(string, objArr);
        return write;
    }
}
