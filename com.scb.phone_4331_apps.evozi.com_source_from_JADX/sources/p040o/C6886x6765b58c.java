package p040o;

/* renamed from: o.HmlCalculatorDeepLinkActivity$MediaBrowserCompat$SearchResultReceiver */
final class C6886x6765b58c<T1, T2, T3, T4, T5, T6, T7, R> implements DirectDebitDeepLinkActivity<Object[], R> {
    private EasycashDeepLinkActivity<T1, T2, T3, T4, T5, T6, T7, R> MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ Object write(Object obj) throws Exception {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 7) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Array of size 7 expected but got ");
        sb.append(objArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    C6886x6765b58c(EasycashDeepLinkActivity<T1, T2, T3, T4, T5, T6, T7, R> easycashDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashDeepLinkActivity;
    }
}
