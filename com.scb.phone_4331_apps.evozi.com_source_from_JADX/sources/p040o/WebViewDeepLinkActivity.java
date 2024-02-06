package p040o;

import java.util.concurrent.atomic.AtomicLong;
import p039io.reactivex.exceptions.MissingBackpressureException;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.WebViewDeepLinkActivity */
public final class WebViewDeepLinkActivity<T> extends SCBBillPaymentDeepLinkActivity<T, T> {
    private boolean IconCompatParcelizer = false;
    private BankingAgentDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private int read;

    public WebViewDeepLinkActivity(DebitCardRequestReviewActivity<T> debitCardRequestReviewActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, int i) {
        super(debitCardRequestReviewActivity);
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentDeepLinkActivity;
        this.read = i;
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        BankingAgentDeepLinkActivity.read write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (depositDetailRecyclerViewAdapter$DepositViewHolder instanceof HmlBusinessOwnerSummaryDeepLinkActivity) {
            this.write.MediaBrowserCompat$ItemReceiver(new read((HmlBusinessOwnerSummaryDeepLinkActivity) depositDetailRecyclerViewAdapter$DepositViewHolder, write2, this.IconCompatParcelizer, this.read));
        } else {
            this.write.MediaBrowserCompat$ItemReceiver(new write(depositDetailRecyclerViewAdapter$DepositViewHolder, write2, this.IconCompatParcelizer, this.read));
        }
    }

    /* renamed from: o.WebViewDeepLinkActivity$IconCompatParcelizer */
    static abstract class IconCompatParcelizer<T> extends HmlBaseReviewActivity_ViewBinding<T> implements DebitCardRequestPayOtpActivity<T>, Runnable {
        Throwable IconCompatParcelizer;
        final int MediaBrowserCompat$CustomActionResultReceiver;
        volatile boolean MediaBrowserCompat$ItemReceiver;
        SelectProvinceOrDistrictAdapter$ViewHolder MediaBrowserCompat$MediaItem;
        long MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private boolean f3163x50fd9e4a;
        HmlSuccessfulDeepLinkActivity<T> MediaDescriptionCompat;
        int MediaMetadataCompat;
        private boolean MediaSessionCompat$ResultReceiverWrapper;
        final BankingAgentDeepLinkActivity.read ParcelableVolumeInfo;
        final AtomicLong RatingCompat = new AtomicLong();
        volatile boolean read;
        final int write;

        /* access modifiers changed from: package-private */
        public abstract void IconCompatParcelizer();

        /* access modifiers changed from: package-private */
        public abstract void MediaBrowserCompat$CustomActionResultReceiver();

        /* access modifiers changed from: package-private */
        public abstract void MediaBrowserCompat$MediaItem();

        IconCompatParcelizer(BankingAgentDeepLinkActivity.read read2, boolean z, int i) {
            this.ParcelableVolumeInfo = read2;
            this.f3163x50fd9e4a = z;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.write = i - (i >> 2);
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                if (this.MediaMetadataCompat != 2) {
                    if (!this.MediaDescriptionCompat.IconCompatParcelizer(t)) {
                        this.MediaBrowserCompat$MediaItem.aQ_();
                        this.IconCompatParcelizer = new MissingBackpressureException("Queue is full?!");
                        this.MediaBrowserCompat$ItemReceiver = true;
                    }
                    if (getAndIncrement() == 0) {
                        this.ParcelableVolumeInfo.IconCompatParcelizer(this);
                    }
                } else if (getAndIncrement() == 0) {
                    this.ParcelableVolumeInfo.IconCompatParcelizer(this);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.IconCompatParcelizer = th;
            this.MediaBrowserCompat$ItemReceiver = true;
            if (getAndIncrement() == 0) {
                this.ParcelableVolumeInfo.IconCompatParcelizer(this);
            }
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                if (getAndIncrement() == 0) {
                    this.ParcelableVolumeInfo.IconCompatParcelizer(this);
                }
            }
        }

