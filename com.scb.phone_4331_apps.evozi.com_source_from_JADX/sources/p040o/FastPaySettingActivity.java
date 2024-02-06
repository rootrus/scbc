package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FastPaySettingActivity */
public final class FastPaySettingActivity<T, B> extends NtbUserInfoActivity<T, DebitCardResetOtpActivity<T>> {
    private DebitCardResetPinSuccessActivity_ViewBinding<B> MediaBrowserCompat$CustomActionResultReceiver;
    private int write;

    public FastPaySettingActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding2, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.write = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        write write2 = new write(bankingAgentTransactionsDeepLinkActivity, this.write);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(write2);
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(write2.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer.subscribe(write2);
    }

    /* renamed from: o.FastPaySettingActivity$write */
    static final class write<T, B> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        static final Object write = new Object();
        final HmlBusinessETBPersonalInfoActivity IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
        volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        final FastPaySettingActivity$MediaBrowserCompat$ItemReceiver<T, B> MediaBrowserCompat$ItemReceiver = new FastPaySettingActivity$MediaBrowserCompat$ItemReceiver<>(this);
        private int MediaBrowserCompat$MediaItem;
        private HmlETBLoanSetupActivity<T> MediaBrowserCompat$SearchResultReceiver;
        final AtomicReference<BulkTransferDeepLinkActivity> MediaDescriptionCompat = new AtomicReference<>();
        private BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> MediaMetadataCompat;
        private AtomicInteger MediaSessionCompat$ResultReceiverWrapper = new AtomicInteger(1);
        private AtomicBoolean RatingCompat = new AtomicBoolean();
        final HmlApplicationOutcomeActivity<Object> read = new HmlApplicationOutcomeActivity<>();

        write(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, int i) {
            this.MediaMetadataCompat = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat, bulkTransferDeepLinkActivity)) {
                this.read.IconCompatParcelizer(write);
                MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void onNext(T t) {
            this.read.IconCompatParcelizer(t);
            MediaBrowserCompat$ItemReceiver();
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver.dispose();
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer, th)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                MediaBrowserCompat$ItemReceiver();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$ItemReceiver.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            MediaBrowserCompat$ItemReceiver();
        }

        public final void dispose() {
            if (this.RatingCompat.compareAndSet(false, true)) {
                this.MediaBrowserCompat$ItemReceiver.dispose();
                if (this.MediaSessionCompat$ResultReceiverWrapper.decrementAndGet() == 0) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
                }
            }
        }

        public final boolean isDisposed() {
            return this.RatingCompat.get();
        }

        public final void run() {
            if (this.MediaSessionCompat$ResultReceiverWrapper.decrementAndGet() == 0) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver() {
            if (getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity = this.MediaMetadataCompat;
                HmlApplicationOutcomeActivity<Object> hmlApplicationOutcomeActivity = this.read;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.IconCompatParcelizer;
                int i = 1;
                while (this.MediaSessionCompat$ResultReceiverWrapper.get() != 0) {
                    HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.MediaBrowserCompat$SearchResultReceiver;
                    boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (!z || hmlBusinessETBPersonalInfoActivity.get() == null) {
                        Object read2 = hmlApplicationOutcomeActivity.read();
                        boolean z2 = read2 == null;
                        if (z && z2) {
                            Throwable read3 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                            if (read3 == null) {
                                if (hmlETBLoanSetupActivity != null) {
                                    this.MediaBrowserCompat$SearchResultReceiver = null;
                                    hmlETBLoanSetupActivity.onComplete();
                                }
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                            if (hmlETBLoanSetupActivity != null) {
                                this.MediaBrowserCompat$SearchResultReceiver = null;
                                hmlETBLoanSetupActivity.onError(read3);
                            }
                            bankingAgentTransactionsDeepLinkActivity.onError(read3);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (read2 != write) {
                            hmlETBLoanSetupActivity.onNext(read2);
                        } else {
                            if (hmlETBLoanSetupActivity != null) {
                                this.MediaBrowserCompat$SearchResultReceiver = null;
                                hmlETBLoanSetupActivity.onComplete();
                            }
                            if (!this.RatingCompat.get()) {
                                HmlETBLoanSetupActivity<T> IconCompatParcelizer2 = HmlETBLoanSetupActivity.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, this);
                                this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer2;
                                this.MediaSessionCompat$ResultReceiverWrapper.getAndIncrement();
                                bankingAgentTransactionsDeepLinkActivity.onNext(IconCompatParcelizer2);
                            }
                        }
                    } else {
                        hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
                        Throwable read4 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                        if (hmlETBLoanSetupActivity != null) {
                            this.MediaBrowserCompat$SearchResultReceiver = null;
                            hmlETBLoanSetupActivity.onError(read4);
                        }
                        bankingAgentTransactionsDeepLinkActivity.onError(read4);
                        return;
                    }
                }
                hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$SearchResultReceiver = null;
            }
        }
    }
}
