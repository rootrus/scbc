package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dJ$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C4257xa798420c extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4252dJ MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4257xa798420c(C4252dJ dJVar) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = dJVar;
    }

    public final /* synthetic */ Object invoke() {
        C4252dJ dJVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C42584.MediaBrowserCompat$ItemReceiver;
        if (dJVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(dJVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
