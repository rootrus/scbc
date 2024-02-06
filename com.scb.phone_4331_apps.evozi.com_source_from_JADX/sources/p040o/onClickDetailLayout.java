package p040o;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onClickDetailLayout */
public final class onClickDetailLayout<T, B> extends NtbUserInfoActivity<T, DebitCardResetOtpActivity<T>> {
    private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> MediaBrowserCompat$CustomActionResultReceiver;
    private int read;

    public onClickDetailLayout(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = callable;
        this.read = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.onClickDetailLayout$write */
    static final class write<T, B> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        static final Object IconCompatParcelizer = new Object();
        private static C10093xc60239f1<Object, Object> MediaDescriptionCompat = new C10093xc60239f1<>((write) null);
        final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
        volatile boolean MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> MediaBrowserCompat$MediaItem;
        private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private HmlETBLoanSetupActivity<T> f5551x50fd9e4a;
        BulkTransferDeepLinkActivity MediaMetadataCompat;
        private AtomicBoolean MediaSessionCompat$QueueItem = new AtomicBoolean();
        private AtomicInteger MediaSessionCompat$Token = new AtomicInteger(1);
        private int RatingCompat;
        final HmlApplicationOutcomeActivity<Object> read = new HmlApplicationOutcomeActivity<>();
        final AtomicReference<C10093xc60239f1<T, B>> write = new AtomicReference<>();

        write(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, int i, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable) {
            this.MediaBrowserCompat$MediaItem = bankingAgentTransactionsDeepLinkActivity;
            this.RatingCompat = i;
            this.MediaBrowserCompat$SearchResultReceiver = callable;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaMetadataCompat, bulkTransferDeepLinkActivity)) {
                this.MediaMetadataCompat = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$MediaItem.onSubscribe(this);
                this.read.IconCompatParcelizer(IconCompatParcelizer);
                read();
            }
        }

        public final void onNext(T t) {
            this.read.IconCompatParcelizer(t);
            read();
        }

        public final void dispose() {
            if (this.MediaSessionCompat$QueueItem.compareAndSet(false, true)) {
                BulkTransferDeepLinkActivity andSet = this.write.getAndSet(MediaDescriptionCompat);
                if (!(andSet == null || andSet == MediaDescriptionCompat)) {
                    andSet.dispose();
                }
                if (this.MediaSessionCompat$Token.decrementAndGet() == 0) {
                    this.MediaMetadataCompat.dispose();
                }
            }
        }

        public final boolean isDisposed() {
            return this.MediaSessionCompat$QueueItem.get();
        }

        public final void run() {
            if (this.MediaSessionCompat$Token.decrementAndGet() == 0) {
                this.MediaMetadataCompat.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            if (getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
                HmlApplicationOutcomeActivity<Object> hmlApplicationOutcomeActivity = this.read;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 1;
                while (this.MediaSessionCompat$Token.get() != 0) {
                    HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.f5551x50fd9e4a;
                    boolean z = this.MediaBrowserCompat$ItemReceiver;
                    if (!z || hmlBusinessETBPersonalInfoActivity.get() == null) {
                        Object read2 = hmlApplicationOutcomeActivity.read();
                        boolean z2 = read2 == null;
                        if (z && z2) {
                            Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                            if (read3 == null) {
                                if (hmlETBLoanSetupActivity != null) {
                                    this.f5551x50fd9e4a = null;
                                    hmlETBLoanSetupActivity.onComplete();
                                }
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                            if (hmlETBLoanSetupActivity != null) {
                                this.f5551x50fd9e4a = null;
                                hmlETBLoanSetupActivity.onError(read3);
                            }
                            bankingAgentTransactionsDeepLinkActivity.onError(read3);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (read2 != IconCompatParcelizer) {
                            hmlETBLoanSetupActivity.onNext(read2);
                        } else {
                            if (hmlETBLoanSetupActivity != null) {
                                this.f5551x50fd9e4a = null;
                                hmlETBLoanSetupActivity.onComplete();
                            }
                            if (!this.MediaSessionCompat$QueueItem.get()) {
                                HmlETBLoanSetupActivity<T> IconCompatParcelizer2 = HmlETBLoanSetupActivity.IconCompatParcelizer(this.RatingCompat, this);
                                this.f5551x50fd9e4a = IconCompatParcelizer2;
                                this.MediaSessionCompat$Token.getAndIncrement();
                                try {
                                    DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The other Callable returned a null ObservableSource");
                                    C10093xc60239f1 onclickdetaillayout_mediabrowsercompat_customactionresultreceiver = new C10093xc60239f1(this);
                                    if (this.write.compareAndSet((Object) null, onclickdetaillayout_mediabrowsercompat_customactionresultreceiver)) {
                                        debitCardResetPinSuccessActivity_ViewBinding.subscribe(onclickdetaillayout_mediabrowsercompat_customactionresultreceiver);
                                        bankingAgentTransactionsDeepLinkActivity.onNext(IconCompatParcelizer2);
                                    }
                                } catch (Throwable th) {
                                    AlertController$RecycleListView.read.write(th);
                                    HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th);
                                    this.MediaBrowserCompat$ItemReceiver = true;
                                }
                            }
                        }
                    } else {
                        hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
                        Throwable read4 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                        if (hmlETBLoanSetupActivity != null) {
                            this.f5551x50fd9e4a = null;
                            hmlETBLoanSetupActivity.onError(read4);
                        }
                        bankingAgentTransactionsDeepLinkActivity.onError(read4);
                        return;
                    }
                }
                hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
                this.f5551x50fd9e4a = null;
            }
        }

        public final void onComplete() {
            BulkTransferDeepLinkActivity andSet = this.write.getAndSet(MediaDescriptionCompat);
            if (!(andSet == null || andSet == MediaDescriptionCompat)) {
                andSet.dispose();
            }
            this.MediaBrowserCompat$ItemReceiver = true;
            read();
        }

        public final void onError(Throwable th) {
            BulkTransferDeepLinkActivity andSet = this.write.getAndSet(MediaDescriptionCompat);
            if (!(andSet == null || andSet == MediaDescriptionCompat)) {
                andSet.dispose();
            }
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                this.MediaBrowserCompat$ItemReceiver = true;
                read();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }
    }
}
