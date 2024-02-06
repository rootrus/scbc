package p040o;

import com.scb.phone.domain.interactor.PinCase;

/* renamed from: o.appendToArray */
public final /* synthetic */ class appendToArray implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ appendToArray MediaBrowserCompat$CustomActionResultReceiver = new appendToArray();

    private /* synthetic */ appendToArray() {
    }

    public final Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        if (setcurrentiteminternal.getStatus() != null) {
            String write = setcurrentiteminternal.getStatus().write();
            char c = 65535;
            int hashCode = write.hashCode();
            if (hashCode != 1507516) {
                if (hashCode == 1507522 && write.equals("1036")) {
                    c = 0;
                }
            } else if (write.equals("1030")) {
                c = 1;
            }
            if (c == 0) {
                return DebitCardResetOtpActivity.error((Throwable) new PinCase.PinIncorrectLimitReachedException());
            }
            if (c == 1) {
                return DebitCardResetOtpActivity.error((Throwable) new PinCase.PinIncorrectException(setcurrentiteminternal.getError().read()));
            }
        }
        return DebitCardResetOtpActivity.just(Boolean.TRUE);
    }
}
