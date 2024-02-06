package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.ManageFastPayQrScanActivity_ViewBinding;

/* renamed from: o.ManageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C6943x1160e2c2<T, R> extends AtomicInteger implements BulkTransferDeepLinkActivity {
    final ManageFastPayQrScanActivity_ViewBinding.read<T, R>[] IconCompatParcelizer;
    private T[] MediaBrowserCompat$CustomActionResultReceiver;
    volatile boolean MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super Object[], ? extends R> RatingCompat;
    private boolean read;
    final BankingAgentTransactionsDeepLinkActivity<? super R> write;

    C6943x1160e2c2(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i, boolean z) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.RatingCompat = directDebitDeepLinkActivity;
        this.IconCompatParcelizer = new ManageFastPayQrScanActivity_ViewBinding.read[i];
        this.MediaBrowserCompat$CustomActionResultReceiver = (Object[]) new Object[i];
        this.read = z;
    }

    public final void dispose() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            for (ManageFastPayQrScanActivity_ViewBinding.read<T, R> read2 : this.IconCompatParcelizer) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2.write);
            }
            if (getAndIncrement() == 0) {
                for (ManageFastPayQrScanActivity_ViewBinding.read<T, R> read3 : this.IconCompatParcelizer) {
                    read3.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
                }
            }
        }
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r16.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            o.ManageFastPayQrScanActivity_ViewBinding$read<T, R>[] r0 = r1.IconCompatParcelizer
            o.BankingAgentTransactionsDeepLinkActivity<? super R> r2 = r1.write
            T[] r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            boolean r4 = r1.read
            r5 = 1
            r6 = r5
        L_0x0013:
            int r7 = r0.length
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0017:
            if (r9 >= r7) goto L_0x0088
            r12 = r0[r9]
            r13 = r3[r11]
            if (r13 != 0) goto L_0x0070
            boolean r13 = r12.read
            o.HmlBaseEmailAboutActivity<T> r14 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r14 = r14.read()
            if (r14 != 0) goto L_0x002b
            r15 = r5
            goto L_0x002c
        L_0x002b:
            r15 = 0
        L_0x002c:
            boolean r8 = r1.MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x0035
            r16.read()
        L_0x0033:
            r8 = r5
            goto L_0x0065
        L_0x0035:
            if (r13 == 0) goto L_0x0064
            if (r4 == 0) goto L_0x004c
            if (r15 == 0) goto L_0x0064
            java.lang.Throwable r8 = r12.IconCompatParcelizer
            r1.MediaBrowserCompat$ItemReceiver = r5
            r16.read()
            if (r8 == 0) goto L_0x0048
            r2.onError(r8)
            goto L_0x0033
        L_0x0048:
            r2.onComplete()
            goto L_0x0033
        L_0x004c:
            java.lang.Throwable r8 = r12.IconCompatParcelizer
            if (r8 == 0) goto L_0x0059
            r1.MediaBrowserCompat$ItemReceiver = r5
            r16.read()
            r2.onError(r8)
            goto L_0x0033
        L_0x0059:
            if (r15 == 0) goto L_0x0064
            r1.MediaBrowserCompat$ItemReceiver = r5
            r16.read()
            r2.onComplete()
            goto L_0x0033
        L_0x0064:
            r8 = 0
        L_0x0065:
            if (r8 == 0) goto L_0x0068
            return
        L_0x0068:
            if (r15 != 0) goto L_0x006d
            r3[r11] = r14
            goto L_0x0083
        L_0x006d:
            int r10 = r10 + 1
            goto L_0x0083
        L_0x0070:
            boolean r8 = r12.read
            if (r8 == 0) goto L_0x0083
            if (r4 != 0) goto L_0x0083
            java.lang.Throwable r8 = r12.IconCompatParcelizer
            if (r8 == 0) goto L_0x0083
            r1.MediaBrowserCompat$ItemReceiver = r5
            r16.read()
            r2.onError(r8)
            return
        L_0x0083:
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L_0x0017
        L_0x0088:
            if (r10 == 0) goto L_0x0092
            int r6 = -r6
            int r6 = r1.addAndGet(r6)
            if (r6 != 0) goto L_0x0013
            return
        L_0x0092:
            o.DirectDebitDeepLinkActivity<? super java.lang.Object[], ? extends R> r7 = r1.RatingCompat     // Catch:{ all -> 0x00ab }
            java.lang.Object r8 = r3.clone()     // Catch:{ all -> 0x00ab }
            java.lang.Object r7 = r7.write(r8)     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = "The zipper returned a null value"
            java.lang.Object r7 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r7, r8)     // Catch:{ all -> 0x00ab }
            r2.onNext(r7)
            r7 = 0
            java.util.Arrays.fill(r3, r7)
            goto L_0x0013
        L_0x00ab:
            r0 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r0)
            r16.read()
            r2.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6943x1160e2c2.write():void");
    }

    private void read() {
        for (ManageFastPayQrScanActivity_ViewBinding.read<T, R> read2 : this.IconCompatParcelizer) {
            read2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        }
        for (ManageFastPayQrScanActivity_ViewBinding.read<T, R> read3 : this.IconCompatParcelizer) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read3.write);
        }
    }
}
