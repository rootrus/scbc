package p040o;

import p040o.ExtractorResponse;
import p040o.FirebaseVisionCloudDocumentRecognizerOptions;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$ItemReceiver */
final class C3382x86b5608c extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ FirebaseVisionCloudDocumentRecognizerOptions.Builder IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3382x86b5608c(FirebaseVisionCloudDocumentRecognizerOptions.Builder builder) {
        super(1);
        this.IconCompatParcelizer = builder;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        FirebaseVisionCloudDocumentRecognizerOptions.Builder builder = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write>(this) {
            private /* synthetic */ C3382x86b5608c MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ExtractorResponse.write write = (ExtractorResponse.write) obj;
                write.aj_();
                write.write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        };
        if (builder.RatingCompat != null) {
            r1.IconCompatParcelizer(builder.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
