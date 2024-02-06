package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaBrowserCompat$ItemReceiver */
public final class dx$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4305dx MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx$MediaBrowserCompat$ItemReceiver(C4305dx dxVar) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = dxVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final String str = (String) obj;
        onGetStartedClick.write((Object) str, "response");
        C4305dx dxVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((LocalProjectProvider.write) obj).write(str);
            }
        };
        if (dxVar.RatingCompat != null) {
            r1.IconCompatParcelizer(dxVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
