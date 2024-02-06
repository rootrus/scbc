package p040o;

/* renamed from: o.IDocumentDetector$MediaBrowserCompat$ItemReceiver */
public final class IDocumentDetector$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ onStopCallOnce MediaBrowserCompat$ItemReceiver;

    private IDocumentDetector$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ IDocumentDetector$MediaBrowserCompat$ItemReceiver(onStopCallOnce onstopcallonce) {
        this.MediaBrowserCompat$ItemReceiver = onstopcallonce;
    }

    public final Object IconCompatParcelizer(Object obj) {
        PngProcessingException pngProcessingException = (PngProcessingException) obj;
        return new zzry(pngProcessingException.read, pngProcessingException.IconCompatParcelizer, pngProcessingException.MediaBrowserCompat$ItemReceiver, pngProcessingException.write, new zzrz(pngProcessingException.MediaBrowserCompat$CustomActionResultReceiver.read, pngProcessingException.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
    }
}
