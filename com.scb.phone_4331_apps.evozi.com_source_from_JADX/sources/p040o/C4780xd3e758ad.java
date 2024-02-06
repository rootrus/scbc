package p040o;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p040o.GoogleMap;
import p040o.OnDeviceIdExtractor;
import p040o.StreetViewPanorama;
import p040o.writeUInt64NoTag;

/* renamed from: o.ho$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C4780xd3e758ad<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.IconCompatParcelizer> {
    private /* synthetic */ C4778ho IconCompatParcelizer;
    private /* synthetic */ setRam MediaBrowserCompat$CustomActionResultReceiver;

    public C4780xd3e758ad(C4778ho hoVar, setRam setram) {
        this.IconCompatParcelizer = hoVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = setram;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Object obj2;
        OnDeviceIdExtractor.C6966a.IconCompatParcelizer iconCompatParcelizer = (OnDeviceIdExtractor.C6966a.IconCompatParcelizer) obj;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) AppCompatDelegateImpl$ListMenuDecorView, "mGetUserProfileUseCase.userProfile");
        boolean z = AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper > 0;
        Iterator it = C4778ho.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(((StreetViewPanorama.OnStreetViewPanoramaLongClickListener) obj2).write, z), (Object) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
                break;
            }
        }
        StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener = (StreetViewPanorama.OnStreetViewPanoramaLongClickListener) obj2;
        C4778ho hoVar = this.IconCompatParcelizer;
        if (onStreetViewPanoramaLongClickListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        hoVar.MediaSessionCompat$QueueItem = onStreetViewPanoramaLongClickListener;
        iconCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        flushQuietly MediaDescriptionCompat = this.IconCompatParcelizer.f2864x50fd9e4a;
        List singletonList = Collections.singletonList(onStreetViewPanoramaLongClickListener);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat.read(singletonList, z, this.IconCompatParcelizer.MediaSessionCompat$Token, true));
    }
}
