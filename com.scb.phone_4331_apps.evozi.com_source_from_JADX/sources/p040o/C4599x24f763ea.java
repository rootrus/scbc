package p040o;

import p040o.CrashlyticsController;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getJsonTransformForVersion$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4599x24f763ea extends CheckEligibilityActivity implements FundFactSheetActivity<CrashlyticsController.C32367, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getJsonTransformForVersion IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4599x24f763ea(getJsonTransformForVersion getjsontransformforversion) {
        super(1);
        this.IconCompatParcelizer = getjsontransformforversion;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final CrashlyticsController.C32367 r3 = (CrashlyticsController.C32367) obj;
        onGetStartedClick.write((Object) r3, "it");
        getJsonTransformForVersion.write(this.IconCompatParcelizer);
        getJsonTransformForVersion getjsontransformforversion = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<T>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((KtaJsonCheck.C6929b) obj).MediaBrowserCompat$CustomActionResultReceiver(r3);
            }
        };
        if (getjsontransformforversion.RatingCompat != null) {
            r1.IconCompatParcelizer(getjsontransformforversion.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
