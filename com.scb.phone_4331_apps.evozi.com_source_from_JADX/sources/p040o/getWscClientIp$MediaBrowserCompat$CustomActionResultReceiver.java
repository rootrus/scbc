package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.getWscClientIp$MediaBrowserCompat$CustomActionResultReceiver */
public final class getWscClientIp$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzcz.zzh.zza, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getWscClientIp IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getWscClientIp$MediaBrowserCompat$CustomActionResultReceiver(getWscClientIp getwscclientip) {
        super(1);
        this.IconCompatParcelizer = getwscclientip;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (zzcz.zzh.zza) obj, "it");
        getWscClientIp getwscclientip = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99902.IconCompatParcelizer;
        if (getwscclientip.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getwscclientip.RatingCompat);
        }
        getWscClientIp.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
