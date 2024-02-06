package p040o;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.Dash */
public final /* synthetic */ class Dash implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ doGoAsync IconCompatParcelizer;
    private final /* synthetic */ setActivity write;

    public /* synthetic */ Dash(doGoAsync dogoasync, setActivity setactivity) {
        this.IconCompatParcelizer = dogoasync;
        this.write = setactivity;
    }

    public final Object write(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        setActivity setactivity = this.write;
        show show = new show((List) obj);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getAnchorU(setactivity)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return DebitCardResetOtpActivity.just(new setActivity(setactivity.ParcelableVolumeInfo, setactivity.RatingCompat, setactivity.MediaDescriptionCompat, setactivity.f2933x50fd9e4a, setactivity.MediaBrowserCompat$SearchResultReceiver, setactivity.MediaSessionCompat$QueueItem, setactivity.write, setactivity.MediaBrowserCompat$CustomActionResultReceiver, setactivity.MediaSessionCompat$Token, setactivity.read, setactivity.MediaBrowserCompat$ItemReceiver, setactivity.MediaSessionCompat$ResultReceiverWrapper, setactivity.PlaybackStateCompat, String.valueOf(setactivity.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$MediaItem), ""));
        }
        int i = setactivity.ParcelableVolumeInfo;
        String str = setactivity.RatingCompat;
        int i2 = setactivity.MediaDescriptionCompat;
        String str2 = setactivity.f2933x50fd9e4a;
        zzrm zzrm = setactivity.MediaBrowserCompat$SearchResultReceiver;
        String str3 = setactivity.MediaSessionCompat$QueueItem;
        String str4 = setactivity.write;
        String str5 = setactivity.MediaBrowserCompat$CustomActionResultReceiver;
        String str6 = setactivity.MediaSessionCompat$Token;
        String str7 = setactivity.read;
        String str8 = setactivity.MediaBrowserCompat$ItemReceiver;
        onMapReady onmapready = setactivity.MediaSessionCompat$ResultReceiverWrapper;
        OnMapReadyCallback onMapReadyCallback = setactivity.PlaybackStateCompat;
        T t = issupportfragmentclass.IconCompatParcelizer;
        OnMapReadyCallback onMapReadyCallback2 = onMapReadyCallback;
        if (t != null) {
            String str9 = ((setZoomControlsEnabled) t).IconCompatParcelizer;
            T t2 = issupportfragmentclass.IconCompatParcelizer;
            if (t2 != null) {
                return DebitCardResetOtpActivity.just(new setActivity(i, str, i2, str2, zzrm, str3, str4, str5, str6, str7, str8, onmapready, onMapReadyCallback2, str9, ((setZoomControlsEnabled) t2).write));
            }
            throw new NoSuchElementException("No value present");
        }
        throw new NoSuchElementException("No value present");
    }
}
