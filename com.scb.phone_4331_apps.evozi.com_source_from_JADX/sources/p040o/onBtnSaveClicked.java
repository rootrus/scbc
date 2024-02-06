package p040o;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onBtnSaveClicked */
public final class onBtnSaveClicked<T> extends HmlConsumerGuidelinesBaseDeepLinkActivity<T> implements HmlBusinessOwnerCalculatorDeepLinkActivity {
    private static read IconCompatParcelizer = new onBtnSaveClicked$MediaSessionCompat$QueueItem();
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$CustomActionResultReceiver;
    private AtomicReference<MediaMetadataCompat<T>> MediaBrowserCompat$ItemReceiver;
    private read<T> read;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    /* renamed from: o.onBtnSaveClicked$read */
    interface read<T> {
        onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> read();
    }

    public static <U, R> DebitCardResetOtpActivity<R> IconCompatParcelizer(Callable<? extends HmlConsumerGuidelinesBaseDeepLinkActivity<U>> callable, DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<U>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity) {
        return new onBtnSaveClicked$MediaBrowserCompat$CustomActionResultReceiver(callable, directDebitDeepLinkActivity);
    }

    public static <T> HmlConsumerGuidelinesBaseDeepLinkActivity<T> IconCompatParcelizer(HmlConsumerGuidelinesBaseDeepLinkActivity<T> hmlConsumerGuidelinesBaseDeepLinkActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return new MediaDescriptionCompat(hmlConsumerGuidelinesBaseDeepLinkActivity, hmlConsumerGuidelinesBaseDeepLinkActivity.observeOn(bankingAgentDeepLinkActivity));
    }

    public static <T> HmlConsumerGuidelinesBaseDeepLinkActivity<T> write(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        read read2 = IconCompatParcelizer;
        AtomicReference atomicReference = new AtomicReference();
        return new onBtnSaveClicked(new C10092xcc48bf53(atomicReference, read2), debitCardResetPinSuccessActivity_ViewBinding, atomicReference, read2);
    }

    public static <T> HmlConsumerGuidelinesBaseDeepLinkActivity<T> IconCompatParcelizer(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i) {
        onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper onbtnsaveclicked_mediasessioncompat_resultreceiverwrapper = new onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper(i, j, timeUnit, bankingAgentDeepLinkActivity);
        AtomicReference atomicReference = new AtomicReference();
        return new onBtnSaveClicked(new C10092xcc48bf53(atomicReference, onbtnsaveclicked_mediasessioncompat_resultreceiverwrapper), debitCardResetPinSuccessActivity_ViewBinding, atomicReference, onbtnsaveclicked_mediasessioncompat_resultreceiverwrapper);
    }

    private onBtnSaveClicked(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding2, AtomicReference<MediaMetadataCompat<T>> atomicReference, read<T> read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaBrowserCompat$ItemReceiver = atomicReference;
        this.read = read2;
    }

