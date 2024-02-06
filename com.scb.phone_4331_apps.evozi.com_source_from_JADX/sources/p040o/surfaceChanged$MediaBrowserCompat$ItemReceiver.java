package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.StreetViewPanorama;

/* renamed from: o.surfaceChanged$MediaBrowserCompat$ItemReceiver */
public final class surfaceChanged$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ getChimeraLifecycleFragmentImpl MediaBrowserCompat$ItemReceiver;

    private surfaceChanged$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ surfaceChanged$MediaBrowserCompat$ItemReceiver(getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl, String str) {
        this.MediaBrowserCompat$ItemReceiver = getchimeralifecyclefragmentimpl;
        this.IconCompatParcelizer = str;
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str = this.IconCompatParcelizer;
        opFirstPathWithRest opfirstpathwithrest = (opFirstPathWithRest) obj;
        StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener = new StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener();
        onStreetViewPanoramaCameraChangeListener.MediaSessionCompat$QueueItem = opfirstpathwithrest.MediaMetadataCompat;
        onStreetViewPanoramaCameraChangeListener.f2788x50fd9e4a = opfirstpathwithrest.MediaBrowserCompat$SearchResultReceiver;
        onStreetViewPanoramaCameraChangeListener.MediaBrowserCompat$SearchResultReceiver = opfirstpathwithrest.MediaBrowserCompat$CustomActionResultReceiver;
        onStreetViewPanoramaCameraChangeListener.MediaDescriptionCompat = opfirstpathwithrest.MediaBrowserCompat$ItemReceiver;
        onStreetViewPanoramaCameraChangeListener.PlaybackStateCompat$CustomAction = opfirstpathwithrest.MediaSessionCompat$QueueItem;
        onStreetViewPanoramaCameraChangeListener.ParcelableVolumeInfo = opfirstpathwithrest.RatingCompat;
        onStreetViewPanoramaCameraChangeListener.Keep = FragmentBuilder_BindSummaryFragment.write(opfirstpathwithrest.f2821x50fd9e4a, (OffsetDateTime) null);
        onStreetViewPanoramaCameraChangeListener.PlaybackStateCompat = opfirstpathwithrest.MediaDescriptionCompat;
        onStreetViewPanoramaCameraChangeListener.MediaBrowserCompat$ItemReceiver = opfirstpathwithrest.MediaSessionCompat$Token;
        onStreetViewPanoramaCameraChangeListener.setHasDecor = str;
        onStreetViewPanoramaCameraChangeListener.IconCompatParcelizer = opfirstpathwithrest.read;
        onStreetViewPanoramaCameraChangeListener.MediaSessionCompat$ResultReceiverWrapper = opfirstpathwithrest.write;
        onStreetViewPanoramaCameraChangeListener.MediaBrowserCompat$MediaItem = opfirstpathwithrest.MediaBrowserCompat$MediaItem;
        onStreetViewPanoramaCameraChangeListener.MediaMetadataCompat = opfirstpathwithrest.IconCompatParcelizer;
        return onStreetViewPanoramaCameraChangeListener;
    }
}
