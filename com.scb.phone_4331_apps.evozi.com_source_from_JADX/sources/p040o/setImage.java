package p040o;

import p040o.StreetViewPanoramaFragment;

/* renamed from: o.setImage */
public final /* synthetic */ class setImage implements ChequeManagementDeepLinkActivity {
    private final /* synthetic */ doGoAsync MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setImage(doGoAsync dogoasync) {
        this.MediaBrowserCompat$ItemReceiver = dogoasync;
    }

    public final Object read(Object obj, Object obj2) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        doGoAsync dogoasync = this.MediaBrowserCompat$ItemReceiver;
        setActivity setactivity = (setActivity) obj;
        StreetViewPanoramaFragment.zza zza = (StreetViewPanoramaFragment.zza) obj2;
        if ("PAYMENT".equalsIgnoreCase(setactivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
            boolean equalsIgnoreCase = "th".equalsIgnoreCase(dogoasync.IconCompatParcelizer.setCheckable());
            if (zza == null || zza.write.size() == 0) {
                return DebitCardResetOtpActivity.just(new setActivity(setactivity.ParcelableVolumeInfo, setactivity.RatingCompat, setactivity.MediaDescriptionCompat, setactivity.f2933x50fd9e4a, setactivity.MediaBrowserCompat$SearchResultReceiver, setactivity.MediaSessionCompat$QueueItem, setactivity.write, setactivity.MediaBrowserCompat$CustomActionResultReceiver, setactivity.MediaSessionCompat$Token, setactivity.read, setactivity.MediaBrowserCompat$ItemReceiver, setactivity.MediaSessionCompat$ResultReceiverWrapper, setactivity.PlaybackStateCompat, setactivity.MediaSessionCompat$ResultReceiverWrapper.read, (String) null));
            }
            int i2 = setactivity.ParcelableVolumeInfo;
            String str5 = setactivity.RatingCompat;
            int i3 = setactivity.MediaDescriptionCompat;
            String str6 = setactivity.f2933x50fd9e4a;
            zzrm zzrm = setactivity.MediaBrowserCompat$SearchResultReceiver;
            String str7 = setactivity.MediaSessionCompat$QueueItem;
            String str8 = setactivity.write;
            String str9 = setactivity.MediaBrowserCompat$CustomActionResultReceiver;
            String str10 = setactivity.MediaSessionCompat$Token;
            String str11 = setactivity.read;
            String str12 = setactivity.MediaBrowserCompat$ItemReceiver;
            onMapReady onmapready = setactivity.MediaSessionCompat$ResultReceiverWrapper;
            OnMapReadyCallback onMapReadyCallback = setactivity.PlaybackStateCompat;
            String str13 = str11;
            onMapReady onmapready2 = onmapready;
            StreetViewPanoramaOptions streetViewPanoramaOptions = zza.write.get(0);
            if (onMapReadyCallback != null) {
                if (equalsIgnoreCase) {
                    str2 = streetViewPanoramaOptions.setBackgroundResource;
                } else {
                    str2 = streetViewPanoramaOptions.AppCompatDelegateImpl$ListMenuDecorView;
                }
                onMapReadyCallback.AbsActionBarView = str2;
                if (equalsIgnoreCase) {
                    str3 = streetViewPanoramaOptions.setChecked;
                } else {
                    str3 = streetViewPanoramaOptions.AppCompatDialogFragment;
                }
                onMapReadyCallback.setStackedBackground = str3;
                if (equalsIgnoreCase) {
                    str4 = streetViewPanoramaOptions.ActionMenuItemView;
                } else {
                    str4 = streetViewPanoramaOptions.setCheckable;
                }
                onMapReadyCallback.MenuItemImpl = str4;
            }
            if ("th".equalsIgnoreCase(dogoasync.IconCompatParcelizer.setCheckable())) {
                i = 0;
                str = zza.write.get(0).MediaMetadataCompat;
            } else {
                i = 0;
                str = zza.write.get(0).MediaBrowserCompat$MediaItem;
            }
            String str14 = str13;
            return DebitCardResetOtpActivity.just(new setActivity(i2, str5, i3, str6, zzrm, str7, str8, str9, str10, str14, str12, onmapready2, onMapReadyCallback, str, zza.write.get(i).read));
        } else if ("TOPUP".equalsIgnoreCase(setactivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
            return dogoasync.read(setactivity);
        } else {
            if ("TRANSFER".equalsIgnoreCase(setactivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
                return DebitCardResetOtpActivity.just(new setActivity(setactivity.ParcelableVolumeInfo, setactivity.RatingCompat, setactivity.MediaDescriptionCompat, setactivity.f2933x50fd9e4a, setactivity.MediaBrowserCompat$SearchResultReceiver, setactivity.MediaSessionCompat$QueueItem, setactivity.write, setactivity.MediaBrowserCompat$CustomActionResultReceiver, setactivity.MediaSessionCompat$Token, setactivity.read, setactivity.MediaBrowserCompat$ItemReceiver, setactivity.MediaSessionCompat$ResultReceiverWrapper, setactivity.PlaybackStateCompat, setactivity.PlaybackStateCompat.MediaMetadataCompat, (String) null));
            }
            return DebitCardResetOtpActivity.just(new setActivity(setactivity.ParcelableVolumeInfo, setactivity.RatingCompat, setactivity.MediaDescriptionCompat, setactivity.f2933x50fd9e4a, setactivity.MediaBrowserCompat$SearchResultReceiver, setactivity.MediaSessionCompat$QueueItem, setactivity.write, setactivity.MediaBrowserCompat$CustomActionResultReceiver, setactivity.MediaSessionCompat$Token, setactivity.read, setactivity.MediaBrowserCompat$ItemReceiver, setactivity.MediaSessionCompat$ResultReceiverWrapper, setactivity.PlaybackStateCompat, setactivity.PlaybackStateCompat.setCheckable, (String) null));
        }
    }
}
