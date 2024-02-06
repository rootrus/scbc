package p040o;

/* renamed from: o.nativeSetToken */
public final /* synthetic */ class nativeSetToken implements ChequeManagementDeepLinkActivity {
    private final /* synthetic */ CaptureGuidance MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeSetToken(CaptureGuidance captureGuidance) {
        this.MediaBrowserCompat$CustomActionResultReceiver = captureGuidance;
    }

    public final Object read(Object obj, Object obj2) {
        CaptureGuidance captureGuidance = this.MediaBrowserCompat$CustomActionResultReceiver;
        setFadeIn setfadein = (setFadeIn) obj;
        setPoints setpoints = (setPoints) obj2;
        captureGuidance.MediaBrowserCompat$MediaItem = setfadein;
        captureGuidance.read = setpoints;
        return captureGuidance.write.MediaBrowserCompat$ItemReceiver(setfadein, setpoints, captureGuidance.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaSessionCompat$ResultReceiverWrapper > 0);
    }
}
