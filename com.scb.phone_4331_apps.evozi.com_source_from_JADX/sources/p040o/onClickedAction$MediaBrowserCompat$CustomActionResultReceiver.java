package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onClickedAction$MediaBrowserCompat$CustomActionResultReceiver */
final class onClickedAction$MediaBrowserCompat$CustomActionResultReceiver<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    final boolean IconCompatParcelizer;
    final AtomicReference<HmlBaseEmailAboutActivity<R>> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
    final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$ItemReceiver = new HmlBusinessETBPersonalInfoActivity();
    private DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> MediaBrowserCompat$MediaItem;
    BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private volatile boolean MediaDescriptionCompat;
    final ChequeInquiryDeepLinkActivity RatingCompat = new ChequeInquiryDeepLinkActivity();
    final AtomicInteger read = new AtomicInteger(1);
    final BankingAgentTransactionsDeepLinkActivity<? super R> write;

    onClickedAction$MediaBrowserCompat$CustomActionResultReceiver(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity;
        this.IconCompatParcelizer = z;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
            this.write.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        try {
            BaseChangePinWithMaxActivity baseChangePinWithMaxActivity = (BaseChangePinWithMaxActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(t), "The mapper returned a null MaybeSource");
            this.read.getAndIncrement();
            C10094xcadabfc7 onclickedaction_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver = new C10094xcadabfc7(this);
            if (!this.MediaDescriptionCompat && this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(onclickedaction_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver)) {
                baseChangePinWithMaxActivity.read(onclickedaction_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver);
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
            onError(th);
        }
    }

    public final void onError(Throwable th) {
        this.read.decrementAndGet();
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, th)) {
            if (!this.IconCompatParcelizer) {
                this.RatingCompat.dispose();
            }
            if (getAndIncrement() == 0) {
                IconCompatParcelizer();
                return;
            }
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        this.read.decrementAndGet();
        if (getAndIncrement() == 0) {
            IconCompatParcelizer();
        }
    }

    public final void dispose() {
        this.MediaDescriptionCompat = true;
        this.MediaBrowserCompat$SearchResultReceiver.dispose();
        this.RatingCompat.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaDescriptionCompat;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.write;
        AtomicInteger atomicInteger = this.read;
        AtomicReference<HmlBaseEmailAboutActivity<R>> atomicReference = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 1;
        while (!this.MediaDescriptionCompat) {
            if (this.IconCompatParcelizer || ((Throwable) this.MediaBrowserCompat$ItemReceiver.get()) == null) {
                boolean z = false;
                boolean z2 = atomicInteger.get() == 0;
                HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity = atomicReference.get();
                Object read2 = hmlBaseEmailAboutActivity != null ? hmlBaseEmailAboutActivity.read() : null;
                if (read2 == null) {
                    z = true;
                }
                if (z2 && z) {
                    Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$ItemReceiver);
                    if (read3 != null) {
                        bankingAgentTransactionsDeepLinkActivity.onError(read3);
                        return;
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                        return;
                    }
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onNext(read2);
                }
            } else {
                Throwable read4 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$ItemReceiver);
                HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
                if (hmlBaseEmailAboutActivity2 != null) {
                    hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                }
                bankingAgentTransactionsDeepLinkActivity.onError(read4);
                return;
            }
        }
        HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity3 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (hmlBaseEmailAboutActivity3 != null) {
            hmlBaseEmailAboutActivity3.MediaBrowserCompat$ItemReceiver();
        }
    }
}
