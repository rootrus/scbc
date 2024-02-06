package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.FastPayTransferReviewActivity */
public final class FastPayTransferReviewActivity<T, B, V> extends NtbUserInfoActivity<T, DebitCardResetOtpActivity<T>> {
    private DirectDebitDeepLinkActivity<? super B, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<B> MediaBrowserCompat$ItemReceiver;
    private int read;

    public FastPayTransferReviewActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding2, DirectDebitDeepLinkActivity<? super B, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        this.read = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.read));
    }

    /* renamed from: o.FastPayTransferReviewActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, B> {
        final HmlETBLoanSetupActivity<T> IconCompatParcelizer;
        final B MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity, B b) {
            this.IconCompatParcelizer = hmlETBLoanSetupActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = b;
        }
    }

    /* renamed from: o.FastPayTransferReviewActivity$read */
    static final class read<T, V> extends HmlETBBusinessInformationActivity<V> {
        final HmlETBLoanSetupActivity<T> IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, ?, V> read;

        read(FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, ?, V> fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver, HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity) {
            this.read = fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = hmlETBLoanSetupActivity;
        }

        public final void onNext(V v) {
            dispose();
            onComplete();
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, ?, V> fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver = this.read;
            fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.dispose();
            fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.RatingCompat.dispose();
            fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.onError(th);
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                boolean z = true;
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, ?, V> fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver = this.read;
                fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.RatingCompat.read(this);
                fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(new IconCompatParcelizer(this.IconCompatParcelizer, null));
                if (fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.getAndIncrement() != 0) {
                    z = false;
                }
                if (z) {
                    fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                }
            }
        }
    }
}
