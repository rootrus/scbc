package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.LoanTermsConditionsActivity */
public final class LoanTermsConditionsActivity<T> extends HmlConsumerGuidelinesBaseDeepLinkActivity<T> implements HmlBusinessOwnerCalculatorDeepLinkActivity {
    private AtomicReference<read<T>> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public LoanTermsConditionsActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.DebitCardMarketConductDeepLinkActivity<? super p040o.BulkTransferDeepLinkActivity> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.LoanTermsConditionsActivity$read<T>> r0 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.Object r0 = r0.get()
            o.LoanTermsConditionsActivity$read r0 = (p040o.LoanTermsConditionsActivity.read) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            o.LoanTermsConditionsActivity$read r1 = new o.LoanTermsConditionsActivity$read
            java.util.concurrent.atomic.AtomicReference<o.LoanTermsConditionsActivity$read<T>> r2 = r4.MediaBrowserCompat$ItemReceiver
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<o.LoanTermsConditionsActivity$read<T>> r2 = r4.MediaBrowserCompat$ItemReceiver
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.write
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.write
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r5.IconCompatParcelizer(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            o.DebitCardResetPinSuccessActivity_ViewBinding<T> r5 = r4.write
            r5.subscribe(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r5)
            java.lang.RuntimeException r5 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.LoanTermsConditionsActivity.MediaBrowserCompat$ItemReceiver(o.DebitCardMarketConductDeepLinkActivity):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribeActual(p040o.BankingAgentTransactionsDeepLinkActivity<? super T> r7) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.LoanTermsConditionsActivity$read<T>> r0 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.Object r0 = r0.get()
            o.LoanTermsConditionsActivity$read r0 = (p040o.LoanTermsConditionsActivity.read) r0
            if (r0 != 0) goto L_0x001a
            o.LoanTermsConditionsActivity$read r1 = new o.LoanTermsConditionsActivity$read
            java.util.concurrent.atomic.AtomicReference<o.LoanTermsConditionsActivity$read<T>> r2 = r6.MediaBrowserCompat$ItemReceiver
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<o.LoanTermsConditionsActivity$read<T>> r2 = r6.MediaBrowserCompat$ItemReceiver
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x001a:
            o.LoanTermsConditionsActivity$IconCompatParcelizer r1 = new o.LoanTermsConditionsActivity$IconCompatParcelizer
            r1.<init>(r7, r0)
            r7.onSubscribe(r1)
        L_0x0022:
            java.lang.Object r2 = r0.get()
            o.LoanTermsConditionsActivity$IconCompatParcelizer[] r2 = (p040o.LoanTermsConditionsActivity.IconCompatParcelizer[]) r2
            o.LoanTermsConditionsActivity$IconCompatParcelizer[] r3 = p040o.LoanTermsConditionsActivity.read.IconCompatParcelizer
            r4 = 0
            if (r2 != r3) goto L_0x002e
            goto L_0x003f
        L_0x002e:
            int r3 = r2.length
            int r5 = r3 + 1
            o.LoanTermsConditionsActivity$IconCompatParcelizer[] r5 = new p040o.LoanTermsConditionsActivity.IconCompatParcelizer[r5]
            java.lang.System.arraycopy(r2, r4, r5, r4, r3)
            r5[r3] = r1
            boolean r2 = r0.compareAndSet(r2, r5)
            if (r2 == 0) goto L_0x0022
            r4 = 1
        L_0x003f:
            if (r4 == 0) goto L_0x004b
            boolean r7 = r1.isDisposed()
            if (r7 == 0) goto L_0x004a
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1)
        L_0x004a:
            return
        L_0x004b:
            java.lang.Throwable r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0053
            r7.onError(r0)
            return
        L_0x0053:
            r7.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.LoanTermsConditionsActivity.subscribeActual(o.BankingAgentTransactionsDeepLinkActivity):void");
    }

    public final void IconCompatParcelizer(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.compareAndSet((read) bulkTransferDeepLinkActivity, (Object) null);
    }

    /* renamed from: o.LoanTermsConditionsActivity$read */
    static final class read<T> extends AtomicReference<IconCompatParcelizer<T>[]> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        static final IconCompatParcelizer[] IconCompatParcelizer = new IconCompatParcelizer[0];
        private static IconCompatParcelizer[] read = new IconCompatParcelizer[0];
        Throwable MediaBrowserCompat$CustomActionResultReceiver;
        private AtomicReference<read<T>> MediaBrowserCompat$ItemReceiver;
        private AtomicReference<BulkTransferDeepLinkActivity> MediaMetadataCompat;
        final AtomicBoolean write = new AtomicBoolean();

        read(AtomicReference<read<T>> atomicReference) {
            this.MediaBrowserCompat$ItemReceiver = atomicReference;
            this.MediaMetadataCompat = new AtomicReference<>();
            lazySet(read);
        }

        public final void dispose() {
            getAndSet(IconCompatParcelizer);
            this.MediaBrowserCompat$ItemReceiver.compareAndSet(this, (Object) null);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaMetadataCompat);
        }

        public final boolean isDisposed() {
            return get() == IconCompatParcelizer;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            for (IconCompatParcelizer iconCompatParcelizer : (IconCompatParcelizer[]) get()) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = th;
            this.MediaMetadataCompat.lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            for (IconCompatParcelizer iconCompatParcelizer : (IconCompatParcelizer[]) getAndSet(IconCompatParcelizer)) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.onError(th);
            }
        }

        public final void onComplete() {
            this.MediaMetadataCompat.lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            for (IconCompatParcelizer iconCompatParcelizer : (IconCompatParcelizer[]) getAndSet(IconCompatParcelizer)) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.onComplete();
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer<T> iconCompatParcelizer) {
            IconCompatParcelizer<T>[] iconCompatParcelizerArr;
            IconCompatParcelizer[] iconCompatParcelizerArr2;
            do {
                iconCompatParcelizerArr = (IconCompatParcelizer[]) get();
                int length = iconCompatParcelizerArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (iconCompatParcelizerArr[i] == iconCompatParcelizer) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        iconCompatParcelizerArr2 = read;
                        if (length != 1) {
                            iconCompatParcelizerArr2 = new IconCompatParcelizer[(length - 1)];
                            System.arraycopy(iconCompatParcelizerArr, 0, iconCompatParcelizerArr2, 0, i);
                            System.arraycopy(iconCompatParcelizerArr, i + 1, iconCompatParcelizerArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(iconCompatParcelizerArr, iconCompatParcelizerArr2));
        }
    }

    /* renamed from: o.LoanTermsConditionsActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicReference<read<T>> implements BulkTransferDeepLinkActivity {
        final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, read<T> read) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
            lazySet(read);
        }

        public final void dispose() {
            read read = (read) getAndSet((Object) null);
            if (read != null) {
                read.MediaBrowserCompat$CustomActionResultReceiver(this);
            }
        }

        public final boolean isDisposed() {
            return get() == null;
        }
    }
}
