package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCarInformationActivity_ViewBinding */
public final class EasycashCarInformationActivity_ViewBinding<T, U> extends NtbUserInfoActivity<T, U> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int read;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> write;

    public EasycashCarInformationActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, boolean z, int i, int i2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = i2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        if (!onBtnSendEmailVerificationClicked.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, bankingAgentTransactionsDeepLinkActivity, this.write)) {
            this.IconCompatParcelizer.subscribe(new C6445x417c8af9(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read));
        }
    }

    /* renamed from: o.EasycashCarInformationActivity_ViewBinding$write */
    static final class write<T, U> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<U> {
        volatile boolean IconCompatParcelizer;
        private C6445x417c8af9<T, U> MediaBrowserCompat$CustomActionResultReceiver;
        final long MediaBrowserCompat$ItemReceiver;
        volatile HmlSuccessfulDeepLinkActivity<U> read;
        private int write;

        write(C6445x417c8af9<T, U> easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver, long j) {
            this.MediaBrowserCompat$ItemReceiver = j;
            this.MediaBrowserCompat$CustomActionResultReceiver = easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity) && (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity)) {
                HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                int write2 = hmlLoanOfferStatusDeepLinkActivity.write(7);
                if (write2 == 1) {
                    this.write = write2;
                    this.read = hmlLoanOfferStatusDeepLinkActivity;
                    this.IconCompatParcelizer = true;
                    C6445x417c8af9<T, U> easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.getAndIncrement() == 0) {
                        easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                    }
                } else if (write2 == 2) {
                    this.write = write2;
                    this.read = hmlLoanOfferStatusDeepLinkActivity;
                }
            }
        }

        public final void onNext(U u) {
            if (this.write == 0) {
                C6445x417c8af9<T, U> easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.get() != 0 || !easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.compareAndSet(0, 1)) {
                    HmlSuccessfulDeepLinkActivity hmlSuccessfulDeepLinkActivity = this.read;
                    if (hmlSuccessfulDeepLinkActivity == null) {
                        hmlSuccessfulDeepLinkActivity = new HmlBaseEmailAboutActivity(easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                        this.read = hmlSuccessfulDeepLinkActivity;
                    }
                    hmlSuccessfulDeepLinkActivity.IconCompatParcelizer(u);
                    if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write.onNext(u);
                    if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.decrementAndGet() == 0) {
                        return;
                    }
                }
                easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                return;
            }
            C6445x417c8af9<T, U> easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2.getAndIncrement() == 0) {
                easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void onError(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                }
                this.IconCompatParcelizer = true;
                C6445x417c8af9<T, U> easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.getAndIncrement() == 0) {
                    easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer = true;
            C6445x417c8af9<T, U> easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.getAndIncrement() == 0) {
                easycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}
