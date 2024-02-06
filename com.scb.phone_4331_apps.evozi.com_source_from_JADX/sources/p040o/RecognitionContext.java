package p040o;

/* renamed from: o.RecognitionContext */
public final /* synthetic */ class RecognitionContext implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String read;

    public /* synthetic */ RecognitionContext(String str) {
        this.read = str;
    }

    public final boolean write(Object obj) {
        return BarCodeDirection.MediaBrowserCompat$CustomActionResultReceiver(this.read, (convertMemInfoToBytes) obj);
    }
}
