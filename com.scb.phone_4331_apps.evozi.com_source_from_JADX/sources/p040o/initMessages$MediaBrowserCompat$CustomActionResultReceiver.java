package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.initMessages$MediaBrowserCompat$CustomActionResultReceiver */
public final class initMessages$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ initMessages MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public initMessages$MediaBrowserCompat$CustomActionResultReceiver(initMessages initmessages) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = initmessages;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        initMessages.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        initMessages initmessages = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C100175.read;
        if (initmessages.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(initmessages.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
