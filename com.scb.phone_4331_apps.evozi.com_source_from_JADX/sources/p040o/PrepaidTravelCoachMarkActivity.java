package p040o;

import java.security.PrivilegedAction;

/* renamed from: o.PrepaidTravelCoachMarkActivity */
final class PrepaidTravelCoachMarkActivity implements PrivilegedAction {
    PrepaidTravelCoachMarkActivity() {
    }

    public final Object run() {
        return PrepaidOtpActivity.write();
    }
}
