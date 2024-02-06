package p040o;

/* renamed from: o.MwEditCreateQrActivity */
public final class MwEditCreateQrActivity {
    /* access modifiers changed from: private */
    public static final EkycOtpActivity MediaBrowserCompat$CustomActionResultReceiver = new EkycOtpActivity("CLOSED_EMPTY");
    /* access modifiers changed from: private */
    public static final EkycOtpActivity read = new EkycOtpActivity("REMOVED_TASK");

    public static final long write(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
