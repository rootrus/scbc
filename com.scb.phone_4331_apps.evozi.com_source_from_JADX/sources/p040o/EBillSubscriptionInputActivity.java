package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EBillSubscriptionInputActivity */
public final class EBillSubscriptionInputActivity<T> extends HmlConsumerGuidelinesBaseDeepLinkActivity<T> implements EasycashSpeedyLoanTopupIntroductionActivity<T> {
    private AtomicReference<read<T>> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public static <T> HmlConsumerGuidelinesBaseDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        AtomicReference atomicReference = new AtomicReference();
        return new EBillSubscriptionInputActivity(new write(atomicReference), debitCardResetPinSuccessActivity_ViewBinding, atomicReference);
    }

    private EBillSubscriptionInputActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding2, AtomicReference<read<T>> atomicReference) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaBrowserCompat$CustomActionResultReceiver = atomicReference;
    }

    public final DebitCardResetPinSuccessActivity_ViewBinding<T> read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.write.subscribe(bankingAgentTransactionsDeepLinkActivity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.DebitCardMarketConductDeepLinkActivity<? super p040o.BulkTransferDeepLinkActivity> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.EBillSubscriptionInputActivity$read<T>> r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r0 = r0.get()
            o.EBillSubscriptionInputActivity$read r0 = (p040o.EBillSubscriptionInputActivity.read) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            o.EBillSubscriptionInputActivity$read r1 = new o.EBillSubscriptionInputActivity$read
            java.util.concurrent.atomic.AtomicReference<o.EBillSubscriptionInputActivity$read<T>> r2 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<o.EBillSubscriptionInputActivity$read<T>> r2 = r4.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.MediaBrowserCompat$ItemReceiver
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.MediaBrowserCompat$ItemReceiver
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r5.IconCompatParcelizer(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            o.DebitCardResetPinSuccessActivity_ViewBinding<T> r5 = r4.MediaBrowserCompat$ItemReceiver
            r5.subscribe(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r5)
            java.lang.RuntimeException r5 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.EBillSubscriptionInputActivity.MediaBrowserCompat$ItemReceiver(o.DebitCardMarketConductDeepLinkActivity):void");
    }

    /* renamed from: o.EBillSubscriptionInputActivity$read */
    static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private static IconCompatParcelizer[] IconCompatParcelizer = new IconCompatParcelizer[0];
        static final IconCompatParcelizer[] write = new IconCompatParcelizer[0];
        private AtomicReference<read<T>> MediaBrowserCompat$CustomActionResultReceiver;
        final AtomicBoolean MediaBrowserCompat$ItemReceiver;
        private AtomicReference<BulkTransferDeepLinkActivity> MediaMetadataCompat = new AtomicReference<>();
        final AtomicReference<IconCompatParcelizer<T>[]> read = new AtomicReference<>(IconCompatParcelizer);

        read(AtomicReference<read<T>> atomicReference) {
            this.MediaBrowserCompat$CustomActionResultReceiver = atomicReference;
            this.MediaBrowserCompat$ItemReceiver = new AtomicBoolean();
        }

        public final void dispose() {
            if (((IconCompatParcelizer[]) this.read.getAndSet(write)) != write) {
                this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, (Object) null);
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaMetadataCompat);
            }
        }

        public final boolean isDisposed() {
            return this.read.get() == write;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            for (IconCompatParcelizer iconCompatParcelizer : (IconCompatParcelizer[]) this.read.get()) {
                iconCompatParcelizer.IconCompatParcelizer.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, (Object) null);
            IconCompatParcelizer[] iconCompatParcelizerArr = (IconCompatParcelizer[]) this.read.getAndSet(write);
            if (iconCompatParcelizerArr.length != 0) {
                for (IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
                    iconCompatParcelizer.IconCompatParcelizer.onError(th);
                }
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, (Object) null);
            for (IconCompatParcelizer iconCompatParcelizer : (IconCompatParcelizer[]) this.read.getAndSet(write)) {
                iconCompatParcelizer.IconCompatParcelizer.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(IconCompatParcelizer<T> iconCompatParcelizer) {
            IconCompatParcelizer[] iconCompatParcelizerArr;
            IconCompatParcelizer[] iconCompatParcelizerArr2;
            do {
                iconCompatParcelizerArr = (IconCompatParcelizer[]) this.read.get();
                int length = iconCompatParcelizerArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (iconCompatParcelizerArr[i].equals(iconCompatParcelizer)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            iconCompatParcelizerArr2 = IconCompatParcelizer;
                        } else {
                            IconCompatParcelizer[] iconCompatParcelizerArr3 = new IconCompatParcelizer[(length - 1)];
                            System.arraycopy(iconCompatParcelizerArr, 0, iconCompatParcelizerArr3, 0, i);
                            System.arraycopy(iconCompatParcelizerArr, i + 1, iconCompatParcelizerArr3, i, (length - i) - 1);
                            iconCompatParcelizerArr2 = iconCompatParcelizerArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.read.compareAndSet(iconCompatParcelizerArr, iconCompatParcelizerArr2));
        }
    }

    /* renamed from: o.EBillSubscriptionInputActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicReference<Object> implements BulkTransferDeepLinkActivity {
        final BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final boolean isDisposed() {
            return get() == this;
        }

        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((read) andSet).MediaBrowserCompat$ItemReceiver(this);
            }
        }
    }

    /* renamed from: o.EBillSubscriptionInputActivity$write */
    static final class write<T> implements DebitCardResetPinSuccessActivity_ViewBinding<T> {
        private final AtomicReference<read<T>> write;

        write(AtomicReference<read<T>> atomicReference) {
            this.write = atomicReference;
        }

        public final void subscribe(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            read read;
            boolean z;
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity);
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(iconCompatParcelizer);
            while (true) {
                read = this.write.get();
                if (read == null || read.isDisposed()) {
                    read read2 = new read(this.write);
                    if (this.write.compareAndSet(read, read2)) {
                        read = read2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    IconCompatParcelizer[] iconCompatParcelizerArr = (IconCompatParcelizer[]) read.read.get();
                    z = false;
                    if (iconCompatParcelizerArr != read.write) {
                        int length = iconCompatParcelizerArr.length;
                        IconCompatParcelizer[] iconCompatParcelizerArr2 = new IconCompatParcelizer[(length + 1)];
                        System.arraycopy(iconCompatParcelizerArr, 0, iconCompatParcelizerArr2, 0, length);
                        iconCompatParcelizerArr2[length] = iconCompatParcelizer;
                        if (read.read.compareAndSet(iconCompatParcelizerArr, iconCompatParcelizerArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (!iconCompatParcelizer.compareAndSet((Object) null, read)) {
                read.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
            }
        }
    }
}
