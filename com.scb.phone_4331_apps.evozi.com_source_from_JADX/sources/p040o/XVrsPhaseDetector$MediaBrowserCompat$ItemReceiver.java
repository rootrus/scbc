package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsPhaseDetector$MediaBrowserCompat$ItemReceiver */
final class XVrsPhaseDetector$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ XVrsPhaseDetector MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XVrsPhaseDetector$MediaBrowserCompat$ItemReceiver(XVrsPhaseDetector xVrsPhaseDetector) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = xVrsPhaseDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        ILocationSourceDelegate.zza zza;
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        XVrsPhaseDetector.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("1002", str, true)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
        XVrsPhaseDetector xVrsPhaseDetector = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C39635.read;
        if (xVrsPhaseDetector.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(xVrsPhaseDetector.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
