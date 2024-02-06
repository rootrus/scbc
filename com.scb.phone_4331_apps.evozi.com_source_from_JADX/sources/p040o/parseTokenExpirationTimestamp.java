package p040o;

/* renamed from: o.parseTokenExpirationTimestamp */
public final /* synthetic */ class parseTokenExpirationTimestamp implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FirebaseVisionBarcodeDetectorOptions IconCompatParcelizer;

    public /* synthetic */ parseTokenExpirationTimestamp(FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        this.IconCompatParcelizer = firebaseVisionBarcodeDetectorOptions;
    }

    public final void IconCompatParcelizer(Object obj) {
        FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions = this.IconCompatParcelizer;
        isWifiRequired iswifirequired = isWifiRequired.write;
        if (firebaseVisionBarcodeDetectorOptions.RatingCompat != null) {
            iswifirequired.IconCompatParcelizer(firebaseVisionBarcodeDetectorOptions.RatingCompat);
        }
    }
}
