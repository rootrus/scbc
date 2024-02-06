package p040o;

import p040o.GoogleMap;

/* renamed from: o.BoundaryType$MediaBrowserCompat$CustomActionResultReceiver */
public final class BoundaryType$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.OnMapClickListener, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ BoundaryType MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoundaryType$MediaBrowserCompat$CustomActionResultReceiver(BoundaryType boundaryType) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = boundaryType;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        GoogleMap.OnMapClickListener onMapClickListener = (GoogleMap.OnMapClickListener) obj;
        onGetStartedClick.write((Object) onMapClickListener, "securitiesList");
        BoundaryType.write(this.MediaBrowserCompat$CustomActionResultReceiver, onMapClickListener);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
