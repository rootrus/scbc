package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.ByteStreams;

/* renamed from: o.getInput */
public final class getInput extends constrainedListMultimap {
    public getDigest IconCompatParcelizer;
    public newDataInput MediaBrowserCompat$ItemReceiver;
    public ByteStreams.C31353 MediaBrowserCompat$MediaItem;
    public ByteStreams.ByteArrayDataInputStream MediaBrowserCompat$SearchResultReceiver;
    public length MediaDescriptionCompat;
    public readBytes MediaMetadataCompat;
    public skipFully RatingCompat;
    public newInputStreamSupplier read;

    @HmlPinActivity
    public getInput(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver(getProjection getprojection, String str) {
        getOrgId getorgid;
        AutoValue_CrashlyticsReport_CustomAttribute.C30581 r2;
        setPlatform setplatform;
        AutoValue_CrashlyticsReport_CustomAttribute.Builder read2 = AutoValue_CrashlyticsReport_CustomAttribute.Builder.read();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            read2.MediaSessionCompat$ResultReceiverWrapper = ByteStreams.ByteArrayDataInputStream.IconCompatParcelizer(getprojection.PlaybackStateCompat$CustomAction, str);
        }
        readBytes readbytes = this.MediaMetadataCompat;
        if (readbytes != null) {
            read2.MediaBrowserCompat$MediaItem = readbytes.MediaBrowserCompat$ItemReceiver(getprojection.MediaMetadataCompat);
        }
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            read2.read = newDataInput.read(getprojection.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (this.IconCompatParcelizer != null) {
            read2.MediaDescriptionCompat = getDigest.MediaBrowserCompat$ItemReceiver(getprojection.MediaBrowserCompat$MediaItem);
            read2.MediaBrowserCompat$ItemReceiver = getDigest.MediaBrowserCompat$ItemReceiver(getprojection.write);
            read2.Keep = getDigest.MediaBrowserCompat$ItemReceiver(getprojection.setHasDecor);
        }
        setSession setsession = null;
        if (this.MediaDescriptionCompat != null) {
            getUiSettings getuisettings = getprojection.RatingCompat;
            if (getuisettings != null) {
                setplatform = setPlatform.MediaBrowserCompat$ItemReceiver();
                setplatform.MediaBrowserCompat$CustomActionResultReceiver = getuisettings.IconCompatParcelizer;
            } else {
                setplatform = null;
            }
            read2.MediaMetadataCompat = setplatform;
        }
        if (this.RatingCompat != null) {
            getMaxZoomLevel getmaxzoomlevel = getprojection.MediaDescriptionCompat;
            if (getmaxzoomlevel != null) {
                r2 = AutoValue_CrashlyticsReport_CustomAttribute.C30581.IconCompatParcelizer();
                r2.IconCompatParcelizer = getmaxzoomlevel.read;
                r2.MediaBrowserCompat$ItemReceiver = getmaxzoomlevel.MediaBrowserCompat$ItemReceiver;
            } else {
                r2 = null;
            }
            read2.MediaBrowserCompat$SearchResultReceiver = r2;
        }
        if (this.MediaBrowserCompat$MediaItem != null) {
            isBuildingsEnabled isbuildingsenabled = getprojection.MediaSessionCompat$ResultReceiverWrapper;
            if (isbuildingsenabled != null) {
                getorgid = getOrgId.MediaBrowserCompat$ItemReceiver();
                getorgid.IconCompatParcelizer = isbuildingsenabled.MediaBrowserCompat$ItemReceiver;
                getorgid.MediaBrowserCompat$CustomActionResultReceiver = isbuildingsenabled.write;
            } else {
                getorgid = null;
            }
            read2.f2672x50fd9e4a = getorgid;
        }
        if (this.read != null) {
            getMapType getmaptype = getprojection.MediaBrowserCompat$ItemReceiver;
            if (getmaptype != null) {
                setsession = setSession.write();
                setsession.IconCompatParcelizer = getmaptype.read;
            }
            read2.IconCompatParcelizer = setsession;
        }
        read2.RatingCompat = getprojection.f2850x50fd9e4a;
        read2.MediaSessionCompat$QueueItem = getprojection.AlertController$RecycleListView;
        read2.MediaSessionCompat$Token = getprojection.PlaybackStateCompat;
        read2.ParcelableVolumeInfo = DiskLruCache.VERSION_1.equals(getprojection.MediaSessionCompat$Token);
        read2.MediaBrowserCompat$CustomActionResultReceiver = getprojection.IconCompatParcelizer;
        return read2;
    }
}
