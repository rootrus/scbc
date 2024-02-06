package p040o;

/* renamed from: o.setOCRStatus */
public final /* synthetic */ class setOCRStatus implements DataPrivacyManagementDeepLinkActivity {
    private final /* synthetic */ OcrEventListener IconCompatParcelizer;

    public /* synthetic */ setOCRStatus(OcrEventListener ocrEventListener) {
        this.IconCompatParcelizer = ocrEventListener;
    }

    public final void read() {
        this.IconCompatParcelizer.write.subscribe();
    }
}
