package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.hasEmbeddedIPv4ClientAddress */
public final class hasEmbeddedIPv4ClientAddress extends constrainedListMultimap {
    @HmlPinActivity
    public hasEmbeddedIPv4ClientAddress(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final getBinaries IconCompatParcelizer(setExecution setexecution, OffsetDateTime offsetDateTime, boolean z) {
        int i;
        int i2;
        String string;
        int i3;
        if (z) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_success_link_title;
        } else {
            i = Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_success_unlink_title;
        }
        String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy - HH:mm", offsetDateTime);
        int i4 = setexecution.read;
        if (i4 == 0) {
            if (z) {
                i2 = Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_success_link_mob_info;
            } else {
                i2 = Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_success_unlink_mob_info;
            }
            string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i2);
        } else if (i4 != 1) {
            string = "";
        } else {
            if (z) {
                i3 = Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_success_link_cid_info;
            } else {
                i3 = Iterables$3$MediaBrowserCompat$MediaItem.manage_promptpay_success_unlink_cid_info;
            }
            string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i3);
        }
        return new getBinaries(string2, IconCompatParcelizer, string, setexecution.IconCompatParcelizer, setexecution.MediaBrowserCompat$ItemReceiver.write, setexecution.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, setexecution.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, z ^ true ? 1 : 0, setexecution.read);
    }
}
