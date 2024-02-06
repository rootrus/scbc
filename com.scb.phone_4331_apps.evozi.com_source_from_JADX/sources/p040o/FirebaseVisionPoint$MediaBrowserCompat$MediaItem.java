package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionPoint$MediaBrowserCompat$MediaItem */
public final class FirebaseVisionPoint$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ FirebaseVisionPoint IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseVisionPoint$MediaBrowserCompat$MediaItem(FirebaseVisionPoint firebaseVisionPoint) {
        super(1);
        this.IconCompatParcelizer = firebaseVisionPoint;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        FirebaseVisionPoint firebaseVisionPoint = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<setExtractionServer>(this) {
            private /* synthetic */ FirebaseVisionPoint$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                setExtractionServer setextractionserver = (setExtractionServer) obj;
                setextractionserver.aj_();
                setextractionserver.write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        };
        if (firebaseVisionPoint.RatingCompat != null) {
            r1.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
