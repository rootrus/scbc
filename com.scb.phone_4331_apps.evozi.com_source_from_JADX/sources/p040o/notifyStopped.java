package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.SignedBytes;

/* renamed from: o.notifyStopped */
public class notifyStopped extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    public notifyStopped(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    public final parseFile write(StreetViewPanoramaFragment streetViewPanoramaFragment) {
        String str;
        String str2;
        setIdentifierFromUtf8Bytes setidentifierfromutf8bytes = new setIdentifierFromUtf8Bytes(streetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver, streetViewPanoramaFragment.write, streetViewPanoramaFragment.read, streetViewPanoramaFragment.MediaBrowserCompat$ItemReceiver);
        parseFile parsefile = new parseFile();
        parsefile.read = setidentifierfromutf8bytes;
        parsefile.MediaBrowserCompat$ItemReceiver = streetViewPanoramaFragment.write;
        parsefile.IconCompatParcelizer = mo26549c_(streetViewPanoramaFragment.read);
        if (streetViewPanoramaFragment.MediaBrowserCompat$ItemReceiver) {
            if (streetViewPanoramaFragment.MediaBrowserCompat$SearchResultReceiver == null || streetViewPanoramaFragment.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.transfer_bank_temp_disable_title);
            } else {
                str = streetViewPanoramaFragment.MediaBrowserCompat$SearchResultReceiver;
            }
            parsefile.MediaBrowserCompat$CustomActionResultReceiver = str;
            if (streetViewPanoramaFragment.MediaBrowserCompat$MediaItem == null || streetViewPanoramaFragment.MediaBrowserCompat$MediaItem.isEmpty()) {
                str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.transfer_bank_temp_disable_description);
            } else {
                str2 = streetViewPanoramaFragment.MediaBrowserCompat$MediaItem;
            }
            parsefile.write = str2;
        }
        return parsefile;
    }
}
