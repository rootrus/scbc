package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DepositDetailActivity */
public final class DepositDetailActivity<T, U extends Collection<? super T>, B> extends NtbUserInfoActivity<T, U> {
    private Callable<U> MediaBrowserCompat$CustomActionResultReceiver;
    private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> MediaBrowserCompat$ItemReceiver;

    public DepositDetailActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable, Callable<U> callable2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = callable;
        this.MediaBrowserCompat$CustomActionResultReceiver = callable2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.DepositDetailActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U extends Collection<? super T>, B> extends OprRenewDeepLinkActivity<T, U, U> implements BulkTransferDeepLinkActivity {
        private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> MediaBrowserCompat$MediaItem;
        private Callable<U> MediaBrowserCompat$SearchResultReceiver;
        private AtomicReference<BulkTransferDeepLinkActivity> MediaDescriptionCompat = new AtomicReference<>();
        private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
        private U RatingCompat;

        public final /* synthetic */ void write(BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity, Object obj) {
            this.MediaBrowserCompat$ItemReceiver.onNext((Collection) obj);
        }

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, Callable<U> callable, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable2) {
            super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
            this.MediaBrowserCompat$SearchResultReceiver = callable;
            this.MediaBrowserCompat$MediaItem = callable2;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$Token, bulkTransferDeepLinkActivity)) {
                this.MediaSessionCompat$Token = bulkTransferDeepLinkActivity;
                BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
                try {
                    this.RatingCompat = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
                    try {
                        DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.call(), "The boundary ObservableSource supplied is null");
                        C9710xb27020ab depositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9710xb27020ab(this);
                        this.MediaDescriptionCompat.set(depositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver);
                        bankingAgentTransactionsDeepLinkActivity.onSubscribe(this);
                        if (!this.read) {
                            debitCardResetPinSuccessActivity_ViewBinding.subscribe(depositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.read = true;
                        bulkTransferDeepLinkActivity.dispose();
                        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                    }
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    this.read = true;
                    bulkTransferDeepLinkActivity.dispose();
                    HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th2, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                }
            }
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.RatingCompat;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public final void onError(Throwable th) {
            dispose();
            this.MediaBrowserCompat$ItemReceiver.onError(th);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
            r3.write.IconCompatParcelizer(r0);
            r0 = true;
            r3.MediaBrowserCompat$CustomActionResultReceiver = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
            if (r3.MediaMetadataCompat.getAndIncrement() != 0) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            if (r0 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            p040o.AlertController$RecycleListView.write(r3.write, r3.MediaBrowserCompat$ItemReceiver, false, (p040o.BulkTransferDeepLinkActivity) r3, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U r0 = r3.RatingCompat     // Catch:{ all -> 0x0028 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)
                return
            L_0x0007:
                r1 = 0
                r3.RatingCompat = r1     // Catch:{ all -> 0x0028 }
                monitor-exit(r3)
                o.HmlLoanOfferStatusDeepLinkBaseActivity<U> r1 = r3.write
                r1.IconCompatParcelizer(r0)
                r0 = 1
                r3.MediaBrowserCompat$CustomActionResultReceiver = r0
                java.util.concurrent.atomic.AtomicInteger r1 = r3.MediaMetadataCompat
                int r1 = r1.getAndIncrement()
                r2 = 0
                if (r1 != 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r0 = r2
            L_0x001e:
                if (r0 == 0) goto L_0x0027
                o.HmlLoanOfferStatusDeepLinkBaseActivity<U> r0 = r3.write
                o.BankingAgentTransactionsDeepLinkActivity<? super V> r1 = r3.MediaBrowserCompat$ItemReceiver
                p040o.AlertController$RecycleListView.write(r0, r1, (boolean) r2, (p040o.BulkTransferDeepLinkActivity) r3, r3)
            L_0x0027:
                return
            L_0x0028:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DepositDetailActivity.IconCompatParcelizer.onComplete():void");
        }

        public final void dispose() {
            if (!this.read) {
                boolean z = true;
                this.read = true;
                this.MediaSessionCompat$Token.dispose();
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
                if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                    z = false;
                }
                if (z) {
                    this.write.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.read;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver() {
            try {
                U u = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
                try {
                    DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.call(), "The boundary ObservableSource supplied is null");
                    C9710xb27020ab depositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9710xb27020ab(this);
                    if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, depositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver)) {
                        synchronized (this) {
                            U u2 = this.RatingCompat;
                            if (u2 != null) {
                                this.RatingCompat = u;
                                debitCardResetPinSuccessActivity_ViewBinding.subscribe(depositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver);
                                write(u2, (BulkTransferDeepLinkActivity) this);
                            }
                        }
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.read = true;
                    this.MediaSessionCompat$Token.dispose();
                    this.MediaBrowserCompat$ItemReceiver.onError(th);
                }
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                dispose();
                this.MediaBrowserCompat$ItemReceiver.onError(th2);
            }
        }
    }
}
