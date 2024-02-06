package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.hj$MediaBrowserCompat$ItemReceiver */
public final class hj$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4768hj write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hj$MediaBrowserCompat$ItemReceiver(C4768hj hjVar) {
        super(1);
        this.write = hjVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate != null) {
                ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                onGetStartedClick.IconCompatParcelizer((Object) zza, "error");
                String str = zza.IconCompatParcelizer;
                if (str == null || str.hashCode() != 1746712 || !str.equals("9100")) {
                    this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                } else {
                    C4768hj.write(this.write);
                    C4768hj hjVar = this.write;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4770x864a2b2b.MediaBrowserCompat$ItemReceiver;
                    if (hjVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(hjVar.RatingCompat);
                    }
                }
            } else {
                this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        } else {
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
