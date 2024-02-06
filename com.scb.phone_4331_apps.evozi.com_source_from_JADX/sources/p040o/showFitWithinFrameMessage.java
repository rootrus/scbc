package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.showFitWithinFrameMessage */
public final /* synthetic */ class showFitWithinFrameMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ StreetViewPanoramaFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ showFitWithinFrameMessage(startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver startzoominmessage_mediabrowsercompat_customactionresultreceiver, StreetViewPanoramaFragment streetViewPanoramaFragment) {
        this.write = startzoominmessage_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver startzoominmessage_mediabrowsercompat_customactionresultreceiver = this.write;
        StreetViewPanoramaFragment streetViewPanoramaFragment = this.MediaBrowserCompat$ItemReceiver;
        Ints unused = startzoominmessage_mediabrowsercompat_customactionresultreceiver.write.read;
        ((CheckParameters_MembersInjector.MediaMetadataCompat) obj).MediaBrowserCompat$ItemReceiver(Ints.MediaBrowserCompat$ItemReceiver(startzoominmessage_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer, streetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
