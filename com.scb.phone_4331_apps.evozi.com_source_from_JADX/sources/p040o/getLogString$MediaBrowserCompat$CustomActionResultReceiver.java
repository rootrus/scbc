package p040o;

/* renamed from: o.getLogString$MediaBrowserCompat$CustomActionResultReceiver */
public final class getLogString$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ ensurePlayServicesAvailable write;

    private getLogString$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ getLogString$MediaBrowserCompat$CustomActionResultReceiver(ensurePlayServicesAvailable ensureplayservicesavailable) {
        this.write = ensureplayservicesavailable;
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        applyInvertedSubtractMask applyinvertedsubtractmask = (applyInvertedSubtractMask) obj;
        setAlwaysShow setalwaysshow = new setAlwaysShow();
        setalwaysshow.MediaBrowserCompat$ItemReceiver = applyinvertedsubtractmask.write;
        String str3 = "-";
        if (applyinvertedsubtractmask.MediaMetadataCompat != null) {
            str = applyinvertedsubtractmask.MediaMetadataCompat.write();
        } else {
            str = str3;
        }
        setalwaysshow.MediaBrowserCompat$MediaItem = str;
        if (applyinvertedsubtractmask.MediaDescriptionCompat != null) {
            str2 = applyinvertedsubtractmask.MediaDescriptionCompat;
        } else {
            str2 = str3;
        }
        setalwaysshow.MediaDescriptionCompat = str2;
        if (applyinvertedsubtractmask.MediaMetadataCompat != null) {
            str3 = applyinvertedsubtractmask.MediaMetadataCompat.IconCompatParcelizer();
        }
        setalwaysshow.RatingCompat = str3;
        setalwaysshow.write = applyinvertedsubtractmask.read;
        setalwaysshow.read = applyinvertedsubtractmask.IconCompatParcelizer;
        setalwaysshow.MediaBrowserCompat$CustomActionResultReceiver = applyinvertedsubtractmask.MediaBrowserCompat$ItemReceiver;
        setalwaysshow.f5557x50fd9e4a = applyinvertedsubtractmask.RatingCompat;
        setalwaysshow.MediaBrowserCompat$SearchResultReceiver = applyinvertedsubtractmask.MediaBrowserCompat$SearchResultReceiver;
        setalwaysshow.MediaMetadataCompat = applyinvertedsubtractmask.MediaBrowserCompat$MediaItem;
        setalwaysshow.IconCompatParcelizer = applyinvertedsubtractmask.MediaBrowserCompat$CustomActionResultReceiver;
        return setalwaysshow;
    }
}
