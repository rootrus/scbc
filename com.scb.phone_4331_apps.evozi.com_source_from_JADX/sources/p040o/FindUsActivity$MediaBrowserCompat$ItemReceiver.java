package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.FindUsActivity$MediaBrowserCompat$ItemReceiver */
final class FindUsActivity$MediaBrowserCompat$ItemReceiver<T> extends OprRenewDeepLinkActivity<T, Object, DebitCardResetOtpActivity<T>> implements BulkTransferDeepLinkActivity, Runnable {
    private static Object MediaBrowserCompat$MediaItem = new Object();
    private volatile boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private HmlETBLoanSetupActivity<T> f5512x50fd9e4a;
    private BankingAgentDeepLinkActivity MediaDescriptionCompat;
    private TimeUnit MediaSessionCompat$QueueItem;
    private long MediaSessionCompat$ResultReceiverWrapper;
    private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
    private AtomicReference<BulkTransferDeepLinkActivity> ParcelableVolumeInfo = new AtomicReference<>();
    private int RatingCompat;

    FindUsActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i) {
        super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
        this.MediaSessionCompat$ResultReceiverWrapper = j;
        this.MediaSessionCompat$QueueItem = timeUnit;
        this.MediaDescriptionCompat = bankingAgentDeepLinkActivity;
        this.RatingCompat = i;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$Token, bulkTransferDeepLinkActivity)) {
            this.MediaSessionCompat$Token = bulkTransferDeepLinkActivity;
            this.f5512x50fd9e4a = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
            BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(this);
            bankingAgentTransactionsDeepLinkActivity.onNext(this.f5512x50fd9e4a);
            if (!this.read) {
                BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.MediaDescriptionCompat;
                long j = this.MediaSessionCompat$ResultReceiverWrapper;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.ParcelableVolumeInfo, bankingAgentDeepLinkActivity.write(this, j, j, this.MediaSessionCompat$QueueItem));
            }
        }
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            boolean z = false;
            if (this.MediaMetadataCompat.get() == 0 && this.MediaMetadataCompat.compareAndSet(0, 1)) {
                this.f5512x50fd9e4a.onNext(t);
                if (this.MediaMetadataCompat.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.write.IconCompatParcelizer(HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t));
                if (this.MediaMetadataCompat.getAndIncrement() == 0) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer = th;
        boolean z = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        if (this.MediaMetadataCompat.getAndIncrement() != 0) {
            z = false;
        }
        if (z) {
            MediaBrowserCompat$ItemReceiver();
        }
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.ParcelableVolumeInfo);
        this.MediaBrowserCompat$ItemReceiver.onError(th);
    }

    public final void onComplete() {
        boolean z = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        if (this.MediaMetadataCompat.getAndIncrement() != 0) {
            z = false;
        }
        if (z) {
            MediaBrowserCompat$ItemReceiver();
        }
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.ParcelableVolumeInfo);
        this.MediaBrowserCompat$ItemReceiver.onComplete();
    }

    public final void dispose() {
        this.read = true;
    }

    public final boolean isDisposed() {
        return this.read;
    }

    public final void run() {
        boolean z = true;
        if (this.read) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.ParcelableVolumeInfo);
        }
        this.write.IconCompatParcelizer(MediaBrowserCompat$MediaItem);
        if (this.MediaMetadataCompat.getAndIncrement() != 0) {
            z = false;
        }
        if (z) {
            MediaBrowserCompat$ItemReceiver();
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        HmlApplicationOutcomeActivity hmlApplicationOutcomeActivity = (HmlApplicationOutcomeActivity) this.write;
        BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.f5512x50fd9e4a;
        int i = 1;
        while (true) {
            boolean z = this.MediaBrowserCompat$SearchResultReceiver;
            boolean z2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            Object read = hmlApplicationOutcomeActivity.read();
            if (!z2 || !(read == null || read == MediaBrowserCompat$MediaItem)) {
                if (read == null) {
                    i = this.MediaMetadataCompat.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (read == MediaBrowserCompat$MediaItem) {
                    hmlETBLoanSetupActivity.onComplete();
                    if (!z) {
                        hmlETBLoanSetupActivity = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
                        this.f5512x50fd9e4a = hmlETBLoanSetupActivity;
                        bankingAgentTransactionsDeepLinkActivity.onNext(hmlETBLoanSetupActivity);
                    } else {
                        this.MediaSessionCompat$Token.dispose();
                    }
                } else {
                    hmlETBLoanSetupActivity.onNext(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(read));
                }
            }
        }
        this.f5512x50fd9e4a = null;
        hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.ParcelableVolumeInfo);
        Throwable th = this.IconCompatParcelizer;
        if (th != null) {
            hmlETBLoanSetupActivity.onError(th);
        } else {
            hmlETBLoanSetupActivity.onComplete();
        }
    }
}
