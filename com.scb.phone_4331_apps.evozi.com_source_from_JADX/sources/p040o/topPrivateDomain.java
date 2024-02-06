package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsReport;
import p040o.MapFragment;

/* renamed from: o.topPrivateDomain */
public final class topPrivateDomain extends constrainedSortedSetMultimap<MapFragment.zza, setOffset> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, boolean z) {
        MapFragment.zza zza = (MapFragment.zza) obj;
        String format = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.request_money_outgoing_due), new Object[]{IconCompatParcelizer("dd MMM", zza.write)});
        setOffset setoffset = new setOffset();
        setoffset.MediaBrowserCompat$CustomActionResultReceiver = zza.MediaMetadataCompat;
        setoffset.write = IconCompatParcelizer(zza.RatingCompat, zza.MediaBrowserCompat$SearchResultReceiver, z);
        setoffset.MediaBrowserCompat$ItemReceiver = write(Double.valueOf(zza.MediaBrowserCompat$CustomActionResultReceiver));
        if (zza.MediaSessionCompat$QueueItem != null) {
            IconCompatParcelizer("dd MMM yyyy - HH:mm", zza.MediaSessionCompat$QueueItem);
        }
        setoffset.IconCompatParcelizer = format;
        setoffset.MediaBrowserCompat$MediaItem = zza.f2758x50fd9e4a;
        setoffset.read = zza;
        return setoffset;
    }

    @HmlPinActivity
    public topPrivateDomain(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final void write(MapFragment.zza zza, setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z) {
        String str;
        setuuidfromutf8bytes.ActionBarContainer = zza.RatingCompat;
        setuuidfromutf8bytes.MenuItemWrapperICS$CollapsibleActionViewWrapper = zza.MediaMetadataCompat;
        setuuidfromutf8bytes.AbsActionBarView = IconCompatParcelizer(zza.RatingCompat, zza.MediaBrowserCompat$SearchResultReceiver, z);
        setuuidfromutf8bytes.MenuItemImpl = zza.MediaBrowserCompat$MediaItem;
        setuuidfromutf8bytes.setContentHeight = zza.read;
        setuuidfromutf8bytes.setVisibility = IconCompatParcelizer(zza.MediaBrowserCompat$MediaItem, zza.MediaDescriptionCompat, z);
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = write(Double.valueOf(zza.MediaBrowserCompat$CustomActionResultReceiver));
        setuuidfromutf8bytes.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        setuuidfromutf8bytes.AppCompatDelegateImpl$ListMenuDecorView = IconCompatParcelizer("dd MMM yyyy", zza.write);
        setuuidfromutf8bytes.setForceShowIcon = zza.MediaBrowserCompat$ItemReceiver;
        if (zza.MediaSessionCompat$QueueItem == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", zza.MediaSessionCompat$QueueItem);
        }
        setuuidfromutf8bytes.setLogo = str;
        setuuidfromutf8bytes.setWindowCallback = zza.f2758x50fd9e4a;
        setuuidfromutf8bytes.setSubtitle = zza.ParcelableVolumeInfo;
        setuuidfromutf8bytes.MediaMetadataCompat("rtp.detail");
    }
}
