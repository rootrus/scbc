package p040o;

import p040o.FirebaseVisionOnDeviceImageLabelerOptions;

/* renamed from: o.setPerformanceMode */
public final /* synthetic */ class setPerformanceMode implements FundFactSheetActivity {
    private final /* synthetic */ KotlinDetector MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setPerformanceMode(KotlinDetector kotlinDetector) {
        this.MediaBrowserCompat$CustomActionResultReceiver = kotlinDetector;
    }

    public final Object invoke(Object obj) {
        KotlinDetector kotlinDetector = this.MediaBrowserCompat$CustomActionResultReceiver;
        FirebaseVisionOnDeviceImageLabelerOptions.Builder builder = new FirebaseVisionOnDeviceImageLabelerOptions.Builder(kotlinDetector, (Throwable) obj);
        if (kotlinDetector.RatingCompat != null) {
            builder.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
