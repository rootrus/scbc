package p040o;

import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.EasycashMortgageIntroductionActivity */
public final class EasycashMortgageIntroductionActivity<T> extends NtbUserInfoActivity<T, T> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentDeepLinkActivity read;
    private boolean write;

    public EasycashMortgageIntroductionActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = bankingAgentDeepLinkActivity;
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.read;
        if (bankingAgentDeepLinkActivity instanceof setVwModelConsentSeparator) {
            this.IconCompatParcelizer.subscribe(bankingAgentTransactionsDeepLinkActivity);
            return;
        }
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, bankingAgentDeepLinkActivity.write(), this.write, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.EasycashMortgageIntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends LifestyleDeepLinkActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T>, Runnable {
        private int IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        private int MediaBrowserCompat$MediaItem;
        private HmlSuccessfulDeepLinkActivity<T> MediaBrowserCompat$SearchResultReceiver;
        private boolean MediaDescriptionCompat;
        private BulkTransferDeepLinkActivity MediaMetadataCompat;
        private BankingAgentDeepLinkActivity.read MediaSessionCompat$QueueItem;
        private Throwable RatingCompat;
        private volatile boolean read;
        private boolean write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, BankingAgentDeepLinkActivity.read read2, boolean z, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaSessionCompat$QueueItem = read2;
            this.write = z;
            this.IconCompatParcelizer = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaMetadataCompat, bulkTransferDeepLinkActivity)) {
                this.MediaMetadataCompat = bulkTransferDeepLinkActivity;
                if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                    HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                    int write2 = hmlLoanOfferStatusDeepLinkActivity.write(7);
                    if (write2 == 1) {
                        this.MediaBrowserCompat$MediaItem = write2;
                        this.MediaBrowserCompat$SearchResultReceiver = hmlLoanOfferStatusDeepLinkActivity;
                        this.MediaBrowserCompat$ItemReceiver = true;
                        this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.MediaSessionCompat$QueueItem.IconCompatParcelizer(this);
                            return;
                        }
                        return;
                    } else if (write2 == 2) {
                        this.MediaBrowserCompat$MediaItem = write2;
                        this.MediaBrowserCompat$SearchResultReceiver = hmlLoanOfferStatusDeepLinkActivity;
                        this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
                        return;
                    }
                }
                this.MediaBrowserCompat$SearchResultReceiver = new HmlBaseEmailAboutActivity(this.IconCompatParcelizer);
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                if (this.MediaBrowserCompat$MediaItem != 2) {
                    this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(t);
                }
                if (getAndIncrement() == 0) {
                    this.MediaSessionCompat$QueueItem.IconCompatParcelizer(this);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.RatingCompat = th;
            this.MediaBrowserCompat$ItemReceiver = true;
            if (getAndIncrement() == 0) {
                this.MediaSessionCompat$QueueItem.IconCompatParcelizer(this);
            }
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                if (getAndIncrement() == 0) {
                    this.MediaSessionCompat$QueueItem.IconCompatParcelizer(this);
                }
            }
        }

        public final void dispose() {
            if (!this.read) {
                this.read = true;
                this.MediaMetadataCompat.dispose();
                this.MediaSessionCompat$QueueItem.dispose();
                if (getAndIncrement() == 0) {
                    this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.read;
        }

        public final void run() {
            if (this.MediaDescriptionCompat) {
                int i = 1;
                while (!this.read) {
                    boolean z = this.MediaBrowserCompat$ItemReceiver;
                    Throwable th = this.RatingCompat;
                    if (this.write || !z || th == null) {
                        this.MediaBrowserCompat$CustomActionResultReceiver.onNext(null);
                        if (z) {
                            this.read = true;
                            Throwable th2 = this.RatingCompat;
                            if (th2 != null) {
                                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th2);
                            } else {
                                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                            }
                            this.MediaSessionCompat$QueueItem.dispose();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.read = true;
                        this.MediaBrowserCompat$CustomActionResultReceiver.onError(this.RatingCompat);
                        this.MediaSessionCompat$QueueItem.dispose();
                        return;
                    }
                }
                return;
            }
            HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = 1;
            while (!read(this.MediaBrowserCompat$ItemReceiver, hmlSuccessfulDeepLinkActivity.write(), bankingAgentTransactionsDeepLinkActivity)) {
                while (true) {
                    boolean z2 = this.MediaBrowserCompat$ItemReceiver;
                    try {
                        T read2 = hmlSuccessfulDeepLinkActivity.read();
                        boolean z3 = read2 == null;
                        if (read(z2, z3, bankingAgentTransactionsDeepLinkActivity)) {
                            return;
                        }
                        if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            bankingAgentTransactionsDeepLinkActivity.onNext(read2);
                        }
                    } catch (Throwable th3) {
                        AlertController$RecycleListView.read.write(th3);
                        this.read = true;
                        this.MediaMetadataCompat.dispose();
                        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                        bankingAgentTransactionsDeepLinkActivity.onError(th3);
                        this.MediaSessionCompat$QueueItem.dispose();
                        return;
                    }
                }
            }
        }

        private boolean read(boolean z, boolean z2, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            if (this.read) {
                this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.RatingCompat;
                if (this.write) {
                    if (!z2) {
                        return false;
                    }
                    this.read = true;
                    if (th != null) {
                        bankingAgentTransactionsDeepLinkActivity.onError(th);
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                    }
                    this.MediaSessionCompat$QueueItem.dispose();
                    return true;
                } else if (th != null) {
                    this.read = true;
                    this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
                    bankingAgentTransactionsDeepLinkActivity.onError(th);
                    this.MediaSessionCompat$QueueItem.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.read = true;
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                    this.MediaSessionCompat$QueueItem.dispose();
                    return true;
                }
            }
        }

        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.MediaDescriptionCompat = true;
            return 2;
        }

        public final T read() throws Exception {
            return this.MediaBrowserCompat$SearchResultReceiver.read();
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
        }

        public final boolean write() {
            return this.MediaBrowserCompat$SearchResultReceiver.write();
        }
    }
}
