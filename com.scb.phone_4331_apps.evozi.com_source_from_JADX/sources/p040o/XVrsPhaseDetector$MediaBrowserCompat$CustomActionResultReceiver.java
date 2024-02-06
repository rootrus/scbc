package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.IdWorkflowActivity;
import p040o.StreetViewPanoramaFragment;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver */
final class XVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<StreetViewPanoramaFragment.zza, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ XVrsPhaseDetector read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XVrsPhaseDetector$MediaBrowserCompat$CustomActionResultReceiver(XVrsPhaseDetector xVrsPhaseDetector) {
        super(1);
        this.read = xVrsPhaseDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        StreetViewPanoramaFragment.zza zza = (StreetViewPanoramaFragment.zza) obj;
        onGetStartedClick.write((Object) zza, "it");
        XVrsPhaseDetector.MediaBrowserCompat$ItemReceiver(this.read);
        lessThanUnsigned IconCompatParcelizer = this.read.MediaBrowserCompat$ItemReceiver;
        List<StreetViewPanoramaOptions> list = zza.write;
        String checkable = this.read.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.setCheckable();
        onGetStartedClick.IconCompatParcelizer((Object) checkable, "profileRepositoryContractor.userProfileLanguage");
        final List<CrashlyticsReport.Session.Event.Application.Execution> MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(list, checkable);
        boolean z = true;
        if (MediaBrowserCompat$ItemReceiver.isEmpty()) {
            XVrsPhaseDetector xVrsPhaseDetector = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C39611.write;
            if (xVrsPhaseDetector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(xVrsPhaseDetector.RatingCompat);
            }
        } else {
            XVrsPhaseDetector xVrsPhaseDetector2 = this.read;
            writeUInt64NoTag.IconCompatParcelizer r3 = new writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.read>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    IdWorkflowActivity.read read = (IdWorkflowActivity.read) obj;
                    List list = MediaBrowserCompat$ItemReceiver;
                    onGetStartedClick.IconCompatParcelizer((Object) list, "billPaymentBillerDisplayList");
                    read.IconCompatParcelizer(list);
                    read.MediaBrowserCompat$CustomActionResultReceiver();
                }
            };
            if (xVrsPhaseDetector2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r3.IconCompatParcelizer(xVrsPhaseDetector2.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
