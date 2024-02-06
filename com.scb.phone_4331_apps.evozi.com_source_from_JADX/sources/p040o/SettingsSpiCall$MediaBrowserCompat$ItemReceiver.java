package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsSpiCall$MediaBrowserCompat$ItemReceiver */
final class SettingsSpiCall$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ SettingsSpiCall write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsSpiCall$MediaBrowserCompat$ItemReceiver(SettingsSpiCall settingsSpiCall) {
        super(1);
        this.write = settingsSpiCall;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (Throwable) obj, "it");
        SettingsSpiCall settingsSpiCall = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C37875.write;
        if (settingsSpiCall.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(settingsSpiCall.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
