package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getIndexFields$MediaBrowserCompat$ItemReceiver */
final class getIndexFields$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C10840getIndexFields MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getIndexFields$MediaBrowserCompat$ItemReceiver(C10840getIndexFields getindexfields) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = getindexfields;
    }

    public final /* synthetic */ Object invoke() {
        C10840getIndexFields getindexfields = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99734.MediaBrowserCompat$CustomActionResultReceiver;
        if (getindexfields.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getindexfields.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
