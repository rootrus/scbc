package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getProcessName$MediaBrowserCompat$ItemReceiver */
public final class getProcessName$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getProcessName write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getProcessName$MediaBrowserCompat$ItemReceiver(getProcessName getprocessname) {
        super(1);
        this.write = getprocessname;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        getProcessName.read(this.write);
        getProcessName getprocessname = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99795.write;
        if (getprocessname.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getprocessname.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
