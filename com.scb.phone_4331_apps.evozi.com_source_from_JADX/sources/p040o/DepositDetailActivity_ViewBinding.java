package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DepositDetailActivity_ViewBinding */
public final class DepositDetailActivity_ViewBinding<T, U extends Collection<? super T>, B> extends NtbUserInfoActivity<T, U> {
    private DebitCardResetPinSuccessActivity_ViewBinding<B> MediaBrowserCompat$CustomActionResultReceiver;
    private Callable<U> MediaBrowserCompat$ItemReceiver;

    public DepositDetailActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding2, Callable<U> callable) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaBrowserCompat$ItemReceiver = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new write(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.DepositDetailActivity_ViewBinding$write */
    static final class write<T, U extends Collection<? super T>, B> extends OprRenewDeepLinkActivity<T, U, U> implements BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
        private Callable<U> MediaBrowserCompat$SearchResultReceiver;
        private U MediaDescriptionCompat;
        private BulkTransferDeepLinkActivity MediaSessionCompat$ResultReceiverWrapper;
        private DebitCardResetPinSuccessActivity_ViewBinding<B> RatingCompat;

        public final /* synthetic */ void write(BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity, Object obj) {
            this.MediaBrowserCompat$ItemReceiver.onNext((Collection) obj);
        }

        write(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, Callable<U> callable, DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding) {
            super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
            this.MediaBrowserCompat$SearchResultReceiver = callable;
            this.RatingCompat = debitCardResetPinSuccessActivity_ViewBinding;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$ResultReceiverWrapper, bulkTransferDeepLinkActivity)) {
                this.MediaSessionCompat$ResultReceiverWrapper = bulkTransferDeepLinkActivity;
                try {
                    this.MediaDescriptionCompat = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
                    IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
                    this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
                    this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                    if (!this.read) {
                        this.RatingCompat.subscribe(iconCompatParcelizer);
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.read = true;
                    bulkTransferDeepLinkActivity.dispose();
                    HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$ItemReceiver);
                }
            }
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.MediaDescriptionCompat;
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
                U r0 = r3.MediaDescriptionCompat     // Catch:{ all -> 0x0028 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)
                return
            L_0x0007:
                r1 = 0
                r3.MediaDescriptionCompat = r1     // Catch:{ all -> 0x0028 }
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
            throw new UnsupportedOperationException("Method not decompiled: p040o.DepositDetailActivity_ViewBinding.write.onComplete():void");
        }

        public final void dispose() {
            if (!this.read) {
                boolean z = true;
                this.read = true;
                this.MediaBrowserCompat$MediaItem.dispose();
                this.MediaSessionCompat$ResultReceiverWrapper.dispose();
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
        public final void IconCompatParcelizer() {
            try {
                U u = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.MediaDescriptionCompat;
                    if (u2 != null) {
                        this.MediaDescriptionCompat = u;
                        write(u2, (BulkTransferDeepLinkActivity) this);
                    }
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                dispose();
                this.MediaBrowserCompat$ItemReceiver.onError(th);
            }
        }
    }

    /* renamed from: o.DepositDetailActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U extends Collection<? super T>, B> extends HmlETBBusinessInformationActivity<B> {
        private write<T, U, B> MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(write<T, U, B> write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write;
        }

        public final void onNext(B b) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }
}
