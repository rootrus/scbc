package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.PinCase;
import p040o.zzge;

/* renamed from: o.WakeLockTracker */
public final /* synthetic */ class WakeLockTracker implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzge.zzg MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ WakeLockTracker(zzge.zzg zzg) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzg;
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
        if (iLocationSourceDelegate.write != null) {
            String str = iLocationSourceDelegate.write.IconCompatParcelizer;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 1507516) {
                if (hashCode == 1507522 && str.equals("1036")) {
                    c = 0;
                }
            } else if (str.equals("1030")) {
                c = 1;
            }
            if (c == 0) {
                DebitCardResetOtpActivity.error((Throwable) new PinCase.PinIncorrectLimitReachedException());
            } else if (c == 1) {
                DebitCardResetOtpActivity.error((Throwable) new PinCase.PinIncorrectException(iLocationSourceDelegate.write.read));
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }
}
