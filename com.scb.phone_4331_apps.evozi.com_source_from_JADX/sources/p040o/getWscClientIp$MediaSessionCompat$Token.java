package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getWscClientIp$MediaSessionCompat$Token */
public final class getWscClientIp$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ getWscClientIp read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getWscClientIp$MediaSessionCompat$Token(getWscClientIp getwscclientip, String str) {
        super(1);
        this.read = getwscclientip;
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final String str = (String) obj;
        onGetStartedClick.write((Object) str, "mobileNo");
        getWscClientIp.MediaBrowserCompat$ItemReceiver(this.read);
        getWscClientIp getwscclientip = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.KtaExceptionResponseDeserializer>(this) {
            private /* synthetic */ getWscClientIp$MediaSessionCompat$Token IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                String str = this.IconCompatParcelizer.IconCompatParcelizer;
                String str2 = str;
                String IconCompatParcelizer2 = getICheckDeserializerRtti.IconCompatParcelizer(true, true, str2);
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "Utilities.maskingFormat(…                        )");
                ((PassportCaptureModule.KtaExceptionResponseDeserializer) obj).IconCompatParcelizer(str, str2, IconCompatParcelizer2);
            }
        };
        if (getwscclientip.RatingCompat != null) {
            r1.IconCompatParcelizer(getwscclientip.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
