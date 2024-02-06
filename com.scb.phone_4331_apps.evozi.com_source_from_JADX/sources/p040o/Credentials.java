package p040o;

import p040o.zzbc;

/* renamed from: o.Credentials */
public final /* synthetic */ class Credentials implements findFragmentByWho {
    public static final /* synthetic */ Credentials IconCompatParcelizer = new Credentials();

    private /* synthetic */ Credentials() {
    }

    public final Object IconCompatParcelizer(Object obj) {
        OnCompositionLoadedListener onCompositionLoadedListener = (OnCompositionLoadedListener) obj;
        zzbc.zzb zzb = new zzbc.zzb();
        zzb.ParcelableVolumeInfo = String.valueOf(onCompositionLoadedListener.MediaSessionCompat$QueueItem);
        zzb.MediaBrowserCompat$CustomActionResultReceiver = onCompositionLoadedListener.write;
        zzb.write = onCompositionLoadedListener.MediaBrowserCompat$ItemReceiver;
        zzb.MediaBrowserCompat$ItemReceiver = onCompositionLoadedListener.MediaBrowserCompat$CustomActionResultReceiver;
        zzb.RatingCompat = onCompositionLoadedListener.read;
        zzb.MediaDescriptionCompat = onCompositionLoadedListener.IconCompatParcelizer;
        zzb.MediaBrowserCompat$SearchResultReceiver = onCompositionLoadedListener.RatingCompat;
        zzb.MediaBrowserCompat$MediaItem = onCompositionLoadedListener.MediaBrowserCompat$SearchResultReceiver;
        zzb.MediaMetadataCompat = onCompositionLoadedListener.MediaDescriptionCompat;
        zzb.MediaSessionCompat$Token = onCompositionLoadedListener.MediaMetadataCompat;
        zzb.MediaSessionCompat$QueueItem = onCompositionLoadedListener.MediaBrowserCompat$MediaItem;
        zzb.f2981x50fd9e4a = onCompositionLoadedListener.ParcelableVolumeInfo;
        zzb.read = onCompositionLoadedListener.f2766x50fd9e4a;
        zzb.MediaSessionCompat$ResultReceiverWrapper = onCompositionLoadedListener.MediaSessionCompat$Token;
        return zzb;
    }
}
