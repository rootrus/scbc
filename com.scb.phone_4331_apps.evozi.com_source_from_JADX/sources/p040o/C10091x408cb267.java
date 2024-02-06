package p040o;

import java.util.concurrent.TimeUnit;
import p040o.onBtnEnterEmailVerificationClicked;

/* renamed from: o.onBtnEnterEmailVerificationClicked$MediaBrowserCompat$ItemReceiver */
final class C10091x408cb267<T> extends onBtnEnterEmailVerificationClicked.read<T> {
    C10091x408cb267(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        super(bankingAgentTransactionsDeepLinkActivity, j, timeUnit, bankingAgentDeepLinkActivity);
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        this.IconCompatParcelizer.onComplete();
    }

    public final void run() {
        Object andSet = getAndSet((Object) null);
        if (andSet != null) {
            this.IconCompatParcelizer.onNext(andSet);
        }
    }
}
