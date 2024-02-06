package p040o;

import p040o.GoogleMap;

/* renamed from: o.hk$MediaBrowserCompat$SearchResultReceiver */
public final class hk$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.OnCameraMoveStartedListener, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4771hk IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hk$MediaBrowserCompat$SearchResultReceiver(C4771hk hkVar) {
        super(1);
        this.IconCompatParcelizer = hkVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener = (GoogleMap.OnCameraMoveStartedListener) obj;
        onGetStartedClick.write((Object) onCameraMoveStartedListener, "response");
        C4771hk.IconCompatParcelizer(this.IconCompatParcelizer);
        C4771hk.read(this.IconCompatParcelizer, onCameraMoveStartedListener);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
