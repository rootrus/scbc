package p040o;

/* renamed from: o.HmlCalculatorDeepLinkActivity$MediaSessionCompat$ResultReceiverWrapper */
final class C9757x6f13429d<T, U> implements HmlBaseDeepLinkActivity<T> {
    private Class<U> write;

    C9757x6f13429d(Class<U> cls) {
        this.write = cls;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(T t) throws Exception {
        return this.write.isInstance(t);
    }
}
