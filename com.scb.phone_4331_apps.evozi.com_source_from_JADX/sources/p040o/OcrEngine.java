package p040o;

/* renamed from: o.OcrEngine */
public final /* synthetic */ class OcrEngine implements DataPrivacyManagementDeepLinkActivity {
    private final /* synthetic */ OcrEventListener read;

    public /* synthetic */ OcrEngine(OcrEventListener ocrEventListener) {
        this.read = ocrEventListener;
    }

    public final void read() {
        this.read.write.subscribe();
    }
}
