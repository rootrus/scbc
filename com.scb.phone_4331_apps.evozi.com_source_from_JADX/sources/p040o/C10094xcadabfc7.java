package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onClickedAction$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$ItemReceiver */
final class C10094xcadabfc7 extends AtomicReference<BulkTransferDeepLinkActivity> implements BaseChangePinWithMaxActivity_ViewBinding<R>, BulkTransferDeepLinkActivity {
    private /* synthetic */ onClickedAction$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    C10094xcadabfc7(onClickedAction$MediaBrowserCompat$CustomActionResultReceiver onclickedaction_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = onclickedaction_mediabrowsercompat_customactionresultreceiver;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
        HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity;
        onClickedAction$MediaBrowserCompat$CustomActionResultReceiver onclickedaction_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        onclickedaction_mediabrowsercompat_customactionresultreceiver.RatingCompat.read(this);
        if (onclickedaction_mediabrowsercompat_customactionresultreceiver.get() == 0) {
            boolean z = false;
            if (onclickedaction_mediabrowsercompat_customactionresultreceiver.compareAndSet(0, 1)) {
                onclickedaction_mediabrowsercompat_customactionresultreceiver.write.onNext(r);
                if (onclickedaction_mediabrowsercompat_customactionresultreceiver.read.decrementAndGet() == 0) {
                    z = true;
                }
                HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity2 = onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get();
                if (!z || (hmlBaseEmailAboutActivity2 != null && !hmlBaseEmailAboutActivity2.write())) {
                    if (onclickedaction_mediabrowsercompat_customactionresultreceiver.decrementAndGet() == 0) {
                        return;
                    }
                    onclickedaction_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
                }
                Throwable read = HmlBusinessOccupationInfoActivity_ViewBinding.read(onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
                if (read != null) {
                    onclickedaction_mediabrowsercompat_customactionresultreceiver.write.onError(read);
                    return;
                } else {
                    onclickedaction_mediabrowsercompat_customactionresultreceiver.write.onComplete();
                    return;
                }
            }
        }
        do {
            hmlBaseEmailAboutActivity = onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (hmlBaseEmailAboutActivity != null) {
                break;
            }
            hmlBaseEmailAboutActivity = new HmlBaseEmailAboutActivity(DebitCardResetOtpActivity.bufferSize());
        } while (!onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet((Object) null, hmlBaseEmailAboutActivity));
        synchronized (hmlBaseEmailAboutActivity) {
            hmlBaseEmailAboutActivity.IconCompatParcelizer(r);
        }
        onclickedaction_mediabrowsercompat_customactionresultreceiver.read.decrementAndGet();
        if (onclickedaction_mediabrowsercompat_customactionresultreceiver.getAndIncrement() != 0) {
            return;
        }
        onclickedaction_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
    }

    public final void onError(Throwable th) {
        onClickedAction$MediaBrowserCompat$CustomActionResultReceiver onclickedaction_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        onclickedaction_mediabrowsercompat_customactionresultreceiver.RatingCompat.read(this);
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver, th)) {
            if (!onclickedaction_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) {
                onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver.dispose();
                onclickedaction_mediabrowsercompat_customactionresultreceiver.RatingCompat.dispose();
            }
            onclickedaction_mediabrowsercompat_customactionresultreceiver.read.decrementAndGet();
            if (onclickedaction_mediabrowsercompat_customactionresultreceiver.getAndIncrement() == 0) {
                onclickedaction_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
                return;
            }
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        onClickedAction$MediaBrowserCompat$CustomActionResultReceiver onclickedaction_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        onclickedaction_mediabrowsercompat_customactionresultreceiver.RatingCompat.read(this);
        if (onclickedaction_mediabrowsercompat_customactionresultreceiver.get() == 0) {
            boolean z = false;
            if (onclickedaction_mediabrowsercompat_customactionresultreceiver.compareAndSet(0, 1)) {
                if (onclickedaction_mediabrowsercompat_customactionresultreceiver.read.decrementAndGet() == 0) {
                    z = true;
                }
                HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity = onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get();
                if (z && (hmlBaseEmailAboutActivity == null || hmlBaseEmailAboutActivity.write())) {
                    Throwable read = HmlBusinessOccupationInfoActivity_ViewBinding.read(onclickedaction_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
                    if (read != null) {
                        onclickedaction_mediabrowsercompat_customactionresultreceiver.write.onError(read);
                        return;
                    } else {
                        onclickedaction_mediabrowsercompat_customactionresultreceiver.write.onComplete();
                        return;
                    }
                } else if (onclickedaction_mediabrowsercompat_customactionresultreceiver.decrementAndGet() != 0) {
                    onclickedaction_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
                    return;
                } else {
                    return;
                }
            }
        }
        onclickedaction_mediabrowsercompat_customactionresultreceiver.read.decrementAndGet();
        if (onclickedaction_mediabrowsercompat_customactionresultreceiver.getAndIncrement() == 0) {
            onclickedaction_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
        }
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }
}
