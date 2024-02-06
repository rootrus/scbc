package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.BaseHmlLandingActivity */
public final class BaseHmlLandingActivity<T, R> extends BScanCNotificationDeepLinkActivity<R> {
    final DirectDebitDeepLinkActivity<? super Object[], ? extends R> IconCompatParcelizer;
    private BillerDeepLinkActivity<? extends T>[] read;

    public BaseHmlLandingActivity(BillerDeepLinkActivity<? extends T>[] billerDeepLinkActivityArr, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        this.read = billerDeepLinkActivityArr;
        this.IconCompatParcelizer = directDebitDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity) {
        BillerDeepLinkActivity<? extends T>[] billerDeepLinkActivityArr = this.read;
        int length = billerDeepLinkActivityArr.length;
        if (length == 1) {
            billerDeepLinkActivityArr[0].IconCompatParcelizer(new onCopy$MediaBrowserCompat$ItemReceiver(activateChequeDeepLinkActivity, new C6333xe156109d(this)));
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(activateChequeDeepLinkActivity, length, this.IconCompatParcelizer);
        activateChequeDeepLinkActivity.onSubscribe(iconCompatParcelizer);
        for (int i = 0; i < length && !iconCompatParcelizer.isDisposed(); i++) {
            BillerDeepLinkActivity<? extends T> billerDeepLinkActivity = billerDeepLinkActivityArr[i];
            if (billerDeepLinkActivity == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (iconCompatParcelizer.getAndSet(0) > 0) {
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onError(nullPointerException);
                    return;
                }
                AlertController$RecycleListView.read.read((Throwable) nullPointerException);
                return;
            }
            billerDeepLinkActivity.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver[i]);
        }
    }

    /* renamed from: o.BaseHmlLandingActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> extends AtomicInteger implements BulkTransferDeepLinkActivity {
        final ActivateChequeDeepLinkActivity<? super R> MediaBrowserCompat$CustomActionResultReceiver;
        final BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver<T>[] MediaBrowserCompat$ItemReceiver;
        final Object[] read;
        final DirectDebitDeepLinkActivity<? super Object[], ? extends R> write;

        IconCompatParcelizer(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity, int i, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
            super(i);
            this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
            this.write = directDebitDeepLinkActivity;
            BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver<T>[] baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr = new BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver[i];
            for (int i2 = 0; i2 < i; i2++) {
                baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr[i2] = new BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver<>(this, i2);
            }
            this.MediaBrowserCompat$ItemReceiver = baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr;
            this.read = new Object[i];
        }

        public final boolean isDisposed() {
            return get() <= 0;
        }

        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver<T> read2 : this.MediaBrowserCompat$ItemReceiver) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver<T>[] baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr = this.MediaBrowserCompat$ItemReceiver;
            int length = baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr[i2]);
            }
            while (true) {
                i++;
                if (i < length) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(baseHmlLandingActivity$MediaBrowserCompat$ItemReceiverArr[i]);
                } else {
                    return;
                }
            }
        }
    }
}
