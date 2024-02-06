package p040o;

import p040o.PlaceEntity;
import p040o.zzmd;

/* renamed from: o.isOfflineAccessRequested */
public final /* synthetic */ class isOfflineAccessRequested implements ChequeManagementDeepLinkActivity {
    private final /* synthetic */ createBundleFromClientSettings MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isOfflineAccessRequested(createBundleFromClientSettings createbundlefromclientsettings) {
        this.MediaBrowserCompat$ItemReceiver = createbundlefromclientsettings;
    }

    public final Object read(Object obj, Object obj2) {
        String str;
        createBundleFromClientSettings createbundlefromclientsettings = this.MediaBrowserCompat$ItemReceiver;
        C7506tP tPVar = (C7506tP) obj;
        zzwi zzwi = (zzwi) obj2;
        PlaceEntity.zzb zzb = new PlaceEntity.zzb();
        zzb.MediaBrowserCompat$CustomActionResultReceiver = tPVar.read;
        zzb.setCheckable = tPVar.AppCompatDialogFragment;
        String str2 = tPVar.MediaBrowserCompat$SearchResultReceiver;
        zzb.ParcelableVolumeInfo = str2 != null ? str2.toLowerCase() : "";
        zzb.AppCompatViewInflater = tPVar.setContentView;
        zzb.setHasDecor = tPVar.MediaMetadataCompat;
        zzb.PlaybackStateCompat = tPVar.MediaSessionCompat$ResultReceiverWrapper;
        zzb.f2769x50fd9e4a = tPVar.MediaMetadataCompat;
        zzb.ActionMenuItemView = tPVar.AppCompatDelegateImpl$ListMenuDecorView;
        zzb.Keep = tPVar.RatingCompat;
        zzb.AlertController$RecycleListView = tPVar.MediaSessionCompat$Token;
        zzb.MediaSessionCompat$ResultReceiverWrapper = tPVar.RatingCompat;
        zzb.RatingCompat = tPVar.MediaBrowserCompat$ItemReceiver;
        zzb.AppCompatDelegateImpl$ListMenuDecorView = tPVar.PlaybackStateCompat$CustomAction;
        zzb.MediaBrowserCompat$MediaItem = tPVar.write;
        zzb.setContentView = tPVar.Keep;
        zzb.AppCompatDialogFragment = tPVar.AlertController$RecycleListView;
        T t = tPVar.MediaDescriptionCompat.IconCompatParcelizer;
        if (t == null) {
            t = "";
        }
        zzb.MediaSessionCompat$Token = (String) t;
        T t2 = tPVar.ParcelableVolumeInfo.IconCompatParcelizer;
        if (t2 == null) {
            t2 = "";
        }
        zzb.MediaSessionCompat$QueueItem = (String) t2;
        zzb.AppCompatActivity = tPVar.MediaSessionCompat$QueueItem;
        zzb.setBackgroundResource = tPVar.AppCompatActivity;
        if (tPVar.setBackgroundResource == null || tPVar.setBackgroundResource.equals("")) {
            str = zzmd.zzm.zzb.zza.INDIVIDUAL.mode;
        } else {
            str = tPVar.setBackgroundResource;
        }
        zzb.setExpandedFormat = str;
        if (zzwi != null) {
            zzb.read = zzwi.MediaBrowserCompat$SearchResultReceiver;
            zzb.MediaBrowserCompat$ItemReceiver = zzwi.MediaBrowserCompat$MediaItem;
            zzb.write = zzwi.PlaybackStateCompat$CustomAction;
            zzb.setChecked = zzwi.setBackgroundResource;
            zzb.IconCompatParcelizer = zzwi.MediaBrowserCompat$CustomActionResultReceiver;
            zzb.MediaMetadataCompat = zzwi.MediaSessionCompat$ResultReceiverWrapper;
        }
        createbundlefromclientsettings.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(tPVar.PlaybackStateCompat);
        createbundlefromclientsettings.read = zzb;
        return zzb;
    }
}
