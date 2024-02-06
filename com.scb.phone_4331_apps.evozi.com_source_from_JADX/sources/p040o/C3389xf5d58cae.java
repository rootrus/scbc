package p040o;

import java.util.List;
import p040o.AnalyticsConnector;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionPoint$MediaBrowserCompat$CustomActionResultReceiver */
final class C3389xf5d58cae extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends AnalyticsConnector.AnalyticsConnectorHandle>, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FirebaseVisionPoint write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3389xf5d58cae(FirebaseVisionPoint firebaseVisionPoint) {
        super(1);
        this.write = firebaseVisionPoint;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final List list = (List) obj;
        onGetStartedClick.write((Object) list, "results");
        FirebaseVisionPoint firebaseVisionPoint = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<setExtractionServer>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                setExtractionServer setextractionserver = (setExtractionServer) obj;
                setextractionserver.aj_();
                setextractionserver.read(list);
            }
        };
        if (firebaseVisionPoint.RatingCompat != null) {
            r1.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
