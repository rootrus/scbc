package p040o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver */
final class DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicInteger implements BulkTransferDeepLinkActivity {
    volatile boolean IconCompatParcelizer;
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    C6430xb383b2e1<T> MediaBrowserCompat$ItemReceiver;
    private DepositOpenAccountActivity<T> RatingCompat;
    int read;
    long write;

    DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DepositOpenAccountActivity<T> depositOpenAccountActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.RatingCompat = depositOpenAccountActivity;
        this.MediaBrowserCompat$ItemReceiver = depositOpenAccountActivity.read;
    }

    public final void dispose() {
        DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr;
        DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2;
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
            DepositOpenAccountActivity<T> depositOpenAccountActivity = this.RatingCompat;
            do {
                depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr = (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[]) depositOpenAccountActivity.MediaBrowserCompat$CustomActionResultReceiver.get();
                int length = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr[i] == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2 = DepositOpenAccountActivity.MediaBrowserCompat$ItemReceiver;
                    } else {
                        DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr3 = new DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[(length - 1)];
                        System.arraycopy(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr, 0, depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr3, 0, i);
                        System.arraycopy(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr, i + 1, depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr3, i, (length - i) - 1);
                        depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2 = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr3;
                    }
                } else {
                    return;
                }
            } while (!depositOpenAccountActivity.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr, depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2));
        }
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }
}
