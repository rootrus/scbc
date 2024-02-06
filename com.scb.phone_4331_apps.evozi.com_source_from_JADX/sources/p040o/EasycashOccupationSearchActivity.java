package p040o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashOccupationSearchActivity */
public final class EasycashOccupationSearchActivity<TLeft, TRight, TLeftEnd, TRightEnd, R> extends NtbUserInfoActivity<TLeft, R> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends TRight> MediaBrowserCompat$CustomActionResultReceiver;
    private ChequeManagementDeepLinkActivity<? super TLeft, ? super DebitCardResetOtpActivity<TRight>, ? extends R> MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> read;
    private DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> write;

    public EasycashOccupationSearchActivity(DebitCardResetPinSuccessActivity_ViewBinding<TLeft> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends TRight> debitCardResetPinSuccessActivity_ViewBinding2, DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> directDebitDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super TLeft, ? super DebitCardResetOtpActivity<TRight>, ? extends R> chequeManagementDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.read = directDebitDeepLinkActivity;
        this.write = directDebitDeepLinkActivity2;
        this.MediaBrowserCompat$ItemReceiver = chequeManagementDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, this.read, this.write, this.MediaBrowserCompat$ItemReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        C9721x88504ac4 easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9721x88504ac4(read2, true);
        read2.write.MediaBrowserCompat$CustomActionResultReceiver(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
        C9721x88504ac4 easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver2 = new C9721x88504ac4(read2, false);
        read2.write.MediaBrowserCompat$CustomActionResultReceiver(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver2);
        this.IconCompatParcelizer.subscribe(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver2);
    }

    /* renamed from: o.EasycashOccupationSearchActivity$read */
    static final class read<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements BulkTransferDeepLinkActivity, EasycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver {
        private static Integer IconCompatParcelizer = 2;
        private static Integer MediaBrowserCompat$CustomActionResultReceiver = 4;
        private static Integer MediaBrowserCompat$ItemReceiver = 1;
        private static Integer read = 3;
        private AtomicReference<Throwable> MediaBrowserCompat$MediaItem = new AtomicReference<>();
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private Map<Integer, HmlETBLoanSetupActivity<TRight>> f5505x50fd9e4a = new LinkedHashMap();
        private volatile boolean MediaDescriptionCompat;
        private DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> MediaMetadataCompat;
        private ChequeManagementDeepLinkActivity<? super TLeft, ? super DebitCardResetOtpActivity<TRight>, ? extends R> MediaSessionCompat$QueueItem;
        private HmlBaseEmailAboutActivity<Object> MediaSessionCompat$ResultReceiverWrapper = new HmlBaseEmailAboutActivity<>(DebitCardResetOtpActivity.bufferSize());
        private DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> MediaSessionCompat$Token;
        private int ParcelableVolumeInfo;
        private int PlaybackStateCompat;
        private AtomicInteger RatingCompat;
        private Map<Integer, TRight> setHasDecor = new LinkedHashMap();
        final ChequeInquiryDeepLinkActivity write = new ChequeInquiryDeepLinkActivity();

        read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> directDebitDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super TLeft, ? super DebitCardResetOtpActivity<TRight>, ? extends R> chequeManagementDeepLinkActivity) {
            this.MediaBrowserCompat$SearchResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaMetadataCompat = directDebitDeepLinkActivity;
            this.MediaSessionCompat$Token = directDebitDeepLinkActivity2;
            this.MediaSessionCompat$QueueItem = chequeManagementDeepLinkActivity;
            this.RatingCompat = new AtomicInteger(2);
        }

        public final void dispose() {
            if (!this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = true;
                this.write.dispose();
                if (getAndIncrement() == 0) {
                    this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.MediaDescriptionCompat;
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity) {
            Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$MediaItem);
            for (HmlETBLoanSetupActivity<TRight> onError : this.f5505x50fd9e4a.values()) {
                onError.onError(read2);
            }
            this.f5505x50fd9e4a.clear();
            this.setHasDecor.clear();
            bankingAgentTransactionsDeepLinkActivity.onError(read2);
        }

        private void write() {
            if (getAndIncrement() == 0) {
                HmlBaseEmailAboutActivity<Object> hmlBaseEmailAboutActivity = this.MediaSessionCompat$ResultReceiverWrapper;
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
                int i = 1;
                while (!this.MediaDescriptionCompat) {
                    if (this.MediaBrowserCompat$MediaItem.get() != null) {
                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                        this.write.dispose();
                        MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity);
                        return;
                    }
                    boolean z = this.RatingCompat.get() == 0;
                    Integer num = (Integer) hmlBaseEmailAboutActivity.read();
                    boolean z2 = num == null;
                    if (z && z2) {
                        for (HmlETBLoanSetupActivity<TRight> onComplete : this.f5505x50fd9e4a.values()) {
                            onComplete.onComplete();
                        }
                        this.f5505x50fd9e4a.clear();
                        this.setHasDecor.clear();
                        this.write.dispose();
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object read2 = hmlBaseEmailAboutActivity.read();
                        if (num == MediaBrowserCompat$ItemReceiver) {
                            HmlETBLoanSetupActivity MediaBrowserCompat$ItemReceiver2 = HmlETBLoanSetupActivity.MediaBrowserCompat$ItemReceiver();
                            int i2 = this.ParcelableVolumeInfo;
                            this.ParcelableVolumeInfo = i2 + 1;
                            this.f5505x50fd9e4a.put(Integer.valueOf(i2), MediaBrowserCompat$ItemReceiver2);
                            try {
                                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaMetadataCompat.write(read2), "The leftEnd returned a null ObservableSource");
                                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, true, i2);
                                this.write.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer);
                                debitCardResetPinSuccessActivity_ViewBinding.subscribe(iconCompatParcelizer);
                                if (this.MediaBrowserCompat$MediaItem.get() != null) {
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    this.write.dispose();
                                    MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity);
                                    return;
                                }
                                try {
                                    bankingAgentTransactionsDeepLinkActivity.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaSessionCompat$QueueItem.read(read2, MediaBrowserCompat$ItemReceiver2), "The resultSelector returned a null value"));
                                    for (TRight onNext : this.setHasDecor.values()) {
                                        MediaBrowserCompat$ItemReceiver2.onNext(onNext);
                                    }
                                } catch (Throwable th) {
                                    AlertController$RecycleListView.read.write(th);
                                    HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th);
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    this.write.dispose();
                                    MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity);
                                    return;
                                }
                            } catch (Throwable th2) {
                                AlertController$RecycleListView.read.write(th2);
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th2);
                                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                this.write.dispose();
                                MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity);
                                return;
                            }
                        } else if (num == IconCompatParcelizer) {
                            int i3 = this.PlaybackStateCompat;
                            this.PlaybackStateCompat = i3 + 1;
                            this.setHasDecor.put(Integer.valueOf(i3), read2);
                            try {
                                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding2 = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaSessionCompat$Token.write(read2), "The rightEnd returned a null ObservableSource");
                                IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(this, false, i3);
                                this.write.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer2);
                                debitCardResetPinSuccessActivity_ViewBinding2.subscribe(iconCompatParcelizer2);
                                if (this.MediaBrowserCompat$MediaItem.get() != null) {
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    this.write.dispose();
                                    MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity);
                                    return;
                                }
                                for (HmlETBLoanSetupActivity<TRight> onNext2 : this.f5505x50fd9e4a.values()) {
                                    onNext2.onNext(read2);
                                }
                            } catch (Throwable th3) {
                                AlertController$RecycleListView.read.write(th3);
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th3);
                                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                this.write.dispose();
                                MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity);
                                return;
                            }
                        } else if (num == read) {
                            IconCompatParcelizer iconCompatParcelizer3 = (IconCompatParcelizer) read2;
                            HmlETBLoanSetupActivity remove = this.f5505x50fd9e4a.remove(Integer.valueOf(iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver));
                            if (this.write.read(iconCompatParcelizer3)) {
                                iconCompatParcelizer3.dispose();
                            }
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == MediaBrowserCompat$CustomActionResultReceiver) {
                            IconCompatParcelizer iconCompatParcelizer4 = (IconCompatParcelizer) read2;
                            this.setHasDecor.remove(Integer.valueOf(iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver));
                            if (this.write.read(iconCompatParcelizer4)) {
                                iconCompatParcelizer4.dispose();
                            }
                        }
                    }
                }
                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void write(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th)) {
                this.RatingCompat.decrementAndGet();
                write();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void IconCompatParcelizer(C9721x88504ac4 easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver) {
            this.write.read(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
            this.RatingCompat.decrementAndGet();
            write();
        }

        public final void IconCompatParcelizer(boolean z, Object obj) {
            synchronized (this) {
                this.MediaSessionCompat$ResultReceiverWrapper.read(z ? MediaBrowserCompat$ItemReceiver : IconCompatParcelizer, obj);
            }
            write();
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z, IconCompatParcelizer iconCompatParcelizer) {
            synchronized (this) {
                this.MediaSessionCompat$ResultReceiverWrapper.read(z ? read : MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer);
            }
            write();
        }

        public final void MediaBrowserCompat$ItemReceiver(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th)) {
                write();
            } else {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    /* renamed from: o.EasycashOccupationSearchActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object>, BulkTransferDeepLinkActivity {
        private EasycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        final int MediaBrowserCompat$CustomActionResultReceiver;
        private boolean read;

        IconCompatParcelizer(EasycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver easycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver, boolean z, int i) {
            this.IconCompatParcelizer = easycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver;
            this.read = z;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(Object obj) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this)) {
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read, this);
            }
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read, this);
        }
    }
}
