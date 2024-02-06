package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCreditPowerInputActivity_ViewBinding */
public final class EasycashCreditPowerInputActivity_ViewBinding<T, R> extends NtbUserInfoActivity<T, R> {
    private boolean MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> write;

    public EasycashCreditPowerInputActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.EasycashCreditPowerInputActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final AtomicInteger IconCompatParcelizer = new AtomicInteger(1);
        final BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$CustomActionResultReceiver;
        final AtomicReference<HmlBaseEmailAboutActivity<R>> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
        BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
        final ChequeInquiryDeepLinkActivity MediaBrowserCompat$SearchResultReceiver = new ChequeInquiryDeepLinkActivity();
        private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> MediaDescriptionCompat;
        private volatile boolean MediaMetadataCompat;
        final boolean read;
        final HmlBusinessETBPersonalInfoActivity write = new HmlBusinessETBPersonalInfoActivity();

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaDescriptionCompat = directDebitDeepLinkActivity;
            this.read = z;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$MediaItem = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            try {
                BillerDeepLinkActivity billerDeepLinkActivity = (BillerDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaDescriptionCompat.write(t), "The mapper returned a null SingleSource");
                this.IconCompatParcelizer.getAndIncrement();
                C9719xd5603cd0 easycashCreditPowerInputActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver = new C9719xd5603cd0(this);
                if (!this.MediaMetadataCompat && this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(easycashCreditPowerInputActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver)) {
                    billerDeepLinkActivity.IconCompatParcelizer(easycashCreditPowerInputActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.MediaBrowserCompat$MediaItem.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.decrementAndGet();
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.write, th)) {
                if (!this.read) {
                    this.MediaBrowserCompat$SearchResultReceiver.dispose();
                }
                if (getAndIncrement() == 0) {
                    MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer.decrementAndGet();
            if (getAndIncrement() == 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void dispose() {
            this.MediaMetadataCompat = true;
            this.MediaBrowserCompat$MediaItem.dispose();
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaMetadataCompat;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            AtomicInteger atomicInteger = this.IconCompatParcelizer;
            AtomicReference<HmlBaseEmailAboutActivity<R>> atomicReference = this.MediaBrowserCompat$ItemReceiver;
            int i = 1;
            while (!this.MediaMetadataCompat) {
                if (this.read || ((Throwable) this.write.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity = atomicReference.get();
                    Object read2 = hmlBaseEmailAboutActivity != null ? hmlBaseEmailAboutActivity.read() : null;
                    if (read2 == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.write);
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
                    Throwable read4 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.write);
                    HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity2 = this.MediaBrowserCompat$ItemReceiver.get();
                    if (hmlBaseEmailAboutActivity2 != null) {
                        hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                    }
                    bankingAgentTransactionsDeepLinkActivity.onError(read4);
                    return;
                }
            }
            HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity3 = this.MediaBrowserCompat$ItemReceiver.get();
            if (hmlBaseEmailAboutActivity3 != null) {
                hmlBaseEmailAboutActivity3.MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}
