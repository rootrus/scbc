package p040o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.onIbEmailEditClicked$MediaBrowserCompat$CustomActionResultReceiver */
final class C10096xf0f91c6<T> extends onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> {
    private AtomicInteger MediaBrowserCompat$CustomActionResultReceiver = new AtomicInteger();
    private volatile boolean write;

    C10096xf0f91c6(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<?> debitCardResetPinSuccessActivity_ViewBinding) {
        super(bankingAgentTransactionsDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        this.write = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.getAndIncrement() == 0) {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.read.onNext(andSet);
            }
            this.read.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.getAndIncrement() == 0) {
            do {
                boolean z = this.write;
                Object andSet = getAndSet((Object) null);
                if (andSet != null) {
                    this.read.onNext(andSet);
                }
                if (z) {
                    this.read.onComplete();
                    return;
                }
            } while (this.MediaBrowserCompat$CustomActionResultReceiver.decrementAndGet() != 0);
        }
    }
}
