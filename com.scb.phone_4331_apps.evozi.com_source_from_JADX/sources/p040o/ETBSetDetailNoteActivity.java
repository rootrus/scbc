package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ETBSetDetailNoteActivity */
public final class ETBSetDetailNoteActivity<T, R> extends NtbUserInfoActivity<T, R> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> read;
    private boolean write;

    public ETBSetDetailNoteActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        if (!onBtnSendEmailVerificationClicked.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, bankingAgentTransactionsDeepLinkActivity, this.read)) {
            this.IconCompatParcelizer.subscribe(new ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.write));
        }
    }

    /* renamed from: o.ETBSetDetailNoteActivity$write */
    static final class write<T, R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<R> {
        private long IconCompatParcelizer;
        volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        private int MediaBrowserCompat$ItemReceiver;
        private ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver<T, R> read;
        volatile HmlSuccessfulDeepLinkActivity<R> write;

        write(ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver<T, R> eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver, long j, int i) {
            this.read = eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = j;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
                if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                    HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                    int write2 = hmlLoanOfferStatusDeepLinkActivity.write(7);
                    if (write2 == 1) {
                        this.write = hmlLoanOfferStatusDeepLinkActivity;
                        this.MediaBrowserCompat$CustomActionResultReceiver = true;
                        this.read.MediaBrowserCompat$CustomActionResultReceiver();
                        return;
                    } else if (write2 == 2) {
                        this.write = hmlLoanOfferStatusDeepLinkActivity;
                        return;
                    }
                }
                this.write = new HmlBaseEmailAboutActivity(this.MediaBrowserCompat$ItemReceiver);
            }
        }

        public final void onNext(R r) {
            if (this.IconCompatParcelizer == this.read.MediaBrowserCompat$CustomActionResultReceiver) {
                if (r != null) {
                    this.write.IconCompatParcelizer(r);
                }
                this.read.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void onError(Throwable th) {
            ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver<T, R> eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver = this.read;
            if (this.IconCompatParcelizer != eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver || !HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, th)) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            if (!eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.read) {
                eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.write.dispose();
                eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = true;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            eTBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onComplete() {
            if (this.IconCompatParcelizer == this.read.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                this.read.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }
}
