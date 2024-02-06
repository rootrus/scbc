package p040o;

import java.util.concurrent.atomic.AtomicLong;
import p039io.reactivex.exceptions.MissingBackpressureException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ThirdPartySlipDeepLinkActivity */
public final class ThirdPartySlipDeepLinkActivity<T> extends SCBBillPaymentDeepLinkActivity<T, T> {
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private boolean MediaDescriptionCompat = true;
    private DataPrivacyManagementDeepLinkActivity read;

    public ThirdPartySlipDeepLinkActivity(DebitCardRequestReviewActivity<T> debitCardRequestReviewActivity, int i, boolean z, boolean z2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        super(debitCardRequestReviewActivity);
        this.IconCompatParcelizer = i;
        this.read = dataPrivacyManagementDeepLinkActivity;
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        this.write.MediaBrowserCompat$ItemReceiver(new IconCompatParcelizer(depositDetailRecyclerViewAdapter$DepositViewHolder, this.IconCompatParcelizer, this.MediaDescriptionCompat, this.MediaBrowserCompat$CustomActionResultReceiver, this.read));
    }

    /* renamed from: o.ThirdPartySlipDeepLinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends HmlBaseReviewActivity_ViewBinding<T> implements DebitCardRequestPayOtpActivity<T> {
        private Throwable IconCompatParcelizer;
        private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$MediaItem;
        private AtomicLong MediaBrowserCompat$SearchResultReceiver = new AtomicLong();
        private boolean MediaDescriptionCompat;
        private SelectProvinceOrDistrictAdapter$ViewHolder MediaMetadataCompat;
        private HmlLoanOfferStatusDeepLinkBaseActivity<T> RatingCompat;
        private boolean read;
        private volatile boolean write;

        IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder, int i, boolean z, boolean z2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
            HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = depositDetailRecyclerViewAdapter$DepositViewHolder;
            this.MediaBrowserCompat$MediaItem = dataPrivacyManagementDeepLinkActivity;
            this.read = z2;
            if (z) {
                hmlLoanOfferStatusDeepLinkBaseActivity = new HmlBaseEmailAboutActivity<>(i);
            } else {
                hmlLoanOfferStatusDeepLinkBaseActivity = new HmlBaseConsentActivity<>(i);
            }
            this.RatingCompat = hmlLoanOfferStatusDeepLinkBaseActivity;
        }

        public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, selectProvinceOrDistrictAdapter$ViewHolder)) {
                this.MediaMetadataCompat = selectProvinceOrDistrictAdapter$ViewHolder;
                this.MediaBrowserCompat$CustomActionResultReceiver.read(this);
                selectProvinceOrDistrictAdapter$ViewHolder.write(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.RatingCompat.IconCompatParcelizer(t)) {
                this.MediaMetadataCompat.aQ_();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.MediaBrowserCompat$MediaItem.read();
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.MediaDescriptionCompat) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(null);
            } else {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer = th;
            this.write = true;
            if (this.MediaDescriptionCompat) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            } else {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void onComplete() {
            this.write = true;
            if (this.MediaDescriptionCompat) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
            } else {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void write(long j) {
            if (!this.MediaDescriptionCompat && setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
                AlertController$RecycleListView.write(this.MediaBrowserCompat$SearchResultReceiver, j);
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void aQ_() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.MediaMetadataCompat.aQ_();
                if (getAndIncrement() == 0) {
                    this.RatingCompat.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver() {
            int i;
            if (getAndIncrement() == 0) {
                HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity = this.RatingCompat;
                DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i2 = 1;
                while (!IconCompatParcelizer(this.write, hmlLoanOfferStatusDeepLinkBaseActivity.write(), depositDetailRecyclerViewAdapter$DepositViewHolder)) {
                    long j = this.MediaBrowserCompat$SearchResultReceiver.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.write;
                        T read2 = hmlLoanOfferStatusDeepLinkBaseActivity.read();
                        boolean z2 = read2 == null;
                        if (!IconCompatParcelizer(z, z2, depositDetailRecyclerViewAdapter$DepositViewHolder)) {
                            if (z2) {
                                break;
                            }
                            depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(read2);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !IconCompatParcelizer(this.write, hmlLoanOfferStatusDeepLinkBaseActivity.write(), depositDetailRecyclerViewAdapter$DepositViewHolder)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.MediaBrowserCompat$SearchResultReceiver.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        private boolean IconCompatParcelizer(boolean z, boolean z2, DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                this.RatingCompat.MediaBrowserCompat$ItemReceiver();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.read) {
                    Throwable th = this.IconCompatParcelizer;
                    if (th != null) {
                        this.RatingCompat.MediaBrowserCompat$ItemReceiver();
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.IconCompatParcelizer;
                    if (th2 != null) {
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th2);
                    } else {
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                    }
                    return true;
                }
            }
        }

        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.MediaDescriptionCompat = true;
            return 2;
        }

        public final T read() throws Exception {
            return this.RatingCompat.read();
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.RatingCompat.MediaBrowserCompat$ItemReceiver();
        }

        public final boolean write() {
            return this.RatingCompat.write();
        }
    }
}
