package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.SCBDeepLinkActivity */
public final class SCBDeepLinkActivity<T> extends DebitCardRequestReviewActivity<T> {
    private DebitCardRequestTermsConditionsActivity<T> read;
    private DebitCardCoachMarkActivity_ViewBinding write;

    public SCBDeepLinkActivity(DebitCardRequestTermsConditionsActivity<T> debitCardRequestTermsConditionsActivity, DebitCardCoachMarkActivity_ViewBinding debitCardCoachMarkActivity_ViewBinding) {
        this.read = debitCardRequestTermsConditionsActivity;
        this.write = debitCardCoachMarkActivity_ViewBinding;
    }

    /* renamed from: o.SCBDeepLinkActivity$1 */
    static /* synthetic */ class C98191 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.DebitCardCoachMarkActivity_ViewBinding[] r0 = p040o.DebitCardCoachMarkActivity_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.DROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.LATEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SCBDeepLinkActivity.C98191.<clinit>():void");
        }
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        read read2;
        int i = C98191.MediaBrowserCompat$ItemReceiver[this.write.ordinal()];
        if (i == 1) {
            read2 = new RatingCompat(depositDetailRecyclerViewAdapter$DepositViewHolder);
        } else if (i == 2) {
            read2 = new C9820x71276894(depositDetailRecyclerViewAdapter$DepositViewHolder);
        } else if (i == 3) {
            read2 = new SCBDeepLinkActivity$MediaBrowserCompat$ItemReceiver(depositDetailRecyclerViewAdapter$DepositViewHolder);
        } else if (i != 4) {
            read2 = new IconCompatParcelizer(depositDetailRecyclerViewAdapter$DepositViewHolder, DebitCardRequestReviewActivity.MediaBrowserCompat$ItemReceiver);
        } else {
            read2 = new write(depositDetailRecyclerViewAdapter$DepositViewHolder);
        }
        depositDetailRecyclerViewAdapter$DepositViewHolder.read(read2);
        try {
            this.read.MediaBrowserCompat$ItemReceiver(read2);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            if (!read2.IconCompatParcelizer(th)) {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    /* renamed from: o.SCBDeepLinkActivity$read */
    static abstract class read<T> extends AtomicLong implements DebitCardRequestSuccessActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder {
        final HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        final DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> MediaBrowserCompat$ItemReceiver;

        /* access modifiers changed from: package-private */
        public void read() {
        }

        /* access modifiers changed from: package-private */
        public void write() {
        }

        read(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            this.MediaBrowserCompat$ItemReceiver = depositDetailRecyclerViewAdapter$DepositViewHolder;
        }

        public void MediaBrowserCompat$CustomActionResultReceiver() {
            IconCompatParcelizer();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
            if (!IconCompatParcelizer(th)) {
                AlertController$RecycleListView.read.read(th);
            }
        }

        public boolean IconCompatParcelizer(Throwable th) {
            return MediaBrowserCompat$ItemReceiver(th);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final boolean MediaBrowserCompat$ItemReceiver(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                return false;
            }
            try {
                this.MediaBrowserCompat$ItemReceiver.onError(th);
                this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                return true;
            } catch (Throwable th2) {
                this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                throw th2;
            }
        }

        public final void aQ_() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
            write();
        }

        public final void write(long j) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
                AlertController$RecycleListView.write((AtomicLong) this, j);
                read();
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* access modifiers changed from: protected */
        public final void IconCompatParcelizer() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                try {
                    this.MediaBrowserCompat$ItemReceiver.onComplete();
                } finally {
                    this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
                }
            }
        }
    }

    /* renamed from: o.SCBDeepLinkActivity$RatingCompat */
    static final class RatingCompat<T> extends read<T> {
        RatingCompat(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            super(depositDetailRecyclerViewAdapter$DepositViewHolder);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            long j;
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                if (t != null) {
                    this.MediaBrowserCompat$ItemReceiver.onNext(t);
                    do {
                        j = get();
                        if (j == 0 || compareAndSet(j, j - 1)) {
                            return;
                        }
                        j = get();
                        return;
                    } while (compareAndSet(j, j - 1));
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!IconCompatParcelizer(nullPointerException)) {
                    AlertController$RecycleListView.read.read((Throwable) nullPointerException);
                }
            }
        }
    }

    /* renamed from: o.SCBDeepLinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends read<T> {
        private volatile boolean IconCompatParcelizer;
        private AtomicInteger MediaDescriptionCompat = new AtomicInteger();
        private Throwable read;
        private HmlBaseEmailAboutActivity<T> write;

        IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder, int i) {
            super(depositDetailRecyclerViewAdapter$DepositViewHolder);
            this.write = new HmlBaseEmailAboutActivity<>(i);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            if (!this.IconCompatParcelizer && !this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                if (t == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!IconCompatParcelizer(nullPointerException)) {
                        AlertController$RecycleListView.read.read((Throwable) nullPointerException);
                        return;
                    }
                    return;
                }
                this.write.IconCompatParcelizer(t);
                MediaDescriptionCompat();
            }
        }

        public final boolean IconCompatParcelizer(Throwable th) {
            if (this.IconCompatParcelizer || this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.read = th;
            this.IconCompatParcelizer = true;
            MediaDescriptionCompat();
            return true;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.IconCompatParcelizer = true;
            MediaDescriptionCompat();
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            MediaDescriptionCompat();
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            if (this.MediaDescriptionCompat.getAndIncrement() == 0) {
                this.write.MediaBrowserCompat$ItemReceiver();
            }
        }

        private void MediaDescriptionCompat() {
            int i;
            if (this.MediaDescriptionCompat.getAndIncrement() == 0) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder = this.MediaBrowserCompat$ItemReceiver;
                HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity = this.write;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                            return;
                        } else {
                            boolean z = this.IconCompatParcelizer;
                            T read2 = hmlBaseEmailAboutActivity.read();
                            boolean z2 = read2 == null;
                            if (!z || !z2) {
                                if (z2) {
                                    break;
                                }
                                depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(read2);
                                j2++;
                            } else {
                                Throwable th = this.read;
                                if (th != null) {
                                    MediaBrowserCompat$ItemReceiver(th);
                                    return;
                                } else {
                                    IconCompatParcelizer();
                                    return;
                                }
                            }
                        }
                    }
                    if (i == 0) {
                        if (this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                            hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                            return;
                        }
                        boolean z3 = this.IconCompatParcelizer;
                        boolean write2 = hmlBaseEmailAboutActivity.write();
                        if (z3 && write2) {
                            Throwable th2 = this.read;
                            if (th2 != null) {
                                MediaBrowserCompat$ItemReceiver(th2);
                                return;
                            } else {
                                IconCompatParcelizer();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        AlertController$RecycleListView.IconCompatParcelizer((AtomicLong) this, j2);
                    }
                    i2 = this.MediaDescriptionCompat.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    /* renamed from: o.SCBDeepLinkActivity$write */
    static final class write<T> extends read<T> {
        private Throwable IconCompatParcelizer;
        private AtomicInteger MediaMetadataCompat = new AtomicInteger();
        private volatile boolean read;
        private AtomicReference<T> write = new AtomicReference<>();

        write(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            super(depositDetailRecyclerViewAdapter$DepositViewHolder);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            if (!this.read && !this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                if (t == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!IconCompatParcelizer(nullPointerException)) {
                        AlertController$RecycleListView.read.read((Throwable) nullPointerException);
                        return;
                    }
                    return;
                }
                this.write.set(t);
                RatingCompat();
            }
        }

        public final boolean IconCompatParcelizer(Throwable th) {
            if (this.read || this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                return false;
            }
            if (th == null) {
                NullPointerException nullPointerException = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!IconCompatParcelizer(nullPointerException)) {
                    AlertController$RecycleListView.read.read((Throwable) nullPointerException);
                }
            }
            this.IconCompatParcelizer = th;
            this.read = true;
            RatingCompat();
            return true;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.read = true;
            RatingCompat();
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            RatingCompat();
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            if (this.MediaMetadataCompat.getAndIncrement() == 0) {
                this.write.lazySet((Object) null);
            }
        }

        private void RatingCompat() {
            int i;
            boolean z;
            if (this.MediaMetadataCompat.getAndIncrement() == 0) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder = this.MediaBrowserCompat$ItemReceiver;
                AtomicReference<T> atomicReference = this.write;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        z = false;
                        if (i == 0) {
                            break;
                        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        } else {
                            boolean z2 = this.read;
                            T andSet = atomicReference.getAndSet((Object) null);
                            boolean z3 = andSet == null;
                            if (!z2 || !z3) {
                                if (z3) {
                                    break;
                                }
                                depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(andSet);
                                j2++;
                            } else {
                                Throwable th = this.IconCompatParcelizer;
                                if (th != null) {
                                    MediaBrowserCompat$ItemReceiver(th);
                                    return;
                                } else {
                                    IconCompatParcelizer();
                                    return;
                                }
                            }
                        }
                    }
                    if (i == 0) {
                        if (this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        }
                        boolean z4 = this.read;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.IconCompatParcelizer;
                            if (th2 != null) {
                                MediaBrowserCompat$ItemReceiver(th2);
                                return;
                            } else {
                                IconCompatParcelizer();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        AlertController$RecycleListView.IconCompatParcelizer((AtomicLong) this, j2);
                    }
                    i2 = this.MediaMetadataCompat.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }
}
