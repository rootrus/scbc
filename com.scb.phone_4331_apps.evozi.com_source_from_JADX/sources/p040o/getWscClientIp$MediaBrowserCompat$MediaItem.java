package p040o;

import p040o.PassportCaptureModule;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getWscClientIp$MediaBrowserCompat$MediaItem */
public final class getWscClientIp$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getWscClientIp MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getWscClientIp$MediaBrowserCompat$MediaItem(getWscClientIp getwscclientip) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = getwscclientip;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        getWscClientIp.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        getWscClientIp getwscclientip = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.KtaExceptionResponseDeserializer>(this) {
            private /* synthetic */ getWscClientIp$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(e)");
                String str = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplayMapper.transform(e).message");
                ((PassportCaptureModule.KtaExceptionResponseDeserializer) obj).write(str);
            }
        };
        if (getwscclientip.RatingCompat != null) {
            r1.IconCompatParcelizer(getwscclientip.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
