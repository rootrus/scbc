package p040o;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.HmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6889x18706b56<T> extends AtomicBoolean implements BulkTransferDeepLinkActivity {
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private HmlETBPersonalInfoActivity<T> write;

    C6889x18706b56(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlETBPersonalInfoActivity<T> hmlETBPersonalInfoActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.write = hmlETBPersonalInfoActivity;
    }

    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.write.read(this);
        }
    }

    public final boolean isDisposed() {
        return get();
    }
}
