package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeSetPageIndex */
public final /* synthetic */ class nativeSetPageIndex implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CaptureGuidance write;

    public /* synthetic */ nativeSetPageIndex(CaptureGuidance captureGuidance, boolean z, boolean z2) {
        this.write = captureGuidance;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureGuidance captureGuidance = this.write;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        getCorrectLastElement getcorrectlastelement = captureGuidance.MediaBrowserCompat$ItemReceiver;
        setFadeIn setfadein = captureGuidance.MediaBrowserCompat$MediaItem;
        setPoints setpoints = captureGuidance.read;
        captureGuidance.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        ((proxyGetIIdExtractionServerRtti) obj).MediaBrowserCompat$ItemReceiver(z, getcorrectlastelement.MediaBrowserCompat$ItemReceiver(setfadein, setpoints), z2);
    }
}
