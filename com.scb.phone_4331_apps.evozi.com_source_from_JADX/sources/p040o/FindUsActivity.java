package p040o;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.FindUsActivity */
public final class FindUsActivity<T> extends NtbUserInfoActivity<T, DebitCardResetOtpActivity<T>> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$MediaItem;
    private TimeUnit MediaBrowserCompat$SearchResultReceiver;
    private long RatingCompat;
    private boolean read;
    private long write;

    public FindUsActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, long j3, int i, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.RatingCompat = j;
        this.MediaBrowserCompat$MediaItem = j2;
        this.MediaBrowserCompat$SearchResultReceiver = timeUnit;
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        this.write = j3;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        HmlDocumentUploadGuidelineActivity hmlDocumentUploadGuidelineActivity = new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity);
        if (this.RatingCompat != this.MediaBrowserCompat$MediaItem) {
            this.IconCompatParcelizer.subscribe(new read(hmlDocumentUploadGuidelineActivity, this.RatingCompat, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver.write(), this.MediaBrowserCompat$CustomActionResultReceiver));
        } else if (this.write == Long.MAX_VALUE) {
            this.IconCompatParcelizer.subscribe(new FindUsActivity$MediaBrowserCompat$ItemReceiver(hmlDocumentUploadGuidelineActivity, this.RatingCompat, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver));
        } else {
            this.IconCompatParcelizer.subscribe(new write(hmlDocumentUploadGuidelineActivity, this.RatingCompat, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.read));
        }
    }

    /* renamed from: o.FindUsActivity$write */
    static final class write<T> extends OprRenewDeepLinkActivity<T, Object, DebitCardResetOtpActivity<T>> implements BulkTransferDeepLinkActivity {
        private HmlETBLoanSetupActivity<T> Keep;
        final BankingAgentDeepLinkActivity.read MediaBrowserCompat$MediaItem;
        volatile boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private long f5511x50fd9e4a;
        final AtomicReference<BulkTransferDeepLinkActivity> MediaDescriptionCompat = new AtomicReference<>();
        private long MediaSessionCompat$QueueItem;
        private long MediaSessionCompat$ResultReceiverWrapper;
        private boolean MediaSessionCompat$Token;
        private BankingAgentDeepLinkActivity ParcelableVolumeInfo;
        private TimeUnit PlaybackStateCompat;
        private BulkTransferDeepLinkActivity PlaybackStateCompat$CustomAction;
        private int RatingCompat;
        private long setHasDecor;

        write(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i, long j2, boolean z) {
            super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
            this.setHasDecor = j;
            this.PlaybackStateCompat = timeUnit;
            this.ParcelableVolumeInfo = bankingAgentDeepLinkActivity;
            this.RatingCompat = i;
            this.MediaSessionCompat$ResultReceiverWrapper = j2;
            this.MediaSessionCompat$Token = z;
            if (z) {
                this.MediaBrowserCompat$MediaItem = bankingAgentDeepLinkActivity.write();
            } else {
                this.MediaBrowserCompat$MediaItem = null;
            }
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2;
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.PlaybackStateCompat$CustomAction, bulkTransferDeepLinkActivity)) {
                this.PlaybackStateCompat$CustomAction = bulkTransferDeepLinkActivity;
                BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
                bankingAgentTransactionsDeepLinkActivity.onSubscribe(this);
                if (!this.read) {
                    HmlETBLoanSetupActivity<T> MediaBrowserCompat$CustomActionResultReceiver = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
                    this.Keep = MediaBrowserCompat$CustomActionResultReceiver;
                    bankingAgentTransactionsDeepLinkActivity.onNext(MediaBrowserCompat$CustomActionResultReceiver);
                    C10808write write = new C10808write(this.f5511x50fd9e4a, this);
                    if (this.MediaSessionCompat$Token) {
                        BankingAgentDeepLinkActivity.read read = this.MediaBrowserCompat$MediaItem;
                        long j = this.setHasDecor;
                        bulkTransferDeepLinkActivity2 = read.MediaBrowserCompat$ItemReceiver(write, j, j, this.PlaybackStateCompat);
                    } else {
                        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.ParcelableVolumeInfo;
                        long j2 = this.setHasDecor;
                        bulkTransferDeepLinkActivity2 = bankingAgentDeepLinkActivity.write(write, j2, j2, this.PlaybackStateCompat);
                    }
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, bulkTransferDeepLinkActivity2);
                }
            }
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$SearchResultReceiver) {
                boolean z = false;
                if (this.MediaMetadataCompat.get() == 0 && this.MediaMetadataCompat.compareAndSet(0, 1)) {
                    HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.Keep;
                    hmlETBLoanSetupActivity.onNext(t);
                    long j = this.MediaSessionCompat$QueueItem + 1;
                    if (j >= this.MediaSessionCompat$ResultReceiverWrapper) {
                        this.f5511x50fd9e4a++;
                        this.MediaSessionCompat$QueueItem = 0;
                        hmlETBLoanSetupActivity.onComplete();
                        HmlETBLoanSetupActivity<T> MediaBrowserCompat$CustomActionResultReceiver = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
                        this.Keep = MediaBrowserCompat$CustomActionResultReceiver;
                        this.MediaBrowserCompat$ItemReceiver.onNext(MediaBrowserCompat$CustomActionResultReceiver);
                        if (this.MediaSessionCompat$Token) {
                            this.MediaDescriptionCompat.get().dispose();
                            BankingAgentDeepLinkActivity.read read = this.MediaBrowserCompat$MediaItem;
                            C10808write write = new C10808write(this.f5511x50fd9e4a, this);
                            long j2 = this.setHasDecor;
                            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, read.MediaBrowserCompat$ItemReceiver(write, j2, j2, this.PlaybackStateCompat));
                        }
                    } else {
                        this.MediaSessionCompat$QueueItem = j;
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
                IconCompatParcelizer();
            }
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer = th;
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                IconCompatParcelizer();
            }
            this.MediaBrowserCompat$ItemReceiver.onError(th);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
            BankingAgentDeepLinkActivity.read read = this.MediaBrowserCompat$MediaItem;
            if (read != null) {
                read.dispose();
            }
        }

        public final void onComplete() {
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                IconCompatParcelizer();
            }
            this.MediaBrowserCompat$ItemReceiver.onComplete();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
            BankingAgentDeepLinkActivity.read read = this.MediaBrowserCompat$MediaItem;
            if (read != null) {
                read.dispose();
            }
        }

        public final void dispose() {
            this.read = true;
        }

        public final boolean isDisposed() {
            return this.read;
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            HmlApplicationOutcomeActivity hmlApplicationOutcomeActivity = (HmlApplicationOutcomeActivity) this.write;
            BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
            HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.Keep;
            int i = 1;
            while (!this.MediaBrowserCompat$SearchResultReceiver) {
                boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
                Object read = hmlApplicationOutcomeActivity.read();
                boolean z2 = read == null;
                boolean z3 = read instanceof C10808write;
                if (z && (z2 || z3)) {
                    this.Keep = null;
                    hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
                    BankingAgentDeepLinkActivity.read read2 = this.MediaBrowserCompat$MediaItem;
                    if (read2 != null) {
                        read2.dispose();
                    }
                    Throwable th = this.IconCompatParcelizer;
                    if (th != null) {
                        hmlETBLoanSetupActivity.onError(th);
                        return;
                    } else {
                        hmlETBLoanSetupActivity.onComplete();
                        return;
                    }
                } else if (z2) {
                    i = this.MediaMetadataCompat.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C10808write write = (C10808write) read;
                    if (!this.MediaSessionCompat$Token || this.f5511x50fd9e4a == write.write) {
                        hmlETBLoanSetupActivity.onComplete();
                        this.MediaSessionCompat$QueueItem = 0;
                        hmlETBLoanSetupActivity = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
                        this.Keep = hmlETBLoanSetupActivity;
                        bankingAgentTransactionsDeepLinkActivity.onNext(hmlETBLoanSetupActivity);
                    }
                } else {
                    hmlETBLoanSetupActivity.onNext(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(read));
                    long j = this.MediaSessionCompat$QueueItem + 1;
                    if (j >= this.MediaSessionCompat$ResultReceiverWrapper) {
                        this.f5511x50fd9e4a++;
                        this.MediaSessionCompat$QueueItem = 0;
                        hmlETBLoanSetupActivity.onComplete();
                        hmlETBLoanSetupActivity = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
                        this.Keep = hmlETBLoanSetupActivity;
                        this.MediaBrowserCompat$ItemReceiver.onNext(hmlETBLoanSetupActivity);
                        if (this.MediaSessionCompat$Token) {
                            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat.get();
                            bulkTransferDeepLinkActivity.dispose();
                            BankingAgentDeepLinkActivity.read read3 = this.MediaBrowserCompat$MediaItem;
                            C10808write write2 = new C10808write(this.f5511x50fd9e4a, this);
                            long j2 = this.setHasDecor;
                            BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver = read3.MediaBrowserCompat$ItemReceiver(write2, j2, j2, this.PlaybackStateCompat);
                            if (!this.MediaDescriptionCompat.compareAndSet(bulkTransferDeepLinkActivity, MediaBrowserCompat$ItemReceiver)) {
                                MediaBrowserCompat$ItemReceiver.dispose();
                            }
                        }
                    } else {
                        this.MediaSessionCompat$QueueItem = j;
                    }
                }
            }
            this.PlaybackStateCompat$CustomAction.dispose();
            hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
            BankingAgentDeepLinkActivity.read read4 = this.MediaBrowserCompat$MediaItem;
            if (read4 != null) {
                read4.dispose();
            }
        }

        /* renamed from: o.FindUsActivity$write$write  reason: collision with other inner class name */
        static final class C10808write implements Runnable {
            private write<?> IconCompatParcelizer;
            final long write;

            C10808write(long j, write<?> write2) {
                this.write = j;
                this.IconCompatParcelizer = write2;
            }

            public final void run() {
                write<?> write2 = this.IconCompatParcelizer;
                boolean z = true;
                if (!write2.read) {
                    write2.write.IconCompatParcelizer(this);
                } else {
                    write2.MediaBrowserCompat$SearchResultReceiver = true;
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write2.MediaDescriptionCompat);
                    BankingAgentDeepLinkActivity.read read = write2.MediaBrowserCompat$MediaItem;
                    if (read != null) {
                        read.dispose();
                    }
                }
                if (write2.MediaMetadataCompat.getAndIncrement() != 0) {
                    z = false;
                }
                if (z) {
                    write2.IconCompatParcelizer();
                }
            }
        }
    }

    /* renamed from: o.FindUsActivity$read */
    static final class read<T> extends OprRenewDeepLinkActivity<T, Object, DebitCardResetOtpActivity<T>> implements BulkTransferDeepLinkActivity, Runnable {
        private long MediaBrowserCompat$MediaItem;
        private int MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private List<HmlETBLoanSetupActivity<T>> f5510x50fd9e4a = new LinkedList();
        private long MediaDescriptionCompat;
        private BulkTransferDeepLinkActivity MediaSessionCompat$ResultReceiverWrapper;
        private BankingAgentDeepLinkActivity.read MediaSessionCompat$Token;
        private TimeUnit ParcelableVolumeInfo;
        private volatile boolean RatingCompat;

        read(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read, int i) {
            super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
            this.MediaDescriptionCompat = j;
            this.MediaBrowserCompat$MediaItem = j2;
            this.ParcelableVolumeInfo = timeUnit;
            this.MediaSessionCompat$Token = read;
            this.MediaBrowserCompat$SearchResultReceiver = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$ResultReceiverWrapper, bulkTransferDeepLinkActivity)) {
                this.MediaSessionCompat$ResultReceiverWrapper = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                if (!this.read) {
                    HmlETBLoanSetupActivity MediaBrowserCompat$CustomActionResultReceiver = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver);
                    this.f5510x50fd9e4a.add(MediaBrowserCompat$CustomActionResultReceiver);
                    this.MediaBrowserCompat$ItemReceiver.onNext(MediaBrowserCompat$CustomActionResultReceiver);
                    this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(new write(MediaBrowserCompat$CustomActionResultReceiver), this.MediaDescriptionCompat, this.ParcelableVolumeInfo);
                    BankingAgentDeepLinkActivity.read read = this.MediaSessionCompat$Token;
                    long j = this.MediaBrowserCompat$MediaItem;
                    read.MediaBrowserCompat$ItemReceiver(this, j, j, this.ParcelableVolumeInfo);
                }
            }
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer = th;
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                MediaBrowserCompat$ItemReceiver();
            }
            this.MediaBrowserCompat$ItemReceiver.onError(th);
            this.MediaSessionCompat$Token.dispose();
        }

        public final void onComplete() {
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                MediaBrowserCompat$ItemReceiver();
            }
            this.MediaBrowserCompat$ItemReceiver.onComplete();
            this.MediaSessionCompat$Token.dispose();
        }

        public final void dispose() {
            this.read = true;
        }

        public final boolean isDisposed() {
            return this.read;
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity) {
            boolean z = false;
            this.write.IconCompatParcelizer(new C9735xbc12fe81(hmlETBLoanSetupActivity, false));
            if (this.MediaMetadataCompat.getAndIncrement() == 0) {
                z = true;
            }
            if (z) {
                MediaBrowserCompat$ItemReceiver();
            }
        }

        private void MediaBrowserCompat$ItemReceiver() {
            HmlApplicationOutcomeActivity hmlApplicationOutcomeActivity = (HmlApplicationOutcomeActivity) this.write;
            BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
            List<HmlETBLoanSetupActivity<T>> list = this.f5510x50fd9e4a;
            int i = 1;
            while (!this.RatingCompat) {
                boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
                Object read = hmlApplicationOutcomeActivity.read();
                boolean z2 = read == null;
                boolean z3 = read instanceof C9735xbc12fe81;
                if (z && (z2 || z3)) {
                    hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
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
                    this.MediaSessionCompat$Token.dispose();
                    list.clear();
                    return;
                } else if (z2) {
                    i = this.MediaMetadataCompat.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C9735xbc12fe81 findUsActivity$read$MediaBrowserCompat$CustomActionResultReceiver = (C9735xbc12fe81) read;
                    if (!findUsActivity$read$MediaBrowserCompat$CustomActionResultReceiver.read) {
                        list.remove(findUsActivity$read$MediaBrowserCompat$CustomActionResultReceiver.write);
                        findUsActivity$read$MediaBrowserCompat$CustomActionResultReceiver.write.onComplete();
                        if (list.isEmpty() && this.read) {
                            this.RatingCompat = true;
                        }
                    } else if (!this.read) {
                        HmlETBLoanSetupActivity MediaBrowserCompat$CustomActionResultReceiver = HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver);
                        list.add(MediaBrowserCompat$CustomActionResultReceiver);
                        bankingAgentTransactionsDeepLinkActivity.onNext(MediaBrowserCompat$CustomActionResultReceiver);
                        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(new write(MediaBrowserCompat$CustomActionResultReceiver), this.MediaDescriptionCompat, this.ParcelableVolumeInfo);
                    }
                } else {
                    for (HmlETBLoanSetupActivity<T> onNext : list) {
                        onNext.onNext(read);
                    }
                }
            }
            this.MediaSessionCompat$ResultReceiverWrapper.dispose();
            this.MediaSessionCompat$Token.dispose();
            hmlApplicationOutcomeActivity.MediaBrowserCompat$ItemReceiver();
            list.clear();
        }

        public final void run() {
            boolean z = true;
            C9735xbc12fe81 findUsActivity$read$MediaBrowserCompat$CustomActionResultReceiver = new C9735xbc12fe81(HmlETBLoanSetupActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver), true);
            if (!this.read) {
                this.write.IconCompatParcelizer(findUsActivity$read$MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                MediaBrowserCompat$ItemReceiver();
            }
        }

        /* renamed from: o.FindUsActivity$read$write */
        final class write implements Runnable {
            private final HmlETBLoanSetupActivity<T> MediaBrowserCompat$ItemReceiver;

            write(HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity) {
                this.MediaBrowserCompat$ItemReceiver = hmlETBLoanSetupActivity;
            }

            public final void run() {
                read.this.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
            }
        }

        public final void onNext(T t) {
            boolean z = false;
            if (this.MediaMetadataCompat.get() == 0 && this.MediaMetadataCompat.compareAndSet(0, 1)) {
                for (HmlETBLoanSetupActivity<T> onNext : this.f5510x50fd9e4a) {
                    onNext.onNext(t);
                }
                if (this.MediaMetadataCompat.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.write.IconCompatParcelizer(t);
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
}
