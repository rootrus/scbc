package p040o;

/* renamed from: o.XVrsAutoOrientation$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3959x5a14f1ef implements findFragmentByWho {
    private final /* synthetic */ onStopCallOnce MediaBrowserCompat$ItemReceiver;

    private C3959x5a14f1ef() {
    }

    public /* synthetic */ C3959x5a14f1ef(onStopCallOnce onstopcallonce) {
        this.MediaBrowserCompat$ItemReceiver = onstopcallonce;
    }

    public final Object IconCompatParcelizer(Object obj) {
        Registry$NoSourceEncoderAvailableException registry$NoSourceEncoderAvailableException = (Registry$NoSourceEncoderAvailableException) obj;
        int i = registry$NoSourceEncoderAvailableException.read;
        String str = registry$NoSourceEncoderAvailableException.write;
        String str2 = registry$NoSourceEncoderAvailableException.IconCompatParcelizer;
        setOnPageChangeListener setonpagechangelistener = registry$NoSourceEncoderAvailableException.MediaBrowserCompat$ItemReceiver;
        return new zzrt(i, str, str2, new zzrm(setonpagechangelistener.MediaBrowserCompat$ItemReceiver(), setonpagechangelistener.write(), setonpagechangelistener.IconCompatParcelizer(), setonpagechangelistener.read()));
    }
}
