package p040o;

/* renamed from: o.getTextBlocks */
public final /* synthetic */ class getTextBlocks implements FundFactSheetActivity {
    private final /* synthetic */ KotlinDetector MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ normalize read;

    public /* synthetic */ getTextBlocks(KotlinDetector kotlinDetector, normalize normalize) {
        this.MediaBrowserCompat$CustomActionResultReceiver = kotlinDetector;
        this.read = normalize;
    }

    public final Object invoke(Object obj) {
        KotlinDetector kotlinDetector = this.MediaBrowserCompat$CustomActionResultReceiver;
        getConfidenceThreshold getconfidencethreshold = new getConfidenceThreshold((ensureReceiverRegistered) obj, this.read);
        if (kotlinDetector.RatingCompat != null) {
            getconfidencethreshold.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
