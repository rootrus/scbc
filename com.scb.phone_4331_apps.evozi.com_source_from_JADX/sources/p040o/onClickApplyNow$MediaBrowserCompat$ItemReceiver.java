package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onClickApplyNow$MediaBrowserCompat$ItemReceiver */
final class onClickApplyNow$MediaBrowserCompat$ItemReceiver<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    final HmlBusinessETBPersonalInfoActivity IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    final AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
    private volatile boolean MediaBrowserCompat$MediaItem;
    T MediaDescriptionCompat;
    private volatile boolean MediaMetadataCompat;
    private volatile HmlLoanOfferStatusDeepLinkBaseActivity<T> RatingCompat;
    final write<T> read = new write<>(this);
    volatile int write;

    onClickApplyNow$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        if (compareAndSet(0, 1)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            HmlLoanOfferStatusDeepLinkBaseActivity hmlLoanOfferStatusDeepLinkBaseActivity = this.RatingCompat;
            if (hmlLoanOfferStatusDeepLinkBaseActivity == null) {
                hmlLoanOfferStatusDeepLinkBaseActivity = new HmlBaseEmailAboutActivity(DebitCardResetOtpActivity.bufferSize());
                this.RatingCompat = hmlLoanOfferStatusDeepLinkBaseActivity;
            }
            hmlLoanOfferStatusDeepLinkBaseActivity.IconCompatParcelizer(t);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onError(Throwable th) {
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer, th)) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.read);
            if (getAndIncrement() == 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        this.MediaMetadataCompat = true;
        if (getAndIncrement() == 0) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
    }

    public final void dispose() {
        this.MediaBrowserCompat$MediaItem = true;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.read);
        if (getAndIncrement() == 0) {
            this.RatingCompat = null;
            this.MediaDescriptionCompat = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 1;
        while (!this.MediaBrowserCompat$MediaItem) {
            if (this.IconCompatParcelizer.get() != null) {
                this.MediaDescriptionCompat = null;
                this.RatingCompat = null;
                bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.IconCompatParcelizer));
                return;
            }
            int i2 = this.write;
            if (i2 == 1) {
                T t = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = null;
                this.write = 2;
                bankingAgentTransactionsDeepLinkActivity.onNext(t);
                i2 = 2;
            }
            boolean z = this.MediaMetadataCompat;
            HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity = this.RatingCompat;
            T read2 = hmlLoanOfferStatusDeepLinkBaseActivity != null ? hmlLoanOfferStatusDeepLinkBaseActivity.read() : null;
            boolean z2 = read2 == null;
            if (z && z2 && i2 == 2) {
                this.RatingCompat = null;
                bankingAgentTransactionsDeepLinkActivity.onComplete();
                return;
            } else if (z2) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                bankingAgentTransactionsDeepLinkActivity.onNext(read2);
            }
        }
        this.MediaDescriptionCompat = null;
        this.RatingCompat = null;
    }

    /* renamed from: o.onClickApplyNow$MediaBrowserCompat$ItemReceiver$write */
    static final class write<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BaseChangePinWithMaxActivity_ViewBinding<T> {
        private onClickApplyNow$MediaBrowserCompat$ItemReceiver<T> MediaBrowserCompat$CustomActionResultReceiver;

        write(onClickApplyNow$MediaBrowserCompat$ItemReceiver<T> onclickapplynow_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = onclickapplynow_mediabrowsercompat_itemreceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            onClickApplyNow$MediaBrowserCompat$ItemReceiver<T> onclickapplynow_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (onclickapplynow_mediabrowsercompat_itemreceiver.compareAndSet(0, 1)) {
                onclickapplynow_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
                onclickapplynow_mediabrowsercompat_itemreceiver.write = 2;
            } else {
                onclickapplynow_mediabrowsercompat_itemreceiver.MediaDescriptionCompat = t;
                onclickapplynow_mediabrowsercompat_itemreceiver.write = 1;
                if (onclickapplynow_mediabrowsercompat_itemreceiver.getAndIncrement() != 0) {
                    return;
                }
            }
            onclickapplynow_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            onClickApplyNow$MediaBrowserCompat$ItemReceiver<T> onclickapplynow_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(onclickapplynow_mediabrowsercompat_itemreceiver.IconCompatParcelizer, th)) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(onclickapplynow_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
                if (onclickapplynow_mediabrowsercompat_itemreceiver.getAndIncrement() == 0) {
                    onclickapplynow_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            onClickApplyNow$MediaBrowserCompat$ItemReceiver<T> onclickapplynow_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            onclickapplynow_mediabrowsercompat_itemreceiver.write = 2;
            if (onclickapplynow_mediabrowsercompat_itemreceiver.getAndIncrement() == 0) {
                onclickapplynow_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }
}
