package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.DepositOpenAccountActivity */
public final class DepositOpenAccountActivity<T> extends NtbUserInfoActivity<T, T> implements BankingAgentTransactionsDeepLinkActivity<T> {
    static final DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] MediaBrowserCompat$ItemReceiver = new DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[0];
    private static DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] write = new DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[0];
    final AtomicReference<DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver<T>[]> MediaBrowserCompat$CustomActionResultReceiver;
    private Throwable MediaBrowserCompat$MediaItem;
    private volatile long MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private C6430xb383b2e1<T> f3130x50fd9e4a;
    private volatile boolean MediaDescriptionCompat;
    private AtomicBoolean MediaMetadataCompat = new AtomicBoolean();
    private int ParcelableVolumeInfo;
    private int RatingCompat;
    final C6430xb383b2e1<T> read;

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
    }

    public DepositOpenAccountActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, int i) {
        super(debitCardResetOtpActivity);
        this.RatingCompat = i;
        C6430xb383b2e1<T> depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6430xb383b2e1<>(i);
        this.read = depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.f3130x50fd9e4a = depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>(MediaBrowserCompat$ItemReceiver);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr;
        DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[] depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2;
        DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver = new DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver);
        do {
            depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr = (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[]) this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr == write) {
                break;
            }
            int length = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr.length;
            depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2 = new DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[(length + 1)];
            System.arraycopy(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr, 0, depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2, 0, length);
            depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2[length] = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver;
        } while (!this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr, depositOpenAccountActivity$MediaBrowserCompat$ItemReceiverArr2));
        if (this.MediaMetadataCompat.get() || !this.MediaMetadataCompat.compareAndSet(false, true)) {
            MediaBrowserCompat$ItemReceiver(depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver);
        } else {
            this.IconCompatParcelizer.subscribe(this);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver<T> depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver) {
        if (depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.getAndIncrement() == 0) {
            long j = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.write;
            int i = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.read;
            C6430xb383b2e1<T> depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = this.RatingCompat;
            int i3 = 1;
            while (!depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) {
                boolean z = this.MediaDescriptionCompat;
                boolean z2 = this.MediaBrowserCompat$SearchResultReceiver == j;
                if (z && z2) {
                    depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = null;
                    Throwable th = this.MediaBrowserCompat$MediaItem;
                    if (th != null) {
                        bankingAgentTransactionsDeepLinkActivity.onError(th);
                        return;
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                        return;
                    }
                } else if (!z2) {
                    if (i == i2) {
                        depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver.read;
                        i = 0;
                    }
                    bankingAgentTransactionsDeepLinkActivity.onNext(depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver[i]);
                    i++;
                    j++;
                } else {
                    depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.write = j;
                    depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.read = i;
                    depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver;
                    i3 = depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            depositOpenAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    public final void onNext(T t) {
        int i = this.ParcelableVolumeInfo;
        if (i == this.RatingCompat) {
            C6430xb383b2e1<T> depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6430xb383b2e1<>(i);
            depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver[0] = t;
            this.ParcelableVolumeInfo = 1;
            this.f3130x50fd9e4a.read = depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.f3130x50fd9e4a = depositOpenAccountActivity$MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            this.f3130x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver[i] = t;
            this.ParcelableVolumeInfo = i + 1;
        }
        this.MediaBrowserCompat$SearchResultReceiver++;
        for (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2 : (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[]) this.MediaBrowserCompat$CustomActionResultReceiver.get()) {
            MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$MediaItem = th;
        this.MediaDescriptionCompat = true;
        for (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2 : (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[]) this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(write)) {
            MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
        }
    }

    public final void onComplete() {
        this.MediaDescriptionCompat = true;
        for (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2 : (DepositOpenAccountActivity$MediaBrowserCompat$ItemReceiver[]) this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(write)) {
            MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
        }
    }
}
