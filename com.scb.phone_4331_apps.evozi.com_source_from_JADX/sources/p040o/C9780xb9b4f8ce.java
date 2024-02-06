package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;
import p040o.ManageEmailVerificationActivity;

/* renamed from: o.ManageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9780xb9b4f8ce<T> extends AtomicInteger implements BulkTransferDeepLinkActivity {
    final DebitCardResetPinSuccessActivity_ViewBinding<? extends T> IconCompatParcelizer;
    final ManageEmailVerificationActivity.write<T>[] MediaBrowserCompat$CustomActionResultReceiver;
    final ExternalDeepLinkActivity MediaBrowserCompat$ItemReceiver = new ExternalDeepLinkActivity();
    private BankingAgentTransactionsDeepLinkActivity<? super Boolean> MediaBrowserCompat$MediaItem;
    private T MediaBrowserCompat$SearchResultReceiver;
    private T MediaDescriptionCompat;
    private CreditCardServiceTabDeepLinkActivity<? super T, ? super T> RatingCompat;
    final DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
    private volatile boolean write;

    C9780xb9b4f8ce(BankingAgentTransactionsDeepLinkActivity<? super Boolean> bankingAgentTransactionsDeepLinkActivity, int i, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity) {
        this.MediaBrowserCompat$MediaItem = bankingAgentTransactionsDeepLinkActivity;
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = debitCardResetPinSuccessActivity_ViewBinding2;
        this.RatingCompat = creditCardServiceTabDeepLinkActivity;
        ManageEmailVerificationActivity.write<T>[] writeArr = new ManageEmailVerificationActivity.write[2];
        this.MediaBrowserCompat$CustomActionResultReceiver = writeArr;
        writeArr[0] = new ManageEmailVerificationActivity.write<>(this, 0, i);
        writeArr[1] = new ManageEmailVerificationActivity.write<>(this, 1, i);
    }

    public final void dispose() {
        if (!this.write) {
            this.write = true;
            this.MediaBrowserCompat$ItemReceiver.dispose();
            if (getAndIncrement() == 0) {
                ManageEmailVerificationActivity.write<T>[] writeArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                writeArr[0].MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
                writeArr[1].MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final boolean isDisposed() {
        return this.write;
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        Throwable th;
        Throwable th2;
        if (getAndIncrement() == 0) {
            ManageEmailVerificationActivity.write<T>[] writeArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            ManageEmailVerificationActivity.write<T> write2 = writeArr[0];
            HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity = write2.MediaBrowserCompat$CustomActionResultReceiver;
            ManageEmailVerificationActivity.write<T> write3 = writeArr[1];
            HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity2 = write3.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 1;
            while (!this.write) {
                boolean z = write2.write;
                if (!z || (th2 = write2.MediaBrowserCompat$ItemReceiver) == null) {
                    boolean z2 = write3.write;
                    if (!z2 || (th = write3.MediaBrowserCompat$ItemReceiver) == null) {
                        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                            this.MediaBrowserCompat$SearchResultReceiver = hmlBaseEmailAboutActivity.read();
                        }
                        boolean z3 = this.MediaBrowserCompat$SearchResultReceiver == null;
                        if (this.MediaDescriptionCompat == null) {
                            this.MediaDescriptionCompat = hmlBaseEmailAboutActivity2.read();
                        }
                        boolean z4 = this.MediaDescriptionCompat == null;
                        if (z && z2 && z3 && z4) {
                            this.MediaBrowserCompat$MediaItem.onNext(Boolean.TRUE);
                            this.MediaBrowserCompat$MediaItem.onComplete();
                            return;
                        } else if (!z || !z2 || z3 == z4) {
                            if (!z3 && !z4) {
                                try {
                                    if (!this.RatingCompat.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, this.MediaDescriptionCompat)) {
                                        this.write = true;
                                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                        hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                                        this.MediaBrowserCompat$MediaItem.onNext(Boolean.FALSE);
                                        this.MediaBrowserCompat$MediaItem.onComplete();
                                        return;
                                    }
                                    this.MediaBrowserCompat$SearchResultReceiver = null;
                                    this.MediaDescriptionCompat = null;
                                } catch (Throwable th3) {
                                    AlertController$RecycleListView.read.write(th3);
                                    this.write = true;
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                                    this.MediaBrowserCompat$MediaItem.onError(th3);
                                    return;
                                }
                            }
                            if ((z3 || z4) && (i = addAndGet(-i)) == 0) {
                                return;
                            }
                        } else {
                            this.write = true;
                            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                            hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                            this.MediaBrowserCompat$MediaItem.onNext(Boolean.FALSE);
                            this.MediaBrowserCompat$MediaItem.onComplete();
                            return;
                        }
                    } else {
                        this.write = true;
                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                        hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                        this.MediaBrowserCompat$MediaItem.onError(th);
                        return;
                    }
                } else {
                    this.write = true;
                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                    hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                    this.MediaBrowserCompat$MediaItem.onError(th2);
                    return;
                }
            }
            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
            hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
        }
    }
}
