package p040o;

/* renamed from: o.CreditCardServiceDefaultCardDeepLinkActivity */
public final class CreditCardServiceDefaultCardDeepLinkActivity extends CardlessAtmDeepLinkActivity<Runnable> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        ((Runnable) obj).run();
    }

    public CreditCardServiceDefaultCardDeepLinkActivity(Runnable runnable) {
        super(runnable);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
