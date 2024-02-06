package p040o;

/* renamed from: o.BillCaptureModule_GetIExtractionServerRttiFactory */
public final /* synthetic */ class BillCaptureModule_GetIExtractionServerRttiFactory implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ KtaBillExtractor MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ BillCaptureModule_GetIExtractionServerRttiFactory(KtaBillExtractor ktaBillExtractor, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$ItemReceiver = ktaBillExtractor;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
    }

    public final Object write(Object obj) {
        KtaBillExtractor ktaBillExtractor = this.MediaBrowserCompat$ItemReceiver;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.IconCompatParcelizer;
        return ktaBillExtractor.IconCompatParcelizer.write((zoomByWithFocus) obj, setuuidfromutf8bytes);
    }
}
