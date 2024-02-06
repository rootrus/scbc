package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EBillSubscriptionSearchActivity */
public final class EBillSubscriptionSearchActivity<T> extends DebitCardResetOtpActivity<T> {
    final long IconCompatParcelizer;
    final BankingAgentDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    final HmlConsumerGuidelinesBaseDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver;
    private int RatingCompat;
    final TimeUnit read;
    IconCompatParcelizer write;

    public EBillSubscriptionSearchActivity(HmlConsumerGuidelinesBaseDeepLinkActivity<T> hmlConsumerGuidelinesBaseDeepLinkActivity) {
        this(hmlConsumerGuidelinesBaseDeepLinkActivity, TimeUnit.NANOSECONDS);
    }

    private EBillSubscriptionSearchActivity(HmlConsumerGuidelinesBaseDeepLinkActivity<T> hmlConsumerGuidelinesBaseDeepLinkActivity, TimeUnit timeUnit) {
        this.MediaBrowserCompat$ItemReceiver = hmlConsumerGuidelinesBaseDeepLinkActivity;
        this.RatingCompat = 1;
        this.IconCompatParcelizer = 0;
        this.read = timeUnit;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        IconCompatParcelizer iconCompatParcelizer;
        boolean z;
        synchronized (this) {
            iconCompatParcelizer = this.write;
            if (iconCompatParcelizer == null) {
                iconCompatParcelizer = new IconCompatParcelizer(this);
                this.write = iconCompatParcelizer;
            }
            long j = iconCompatParcelizer.read;
            if (j == 0 && iconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.dispose();
            }
            long j2 = j + 1;
            iconCompatParcelizer.read = j2;
            z = true;
            if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver || j2 != ((long) this.RatingCompat)) {
                z = false;
            } else {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = true;
            }
        }
        this.MediaBrowserCompat$ItemReceiver.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, this, iconCompatParcelizer));
        if (z) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer) {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver instanceof EasycashSpeedyLoanTopupIntroductionActivity) {
                if (this.write != null && this.write == iconCompatParcelizer) {
                    this.write = null;
                    if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null) {
                        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.dispose();
                        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = null;
                    }
                }
                long j = iconCompatParcelizer.read - 1;
                iconCompatParcelizer.read = j;
                if (j == 0) {
                    read(iconCompatParcelizer);
                }
            } else if (this.write != null && this.write == iconCompatParcelizer) {
                if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null) {
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.dispose();
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = null;
                }
                long j2 = iconCompatParcelizer.read - 1;
                iconCompatParcelizer.read = j2;
                if (j2 == 0) {
                    this.write = null;
                    read(iconCompatParcelizer);
                }
            }
        }
    }

    private void read(IconCompatParcelizer iconCompatParcelizer) {
        HmlConsumerGuidelinesBaseDeepLinkActivity<T> hmlConsumerGuidelinesBaseDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (hmlConsumerGuidelinesBaseDeepLinkActivity instanceof BulkTransferDeepLinkActivity) {
            ((BulkTransferDeepLinkActivity) hmlConsumerGuidelinesBaseDeepLinkActivity).dispose();
        } else if (hmlConsumerGuidelinesBaseDeepLinkActivity instanceof HmlBusinessOwnerCalculatorDeepLinkActivity) {
            ((HmlBusinessOwnerCalculatorDeepLinkActivity) hmlConsumerGuidelinesBaseDeepLinkActivity).IconCompatParcelizer((BulkTransferDeepLinkActivity) iconCompatParcelizer.get());
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(IconCompatParcelizer iconCompatParcelizer) {
        synchronized (this) {
            if (iconCompatParcelizer.read == 0 && iconCompatParcelizer == this.write) {
                this.write = null;
                BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) iconCompatParcelizer.get();
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer);
                if (this.MediaBrowserCompat$ItemReceiver instanceof BulkTransferDeepLinkActivity) {
                    ((BulkTransferDeepLinkActivity) this.MediaBrowserCompat$ItemReceiver).dispose();
                } else if (this.MediaBrowserCompat$ItemReceiver instanceof HmlBusinessOwnerCalculatorDeepLinkActivity) {
                    if (bulkTransferDeepLinkActivity == null) {
                        iconCompatParcelizer.write = true;
                    } else {
                        ((HmlBusinessOwnerCalculatorDeepLinkActivity) this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer(bulkTransferDeepLinkActivity);
                    }
                }
            }
        }
    }

    /* renamed from: o.EBillSubscriptionSearchActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends AtomicReference<BulkTransferDeepLinkActivity> implements Runnable, DebitCardMarketConductDeepLinkActivity<BulkTransferDeepLinkActivity> {
        private EBillSubscriptionSearchActivity<?> IconCompatParcelizer;
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        long read;
        boolean write;

        public final /* synthetic */ void IconCompatParcelizer(Object obj) throws Exception {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) obj;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
            synchronized (this.IconCompatParcelizer) {
                if (this.write) {
                    ((HmlBusinessOwnerCalculatorDeepLinkActivity) this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer(bulkTransferDeepLinkActivity);
                }
            }
        }

        IconCompatParcelizer(EBillSubscriptionSearchActivity<?> eBillSubscriptionSearchActivity) {
            this.IconCompatParcelizer = eBillSubscriptionSearchActivity;
        }

        public final void run() {
            this.IconCompatParcelizer.write(this);
        }
    }

    /* renamed from: o.EBillSubscriptionSearchActivity$write */
    static final class write<T> extends AtomicBoolean implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private EBillSubscriptionSearchActivity<T> MediaBrowserCompat$ItemReceiver;
        private IconCompatParcelizer read;

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, EBillSubscriptionSearchActivity<T> eBillSubscriptionSearchActivity, IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = eBillSubscriptionSearchActivity;
            this.read = iconCompatParcelizer;
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
        }

        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.read);
                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.read);
                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void dispose() {
            /*
                r6 = this;
                o.BulkTransferDeepLinkActivity r0 = r6.IconCompatParcelizer
                r0.dispose()
                r0 = 0
                r1 = 1
                boolean r0 = r6.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0039
                o.EBillSubscriptionSearchActivity<T> r0 = r6.MediaBrowserCompat$ItemReceiver
                o.EBillSubscriptionSearchActivity$IconCompatParcelizer r1 = r6.read
                monitor-enter(r0)
                o.EBillSubscriptionSearchActivity$IconCompatParcelizer r2 = r0.write     // Catch:{ all -> 0x0036 }
                if (r2 == 0) goto L_0x0034
                o.EBillSubscriptionSearchActivity$IconCompatParcelizer r2 = r0.write     // Catch:{ all -> 0x0036 }
                if (r2 == r1) goto L_0x001b
                goto L_0x0034
            L_0x001b:
                long r2 = r1.read     // Catch:{ all -> 0x0036 }
                r4 = 1
                long r2 = r2 - r4
                r1.read = r2     // Catch:{ all -> 0x0036 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x0032
                boolean r2 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x002d
                goto L_0x0032
            L_0x002d:
                r0.write(r1)     // Catch:{ all -> 0x0036 }
                monitor-exit(r0)
                return
            L_0x0032:
                monitor-exit(r0)
                return
            L_0x0034:
                monitor-exit(r0)
                return
            L_0x0036:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.EBillSubscriptionSearchActivity.write.dispose():void");
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }
    }
}
