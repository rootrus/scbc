package p040o;

/* renamed from: o.HmlCalculatorDeepLinkActivity$MediaBrowserCompat$MediaItem */
final class HmlCalculatorDeepLinkActivity$MediaBrowserCompat$MediaItem<T1, T2, T3, T4, T5, T6, R> implements DirectDebitDeepLinkActivity<Object[], R> {
    private EmailVerificationDeepLinkActivity<T1, T2, T3, T4, T5, T6, R> write;

    public final /* synthetic */ Object write(Object obj) throws Exception {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 6) {
            return this.write.read(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Array of size 6 expected but got ");
        sb.append(objArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    HmlCalculatorDeepLinkActivity$MediaBrowserCompat$MediaItem(EmailVerificationDeepLinkActivity<T1, T2, T3, T4, T5, T6, R> emailVerificationDeepLinkActivity) {
        this.write = emailVerificationDeepLinkActivity;
    }
}
