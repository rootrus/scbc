package p040o;

/* renamed from: o.doQuickAnalysis$MediaBrowserCompat$ItemReceiver */
public final class doQuickAnalysis$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ onStopCallOnce MediaBrowserCompat$ItemReceiver;

    private doQuickAnalysis$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ doQuickAnalysis$MediaBrowserCompat$ItemReceiver(onStopCallOnce onstopcallonce) {
        this.MediaBrowserCompat$ItemReceiver = onstopcallonce;
    }

    public final Object IconCompatParcelizer(Object obj) {
        Registry$NoResultEncoderAvailableException registry$NoResultEncoderAvailableException = (Registry$NoResultEncoderAvailableException) obj;
        int i = registry$NoResultEncoderAvailableException.read;
        String str = registry$NoResultEncoderAvailableException.write;
        setOnPageChangeListener setonpagechangelistener = registry$NoResultEncoderAvailableException.IconCompatParcelizer;
        return new zzup(i, str, new zzrm(setonpagechangelistener.MediaBrowserCompat$ItemReceiver(), setonpagechangelistener.write(), setonpagechangelistener.IconCompatParcelizer(), setonpagechangelistener.read()), registry$NoResultEncoderAvailableException.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
