package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;
import p040o.ManageEmailVerificationSuccessActivity;

/* renamed from: o.ManageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9781x4ab0d18d<T> extends AtomicInteger implements BulkTransferDeepLinkActivity {
    final DebitCardResetPinSuccessActivity_ViewBinding<? extends T> IconCompatParcelizer;
    private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
    final ExternalDeepLinkActivity MediaBrowserCompat$ItemReceiver = new ExternalDeepLinkActivity();
    private T MediaBrowserCompat$MediaItem;
    private CreditCardServiceTabDeepLinkActivity<? super T, ? super T> MediaDescriptionCompat;
    private ActivateChequeDeepLinkActivity<? super Boolean> MediaMetadataCompat;
    private T RatingCompat;
    final ManageEmailVerificationSuccessActivity.write<T>[] read;
    final DebitCardResetPinSuccessActivity_ViewBinding<? extends T> write;

    C9781x4ab0d18d(ActivateChequeDeepLinkActivity<? super Boolean> activateChequeDeepLinkActivity, int i, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity) {
        this.MediaMetadataCompat = activateChequeDeepLinkActivity;
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaDescriptionCompat = creditCardServiceTabDeepLinkActivity;
        ManageEmailVerificationSuccessActivity.write<T>[] writeArr = new ManageEmailVerificationSuccessActivity.write[2];
        this.read = writeArr;
        writeArr[0] = new ManageEmailVerificationSuccessActivity.write<>(this, 0, i);
        writeArr[1] = new ManageEmailVerificationSuccessActivity.write<>(this, 1, i);
    }

    public final void dispose() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.MediaBrowserCompat$ItemReceiver.dispose();
            if (getAndIncrement() == 0) {
                ManageEmailVerificationSuccessActivity.write<T>[] writeArr = this.read;
                writeArr[0].read.MediaBrowserCompat$ItemReceiver();
                writeArr[1].read.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Throwable th;
        Throwable th2;
        if (getAndIncrement() == 0) {
            ManageEmailVerificationSuccessActivity.write<T>[] writeArr = this.read;
            ManageEmailVerificationSuccessActivity.write<T> write2 = writeArr[0];
            HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity = write2.read;
            ManageEmailVerificationSuccessActivity.write<T> write3 = writeArr[1];
            HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity2 = write3.read;
            int i = 1;
            while (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                boolean z = write2.MediaBrowserCompat$ItemReceiver;
                if (!z || (th2 = write2.IconCompatParcelizer) == null) {
                    boolean z2 = write3.MediaBrowserCompat$ItemReceiver;
                    if (!z2 || (th = write3.IconCompatParcelizer) == null) {
                        if (this.MediaBrowserCompat$MediaItem == null) {
                            this.MediaBrowserCompat$MediaItem = hmlBaseEmailAboutActivity.read();
                        }
                        boolean z3 = this.MediaBrowserCompat$MediaItem == null;
                        if (this.RatingCompat == null) {
                            this.RatingCompat = hmlBaseEmailAboutActivity2.read();
                        }
                        boolean z4 = this.RatingCompat == null;
                        if (z && z2 && z3 && z4) {
                            this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(Boolean.TRUE);
                            return;
                        } else if (!z || !z2 || z3 == z4) {
                            if (!z3 && !z4) {
                                try {
                                    if (!this.MediaDescriptionCompat.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, this.RatingCompat)) {
                                        this.MediaBrowserCompat$CustomActionResultReceiver = true;
                                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                        hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                                        this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(Boolean.FALSE);
                                        return;
                                    }
                                    this.MediaBrowserCompat$MediaItem = null;
                                    this.RatingCompat = null;
                                } catch (Throwable th3) {
                                    AlertController$RecycleListView.read.write(th3);
                                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                                    this.MediaMetadataCompat.onError(th3);
                                    return;
                                }
                            }
                            if ((z3 || z4) && (i = addAndGet(-i)) == 0) {
                                return;
                            }
                        } else {
                            this.MediaBrowserCompat$CustomActionResultReceiver = true;
                            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                            hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                            this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(Boolean.FALSE);
                            return;
                        }
                    } else {
                        this.MediaBrowserCompat$CustomActionResultReceiver = true;
                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                        hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                        this.MediaMetadataCompat.onError(th);
                        return;
                    }
                } else {
                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                    hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
                    this.MediaMetadataCompat.onError(th2);
                    return;
                }
            }
            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
            hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
        }
    }
}
