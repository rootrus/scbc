package p040o;

/* renamed from: o.setPreserveFocusAfterLayout */
public final class setPreserveFocusAfterLayout {
    private static setPreserveFocusAfterLayout IconCompatParcelizer = new setPreserveFocusAfterLayout("USHORT", 2);
    private static setPreserveFocusAfterLayout MediaBrowserCompat$CustomActionResultReceiver = new setPreserveFocusAfterLayout("SLONG", 4);
    private static setPreserveFocusAfterLayout MediaBrowserCompat$ItemReceiver = new setPreserveFocusAfterLayout("SSHORT", 2);
    private static setPreserveFocusAfterLayout MediaBrowserCompat$MediaItem = new setPreserveFocusAfterLayout("BYTE", 1);
    private static setPreserveFocusAfterLayout MediaBrowserCompat$SearchResultReceiver = new setPreserveFocusAfterLayout("SBYTE", 1);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static setPreserveFocusAfterLayout f2637x50fd9e4a = new setPreserveFocusAfterLayout("STRING", 1);
    private static setPreserveFocusAfterLayout MediaDescriptionCompat = new setPreserveFocusAfterLayout("URATIONAL", 8);
    private static setPreserveFocusAfterLayout MediaMetadataCompat = new setPreserveFocusAfterLayout("ULONG", 4);
    private static setPreserveFocusAfterLayout MediaSessionCompat$QueueItem = new setPreserveFocusAfterLayout("UNDEFINED", 1);
    private static setPreserveFocusAfterLayout MediaSessionCompat$ResultReceiverWrapper = new setPreserveFocusAfterLayout("SINGLE", 4);
    private static setPreserveFocusAfterLayout RatingCompat = new setPreserveFocusAfterLayout("SRATIONAL", 8);
    private static setPreserveFocusAfterLayout read = new setPreserveFocusAfterLayout("DOUBLE", 8);
    private final String ParcelableVolumeInfo;
    public final int write;

    public static setPreserveFocusAfterLayout IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                return MediaBrowserCompat$MediaItem;
            case 2:
                return f2637x50fd9e4a;
            case 3:
                return IconCompatParcelizer;
            case 4:
                return MediaMetadataCompat;
            case 5:
                return MediaDescriptionCompat;
            case 6:
                return MediaBrowserCompat$SearchResultReceiver;
            case 7:
                return MediaSessionCompat$QueueItem;
            case 8:
                return MediaBrowserCompat$ItemReceiver;
            case 9:
                return MediaBrowserCompat$CustomActionResultReceiver;
            case 10:
                return RatingCompat;
            case 11:
                return MediaSessionCompat$ResultReceiverWrapper;
            case 12:
                return read;
            default:
                return null;
        }
    }

    private setPreserveFocusAfterLayout(String str, int i) {
        this.ParcelableVolumeInfo = str;
        this.write = i;
    }

    public final String toString() {
        return this.ParcelableVolumeInfo;
    }
}
