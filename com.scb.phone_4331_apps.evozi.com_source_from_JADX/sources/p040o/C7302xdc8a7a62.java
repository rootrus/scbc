package p040o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.onBtnSendEmailVerificationClicked$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7302xdc8a7a62<T> extends AtomicInteger implements HmlLoanOfferStatusDeepLinkActivity<T>, Runnable {
    private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
    private T write;

    public C7302xdc8a7a62(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, T t) {
        this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        this.write = t;
    }

    public final boolean IconCompatParcelizer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final T read() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.write;
    }

    public final boolean write() {
        return get() != 1;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        lazySet(3);
    }

    public final void dispose() {
        set(3);
    }

    public final boolean isDisposed() {
        return get() == 3;
    }

    public final int write(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.IconCompatParcelizer.onNext(this.write);
            if (get() == 2) {
                lazySet(3);
                this.IconCompatParcelizer.onComplete();
            }
        }
    }
}
