package p040o;

/* renamed from: o.proxyGetIBillDeserializerRtti */
public final /* synthetic */ class proxyGetIBillDeserializerRtti implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ KtaBillExtractor MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ proxyGetIBillDeserializerRtti(KtaBillExtractor ktaBillExtractor, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ktaBillExtractor;
        this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
    }

    public final Object write(Object obj) {
        KtaBillExtractor ktaBillExtractor = this.MediaBrowserCompat$CustomActionResultReceiver;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.MediaBrowserCompat$ItemReceiver;
        return ktaBillExtractor.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((zoomByWithFocus) obj, setuuidfromutf8bytes);
    }
}
