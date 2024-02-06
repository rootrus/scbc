package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsReport;
import p040o.ImmutableSortedMap;

/* renamed from: o.TldPatterns */
public final class TldPatterns extends constrainedListMultimap {
    @HmlPinActivity
    public TldPatterns(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final getUuidUtf8Bytes write(zoomGesturesEnabled zoomgesturesenabled, ImmutableSortedMap.C35092 r10, MapView mapView) {
        String str;
        getUuidUtf8Bytes getuuidutf8bytes = new getUuidUtf8Bytes();
        OffsetDateTime now = OffsetDateTime.now();
        setUuidFromUtf8Bytes RatingCompat = setUuidFromUtf8Bytes.RatingCompat();
        RatingCompat.ActionBarContainer = r10.MediaDescriptionCompat;
        String str2 = zoomgesturesenabled.MediaDescriptionCompat;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        RatingCompat.MenuItemWrapperICS$CollapsibleActionViewWrapper = str2;
        RatingCompat.AbsActionBarView = IconCompatParcelizer(r10.MediaDescriptionCompat, r10.MediaBrowserCompat$SearchResultReceiver, true);
        RatingCompat.MenuItemImpl = r10.RatingCompat;
        String str4 = zoomgesturesenabled.MediaBrowserCompat$ItemReceiver;
        if (str4 == null) {
            str4 = str3;
        }
        RatingCompat.setContentHeight = str4;
        RatingCompat.setVisibility = IconCompatParcelizer(r10.RatingCompat, r10.IconCompatParcelizer, true);
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = write(Double.valueOf(r10.write));
        RatingCompat.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        if (mapView.MediaBrowserCompat$CustomActionResultReceiver == null) {
            str = str3;
        } else {
            str = IconCompatParcelizer("dd MMM yyyy", mapView.MediaBrowserCompat$CustomActionResultReceiver);
        }
        RatingCompat.AppCompatDelegateImpl$ListMenuDecorView = str;
        setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem = RatingCompat.MediaBrowserCompat$MediaItem(write(Double.valueOf(zoomgesturesenabled.read)));
        MediaBrowserCompat$MediaItem.ActionMenuItemView = zoomgesturesenabled.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$MediaItem.setForceShowIcon = r10.MediaBrowserCompat$CustomActionResultReceiver;
        getuuidutf8bytes.PlaybackStateCompat = MediaBrowserCompat$MediaItem.MediaMetadataCompat("rtp.requester");
        getuuidutf8bytes.AlertController$RecycleListView = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.request_to_pay_succuess);
        String str5 = zoomgesturesenabled.MediaBrowserCompat$SearchResultReceiver;
        if (str5 == null) {
            str5 = str3;
        }
        getuuidutf8bytes.ParcelableVolumeInfo = str5;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id);
        Object[] objArr = new Object[1];
        String str6 = zoomgesturesenabled.MediaBrowserCompat$SearchResultReceiver;
        if (str6 != null) {
            str3 = str6;
        }
        objArr[0] = str3;
        getuuidutf8bytes.MediaSessionCompat$Token = String.format(string, objArr);
        getuuidutf8bytes.MediaDescriptionCompat = IconCompatParcelizer("dd MMM yyyy - HH:mm", now);
        getuuidutf8bytes.MediaSessionCompat$QueueItem = write(Double.valueOf(zoomgesturesenabled.write));
        return getuuidutf8bytes;
    }

    public final setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(onEnterAmbient onenterambient, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        String str;
        setUuidFromUtf8Bytes read = setUuidFromUtf8Bytes.RatingCompat().read(onenterambient.f2905x50fd9e4a);
        read.setContentHeight = onenterambient.MediaBrowserCompat$MediaItem;
        read.MenuItemWrapperICS$CollapsibleActionViewWrapper = onenterambient.MediaBrowserCompat$SearchResultReceiver;
        read.AbsActionBarView = write(onenterambient.ParcelableVolumeInfo, onenterambient.MediaSessionCompat$QueueItem);
        read.setVisibility = write(onenterambient.MediaMetadataCompat, onenterambient.MediaDescriptionCompat);
        read.ActionBarContainer = onenterambient.ParcelableVolumeInfo;
        read.MenuItemImpl = onenterambient.MediaMetadataCompat;
        CrashlyticsReport.Session.Application.read read2 = new CrashlyticsReport.Session.Application.read();
        read2.IconCompatParcelizer = write(Double.valueOf(onenterambient.write));
        read.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read2, (byte) 0);
        if (onenterambient.MediaBrowserCompat$CustomActionResultReceiver == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM yyyy", onenterambient.MediaBrowserCompat$CustomActionResultReceiver);
        }
        read.AppCompatDelegateImpl$ListMenuDecorView = str;
        read.setForceShowIcon = onenterambient.RatingCompat;
        setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem = read.MediaBrowserCompat$MediaItem(write(Double.valueOf(onenterambient.MediaBrowserCompat$ItemReceiver)));
        MediaBrowserCompat$MediaItem.MediaSessionCompat$QueueItem = write(Double.valueOf(onenterambient.read));
        MediaBrowserCompat$MediaItem.setSubtitle = setuuidfromutf8bytes.setSubtitle;
        return MediaBrowserCompat$MediaItem;
    }
}
