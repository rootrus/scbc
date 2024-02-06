package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.EasycashCreditPowerInputActivity_ViewBinding;

/* renamed from: o.EasycashCreditPowerInputActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
final class C9719xd5603cd0 extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<R>, BulkTransferDeepLinkActivity {
    private /* synthetic */ EasycashCreditPowerInputActivity_ViewBinding.IconCompatParcelizer write;

    C9719xd5603cd0(EasycashCreditPowerInputActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
        HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity;
        EasycashCreditPowerInputActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer = this.write;
        iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver.read(this);
        if (iconCompatParcelizer.get() == 0) {
            boolean z = false;
            if (iconCompatParcelizer.compareAndSet(0, 1)) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onNext(r);
                if (iconCompatParcelizer.IconCompatParcelizer.decrementAndGet() == 0) {
                    z = true;
                }
                HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.get();
                if (!z || (hmlBaseEmailAboutActivity2 != null && !hmlBaseEmailAboutActivity2.write())) {
                    if (iconCompatParcelizer.decrementAndGet() == 0) {
                        return;
                    }
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                }
                Throwable read = HmlBusinessOccupationInfoActivity_ViewBinding.read(iconCompatParcelizer.write);
                if (read != null) {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onError(read);
                    return;
                } else {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                    return;
                }
            }
        }
        do {
            hmlBaseEmailAboutActivity = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.get();
            if (hmlBaseEmailAboutActivity != null) {
                break;
            }
            hmlBaseEmailAboutActivity = new HmlBaseEmailAboutActivity(DebitCardResetOtpActivity.bufferSize());
        } while (!iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.compareAndSet((Object) null, hmlBaseEmailAboutActivity));
        synchronized (hmlBaseEmailAboutActivity) {
            hmlBaseEmailAboutActivity.IconCompatParcelizer(r);
        }
        iconCompatParcelizer.IconCompatParcelizer.decrementAndGet();
        if (iconCompatParcelizer.getAndIncrement() != 0) {
            return;
        }
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onError(Throwable th) {
        EasycashCreditPowerInputActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer = this.write;
        iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver.read(this);
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(iconCompatParcelizer.write, th)) {
            if (!iconCompatParcelizer.read) {
                iconCompatParcelizer.MediaBrowserCompat$MediaItem.dispose();
                iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver.dispose();
            }
            iconCompatParcelizer.IconCompatParcelizer.decrementAndGet();
            if (iconCompatParcelizer.getAndIncrement() == 0) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }
}
