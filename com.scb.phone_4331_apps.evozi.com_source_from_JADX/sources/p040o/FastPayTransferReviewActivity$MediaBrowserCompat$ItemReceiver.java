package p040o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.FastPayTransferReviewActivity;

/* renamed from: o.FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver */
final class FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, B, V> extends OprRenewDeepLinkActivity<T, Object, DebitCardResetOtpActivity<T>> implements BulkTransferDeepLinkActivity {
    BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$SearchResultReceiver = new AtomicReference<>();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private AtomicLong f5508x50fd9e4a = new AtomicLong();
    private int MediaDescriptionCompat;
    private DirectDebitDeepLinkActivity<? super B, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> MediaSessionCompat$QueueItem;
    private AtomicBoolean MediaSessionCompat$ResultReceiverWrapper = new AtomicBoolean();
    private List<HmlETBLoanSetupActivity<T>> MediaSessionCompat$Token;
    private DebitCardResetPinSuccessActivity_ViewBinding<B> ParcelableVolumeInfo;
    final ChequeInquiryDeepLinkActivity RatingCompat;

    public final void write(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, Object obj) {
    }

    FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super B, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, int i) {
        super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
        this.ParcelableVolumeInfo = debitCardResetPinSuccessActivity_ViewBinding;
        this.MediaSessionCompat$QueueItem = directDebitDeepLinkActivity;
        this.MediaDescriptionCompat = i;
        this.RatingCompat = new ChequeInquiryDeepLinkActivity();
        this.MediaSessionCompat$Token = new ArrayList();
        this.f5508x50fd9e4a.lazySet(1);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$MediaItem = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            if (!this.MediaSessionCompat$ResultReceiverWrapper.get()) {
                C9734xa5b3ad0b fastPayTransferReviewActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9734xa5b3ad0b(this);
                if (this.MediaBrowserCompat$SearchResultReceiver.compareAndSet((Object) null, fastPayTransferReviewActivity$MediaBrowserCompat$CustomActionResultReceiver)) {
                    this.ParcelableVolumeInfo.subscribe(fastPayTransferReviewActivity$MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.IconCompatParcelizer = th;
        boolean z = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        if (this.MediaMetadataCompat.getAndIncrement() != 0) {
            z = false;
        }
        if (z) {
            MediaBrowserCompat$ItemReceiver();
        }
        if (this.f5508x50fd9e4a.decrementAndGet() == 0) {
            this.RatingCompat.dispose();
        }
        this.MediaBrowserCompat$ItemReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                MediaBrowserCompat$ItemReceiver();
            }
            if (this.f5508x50fd9e4a.decrementAndGet() == 0) {
                this.RatingCompat.dispose();
            }
            this.MediaBrowserCompat$ItemReceiver.onComplete();
        }
    }

    public final void dispose() {
        if (this.MediaSessionCompat$ResultReceiverWrapper.compareAndSet(false, true)) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$SearchResultReceiver);
            if (this.f5508x50fd9e4a.decrementAndGet() == 0) {
                this.MediaBrowserCompat$MediaItem.dispose();
            }
        }
    }

    public final boolean isDisposed() {
        return this.MediaSessionCompat$ResultReceiverWrapper.get();
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver() {
        HmlApplicationOutcomeActivity hmlApplicationOutcomeActivity = (HmlApplicationOutcomeActivity) this.write;
        BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        List<HmlETBLoanSetupActivity<T>> list = this.MediaSessionCompat$Token;
        int i = 1;
        while (true) {
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            Object read = hmlApplicationOutcomeActivity.read();
            boolean z2 = read == null;
            if (z && z2) {
                this.RatingCompat.dispose();
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$SearchResultReceiver);
                Throwable th = this.IconCompatParcelizer;
                if (th != null) {
                    for (HmlETBLoanSetupActivity<T> onError : list) {
                        onError.onError(th);
                    }
                } else {
                    for (HmlETBLoanSetupActivity<T> onComplete : list) {
                        onComplete.onComplete();
                    }
                }
                list.clear();
                return;
            } else if (z2) {
                i = this.MediaMetadataCompat.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else if (read instanceof FastPayTransferReviewActivity.IconCompatParcelizer) {
                FastPayTransferReviewActivity.IconCompatParcelizer iconCompatParcelizer = (FastPayTransferReviewActivity.IconCompatParcelizer) read;
                if (iconCompatParcelizer.IconCompatParcelizer != null) {
                    if (list.remove(iconCompatParcelizer.IconCompatParcelizer)) {
                        iconCompatParcelizer.IconCompatParcelizer.onComplete();
                        if (this.f5508x50fd9e4a.decrementAndGet() == 0) {
                            this.RatingCompat.dispose();
                            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$SearchResultReceiver);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else if (!this.MediaSessionCompat$ResultReceiverWrapper.get()) {
                    HmlETBLoanSetupActivity MediaBrowserCompat$CustomActionResultReceiver = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat);
                    list.add(MediaBrowserCompat$CustomActionResultReceiver);
                    bankingAgentTransactionsDeepLinkActivity.onNext(MediaBrowserCompat$CustomActionResultReceiver);
                    try {
                        DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaSessionCompat$QueueItem.write(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver), "The ObservableSource supplied is null");
                        FastPayTransferReviewActivity.read read2 = new FastPayTransferReviewActivity.read(this, MediaBrowserCompat$CustomActionResultReceiver);
                        if (this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(read2)) {
                            this.f5508x50fd9e4a.getAndIncrement();
                            debitCardResetPinSuccessActivity_ViewBinding.subscribe(read2);
                        }
                    } catch (Throwable th2) {
                        AlertController$RecycleListView.read.write(th2);
                        this.MediaSessionCompat$ResultReceiverWrapper.set(true);
                        bankingAgentTransactionsDeepLinkActivity.onError(th2);
                    }
                }
            } else {
                for (HmlETBLoanSetupActivity<T> onNext : list) {
                    onNext.onNext(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(read));
                }
            }
        }
    }

    public final void onNext(T t) {
        boolean z = false;
        if (this.MediaMetadataCompat.get() == 0 && this.MediaMetadataCompat.compareAndSet(0, 1)) {
            for (HmlETBLoanSetupActivity<T> onNext : this.MediaSessionCompat$Token) {
                onNext.onNext(t);
            }
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
