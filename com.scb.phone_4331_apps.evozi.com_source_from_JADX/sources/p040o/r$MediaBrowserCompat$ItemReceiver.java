package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.r$MediaBrowserCompat$ItemReceiver */
public final class r$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C5186r MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r$MediaBrowserCompat$ItemReceiver(C5186r rVar) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = rVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        C5186r rVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C101205.write;
        if (rVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(rVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
