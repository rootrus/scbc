package p040o;

import java.util.HashMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaBrowserCompat$SearchResultReceiver */
public final class dx$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzvf, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HashMap MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C4305dx write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx$MediaBrowserCompat$SearchResultReceiver(C4305dx dxVar, HashMap hashMap) {
        super(1);
        this.write = dxVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = hashMap;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zzvf zzvf = (zzvf) obj;
        onGetStartedClick.write((Object) zzvf, "registeredAccount");
        C4305dx dxVar = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99001.MediaBrowserCompat$ItemReceiver;
        if (dxVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(dxVar.RatingCompat);
        }
        this.write.MediaBrowserCompat$CustomActionResultReceiver((HashMap<String, Object>) this.MediaBrowserCompat$CustomActionResultReceiver, zzvf);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
