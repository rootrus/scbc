package p040o;

/* renamed from: o.initRectangle */
public final /* synthetic */ class initRectangle implements Runnable {
    private final /* synthetic */ generateShader$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ initRectangle(generateShader$MediaBrowserCompat$ItemReceiver generateshader_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = generateshader_mediabrowsercompat_itemreceiver;
    }

    public final void run() {
        generateShader generateshader = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        onDrawFrame ondrawframe = onDrawFrame.read;
        if (generateshader.RatingCompat != null) {
            ondrawframe.IconCompatParcelizer(generateshader.RatingCompat);
        }
    }
}
