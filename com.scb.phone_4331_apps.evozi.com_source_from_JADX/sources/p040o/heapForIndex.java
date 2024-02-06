package p040o;

/* renamed from: o.heapForIndex */
public final /* synthetic */ class heapForIndex implements findFragmentByWho {
    private final /* synthetic */ growIfNeeded read;
    private final /* synthetic */ boolean write;

    public /* synthetic */ heapForIndex(growIfNeeded growifneeded, boolean z) {
        this.read = growifneeded;
        this.write = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str;
        growIfNeeded growifneeded = this.read;
        boolean z = this.write;
        setUserId setuserid = (setUserId) obj;
        validateDependencies IconCompatParcelizer = validateDependencies.IconCompatParcelizer();
        IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = z;
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = setuserid.MediaBrowserCompat$CustomActionResultReceiver;
        IconCompatParcelizer.read = setuserid.MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer.MediaDescriptionCompat = setuserid.MediaBrowserCompat$SearchResultReceiver;
        IconCompatParcelizer.MediaMetadataCompat = setuserid.MediaDescriptionCompat;
        IconCompatParcelizer.MediaSessionCompat$QueueItem = setuserid.IconCompatParcelizer;
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = growIfNeeded.write(Double.valueOf(setuserid.write));
        IconCompatParcelizer.IconCompatParcelizer = setuserid.read;
        IconCompatParcelizer.ParcelableVolumeInfo = growifneeded.mo26549c_(setuserid.MediaMetadataCompat);
        if (setuserid.RatingCompat == null) {
            str = "";
        } else {
            str = growifneeded.IconCompatParcelizer("dd MMM yyyy", setuserid.RatingCompat);
        }
        IconCompatParcelizer.RatingCompat = str;
        IconCompatParcelizer.MediaBrowserCompat$MediaItem = growIfNeeded.write(Double.valueOf(setuserid.MediaBrowserCompat$MediaItem));
        IconCompatParcelizer.MediaSessionCompat$Token = setuserid.MediaSessionCompat$QueueItem;
        IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = setuserid.MediaSessionCompat$ResultReceiverWrapper;
        IconCompatParcelizer.f2973x50fd9e4a = setuserid.f2963x50fd9e4a;
        return IconCompatParcelizer;
    }
}
