package p040o;

/* renamed from: o.Image$BitmapDataObject$MediaBrowserCompat$ItemReceiver */
public final class Image$BitmapDataObject$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ onStopCallOnce MediaBrowserCompat$ItemReceiver;

    private Image$BitmapDataObject$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ Image$BitmapDataObject$MediaBrowserCompat$ItemReceiver(onStopCallOnce onstopcallonce) {
        this.MediaBrowserCompat$ItemReceiver = onstopcallonce;
    }

    public final Object IconCompatParcelizer(Object obj) {
        GeneratedAppGlideModule generatedAppGlideModule = (GeneratedAppGlideModule) obj;
        int i = generatedAppGlideModule.read;
        String str = generatedAppGlideModule.write;
        setOnPageChangeListener setonpagechangelistener = generatedAppGlideModule.MediaBrowserCompat$ItemReceiver;
        return new onIndoorLevelActivated(i, str, new zzrm(setonpagechangelistener.MediaBrowserCompat$ItemReceiver(), setonpagechangelistener.write(), setonpagechangelistener.IconCompatParcelizer(), setonpagechangelistener.read()), generatedAppGlideModule.MediaBrowserCompat$CustomActionResultReceiver, generatedAppGlideModule.IconCompatParcelizer);
    }
}
