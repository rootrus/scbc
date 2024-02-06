package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DepositExportStatementActivity */
public final class DepositExportStatementActivity<T, R> extends DebitCardResetOtpActivity<R> {
    private Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super Object[], ? extends R> MediaBrowserCompat$ItemReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] read;
    private boolean write;

    public DepositExportStatementActivity(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i, boolean z) {
        this.read = debitCardResetPinSuccessActivity_ViewBindingArr;
        this.IconCompatParcelizer = iterable;
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        int i;
        DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr = this.read;
        if (debitCardResetPinSuccessActivity_ViewBindingArr == null) {
            debitCardResetPinSuccessActivity_ViewBindingArr = new DebitCardResetOtpActivity[8];
            i = 0;
            for (DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding : this.IconCompatParcelizer) {
                if (i == debitCardResetPinSuccessActivity_ViewBindingArr.length) {
                    DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr2 = new DebitCardResetPinSuccessActivity_ViewBinding[((i >> 2) + i)];
                    System.arraycopy(debitCardResetPinSuccessActivity_ViewBindingArr, 0, debitCardResetPinSuccessActivity_ViewBindingArr2, 0, i);
                    debitCardResetPinSuccessActivity_ViewBindingArr = debitCardResetPinSuccessActivity_ViewBindingArr2;
                }
                debitCardResetPinSuccessActivity_ViewBindingArr[i] = debitCardResetPinSuccessActivity_ViewBinding;
                i++;
            }
        } else {
            i = debitCardResetPinSuccessActivity_ViewBindingArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            return;
        }
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, i2, this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
        IconCompatParcelizer<T, R>[] iconCompatParcelizerArr = read2.MediaDescriptionCompat;
        int length = iconCompatParcelizerArr.length;
        read2.write.onSubscribe(read2);
        for (int i3 = 0; i3 < length && !read2.read && !read2.IconCompatParcelizer; i3++) {
            debitCardResetPinSuccessActivity_ViewBindingArr[i3].subscribe(iconCompatParcelizerArr[i3]);
        }
    }

    /* renamed from: o.DepositExportStatementActivity$read */
    static final class read<T, R> extends AtomicInteger implements BulkTransferDeepLinkActivity {
        volatile boolean IconCompatParcelizer;
        final boolean MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super Object[], ? extends R> MediaBrowserCompat$MediaItem;
        Object[] MediaBrowserCompat$SearchResultReceiver;
        final IconCompatParcelizer<T, R>[] MediaDescriptionCompat;
        final HmlBusinessETBPersonalInfoActivity MediaMetadataCompat = new HmlBusinessETBPersonalInfoActivity();
        private HmlBaseEmailAboutActivity<Object[]> MediaSessionCompat$Token;
        private int RatingCompat;
        volatile boolean read;
        final BankingAgentTransactionsDeepLinkActivity<? super R> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i, int i2, boolean z) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.MediaBrowserCompat$SearchResultReceiver = new Object[i];
            IconCompatParcelizer<T, R>[] iconCompatParcelizerArr = new IconCompatParcelizer[i];
            for (int i3 = 0; i3 < i; i3++) {
                iconCompatParcelizerArr[i3] = new IconCompatParcelizer<>(this, i3);
            }
            this.MediaDescriptionCompat = iconCompatParcelizerArr;
            this.MediaSessionCompat$Token = new HmlBaseEmailAboutActivity<>(i2);
        }

        public final void dispose() {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                for (IconCompatParcelizer<T, R> read2 : this.MediaDescriptionCompat) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2);
                }
                if (getAndIncrement() == 0) {
                    HmlBaseEmailAboutActivity<Object[]> hmlBaseEmailAboutActivity = this.MediaSessionCompat$Token;
                    synchronized (this) {
                        this.MediaBrowserCompat$SearchResultReceiver = null;
                    }
                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (getAndIncrement() == 0) {
                HmlBaseEmailAboutActivity<Object[]> hmlBaseEmailAboutActivity = this.MediaSessionCompat$Token;
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.write;
                boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 1;
                while (!this.IconCompatParcelizer) {
                    int i2 = 0;
                    if (z || this.MediaMetadataCompat.get() == null) {
                        boolean z2 = this.read;
                        Object[] read2 = hmlBaseEmailAboutActivity.read();
                        boolean z3 = read2 == null;
                        if (z2 && z3) {
                            synchronized (this) {
                                this.MediaBrowserCompat$SearchResultReceiver = null;
                            }
                            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                            Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaMetadataCompat);
                            if (read3 == null) {
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            } else {
                                bankingAgentTransactionsDeepLinkActivity.onError(read3);
                                return;
                            }
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                bankingAgentTransactionsDeepLinkActivity.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(read2), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                AlertController$RecycleListView.read.write(th);
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaMetadataCompat, th);
                                IconCompatParcelizer<T, R>[] iconCompatParcelizerArr = this.MediaDescriptionCompat;
                                int length = iconCompatParcelizerArr.length;
                                while (i2 < length) {
                                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizerArr[i2]);
                                    i2++;
                                }
                                synchronized (this) {
                                    this.MediaBrowserCompat$SearchResultReceiver = null;
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaMetadataCompat));
                                    return;
                                }
                            }
                        }
                    } else {
                        IconCompatParcelizer<T, R>[] iconCompatParcelizerArr2 = this.MediaDescriptionCompat;
                        int length2 = iconCompatParcelizerArr2.length;
                        while (i2 < length2) {
                            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizerArr2[i2]);
                            i2++;
                        }
                        synchronized (this) {
                            this.MediaBrowserCompat$SearchResultReceiver = null;
                        }
                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                        bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaMetadataCompat));
                        return;
                    }
                }
                synchronized (this) {
                    this.MediaBrowserCompat$SearchResultReceiver = null;
                }
                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
            MediaBrowserCompat$CustomActionResultReceiver();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void IconCompatParcelizer(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.RatingCompat     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.RatingCompat = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                o.HmlBaseEmailAboutActivity<java.lang.Object[]> r4 = r3.MediaSessionCompat$Token     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.IconCompatParcelizer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)
                if (r4 == 0) goto L_0x0028
                r3.MediaBrowserCompat$CustomActionResultReceiver()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DepositExportStatementActivity.read.IconCompatParcelizer(int, java.lang.Object):void");
        }
    }

    /* renamed from: o.DepositExportStatementActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private int IconCompatParcelizer;
        private read<T, R> MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(read<T, R> read, int i) {
            this.MediaBrowserCompat$ItemReceiver = read;
            this.IconCompatParcelizer = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.IconCompatParcelizer, t);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
            if (r4 == r6.length) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
            r3 = r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onError(java.lang.Throwable r6) {
            /*
                r5 = this;
                o.DepositExportStatementActivity$read<T, R> r0 = r5.MediaBrowserCompat$ItemReceiver
                int r1 = r5.IconCompatParcelizer
                o.HmlBusinessETBPersonalInfoActivity r2 = r0.MediaMetadataCompat
                boolean r2 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(r2, r6)
                if (r2 == 0) goto L_0x0045
                boolean r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r2 = 0
                r3 = 1
                if (r6 == 0) goto L_0x0032
                monitor-enter(r0)
                java.lang.Object[] r6 = r0.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x002f }
                if (r6 != 0) goto L_0x0019
                monitor-exit(r0)
                return
            L_0x0019:
                r1 = r6[r1]     // Catch:{ all -> 0x002f }
                if (r1 != 0) goto L_0x001f
                r1 = r3
                goto L_0x0020
            L_0x001f:
                r1 = r2
            L_0x0020:
                if (r1 != 0) goto L_0x002a
                int r4 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x002f }
                int r4 = r4 + r3
                r0.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ all -> 0x002f }
                int r6 = r6.length     // Catch:{ all -> 0x002f }
                if (r4 != r6) goto L_0x002c
            L_0x002a:
                r0.read = r3     // Catch:{ all -> 0x002f }
            L_0x002c:
                monitor-exit(r0)
                r3 = r1
                goto L_0x0032
            L_0x002f:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            L_0x0032:
                if (r3 == 0) goto L_0x0041
                o.DepositExportStatementActivity$IconCompatParcelizer<T, R>[] r6 = r0.MediaDescriptionCompat
                int r1 = r6.length
            L_0x0037:
                if (r2 >= r1) goto L_0x0041
                r3 = r6[r2]
                p040o.HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(r3)
                int r2 = r2 + 1
                goto L_0x0037
            L_0x0041:
                r0.MediaBrowserCompat$CustomActionResultReceiver()
                return
            L_0x0045:
                p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DepositExportStatementActivity.IconCompatParcelizer.onError(java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            if (r5 == r2.length) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            if (r1 == false) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
            r1 = r0.MediaDescriptionCompat;
            r2 = r1.length;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
            if (r3 >= r2) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
            p040o.HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(r1[r3]);
            r3 = r3 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
            r0.MediaBrowserCompat$CustomActionResultReceiver();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r6 = this;
                o.DepositExportStatementActivity$read<T, R> r0 = r6.MediaBrowserCompat$ItemReceiver
                int r1 = r6.IconCompatParcelizer
                monitor-enter(r0)
                java.lang.Object[] r2 = r0.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0034 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                r1 = r2[r1]     // Catch:{ all -> 0x0034 }
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L_0x0013
                r1 = r4
                goto L_0x0014
            L_0x0013:
                r1 = r3
            L_0x0014:
                if (r1 != 0) goto L_0x001e
                int r5 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0034 }
                int r5 = r5 + r4
                r0.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ all -> 0x0034 }
                int r2 = r2.length     // Catch:{ all -> 0x0034 }
                if (r5 != r2) goto L_0x0020
            L_0x001e:
                r0.read = r4     // Catch:{ all -> 0x0034 }
            L_0x0020:
                monitor-exit(r0)
                if (r1 == 0) goto L_0x0030
                o.DepositExportStatementActivity$IconCompatParcelizer<T, R>[] r1 = r0.MediaDescriptionCompat
                int r2 = r1.length
            L_0x0026:
                if (r3 >= r2) goto L_0x0030
                r4 = r1[r3]
                p040o.HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(r4)
                int r3 = r3 + 1
                goto L_0x0026
            L_0x0030:
                r0.MediaBrowserCompat$CustomActionResultReceiver()
                return
            L_0x0034:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DepositExportStatementActivity.IconCompatParcelizer.onComplete():void");
        }
    }
}
