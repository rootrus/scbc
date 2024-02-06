package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageFileWidth$MediaBrowserCompat$CustomActionResultReceiver */
public final class setImageFileWidth$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setImageFileWidth MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setImageFileWidth$MediaBrowserCompat$CustomActionResultReceiver(setImageFileWidth setimagefilewidth) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagefilewidth;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        ILocationSourceDelegate.zza zza;
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "9300", (Object) str)) {
                setImageFileWidth setimagefilewidth = this.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getCardNumber>() {
                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        getCardNumber getcardnumber = (getCardNumber) obj;
                        getcardnumber.aj_();
                        ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                        onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "throwable.response");
                        ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                        onGetStartedClick.IconCompatParcelizer((Object) zza, "throwable.response.error");
                        String str = zza.read;
                        onGetStartedClick.IconCompatParcelizer((Object) str, "throwable.response.error.message");
                        getcardnumber.write(str);
                    }
                };
                if (setimagefilewidth.RatingCompat != null) {
                    r1.IconCompatParcelizer(setimagefilewidth.RatingCompat);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
