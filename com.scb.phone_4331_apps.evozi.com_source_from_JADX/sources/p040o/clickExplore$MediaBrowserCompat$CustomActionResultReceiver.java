package p040o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.clickExplore;

/* renamed from: o.clickExplore$MediaBrowserCompat$CustomActionResultReceiver */
final class clickExplore$MediaBrowserCompat$CustomActionResultReceiver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    volatile boolean IconCompatParcelizer;
    long MediaBrowserCompat$CustomActionResultReceiver;
    Map<Long, C> MediaBrowserCompat$ItemReceiver = new LinkedHashMap();
    private volatile boolean MediaBrowserCompat$MediaItem;
    final AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$SearchResultReceiver = new AtomicReference<>();
    private BankingAgentTransactionsDeepLinkActivity<? super C> MediaDescriptionCompat;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends Open> MediaMetadataCompat;
    private HmlBaseEmailAboutActivity<C> MediaSessionCompat$ResultReceiverWrapper = new HmlBaseEmailAboutActivity<>(DebitCardResetOtpActivity.bufferSize());
    private HmlBusinessETBPersonalInfoActivity ParcelableVolumeInfo = new HmlBusinessETBPersonalInfoActivity();
    final ChequeInquiryDeepLinkActivity RatingCompat = new ChequeInquiryDeepLinkActivity();
    final DirectDebitDeepLinkActivity<? super Open, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends Close>> read;
    final Callable<C> write;

    clickExplore$MediaBrowserCompat$CustomActionResultReceiver(BankingAgentTransactionsDeepLinkActivity<? super C> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends Open> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super Open, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends Close>> directDebitDeepLinkActivity, Callable<C> callable) {
        this.MediaDescriptionCompat = bankingAgentTransactionsDeepLinkActivity;
        this.write = callable;
        this.MediaMetadataCompat = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = directDebitDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
            write write2 = new write(this);
            this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(write2);
            this.MediaMetadataCompat.subscribe(write2);
        }
    }

    public final void onNext(T t) {
        synchronized (this) {
            Map<Long, C> map = this.MediaBrowserCompat$ItemReceiver;
            if (map != null) {
                for (C add : map.values()) {
                    add.add(t);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.ParcelableVolumeInfo, th)) {
            this.RatingCompat.dispose();
            synchronized (this) {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
            this.IconCompatParcelizer = true;
            MediaBrowserCompat$ItemReceiver();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        this.RatingCompat.dispose();
        synchronized (this) {
            Map<Long, C> map = this.MediaBrowserCompat$ItemReceiver;
            if (map != null) {
                for (C IconCompatParcelizer2 : map.values()) {
                    this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(IconCompatParcelizer2);
                }
                this.MediaBrowserCompat$ItemReceiver = null;
                this.IconCompatParcelizer = true;
                MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final void dispose() {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$SearchResultReceiver)) {
            this.MediaBrowserCompat$MediaItem = true;
            this.RatingCompat.dispose();
            synchronized (this) {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
            if (getAndIncrement() != 0) {
                this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver.get());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r4 == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r3.IconCompatParcelizer = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(p040o.clickExplore.read<T, C> r4, long r5) {
        /*
            r3 = this;
            o.ChequeInquiryDeepLinkActivity r0 = r3.RatingCompat
            r0.read(r4)
            o.ChequeInquiryDeepLinkActivity r4 = r3.RatingCompat
            int r4 = r4.IconCompatParcelizer()
            r0 = 1
            if (r4 != 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicReference<o.BulkTransferDeepLinkActivity> r4 = r3.MediaBrowserCompat$SearchResultReceiver
            p040o.HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(r4)
            r4 = r0
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            monitor-enter(r3)
            java.util.Map<java.lang.Long, C> r1 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r3)
            return
        L_0x001d:
            o.HmlBaseEmailAboutActivity<C> r1 = r3.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x0035 }
            java.util.Map<java.lang.Long, C> r2 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0035 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0035 }
            java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0035 }
            r1.IconCompatParcelizer(r5)     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0031
            r3.IconCompatParcelizer = r0
        L_0x0031:
            r3.MediaBrowserCompat$ItemReceiver()
            return
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.clickExplore$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(o.clickExplore$read, long):void");
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        if (getAndIncrement() == 0) {
            BankingAgentTransactionsDeepLinkActivity<? super C> bankingAgentTransactionsDeepLinkActivity = this.MediaDescriptionCompat;
            HmlBaseEmailAboutActivity<C> hmlBaseEmailAboutActivity = this.MediaSessionCompat$ResultReceiverWrapper;
            int i = 1;
            while (!this.MediaBrowserCompat$MediaItem) {
                boolean z = this.IconCompatParcelizer;
                if (!z || this.ParcelableVolumeInfo.get() == null) {
                    Collection collection = (Collection) hmlBaseEmailAboutActivity.read();
                    boolean z2 = collection == null;
                    if (z && z2) {
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onNext(collection);
                    }
                } else {
                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.ParcelableVolumeInfo));
                    return;
                }
            }
            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.clickExplore$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<Open> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Open>, BulkTransferDeepLinkActivity {
        private clickExplore$MediaBrowserCompat$CustomActionResultReceiver<?, ?, Open, ?> IconCompatParcelizer;

        write(clickExplore$MediaBrowserCompat$CustomActionResultReceiver<?, ?, Open, ?> clickexplore_mediabrowsercompat_customactionresultreceiver) {
            this.IconCompatParcelizer = clickexplore_mediabrowsercompat_customactionresultreceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(Open open) {
            clickExplore$MediaBrowserCompat$CustomActionResultReceiver<?, ?, Open, ?> clickexplore_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
            try {
                Collection collection = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(clickexplore_mediabrowsercompat_customactionresultreceiver.write.call(), "The bufferSupplier returned a null Collection");
                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(clickexplore_mediabrowsercompat_customactionresultreceiver.read.write(open), "The bufferClose returned a null ObservableSource");
                long j = clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = 1 + j;
                synchronized (clickexplore_mediabrowsercompat_customactionresultreceiver) {
                    Map<Long, C> map = clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
                    if (map != null) {
                        map.put(Long.valueOf(j), collection);
                        clickExplore.read read = new clickExplore.read(clickexplore_mediabrowsercompat_customactionresultreceiver, j);
                        clickexplore_mediabrowsercompat_customactionresultreceiver.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(read);
                        debitCardResetPinSuccessActivity_ViewBinding.subscribe(read);
                    }
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver);
                clickexplore_mediabrowsercompat_customactionresultreceiver.onError(th);
            }
        }

        public final void onError(Throwable th) {
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            clickExplore$MediaBrowserCompat$CustomActionResultReceiver<?, ?, Open, ?> clickexplore_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver);
            clickexplore_mediabrowsercompat_customactionresultreceiver.RatingCompat.read(this);
            clickexplore_mediabrowsercompat_customactionresultreceiver.onError(th);
        }

        public final void onComplete() {
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            clickExplore$MediaBrowserCompat$CustomActionResultReceiver<?, ?, Open, ?> clickexplore_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
            clickexplore_mediabrowsercompat_customactionresultreceiver.RatingCompat.read(this);
            if (clickexplore_mediabrowsercompat_customactionresultreceiver.RatingCompat.IconCompatParcelizer() == 0) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver);
                clickexplore_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = true;
                clickexplore_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }
    }
}
