package p040o;

import p040o.access$2300;

/* renamed from: o.DocumentBaseOverlayView$MediaSessionCompat$Token */
final class DocumentBaseOverlayView$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ DocumentBaseOverlayView MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DocumentBaseOverlayView$MediaSessionCompat$Token(DocumentBaseOverlayView documentBaseOverlayView) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = documentBaseOverlayView;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
