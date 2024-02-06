package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import p040o.CrashlyticsReport;

/* renamed from: o.ensureCapacity */
public final class ensureCapacity extends constrainedListMultimap {
    @HmlPinActivity
    public ensureCapacity(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final getUuidUtf8Bytes MediaBrowserCompat$ItemReceiver(useViewLifecycleInFragment useviewlifecycleinfragment, String str) {
        String str2;
        getUuidUtf8Bytes getuuidutf8bytes = new getUuidUtf8Bytes();
        setUuidFromUtf8Bytes RatingCompat = setUuidFromUtf8Bytes.RatingCompat();
        if (TextUtils.isEmpty(str)) {
            str = "rtp.payer";
        }
        setUuidFromUtf8Bytes MediaMetadataCompat = RatingCompat.MediaMetadataCompat(str);
        MediaMetadataCompat.ActionBarContainer = useviewlifecycleinfragment.ParcelableVolumeInfo;
        MediaMetadataCompat.MenuItemWrapperICS$CollapsibleActionViewWrapper = useviewlifecycleinfragment.MediaMetadataCompat;
        MediaMetadataCompat.AbsActionBarView = IconCompatParcelizer(useviewlifecycleinfragment.ParcelableVolumeInfo, useviewlifecycleinfragment.MediaBrowserCompat$SearchResultReceiver, true);
        MediaMetadataCompat.MenuItemImpl = useviewlifecycleinfragment.MediaDescriptionCompat;
        MediaMetadataCompat.setContentHeight = useviewlifecycleinfragment.RatingCompat;
        MediaMetadataCompat.setVisibility = IconCompatParcelizer(useviewlifecycleinfragment.MediaDescriptionCompat, useviewlifecycleinfragment.MediaBrowserCompat$MediaItem, true);
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = write(Double.valueOf(useviewlifecycleinfragment.write));
        MediaMetadataCompat.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        MediaMetadataCompat.setForceShowIcon = useviewlifecycleinfragment.MediaBrowserCompat$CustomActionResultReceiver;
        setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem = MediaMetadataCompat.MediaBrowserCompat$MediaItem(write(Double.valueOf(useviewlifecycleinfragment.MediaBrowserCompat$ItemReceiver)));
        MediaBrowserCompat$MediaItem.setActionBarHideOffset = write(Double.valueOf(useviewlifecycleinfragment.read));
        getuuidutf8bytes.PlaybackStateCompat = MediaBrowserCompat$MediaItem;
        getuuidutf8bytes.AlertController$RecycleListView = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.request_to_pay_success_payment);
        getuuidutf8bytes.ParcelableVolumeInfo = useviewlifecycleinfragment.MediaSessionCompat$ResultReceiverWrapper;
        getuuidutf8bytes.MediaSessionCompat$Token = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id), new Object[]{useviewlifecycleinfragment.MediaSessionCompat$ResultReceiverWrapper});
        getuuidutf8bytes.MediaSessionCompat$QueueItem = write(Double.valueOf(useviewlifecycleinfragment.read));
        if (useviewlifecycleinfragment.MediaSessionCompat$Token == null) {
            str2 = "";
        } else {
            str2 = IconCompatParcelizer("dd MMM yyyy - HH:mm", useviewlifecycleinfragment.MediaSessionCompat$Token);
        }
        getuuidutf8bytes.MediaDescriptionCompat = str2;
        return getuuidutf8bytes;
    }
}