        public final void write(long j) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
                AlertController$RecycleListView.write(this.RatingCompat, j);
                if (getAndIncrement() == 0) {
                    this.ParcelableVolumeInfo.IconCompatParcelizer(this);
                }
            }
        }

        public final void aQ_() {
            if (!this.read) {
                this.read = true;
                this.MediaBrowserCompat$MediaItem.aQ_();
                this.ParcelableVolumeInfo.dispose();
                if (getAndIncrement() == 0) {
                    this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final void run() {
            if (this.MediaSessionCompat$ResultReceiverWrapper) {
                MediaBrowserCompat$CustomActionResultReceiver();
            } else if (this.MediaMetadataCompat == 1) {
                MediaBrowserCompat$MediaItem();
            } else {
                IconCompatParcelizer();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean IconCompatParcelizer(boolean z, boolean z2, DepositDetailRecyclerViewAdapter$DepositViewHolder<?> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            if (this.read) {
                this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f3163x50fd9e4a) {
                    Throwable th = this.IconCompatParcelizer;
                    if (th != null) {
                        this.read = true;
                        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th);
                        this.ParcelableVolumeInfo.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.read = true;
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                        this.ParcelableVolumeInfo.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.read = true;
                    Throwable th2 = this.IconCompatParcelizer;
                    if (th2 != null) {
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th2);
                    } else {
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                    }
                    this.ParcelableVolumeInfo.dispose();
                    return true;
                }
            }
        }

        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.MediaSessionCompat$ResultReceiverWrapper = true;
            return 2;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
        }

        public final boolean write() {
            return this.MediaDescriptionCompat.write();
        }
    }

    /* renamed from: o.WebViewDeepLinkActivity$write */
    static final class write<T> extends IconCompatParcelizer<T> {
        private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> MediaSessionCompat$ResultReceiverWrapper;

        write(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder, BankingAgentDeepLinkActivity.read read, boolean z, int i) {
            super(read, z, i);
            this.MediaSessionCompat$ResultReceiverWrapper = depositDetailRecyclerViewAdapter$DepositViewHolder;
        }

        public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, selectProvinceOrDistrictAdapter$ViewHolder)) {
                this.MediaBrowserCompat$MediaItem = selectProvinceOrDistrictAdapter$ViewHolder;
                if (selectProvinceOrDistrictAdapter$ViewHolder instanceof HmlPersonalInformationDeepLinkBaseActivity) {
                    HmlPersonalInformationDeepLinkBaseActivity hmlPersonalInformationDeepLinkBaseActivity = (HmlPersonalInformationDeepLinkBaseActivity) selectProvinceOrDistrictAdapter$ViewHolder;
                    int write = hmlPersonalInformationDeepLinkBaseActivity.write(7);
                    if (write == 1) {
                        this.MediaMetadataCompat = 1;
                        this.MediaDescriptionCompat = hmlPersonalInformationDeepLinkBaseActivity;
                        this.MediaBrowserCompat$ItemReceiver = true;
                        this.MediaSessionCompat$ResultReceiverWrapper.read(this);
                        return;
                    } else if (write == 2) {
                        this.MediaMetadataCompat = 2;
                        this.MediaDescriptionCompat = hmlPersonalInformationDeepLinkBaseActivity;
                        this.MediaSessionCompat$ResultReceiverWrapper.read(this);
                        selectProvinceOrDistrictAdapter$ViewHolder.write((long) this.MediaBrowserCompat$CustomActionResultReceiver);
                        return;
                    }
                }
                this.MediaDescriptionCompat = new HmlBaseConsentActivity(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaSessionCompat$ResultReceiverWrapper.read(this);
                selectProvinceOrDistrictAdapter$ViewHolder.write((long) this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$MediaItem() {
            DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder = this.MediaSessionCompat$ResultReceiverWrapper;
            HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.MediaDescriptionCompat;
            long j = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 1;
            while (true) {
                long j2 = this.RatingCompat.get();
                while (j != j2) {
                    try {
                        T read = hmlSuccessfulDeepLinkActivity.read();
                        if (!this.read) {
                            if (read == null) {
                                this.read = true;
                                depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                                this.ParcelableVolumeInfo.dispose();
                                return;
                            }
                            depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(read);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.read = true;
                        this.MediaBrowserCompat$MediaItem.aQ_();
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th);
                        this.ParcelableVolumeInfo.dispose();
                        return;
                    }
                }
                if (!this.read) {
                    if (hmlSuccessfulDeepLinkActivity.write()) {
                        this.read = true;
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                        this.ParcelableVolumeInfo.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.MediaBrowserCompat$SearchResultReceiver = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            int i;
            DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder = this.MediaSessionCompat$ResultReceiverWrapper;
            HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.MediaDescriptionCompat;
            long j = this.MediaBrowserCompat$SearchResultReceiver;
            int i2 = 1;
            while (true) {
                long j2 = this.RatingCompat.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.MediaBrowserCompat$ItemReceiver;
                    try {
                        T read = hmlSuccessfulDeepLinkActivity.read();
                        boolean z2 = read == null;
                        if (!IconCompatParcelizer(z, z2, depositDetailRecyclerViewAdapter$DepositViewHolder)) {
                            if (z2) {
                                break;
                            }
                            depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(read);
                            j++;
                            if (j == ((long) this.write)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.RatingCompat.addAndGet(-j);
                                }
                                this.MediaBrowserCompat$MediaItem.write(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.read = true;
                        this.MediaBrowserCompat$MediaItem.aQ_();
                        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th);
                        this.ParcelableVolumeInfo.dispose();
                        return;
                    }
                }
                if (i != 0 || !IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, hmlSuccessfulDeepLinkActivity.write(), depositDetailRecyclerViewAdapter$DepositViewHolder)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.MediaBrowserCompat$SearchResultReceiver = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            int i = 1;
            while (!this.read) {
                boolean z = this.MediaBrowserCompat$ItemReceiver;
                this.MediaSessionCompat$ResultReceiverWrapper.onNext(null);
                if (z) {
                    this.read = true;
                    Throwable th = this.IconCompatParcelizer;
                    if (th != null) {
                        this.MediaSessionCompat$ResultReceiverWrapper.onError(th);
                    } else {
                        this.MediaSessionCompat$ResultReceiverWrapper.onComplete();
                    }
                    this.ParcelableVolumeInfo.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T read() throws Exception {
            T read = this.MediaDescriptionCompat.read();
            if (!(read == null || this.MediaMetadataCompat == 1)) {
                long j = this.MediaBrowserCompat$SearchResultReceiver + 1;
                if (j == ((long) this.write)) {
                    this.MediaBrowserCompat$SearchResultReceiver = 0;
                    this.MediaBrowserCompat$MediaItem.write(j);
                } else {
                    this.MediaBrowserCompat$SearchResultReceiver = j;
                }
            }
            return read;
        }
    }

    /* renamed from: o.WebViewDeepLinkActivity$read */
    static final class read<T> extends IconCompatParcelizer<T> {
        private HmlBusinessOwnerSummaryDeepLinkActivity<? super T> MediaSessionCompat$QueueItem;
        private long MediaSessionCompat$Token;

        read(HmlBusinessOwnerSummaryDeepLinkActivity<? super T> hmlBusinessOwnerSummaryDeepLinkActivity, BankingAgentDeepLinkActivity.read read, boolean z, int i) {
            super(read, z, i);
            this.MediaSessionCompat$QueueItem = hmlBusinessOwnerSummaryDeepLinkActivity;
        }

        public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, selectProvinceOrDistrictAdapter$ViewHolder)) {
                this.MediaBrowserCompat$MediaItem = selectProvinceOrDistrictAdapter$ViewHolder;
                if (selectProvinceOrDistrictAdapter$ViewHolder instanceof HmlPersonalInformationDeepLinkBaseActivity) {
                    HmlPersonalInformationDeepLinkBaseActivity hmlPersonalInformationDeepLinkBaseActivity = (HmlPersonalInformationDeepLinkBaseActivity) selectProvinceOrDistrictAdapter$ViewHolder;
                    int write = hmlPersonalInformationDeepLinkBaseActivity.write(7);
                    if (write == 1) {
                        this.MediaMetadataCompat = 1;
                        this.MediaDescriptionCompat = hmlPersonalInformationDeepLinkBaseActivity;
                        this.MediaBrowserCompat$ItemReceiver = true;
                        this.MediaSessionCompat$QueueItem.read(this);
                        return;
                    } else if (write == 2) {
                        this.MediaMetadataCompat = 2;
                        this.MediaDescriptionCompat = hmlPersonalInformationDeepLinkBaseActivity;
                        this.MediaSessionCompat$QueueItem.read(this);
                        selectProvinceOrDistrictAdapter$ViewHolder.write((long) this.MediaBrowserCompat$CustomActionResultReceiver);
                        return;
                    }
                }
                this.MediaDescriptionCompat = new HmlBaseConsentActivity(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaSessionCompat$QueueItem.read(this);
                selectProvinceOrDistrictAdapter$ViewHolder.write((long) this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$MediaItem() {
            HmlBusinessOwnerSummaryDeepLinkActivity<? super T> hmlBusinessOwnerSummaryDeepLinkActivity = this.MediaSessionCompat$QueueItem;
            HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.MediaDescriptionCompat;
            long j = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 1;
            while (true) {
                long j2 = this.RatingCompat.get();
                while (j != j2) {
                    try {
                        T read = hmlSuccessfulDeepLinkActivity.read();
                        if (!this.read) {
                            if (read == null) {
                                this.read = true;
                                hmlBusinessOwnerSummaryDeepLinkActivity.onComplete();
                                this.ParcelableVolumeInfo.dispose();
                                return;
                            } else if (hmlBusinessOwnerSummaryDeepLinkActivity.MediaBrowserCompat$ItemReceiver()) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.read = true;
                        this.MediaBrowserCompat$MediaItem.aQ_();
                        hmlBusinessOwnerSummaryDeepLinkActivity.onError(th);
                        this.ParcelableVolumeInfo.dispose();
                        return;
                    }
                }
                if (!this.read) {
                    if (hmlSuccessfulDeepLinkActivity.write()) {
                        this.read = true;
                        hmlBusinessOwnerSummaryDeepLinkActivity.onComplete();
                        this.ParcelableVolumeInfo.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.MediaBrowserCompat$SearchResultReceiver = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            int i;
            HmlBusinessOwnerSummaryDeepLinkActivity<? super T> hmlBusinessOwnerSummaryDeepLinkActivity = this.MediaSessionCompat$QueueItem;
            HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity = this.MediaDescriptionCompat;
            long j = this.MediaBrowserCompat$SearchResultReceiver;
            long j2 = this.MediaSessionCompat$Token;
            int i2 = 1;
            while (true) {
                long j3 = this.RatingCompat.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.MediaBrowserCompat$ItemReceiver;
                    try {
                        boolean z2 = hmlSuccessfulDeepLinkActivity.read() == null;
                        if (!IconCompatParcelizer(z, z2, hmlBusinessOwnerSummaryDeepLinkActivity)) {
                            if (z2) {
                                break;
                            }
                            if (hmlBusinessOwnerSummaryDeepLinkActivity.MediaBrowserCompat$ItemReceiver()) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.write)) {
                                this.MediaBrowserCompat$MediaItem.write(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.read = true;
                        this.MediaBrowserCompat$MediaItem.aQ_();
                        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                        hmlBusinessOwnerSummaryDeepLinkActivity.onError(th);
                        this.ParcelableVolumeInfo.dispose();
                        return;
                    }
                }
                if (i != 0 || !IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, hmlSuccessfulDeepLinkActivity.write(), hmlBusinessOwnerSummaryDeepLinkActivity)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.MediaBrowserCompat$SearchResultReceiver = j;
                        this.MediaSessionCompat$Token = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            int i = 1;
            while (!this.read) {
                boolean z = this.MediaBrowserCompat$ItemReceiver;
                this.MediaSessionCompat$QueueItem.onNext(null);
                if (z) {
                    this.read = true;
                    Throwable th = this.IconCompatParcelizer;
                    if (th != null) {
                        this.MediaSessionCompat$QueueItem.onError(th);
                    } else {
                        this.MediaSessionCompat$QueueItem.onComplete();
                    }
                    this.ParcelableVolumeInfo.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T read() throws Exception {
            T read = this.MediaDescriptionCompat.read();
            if (!(read == null || this.MediaMetadataCompat == 1)) {
                long j = this.MediaSessionCompat$Token + 1;
                if (j == ((long) this.write)) {
                    this.MediaSessionCompat$Token = 0;
                    this.MediaBrowserCompat$MediaItem.write(j);
                } else {
                    this.MediaSessionCompat$Token = j;
                }
            }
            return read;
        }
    }
}
