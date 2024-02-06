package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.showUserInstructionMessage$MediaBrowserCompat$ItemReceiver */
final class showUserInstructionMessage$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ showUserInstructionMessage write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    showUserInstructionMessage$MediaBrowserCompat$ItemReceiver(showUserInstructionMessage showuserinstructionmessage) {
        super(1);
        this.write = showuserinstructionmessage;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final String str = (String) obj;
        onGetStartedClick.write((Object) str, "resetPinToken");
        showUserInstructionMessage.read(this.write);
        showUserInstructionMessage showuserinstructionmessage = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C7140hu>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C7140hu huVar = (C7140hu) obj;
                huVar.read();
                huVar.write(str);
            }
        };
        if (showuserinstructionmessage.RatingCompat != null) {
            r1.IconCompatParcelizer(showuserinstructionmessage.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
