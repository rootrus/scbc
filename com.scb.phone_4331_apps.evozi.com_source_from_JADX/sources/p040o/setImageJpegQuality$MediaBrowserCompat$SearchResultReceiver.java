package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;

/* renamed from: o.setImageJpegQuality$MediaBrowserCompat$SearchResultReceiver */
public final class setImageJpegQuality$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setImageJpegQuality IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setImageJpegQuality$MediaBrowserCompat$SearchResultReceiver(setImageJpegQuality setimagejpegquality) {
        super(1);
        this.IconCompatParcelizer = setimagejpegquality;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "e.response");
            ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
            onGetStartedClick.IconCompatParcelizer((Object) zza, "e.response.error");
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) zza.IconCompatParcelizer, (Object) "3038")) {
                setImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
                setImageJpegQuality.write(this.IconCompatParcelizer);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
