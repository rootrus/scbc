package p040o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.EasycashOccupationSearchActivity;

/* renamed from: o.EasycashCreditPowerInformationActivity */
public final class EasycashCreditPowerInformationActivity<TLeft, TRight, TLeftEnd, TRightEnd, R> extends NtbUserInfoActivity<TLeft, R> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends TRight> MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> read;
    private ChequeManagementDeepLinkActivity<? super TLeft, ? super TRight, ? extends R> write;

    public EasycashCreditPowerInformationActivity(DebitCardResetPinSuccessActivity_ViewBinding<TLeft> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends TRight> debitCardResetPinSuccessActivity_ViewBinding2, DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> directDebitDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super TLeft, ? super TRight, ? extends R> chequeManagementDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
        this.read = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity2;
        this.write = chequeManagementDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        write write2 = new write(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$ItemReceiver, this.write);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(write2);
        C9721x88504ac4 easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9721x88504ac4(write2, true);
        write2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
        C9721x88504ac4 easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver2 = new C9721x88504ac4(write2, false);
        write2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver2);
        this.IconCompatParcelizer.subscribe(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver2);
    }

    /* renamed from: o.EasycashCreditPowerInformationActivity$write */
    static final class write<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements BulkTransferDeepLinkActivity, EasycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver {
        private static Integer IconCompatParcelizer = 1;
        private static Integer MediaBrowserCompat$ItemReceiver = 2;
        private static Integer read = 3;
        private static Integer write = 4;
        private int AlertController$RecycleListView;
        final ChequeInquiryDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = new ChequeInquiryDeepLinkActivity();
        private AtomicReference<Throwable> MediaBrowserCompat$MediaItem = new AtomicReference<>();
        private AtomicInteger MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private int f5504x50fd9e4a;
        private DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> MediaDescriptionCompat;
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaMetadataCompat;
        private Map<Integer, TLeft> MediaSessionCompat$QueueItem = new LinkedHashMap();
        private ChequeManagementDeepLinkActivity<? super TLeft, ? super TRight, ? extends R> MediaSessionCompat$ResultReceiverWrapper;
        private HmlBaseEmailAboutActivity<Object> MediaSessionCompat$Token = new HmlBaseEmailAboutActivity<>(DebitCardResetOtpActivity.bufferSize());
        private DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> ParcelableVolumeInfo;
        private Map<Integer, TRight> PlaybackStateCompat = new LinkedHashMap();
        private volatile boolean RatingCompat;

        write(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super TLeft, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> directDebitDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super TLeft, ? super TRight, ? extends R> chequeManagementDeepLinkActivity) {
            this.MediaMetadataCompat = bankingAgentTransactionsDeepLinkActivity;
            this.MediaDescriptionCompat = directDebitDeepLinkActivity;
            this.ParcelableVolumeInfo = directDebitDeepLinkActivity2;
            this.MediaSessionCompat$ResultReceiverWrapper = chequeManagementDeepLinkActivity;
            this.MediaBrowserCompat$SearchResultReceiver = new AtomicInteger(2);
        }

        public final void dispose() {
            if (!this.RatingCompat) {
                this.RatingCompat = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                if (getAndIncrement() == 0) {
                    this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.RatingCompat;
        }

        private void read(BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity) {
            Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$MediaItem);
            this.MediaSessionCompat$QueueItem.clear();
            this.PlaybackStateCompat.clear();
            bankingAgentTransactionsDeepLinkActivity.onError(read2);
        }

        private void MediaBrowserCompat$ItemReceiver() {
            if (getAndIncrement() == 0) {
                HmlBaseEmailAboutActivity<Object> hmlBaseEmailAboutActivity = this.MediaSessionCompat$Token;
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaMetadataCompat;
                int i = 1;
                while (!this.RatingCompat) {
                    if (this.MediaBrowserCompat$MediaItem.get() != null) {
                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                        read(bankingAgentTransactionsDeepLinkActivity);
                        return;
                    }
                    boolean z = this.MediaBrowserCompat$SearchResultReceiver.get() == 0;
                    Integer num = (Integer) hmlBaseEmailAboutActivity.read();
                    boolean z2 = num == null;
                    if (z && z2) {
                        this.MediaSessionCompat$QueueItem.clear();
                        this.PlaybackStateCompat.clear();
                        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object read2 = hmlBaseEmailAboutActivity.read();
                        if (num == IconCompatParcelizer) {
                            int i2 = this.f5504x50fd9e4a;
                            this.f5504x50fd9e4a = i2 + 1;
                            this.MediaSessionCompat$QueueItem.put(Integer.valueOf(i2), read2);
                            try {
                                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaDescriptionCompat.write(read2), "The leftEnd returned a null ObservableSource");
                                EasycashOccupationSearchActivity.IconCompatParcelizer iconCompatParcelizer = new EasycashOccupationSearchActivity.IconCompatParcelizer(this, true, i2);
                                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer);
                                debitCardResetPinSuccessActivity_ViewBinding.subscribe(iconCompatParcelizer);
                                if (this.MediaBrowserCompat$MediaItem.get() != null) {
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                                    read(bankingAgentTransactionsDeepLinkActivity);
                                    return;
                                }
                                for (TRight read3 : this.PlaybackStateCompat.values()) {
                                    try {
                                        bankingAgentTransactionsDeepLinkActivity.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaSessionCompat$ResultReceiverWrapper.read(read2, read3), "The resultSelector returned a null value"));
                                    } catch (Throwable th) {
                                        AlertController$RecycleListView.read.write(th);
                                        HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th);
                                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                                        read(bankingAgentTransactionsDeepLinkActivity);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                AlertController$RecycleListView.read.write(th2);
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th2);
                                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                                read(bankingAgentTransactionsDeepLinkActivity);
                                return;
                            }
                        } else if (num == MediaBrowserCompat$ItemReceiver) {
                            int i3 = this.AlertController$RecycleListView;
                            this.AlertController$RecycleListView = i3 + 1;
                            this.PlaybackStateCompat.put(Integer.valueOf(i3), read2);
                            try {
                                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding2 = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.ParcelableVolumeInfo.write(read2), "The rightEnd returned a null ObservableSource");
                                EasycashOccupationSearchActivity.IconCompatParcelizer iconCompatParcelizer2 = new EasycashOccupationSearchActivity.IconCompatParcelizer(this, false, i3);
                                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer2);
                                debitCardResetPinSuccessActivity_ViewBinding2.subscribe(iconCompatParcelizer2);
                                if (this.MediaBrowserCompat$MediaItem.get() != null) {
                                    hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                    this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                                    read(bankingAgentTransactionsDeepLinkActivity);
                                    return;
                                }
                                for (TLeft read4 : this.MediaSessionCompat$QueueItem.values()) {
                                    try {
                                        bankingAgentTransactionsDeepLinkActivity.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaSessionCompat$ResultReceiverWrapper.read(read4, read2), "The resultSelector returned a null value"));
                                    } catch (Throwable th3) {
                                        AlertController$RecycleListView.read.write(th3);
                                        HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th3);
                                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                                        read(bankingAgentTransactionsDeepLinkActivity);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                AlertController$RecycleListView.read.write(th4);
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th4);
                                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                                this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                                read(bankingAgentTransactionsDeepLinkActivity);
                                return;
                            }
                        } else if (num == read) {
                            EasycashOccupationSearchActivity.IconCompatParcelizer iconCompatParcelizer3 = (EasycashOccupationSearchActivity.IconCompatParcelizer) read2;
                            this.MediaSessionCompat$QueueItem.remove(Integer.valueOf(iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver));
                            if (this.MediaBrowserCompat$CustomActionResultReceiver.read(iconCompatParcelizer3)) {
                                iconCompatParcelizer3.dispose();
                            }
                        } else {
                            EasycashOccupationSearchActivity.IconCompatParcelizer iconCompatParcelizer4 = (EasycashOccupationSearchActivity.IconCompatParcelizer) read2;
                            this.PlaybackStateCompat.remove(Integer.valueOf(iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver));
                            if (this.MediaBrowserCompat$CustomActionResultReceiver.read(iconCompatParcelizer4)) {
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
                this.MediaBrowserCompat$SearchResultReceiver.decrementAndGet();
                MediaBrowserCompat$ItemReceiver();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void IconCompatParcelizer(C9721x88504ac4 easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.read(easycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$SearchResultReceiver.decrementAndGet();
            MediaBrowserCompat$ItemReceiver();
        }

        public final void IconCompatParcelizer(boolean z, Object obj) {
            synchronized (this) {
                this.MediaSessionCompat$Token.read(z ? IconCompatParcelizer : MediaBrowserCompat$ItemReceiver, obj);
            }
            MediaBrowserCompat$ItemReceiver();
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z, EasycashOccupationSearchActivity.IconCompatParcelizer iconCompatParcelizer) {
            synchronized (this) {
                this.MediaSessionCompat$Token.read(z ? read : write, iconCompatParcelizer);
            }
            MediaBrowserCompat$ItemReceiver();
        }

        public final void MediaBrowserCompat$ItemReceiver(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, th)) {
                MediaBrowserCompat$ItemReceiver();
            } else {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }
}
