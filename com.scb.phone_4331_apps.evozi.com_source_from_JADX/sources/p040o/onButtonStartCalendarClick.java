package p040o;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onButtonStartCalendarClick */
public final class onButtonStartCalendarClick<T, R> extends NtbUserInfoActivity<T, R> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBusinessOccupationInfoActivity MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> read;
    private int write;

    public onButtonStartCalendarClick(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity, int i, int i2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOccupationInfoActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = i2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.onButtonStartCalendarClick$read */
    static final class read<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, PartnerConsentUuidDeepLinkActivity<R> {
        private int IconCompatParcelizer;
        private NdidIdpDeepLinkActivity<R> MediaBrowserCompat$CustomActionResultReceiver;
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        private ArrayDeque<NdidIdpDeepLinkActivity<R>> MediaBrowserCompat$MediaItem = new ArrayDeque<>();
        private HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$SearchResultReceiver = new HmlBusinessETBPersonalInfoActivity();

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private HmlSuccessfulDeepLinkActivity<T> f5550x50fd9e4a;
        private int MediaDescriptionCompat;
        private HmlBusinessOccupationInfoActivity MediaMetadataCompat;
        private int MediaSessionCompat$QueueItem;
        private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
        private int ParcelableVolumeInfo;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> RatingCompat;
        private BankingAgentTransactionsDeepLinkActivity<? super R> read;
        private volatile boolean write;

        read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, int i2, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.RatingCompat = directDebitDeepLinkActivity;
            this.MediaDescriptionCompat = i;
            this.ParcelableVolumeInfo = i2;
            this.MediaMetadataCompat = hmlBusinessOccupationInfoActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$Token, bulkTransferDeepLinkActivity)) {
                this.MediaSessionCompat$Token = bulkTransferDeepLinkActivity;
                if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                    HmlLoanOfferStatusDeepLinkActivity hmlLoanOfferStatusDeepLinkActivity = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                    int write2 = hmlLoanOfferStatusDeepLinkActivity.write(3);
                    if (write2 == 1) {
                        this.MediaSessionCompat$QueueItem = write2;
                        this.f5550x50fd9e4a = hmlLoanOfferStatusDeepLinkActivity;
                        this.write = true;
                        this.read.onSubscribe(this);
                        write();
                        return;
                    } else if (write2 == 2) {
                        this.MediaSessionCompat$QueueItem = write2;
                        this.f5550x50fd9e4a = hmlLoanOfferStatusDeepLinkActivity;
                        this.read.onSubscribe(this);
                        return;
                    }
                }
                this.f5550x50fd9e4a = new HmlBaseEmailAboutActivity(this.ParcelableVolumeInfo);
                this.read.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.MediaSessionCompat$QueueItem == 0) {
                this.f5550x50fd9e4a.IconCompatParcelizer(t);
            }
            write();
        }

        public final void onError(Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, th)) {
                this.write = true;
                write();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            this.write = true;
            write();
        }

        public final void dispose() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.MediaSessionCompat$Token.dispose();
                if (getAndIncrement() == 0) {
                    do {
                        this.f5550x50fd9e4a.MediaBrowserCompat$ItemReceiver();
                        read();
                    } while (decrementAndGet() != 0);
                }
            }
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        private void read() {
            NdidIdpDeepLinkActivity<R> ndidIdpDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (ndidIdpDeepLinkActivity != null) {
                ndidIdpDeepLinkActivity.dispose();
            }
            while (true) {
                NdidIdpDeepLinkActivity poll = this.MediaBrowserCompat$MediaItem.poll();
                if (poll != null) {
                    poll.dispose();
                } else {
                    return;
                }
            }
        }

        public final void IconCompatParcelizer(NdidIdpDeepLinkActivity<R> ndidIdpDeepLinkActivity, Throwable th) {
            if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, th)) {
                if (this.MediaMetadataCompat == HmlBusinessOccupationInfoActivity.IMMEDIATE) {
                    this.MediaSessionCompat$Token.dispose();
                }
                ndidIdpDeepLinkActivity.write = true;
                write();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void write() {
            if (getAndIncrement() == 0) {
                HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.f5550x50fd9e4a;
                ArrayDeque<NdidIdpDeepLinkActivity<R>> arrayDeque = this.MediaBrowserCompat$MediaItem;
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.read;
                HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity = this.MediaMetadataCompat;
                int i = 1;
                while (true) {
                    int i2 = this.IconCompatParcelizer;
                    while (i2 != this.MediaDescriptionCompat) {
                        if (this.MediaBrowserCompat$ItemReceiver) {
                            hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                            read();
                            return;
                        } else if (hmlBusinessOccupationInfoActivity != HmlBusinessOccupationInfoActivity.IMMEDIATE || ((Throwable) this.MediaBrowserCompat$SearchResultReceiver.get()) == null) {
                            try {
                                T read2 = hmlSuccessfulDeepLinkActivity.read();
                                if (read2 == null) {
                                    break;
                                }
                                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.RatingCompat.write(read2), "The mapper returned a null ObservableSource");
                                NdidIdpDeepLinkActivity ndidIdpDeepLinkActivity = new NdidIdpDeepLinkActivity(this, this.ParcelableVolumeInfo);
                                arrayDeque.offer(ndidIdpDeepLinkActivity);
                                debitCardResetPinSuccessActivity_ViewBinding.subscribe(ndidIdpDeepLinkActivity);
                                i2++;
                            } catch (Throwable th) {
                                AlertController$RecycleListView.read.write(th);
                                this.MediaSessionCompat$Token.dispose();
                                hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                                read();
                                HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, th);
                                bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$SearchResultReceiver));
                                return;
                            }
                        } else {
                            hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                            read();
                            bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$SearchResultReceiver));
                            return;
                        }
                    }
                    this.IconCompatParcelizer = i2;
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                        read();
                        return;
                    } else if (hmlBusinessOccupationInfoActivity != HmlBusinessOccupationInfoActivity.IMMEDIATE || ((Throwable) this.MediaBrowserCompat$SearchResultReceiver.get()) == null) {
                        NdidIdpDeepLinkActivity<R> ndidIdpDeepLinkActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (ndidIdpDeepLinkActivity2 == null) {
                            if (hmlBusinessOccupationInfoActivity != HmlBusinessOccupationInfoActivity.BOUNDARY || ((Throwable) this.MediaBrowserCompat$SearchResultReceiver.get()) == null) {
                                boolean z = this.write;
                                NdidIdpDeepLinkActivity<R> poll = arrayDeque.poll();
                                boolean z2 = poll == null;
                                if (!z || !z2) {
                                    if (!z2) {
                                        this.MediaBrowserCompat$CustomActionResultReceiver = poll;
                                    }
                                    ndidIdpDeepLinkActivity2 = poll;
                                } else if (((Throwable) this.MediaBrowserCompat$SearchResultReceiver.get()) != null) {
                                    hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                                    read();
                                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$SearchResultReceiver));
                                    return;
                                } else {
                                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                                    return;
                                }
                            } else {
                                hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                                read();
                                bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$SearchResultReceiver));
                                return;
                            }
                        }
                        if (ndidIdpDeepLinkActivity2 != null) {
                            HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity2 = ndidIdpDeepLinkActivity2.IconCompatParcelizer;
                            while (!this.MediaBrowserCompat$ItemReceiver) {
                                boolean z3 = ndidIdpDeepLinkActivity2.write;
                                if (hmlBusinessOccupationInfoActivity != HmlBusinessOccupationInfoActivity.IMMEDIATE || ((Throwable) this.MediaBrowserCompat$SearchResultReceiver.get()) == null) {
                                    try {
                                        T read3 = hmlSuccessfulDeepLinkActivity2.read();
                                        boolean z4 = read3 == null;
                                        if (z3 && z4) {
                                            this.MediaBrowserCompat$CustomActionResultReceiver = null;
                                            this.IconCompatParcelizer--;
                                        } else if (!z4) {
                                            bankingAgentTransactionsDeepLinkActivity.onNext(read3);
                                        }
                                    } catch (Throwable th2) {
                                        AlertController$RecycleListView.read.write(th2);
                                        HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, th2);
                                        this.MediaBrowserCompat$CustomActionResultReceiver = null;
                                        this.IconCompatParcelizer--;
                                    }
                                } else {
                                    hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                                    read();
                                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$SearchResultReceiver));
                                    return;
                                }
                            }
                            hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                            read();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                        read();
                        bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$SearchResultReceiver));
                        return;
                    }
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(NdidIdpDeepLinkActivity<R> ndidIdpDeepLinkActivity) {
            ndidIdpDeepLinkActivity.write = true;
            write();
        }

        public final void write(NdidIdpDeepLinkActivity<R> ndidIdpDeepLinkActivity, R r) {
            ndidIdpDeepLinkActivity.IconCompatParcelizer.IconCompatParcelizer(r);
            write();
        }
    }
}
