package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ManageFastPayQrScanActivity_ViewBinding */
public final class ManageFastPayQrScanActivity_ViewBinding<T, R> extends DebitCardResetOtpActivity<R> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] IconCompatParcelizer;
    private Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super Object[], ? extends R> read;
    private int write;

    public ManageFastPayQrScanActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i, boolean z) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBindingArr;
        this.MediaBrowserCompat$CustomActionResultReceiver = iterable;
        this.read = directDebitDeepLinkActivity;
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        int i;
        DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr = this.IconCompatParcelizer;
        if (debitCardResetPinSuccessActivity_ViewBindingArr == null) {
            debitCardResetPinSuccessActivity_ViewBindingArr = new DebitCardResetOtpActivity[8];
            i = 0;
            for (DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding : this.MediaBrowserCompat$CustomActionResultReceiver) {
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
        if (i == 0) {
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            return;
        }
        C6943x1160e2c2 manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C6943x1160e2c2(bankingAgentTransactionsDeepLinkActivity, this.read, i, this.MediaBrowserCompat$ItemReceiver);
        int i2 = this.write;
        read<T, R>[] readArr = manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        int length = readArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            readArr[i3] = new read<>(manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, i2);
        }
        manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.lazySet(0);
        manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.write.onSubscribe(manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        for (int i4 = 0; i4 < length && !manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver; i4++) {
            debitCardResetPinSuccessActivity_ViewBindingArr[i4].subscribe(readArr[i4]);
        }
    }

    /* renamed from: o.ManageFastPayQrScanActivity_ViewBinding$read */
    static final class read<T, R> implements BankingAgentTransactionsDeepLinkActivity<T> {
        Throwable IconCompatParcelizer;
        final HmlBaseEmailAboutActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
        private C6943x1160e2c2<T, R> MediaBrowserCompat$ItemReceiver;
        volatile boolean read;
        final AtomicReference<BulkTransferDeepLinkActivity> write = new AtomicReference<>();

        read(C6943x1160e2c2<T, R> manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, int i) {
            this.MediaBrowserCompat$ItemReceiver = manageFastPayQrScanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = new HmlBaseEmailAboutActivity<>(i);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(t);
            this.MediaBrowserCompat$ItemReceiver.write();
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer = th;
            this.read = true;
            this.MediaBrowserCompat$ItemReceiver.write();
        }

        public final void onComplete() {
            this.read = true;
            this.MediaBrowserCompat$ItemReceiver.write();
        }
    }
}
