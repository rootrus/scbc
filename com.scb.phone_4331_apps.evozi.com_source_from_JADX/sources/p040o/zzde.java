package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;

/* renamed from: o.zzde */
public final /* synthetic */ class zzde implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzde(forceEnableSaveDialog forceenablesavedialog) {
    }

    public final Object write(Object obj) {
        getImages getimages = (getImages) obj;
        String str = getimages.IconCompatParcelizer;
        String MediaBrowserCompat$ItemReceiver = getimages.getStatus().MediaBrowserCompat$ItemReceiver();
        String write = getimages.getStatus().write();
        String read = getimages.getStatus().read();
        boolean equals = "1010".equals(write);
        if ((str == null || str.isEmpty()) || equals) {
            ILocationSourceDelegate.zza zza = new ILocationSourceDelegate.zza();
            zza.IconCompatParcelizer = write;
            zza.read = read;
            zza.write = MediaBrowserCompat$ItemReceiver;
            ILocationSourceDelegate iLocationSourceDelegate = new ILocationSourceDelegate();
            iLocationSourceDelegate.write = zza;
            throw RetrofitException.MediaBrowserCompat$CustomActionResultReceiver(iLocationSourceDelegate);
        }
        getLevels getlevels = new getLevels();
        getlevels.read = getimages.MediaBrowserCompat$ItemReceiver;
        getlevels.MediaBrowserCompat$ItemReceiver = getimages.MediaBrowserCompat$CustomActionResultReceiver;
        getlevels.write = getimages.write;
        getlevels.MediaBrowserCompat$MediaItem = getimages.f2588x50fd9e4a;
        getlevels.MediaDescriptionCompat = getimages.ParcelableVolumeInfo;
        getlevels.MediaBrowserCompat$SearchResultReceiver = getimages.MediaBrowserCompat$MediaItem;
        getlevels.RatingCompat = getimages.MediaDescriptionCompat;
        getlevels.MediaBrowserCompat$CustomActionResultReceiver = getimages.MediaBrowserCompat$SearchResultReceiver;
        getlevels.MediaMetadataCompat = getimages.RatingCompat;
        getlevels.MediaSessionCompat$QueueItem = str;
        getlevels.ParcelableVolumeInfo = getimages.read;
        getlevels.MediaSessionCompat$ResultReceiverWrapper = getimages.MediaMetadataCompat;
        return getlevels;
    }
}
