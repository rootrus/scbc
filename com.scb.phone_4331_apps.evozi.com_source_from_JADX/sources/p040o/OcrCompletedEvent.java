package p040o;

/* renamed from: o.OcrCompletedEvent */
public final /* synthetic */ class OcrCompletedEvent implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ OcrEventListener read;

    public /* synthetic */ OcrCompletedEvent(OcrEventListener ocrEventListener) {
        this.read = ocrEventListener;
    }

    public final Object write(Object obj) {
        return this.read.write;
    }
}
