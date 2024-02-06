package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.setOptions$MediaBrowserCompat$CustomActionResultReceiver */
final class setOptions$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zziu.zzc, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setOptions write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setOptions$MediaBrowserCompat$CustomActionResultReceiver(setOptions setoptions) {
        super(1);
        this.write = setoptions;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final zziu.zzc zzc = (zziu.zzc) obj;
        onGetStartedClick.write((Object) zzc, "operatingAccount");
        setOptions.write(this.write);
        setOptions setoptions = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.C6975b>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((PassportCaptureModule.C6975b) obj).MediaBrowserCompat$CustomActionResultReceiver(zzc, false);
            }
        };
        if (setoptions.RatingCompat != null) {
            r1.IconCompatParcelizer(setoptions.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
