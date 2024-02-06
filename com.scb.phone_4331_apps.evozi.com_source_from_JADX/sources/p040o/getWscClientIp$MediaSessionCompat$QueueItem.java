package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getWscClientIp$MediaSessionCompat$QueueItem */
public final class getWscClientIp$MediaSessionCompat$QueueItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getWscClientIp read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getWscClientIp$MediaSessionCompat$QueueItem(getWscClientIp getwscclientip) {
        super(1);
        this.read = getwscclientip;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        getWscClientIp.MediaBrowserCompat$ItemReceiver(this.read);
        getWscClientIp getwscclientip = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.KtaExceptionResponseDeserializer>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                PassportCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = (PassportCaptureModule.KtaExceptionResponseDeserializer) obj;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                ktaExceptionResponseDeserializer.write(message);
            }
        };
        if (getwscclientip.RatingCompat != null) {
            r1.IconCompatParcelizer(getwscclientip.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
