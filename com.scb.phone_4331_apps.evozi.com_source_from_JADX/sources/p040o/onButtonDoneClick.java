package p040o;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onButtonDoneClick */
public final class onButtonDoneClick<T, U> extends NtbUserInfoActivity<T, U> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> read;
    private HmlBusinessOccupationInfoActivity write;

    public onButtonDoneClick(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, int i, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = directDebitDeepLinkActivity;
        this.write = hmlBusinessOccupationInfoActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = Math.max(8, i);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        if (!onBtnSendEmailVerificationClicked.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, bankingAgentTransactionsDeepLinkActivity, this.read)) {
            if (this.write == HmlBusinessOccupationInfoActivity.IMMEDIATE) {
                this.IconCompatParcelizer.subscribe(new onButtonDoneClick$MediaBrowserCompat$CustomActionResultReceiver(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
            } else {
                this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.write == HmlBusinessOccupationInfoActivity.END));
            }
        }
    }

    /* renamed from: o.onButtonDoneClick$read */
    static final class read<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        BulkTransferDeepLinkActivity IconCompatParcelizer;
        final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
        private int MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaBrowserCompat$MediaItem;
        private volatile boolean MediaBrowserCompat$SearchResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaDescriptionCompat;
        private C10789read<R> MediaMetadataCompat;
        private int MediaSessionCompat$Token;
        private HmlSuccessfulDeepLinkActivity<T> ParcelableVolumeInfo;
        private volatile boolean RatingCompat;
        volatile boolean read;
        final boolean write;

        read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, boolean z) {
            this.MediaDescriptionCompat = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.write = z;
            this.MediaMetadataCompat = new C10789read<>(bankingAgentTransactionsDeepLinkActivity, this);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                    HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                    int write2 = hmlLoanOfferStatusDeepLinkActivity.write(3);
                    if (write2 == 1) {
                        this.MediaSessionCompat$Token = write2;
                        this.ParcelableVolumeInfo = hmlLoanOfferStatusDeepLinkActivity;
                        this.RatingCompat = true;
                        this.MediaDescriptionCompat.onSubscribe(this);
                        write();
                        return;
                    } else if (write2 == 2) {
                        this.MediaSessionCompat$Token = write2;
                        this.ParcelableVolumeInfo = hmlLoanOfferStatusDeepLinkActivity;
                        this.MediaDescriptionCompat.onSubscribe(this);
                        return;
                    }
                }
                this.ParcelableVolumeInfo = new HmlBaseEmailAboutActivity(this.MediaBrowserCompat$ItemReceiver);
                this.MediaDescriptionCompat.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.MediaSessionCompat$Token == 0) {
                this.ParcelableVolumeInfo.IconCompatParcelizer(t);
            }
            write();
        }

        public final void onError(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                this.RatingCompat = true;
                write();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.RatingCompat = true;
            write();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        public final void dispose() {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            this.IconCompatParcelizer.dispose();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaMetadataCompat);
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            if (getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaDescriptionCompat;
                HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.ParcelableVolumeInfo;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                while (true) {
                    if (!this.read) {
                        if (this.MediaBrowserCompat$SearchResultReceiver) {
                            hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                            return;
                        } else if (this.write || ((Throwable) hmlBusinessETBPersonalInfoActivity.get()) == null) {
                            boolean z = this.RatingCompat;
                            try {
                                T read2 = hmlSuccessfulDeepLinkActivity.read();
                                boolean z2 = read2 == null;
                                if (z && z2) {
                                    this.MediaBrowserCompat$SearchResultReceiver = true;
                                    Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                                    if (read3 != null) {
                                        bankingAgentTransactionsDeepLinkActivity.onError(read3);
                                        return;
                                    } else {
                                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(read2), "The mapper returned a null ObservableSource");
                                        if (debitCardResetPinSuccessActivity_ViewBinding instanceof Callable) {
                                            try {
                                                Object call = ((Callable) debitCardResetPinSuccessActivity_ViewBinding).call();
                                                if (call != null && !this.MediaBrowserCompat$SearchResultReceiver) {
                                                    bankingAgentTransactionsDeepLinkActivity.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                AlertController$RecycleListView.read.write(th);
                                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th);
                                            }
                                        } else {
                                            this.read = true;
                                            debitCardResetPinSuccessActivity_ViewBinding.subscribe(this.MediaMetadataCompat);
                                        }
                                    } catch (Throwable th2) {
                                        AlertController$RecycleListView.read.write(th2);
                                        this.MediaBrowserCompat$SearchResultReceiver = true;
                                        this.IconCompatParcelizer.dispose();
                                        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                                        HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th2);
                                        bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                AlertController$RecycleListView.read.write(th3);
                                this.MediaBrowserCompat$SearchResultReceiver = true;
                                this.IconCompatParcelizer.dispose();
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th3);
                                bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                                return;
                            }
                        } else {
                            hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                            this.MediaBrowserCompat$SearchResultReceiver = true;
                            bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: o.onButtonDoneClick$read$read  reason: collision with other inner class name */
        static final class C10789read<R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<R> {
            private read<?, R> IconCompatParcelizer;
            private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$ItemReceiver;

            C10789read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, read<?, R> read) {
                this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
                this.IconCompatParcelizer = read;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
            }

            public final void onNext(R r) {
                this.MediaBrowserCompat$ItemReceiver.onNext(r);
            }

            public final void onError(Throwable th) {
                read<?, R> read = this.IconCompatParcelizer;
                if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(read.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                    if (!read.write) {
                        read.IconCompatParcelizer.dispose();
                    }
                    read.read = false;
                    read.write();
                    return;
                }
                AlertController$RecycleListView.read.read(th);
            }

            public final void onComplete() {
                read<?, R> read = this.IconCompatParcelizer;
                read.read = false;
                read.write();
            }
        }
    }
}
