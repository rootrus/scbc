package p040o;

/* renamed from: o.HmlCalculatorDeepLinkActivity$MediaBrowserCompat$ItemReceiver */
final class HmlCalculatorDeepLinkActivity$MediaBrowserCompat$ItemReceiver<T1, T2, T3, R> implements DirectDebitDeepLinkActivity<Object[], R> {
    private DebitCardDeepLinkActivity<T1, T2, T3, R> read;

    public final /* synthetic */ Object write(Object obj) throws Exception {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 3) {
            return this.read.write(objArr[0], objArr[1], objArr[2]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Array of size 3 expected but got ");
        sb.append(objArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    HmlCalculatorDeepLinkActivity$MediaBrowserCompat$ItemReceiver(DebitCardDeepLinkActivity<T1, T2, T3, R> debitCardDeepLinkActivity) {
        this.read = debitCardDeepLinkActivity;
    }
}