    public final void IconCompatParcelizer(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.compareAndSet((MediaMetadataCompat) bulkTransferDeepLinkActivity, (Object) null);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(bankingAgentTransactionsDeepLinkActivity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.DebitCardMarketConductDeepLinkActivity<? super p040o.BulkTransferDeepLinkActivity> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.onBtnSaveClicked$MediaMetadataCompat<T>> r0 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.Object r0 = r0.get()
            o.onBtnSaveClicked$MediaMetadataCompat r0 = (p040o.onBtnSaveClicked.MediaMetadataCompat) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0024
        L_0x0010:
            o.onBtnSaveClicked$read<T> r1 = r4.read
            o.onBtnSaveClicked$MediaBrowserCompat$MediaItem r1 = r1.read()
            o.onBtnSaveClicked$MediaMetadataCompat r2 = new o.onBtnSaveClicked$MediaMetadataCompat
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<o.onBtnSaveClicked$MediaMetadataCompat<T>> r1 = r4.MediaBrowserCompat$ItemReceiver
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = r2
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.write
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.write
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0038
            r1 = r2
            goto L_0x0039
        L_0x0038:
            r1 = r3
        L_0x0039:
            r5.IconCompatParcelizer(r0)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0043
            o.DebitCardResetPinSuccessActivity_ViewBinding<T> r5 = r4.write
            r5.subscribe(r0)
        L_0x0043:
            return
        L_0x0044:
            r5 = move-exception
            if (r1 == 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.write
            r0.compareAndSet(r2, r3)
        L_0x004c:
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r5)
            java.lang.RuntimeException r5 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onBtnSaveClicked.MediaBrowserCompat$ItemReceiver(o.DebitCardMarketConductDeepLinkActivity):void");
    }

    /* renamed from: o.onBtnSaveClicked$MediaMetadataCompat */
    static final class MediaMetadataCompat<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private static IconCompatParcelizer[] IconCompatParcelizer = new IconCompatParcelizer[0];
        static final IconCompatParcelizer[] read = new IconCompatParcelizer[0];
        final onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> MediaBrowserCompat$CustomActionResultReceiver;
        final AtomicReference<IconCompatParcelizer[]> MediaBrowserCompat$ItemReceiver = new AtomicReference<>(IconCompatParcelizer);
        private boolean MediaBrowserCompat$SearchResultReceiver;
        final AtomicBoolean write = new AtomicBoolean();

        MediaMetadataCompat(onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> onbtnsaveclicked_mediabrowsercompat_mediaitem) {
            this.MediaBrowserCompat$CustomActionResultReceiver = onbtnsaveclicked_mediabrowsercompat_mediaitem;
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver.get() == read;
        }

        public final void dispose() {
            this.MediaBrowserCompat$ItemReceiver.set(read);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        /* access modifiers changed from: package-private */
        public final void read(IconCompatParcelizer<T> iconCompatParcelizer) {
            IconCompatParcelizer[] iconCompatParcelizerArr;
            IconCompatParcelizer[] iconCompatParcelizerArr2;
            do {
                iconCompatParcelizerArr = this.MediaBrowserCompat$ItemReceiver.get();
                int length = iconCompatParcelizerArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (iconCompatParcelizerArr[i].equals(iconCompatParcelizer)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            iconCompatParcelizerArr2 = IconCompatParcelizer;
                        } else {
                            IconCompatParcelizer[] iconCompatParcelizerArr3 = new IconCompatParcelizer[(length - 1)];
                            System.arraycopy(iconCompatParcelizerArr, 0, iconCompatParcelizerArr3, 0, i);
                            System.arraycopy(iconCompatParcelizerArr, i + 1, iconCompatParcelizerArr3, i, (length - i) - 1);
                            iconCompatParcelizerArr2 = iconCompatParcelizerArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.MediaBrowserCompat$ItemReceiver.compareAndSet(iconCompatParcelizerArr, iconCompatParcelizerArr2));
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$SearchResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void onError(Throwable th) {
            if (!this.MediaBrowserCompat$SearchResultReceiver) {
                this.MediaBrowserCompat$SearchResultReceiver = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(th);
                write();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$SearchResultReceiver) {
                this.MediaBrowserCompat$SearchResultReceiver = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                write();
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver() {
            for (IconCompatParcelizer IconCompatParcelizer2 : this.MediaBrowserCompat$ItemReceiver.get()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(IconCompatParcelizer2);
            }
        }

        private void write() {
            for (IconCompatParcelizer IconCompatParcelizer2 : this.MediaBrowserCompat$ItemReceiver.getAndSet(read)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(IconCompatParcelizer2);
            }
        }
    }

    /* renamed from: o.onBtnSaveClicked$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BulkTransferDeepLinkActivity {
        private MediaMetadataCompat<T> MediaBrowserCompat$CustomActionResultReceiver;
        Object MediaBrowserCompat$ItemReceiver;
        final BankingAgentTransactionsDeepLinkActivity<? super T> read;
        private volatile boolean write;

        IconCompatParcelizer(MediaMetadataCompat<T> mediaMetadataCompat, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mediaMetadataCompat;
            this.read = bankingAgentTransactionsDeepLinkActivity;
        }

        public final boolean isDisposed() {
            return this.write;
        }

        public final void dispose() {
            if (!this.write) {
                this.write = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.read(this);
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }

    /* renamed from: o.onBtnSaveClicked$PlaybackStateCompat */
    static final class PlaybackStateCompat<T> extends ArrayList<Object> implements onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> {
        private volatile int write;

        PlaybackStateCompat() {
            super(16);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            add(HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t));
            this.write++;
        }

        public final void IconCompatParcelizer(Throwable th) {
            add(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(th));
            this.write++;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            add(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver());
            this.write++;
        }

        public final void IconCompatParcelizer(IconCompatParcelizer<T> iconCompatParcelizer) {
            if (iconCompatParcelizer.getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = iconCompatParcelizer.read;
                int i = 1;
                while (!iconCompatParcelizer.isDisposed()) {
                    int i2 = this.write;
                    Integer num = (Integer) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!HmlCaptureDocumentActivity.read(get(intValue), bankingAgentTransactionsDeepLinkActivity) && !iconCompatParcelizer.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = Integer.valueOf(intValue);
                    i = iconCompatParcelizer.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: o.onBtnSaveClicked$RatingCompat */
    static final class RatingCompat extends AtomicReference<RatingCompat> {
        final Object write;

        RatingCompat(Object obj) {
            this.write = obj;
        }
    }

    /* renamed from: o.onBtnSaveClicked$write */
    static abstract class write<T> extends AtomicReference<RatingCompat> implements onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> {
        int MediaBrowserCompat$ItemReceiver;
        private RatingCompat write;

        /* access modifiers changed from: package-private */
        public Object IconCompatParcelizer(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public abstract void IconCompatParcelizer();

        /* access modifiers changed from: package-private */
        public Object read(Object obj) {
            return obj;
        }

        write() {
            RatingCompat ratingCompat = new RatingCompat((Object) null);
            this.write = ratingCompat;
            set(ratingCompat);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            RatingCompat ratingCompat = new RatingCompat(IconCompatParcelizer(HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t)));
            this.write.set(ratingCompat);
            this.write = ratingCompat;
            this.MediaBrowserCompat$ItemReceiver++;
            IconCompatParcelizer();
        }

        public final void IconCompatParcelizer(Throwable th) {
            RatingCompat ratingCompat = new RatingCompat(IconCompatParcelizer(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(th)));
            this.write.set(ratingCompat);
            this.write = ratingCompat;
            this.MediaBrowserCompat$ItemReceiver++;
            MediaBrowserCompat$ItemReceiver();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            RatingCompat ratingCompat = new RatingCompat(IconCompatParcelizer(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver()));
            this.write.set(ratingCompat);
            this.write = ratingCompat;
            this.MediaBrowserCompat$ItemReceiver++;
            MediaBrowserCompat$ItemReceiver();
        }

        public final void IconCompatParcelizer(IconCompatParcelizer<T> iconCompatParcelizer) {
            if (iconCompatParcelizer.getAndIncrement() == 0) {
                int i = 1;
                do {
                    RatingCompat ratingCompat = (RatingCompat) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    if (ratingCompat == null) {
                        ratingCompat = read();
                        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = ratingCompat;
                    }
                    while (!iconCompatParcelizer.isDisposed()) {
                        RatingCompat ratingCompat2 = (RatingCompat) ratingCompat.get();
                        if (ratingCompat2 == null) {
                            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = ratingCompat;
                            i = iconCompatParcelizer.addAndGet(-i);
                        } else if (HmlCaptureDocumentActivity.read(read(ratingCompat2.write), iconCompatParcelizer.read)) {
                            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = null;
                            return;
                        } else {
                            ratingCompat = ratingCompat2;
                        }
                    }
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        public RatingCompat read() {
            return (RatingCompat) get();
        }

        /* access modifiers changed from: package-private */
        public void MediaBrowserCompat$ItemReceiver() {
            RatingCompat ratingCompat = (RatingCompat) get();
            if (ratingCompat.write != null) {
                RatingCompat ratingCompat2 = new RatingCompat((Object) null);
                ratingCompat2.lazySet(ratingCompat.get());
                set(ratingCompat2);
            }
        }
    }

    /* renamed from: o.onBtnSaveClicked$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<T> extends write<T> {
        private int read;

        ParcelableVolumeInfo(int i) {
            this.read = i;
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            if (this.MediaBrowserCompat$ItemReceiver > this.read) {
                this.MediaBrowserCompat$ItemReceiver--;
                set((RatingCompat) ((RatingCompat) get()).get());
            }
        }
    }

    /* renamed from: o.onBtnSaveClicked$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<T> extends HmlConsumerGuidelinesBaseDeepLinkActivity<T> {
        private final DebitCardResetOtpActivity<T> IconCompatParcelizer;
        private final HmlConsumerGuidelinesBaseDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(HmlConsumerGuidelinesBaseDeepLinkActivity<T> hmlConsumerGuidelinesBaseDeepLinkActivity, DebitCardResetOtpActivity<T> debitCardResetOtpActivity) {
            this.MediaBrowserCompat$ItemReceiver = hmlConsumerGuidelinesBaseDeepLinkActivity;
            this.IconCompatParcelizer = debitCardResetOtpActivity;
        }

        public final void MediaBrowserCompat$ItemReceiver(DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(debitCardMarketConductDeepLinkActivity);
        }

        public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer.subscribe(bankingAgentTransactionsDeepLinkActivity);
        }
    }

    public static <T> HmlConsumerGuidelinesBaseDeepLinkActivity<T> MediaBrowserCompat$CustomActionResultReceiver(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        if (i == Integer.MAX_VALUE) {
            read read2 = IconCompatParcelizer;
            AtomicReference atomicReference = new AtomicReference();
            return new onBtnSaveClicked(new C10092xcc48bf53(atomicReference, read2), debitCardResetPinSuccessActivity_ViewBinding, atomicReference, read2);
        }
        onBtnSaveClicked$MediaBrowserCompat$SearchResultReceiver onbtnsaveclicked_mediabrowsercompat_searchresultreceiver = new onBtnSaveClicked$MediaBrowserCompat$SearchResultReceiver(i);
        AtomicReference atomicReference2 = new AtomicReference();
        return new onBtnSaveClicked(new C10092xcc48bf53(atomicReference2, onbtnsaveclicked_mediabrowsercompat_searchresultreceiver), debitCardResetPinSuccessActivity_ViewBinding, atomicReference2, onbtnsaveclicked_mediabrowsercompat_searchresultreceiver);
    }

    public static <T> HmlConsumerGuidelinesBaseDeepLinkActivity<T> write(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper onbtnsaveclicked_mediasessioncompat_resultreceiverwrapper = new onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper(Api.BaseClientBuilder.API_PRIORITY_OTHER, j, timeUnit, bankingAgentDeepLinkActivity);
        AtomicReference atomicReference = new AtomicReference();
        return new onBtnSaveClicked(new C10092xcc48bf53(atomicReference, onbtnsaveclicked_mediasessioncompat_resultreceiverwrapper), debitCardResetPinSuccessActivity_ViewBinding, atomicReference, onbtnsaveclicked_mediasessioncompat_resultreceiverwrapper);
    }
}
