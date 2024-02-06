package p040o;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.EasycashCarInformationActivity_ViewBinding;

/* renamed from: o.EasycashCarInformationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class C6445x417c8af9<T, U> extends AtomicInteger implements BulkTransferDeepLinkActivity, BankingAgentTransactionsDeepLinkActivity<T> {
    private static EasycashCarInformationActivity_ViewBinding.write<?, ?>[] MediaBrowserCompat$MediaItem = new EasycashCarInformationActivity_ViewBinding.write[0];
    private static EasycashCarInformationActivity_ViewBinding.write<?, ?>[] read = new EasycashCarInformationActivity_ViewBinding.write[0];
    final int IconCompatParcelizer;
    private int Keep;
    final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
    final boolean MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f3134x50fd9e4a;
    private int MediaDescriptionCompat;
    private volatile boolean MediaMetadataCompat;
    private AtomicReference<EasycashCarInformationActivity_ViewBinding.write<?, ?>[]> MediaSessionCompat$QueueItem;
    private volatile HmlLoanOfferStatusDeepLinkBaseActivity<U> MediaSessionCompat$ResultReceiverWrapper;
    private Queue<DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> MediaSessionCompat$Token;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> ParcelableVolumeInfo;
    private long PlaybackStateCompat;
    private BulkTransferDeepLinkActivity PlaybackStateCompat$CustomAction;
    private volatile boolean RatingCompat;
    final BankingAgentTransactionsDeepLinkActivity<? super U> write;

    C6445x417c8af9(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, boolean z, int i, int i2) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.ParcelableVolumeInfo = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.f3134x50fd9e4a = i;
        this.IconCompatParcelizer = i2;
        if (i != Integer.MAX_VALUE) {
            this.MediaSessionCompat$Token = new ArrayDeque(i);
        }
        this.MediaSessionCompat$QueueItem = new AtomicReference<>(MediaBrowserCompat$MediaItem);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.PlaybackStateCompat$CustomAction, bulkTransferDeepLinkActivity)) {
            this.PlaybackStateCompat$CustomAction = bulkTransferDeepLinkActivity;
            this.write.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (!this.MediaMetadataCompat) {
            try {
                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.ParcelableVolumeInfo.write(t), "The mapper returned a null ObservableSource");
                if (this.f3134x50fd9e4a != Integer.MAX_VALUE) {
                    synchronized (this) {
                        if (this.Keep == this.f3134x50fd9e4a) {
                            this.MediaSessionCompat$Token.offer(debitCardResetPinSuccessActivity_ViewBinding);
                            return;
                        }
                        this.Keep++;
                    }
                }
                MediaBrowserCompat$ItemReceiver(debitCardResetPinSuccessActivity_ViewBinding);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.PlaybackStateCompat$CustomAction.dispose();
                onError(th);
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding) {
        DebitCardResetPinSuccessActivity_ViewBinding<? extends U> poll;
        while (debitCardResetPinSuccessActivity_ViewBinding instanceof Callable) {
            if (MediaBrowserCompat$CustomActionResultReceiver((Callable) debitCardResetPinSuccessActivity_ViewBinding) && this.f3134x50fd9e4a != Integer.MAX_VALUE) {
                boolean z = false;
                synchronized (this) {
                    poll = this.MediaSessionCompat$Token.poll();
                    if (poll == null) {
                        this.Keep--;
                        z = true;
                    }
                }
                if (!z) {
                    debitCardResetPinSuccessActivity_ViewBinding = poll;
                } else if (getAndIncrement() == 0) {
                    MediaBrowserCompat$ItemReceiver();
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        long j = this.PlaybackStateCompat;
        this.PlaybackStateCompat = 1 + j;
        EasycashCarInformationActivity_ViewBinding.write write2 = new EasycashCarInformationActivity_ViewBinding.write(this, j);
        if (MediaBrowserCompat$CustomActionResultReceiver(write2)) {
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(write2);
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(EasycashCarInformationActivity_ViewBinding.write<T, U> write2) {
        EasycashCarInformationActivity_ViewBinding.write<?, ?>[] writeArr;
        EasycashCarInformationActivity_ViewBinding.write[] writeArr2;
        do {
            writeArr = (EasycashCarInformationActivity_ViewBinding.write[]) this.MediaSessionCompat$QueueItem.get();
            if (writeArr == read) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write2);
                return false;
            }
            int length = writeArr.length;
            writeArr2 = new EasycashCarInformationActivity_ViewBinding.write[(length + 1)];
            System.arraycopy(writeArr, 0, writeArr2, 0, length);
            writeArr2[length] = write2;
        } while (!this.MediaSessionCompat$QueueItem.compareAndSet(writeArr, writeArr2));
        return true;
    }

    private void IconCompatParcelizer(EasycashCarInformationActivity_ViewBinding.write<T, U> write2) {
        EasycashCarInformationActivity_ViewBinding.write<T, U>[] writeArr;
        EasycashCarInformationActivity_ViewBinding.write<?, ?>[] writeArr2;
        do {
            writeArr = (EasycashCarInformationActivity_ViewBinding.write[]) this.MediaSessionCompat$QueueItem.get();
            int length = writeArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (writeArr[i] == write2) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        writeArr2 = MediaBrowserCompat$MediaItem;
                    } else {
                        EasycashCarInformationActivity_ViewBinding.write<?, ?>[] writeArr3 = new EasycashCarInformationActivity_ViewBinding.write[(length - 1)];
                        System.arraycopy(writeArr, 0, writeArr3, 0, i);
                        System.arraycopy(writeArr, i + 1, writeArr3, i, (length - i) - 1);
                        writeArr2 = writeArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.MediaSessionCompat$QueueItem.compareAndSet(writeArr, writeArr2));
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(Callable<? extends U> callable) {
        try {
            Object call = callable.call();
            if (call == null) {
                return true;
            }
            if (get() != 0 || !compareAndSet(0, 1)) {
                HmlLoanOfferStatusDeepLinkBaseActivity<U> hmlLoanOfferStatusDeepLinkBaseActivity = this.MediaSessionCompat$ResultReceiverWrapper;
                if (hmlLoanOfferStatusDeepLinkBaseActivity == null) {
                    if (this.f3134x50fd9e4a == Integer.MAX_VALUE) {
                        hmlLoanOfferStatusDeepLinkBaseActivity = new HmlBaseEmailAboutActivity<>(this.IconCompatParcelizer);
                    } else {
                        hmlLoanOfferStatusDeepLinkBaseActivity = new HmlBaseConsentActivity<>(this.f3134x50fd9e4a);
                    }
                    this.MediaSessionCompat$ResultReceiverWrapper = hmlLoanOfferStatusDeepLinkBaseActivity;
                }
                if (!hmlLoanOfferStatusDeepLinkBaseActivity.IconCompatParcelizer(call)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return true;
                } else if (getAndIncrement() != 0) {
                    return false;
                }
            } else {
                this.write.onNext(call);
                if (decrementAndGet() == 0) {
                    return true;
                }
            }
            MediaBrowserCompat$ItemReceiver();
            return true;
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th);
            IconCompatParcelizer();
            return true;
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaMetadataCompat) {
            AlertController$RecycleListView.read.read(th);
        } else if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th)) {
            this.MediaMetadataCompat = true;
            if (getAndIncrement() == 0) {
                MediaBrowserCompat$ItemReceiver();
            }
        } else {
            AlertController$RecycleListView.read.read(th);
        }
    }

    public final void onComplete() {
        if (!this.MediaMetadataCompat) {
            this.MediaMetadataCompat = true;
            if (getAndIncrement() == 0) {
                MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final void dispose() {
        Throwable read2;
        if (!this.RatingCompat) {
            this.RatingCompat = true;
            if (MediaBrowserCompat$CustomActionResultReceiver() && (read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver)) != null && read2 != HmlBusinessOccupationInfoActivity_ViewBinding.write) {
                AlertController$RecycleListView.read.read(read2);
            }
        }
    }

    public final boolean isDisposed() {
        return this.RatingCompat;
    }

    private void IconCompatParcelizer() {
        if (getAndIncrement() == 0) {
            MediaBrowserCompat$ItemReceiver();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        int i;
        int i2;
        BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity = this.write;
        int i3 = 1;
        while (!write()) {
            HmlLoanOfferStatusDeepLinkBaseActivity<U> hmlLoanOfferStatusDeepLinkBaseActivity = this.MediaSessionCompat$ResultReceiverWrapper;
            if (hmlLoanOfferStatusDeepLinkBaseActivity != null) {
                while (!write()) {
                    U read2 = hmlLoanOfferStatusDeepLinkBaseActivity.read();
                    if (read2 != null) {
                        bankingAgentTransactionsDeepLinkActivity.onNext(read2);
                    }
                }
                return;
            }
            boolean z = this.MediaMetadataCompat;
            HmlLoanOfferStatusDeepLinkBaseActivity<U> hmlLoanOfferStatusDeepLinkBaseActivity2 = this.MediaSessionCompat$ResultReceiverWrapper;
            EasycashCarInformationActivity_ViewBinding.write[] writeArr = (EasycashCarInformationActivity_ViewBinding.write[]) this.MediaSessionCompat$QueueItem.get();
            int length = writeArr.length;
            int i4 = 0;
            if (this.f3134x50fd9e4a != Integer.MAX_VALUE) {
                synchronized (this) {
                    i = this.MediaSessionCompat$Token.size();
                }
            } else {
                i = 0;
            }
            if (!z || !((hmlLoanOfferStatusDeepLinkBaseActivity2 == null || hmlLoanOfferStatusDeepLinkBaseActivity2.write()) && length == 0 && i == 0)) {
                if (length != 0) {
                    long j = this.MediaBrowserCompat$SearchResultReceiver;
                    int i5 = this.MediaDescriptionCompat;
                    if (length <= i5 || writeArr[i5].MediaBrowserCompat$ItemReceiver != j) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && writeArr[i5].MediaBrowserCompat$ItemReceiver != j; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.MediaDescriptionCompat = i5;
                        this.MediaBrowserCompat$SearchResultReceiver = writeArr[i5].MediaBrowserCompat$ItemReceiver;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        if (!write()) {
                            EasycashCarInformationActivity_ViewBinding.write write2 = writeArr[i5];
                            HmlSuccessfulDeepLinkActivity<U> hmlSuccessfulDeepLinkActivity = write2.read;
                            if (hmlSuccessfulDeepLinkActivity != null) {
                                while (true) {
                                    try {
                                        U read3 = hmlSuccessfulDeepLinkActivity.read();
                                        if (read3 == null) {
                                            break;
                                        }
                                        bankingAgentTransactionsDeepLinkActivity.onNext(read3);
                                        if (write()) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        AlertController$RecycleListView.read.write(th);
                                        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write2);
                                        HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th);
                                        if (!write()) {
                                            IconCompatParcelizer(write2);
                                            i8++;
                                            i2 = i5 + 1;
                                            if (i2 != length) {
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                            boolean z2 = write2.IconCompatParcelizer;
                            HmlSuccessfulDeepLinkActivity<U> hmlSuccessfulDeepLinkActivity2 = write2.read;
                            if (z2 && (hmlSuccessfulDeepLinkActivity2 == null || hmlSuccessfulDeepLinkActivity2.write())) {
                                IconCompatParcelizer(write2);
                                if (!write()) {
                                    i8++;
                                } else {
                                    return;
                                }
                            }
                            i2 = i5 + 1;
                            if (i2 != length) {
                                i7++;
                            }
                            i2 = 0;
                            i7++;
                        } else {
                            return;
                        }
                    }
                    this.MediaDescriptionCompat = i5;
                    this.MediaBrowserCompat$SearchResultReceiver = writeArr[i5].MediaBrowserCompat$ItemReceiver;
                    i4 = i8;
                }
                if (i4 == 0) {
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else if (this.f3134x50fd9e4a != Integer.MAX_VALUE) {
                    while (i4 != 0) {
                        synchronized (this) {
                            DebitCardResetPinSuccessActivity_ViewBinding poll = this.MediaSessionCompat$Token.poll();
                            if (poll == null) {
                                this.Keep--;
                            } else {
                                MediaBrowserCompat$ItemReceiver(poll);
                            }
                        }
                        i4--;
                    }
                    continue;
                } else {
                    continue;
                }
            } else {
                Throwable read4 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (read4 == HmlBusinessOccupationInfoActivity_ViewBinding.write) {
                    return;
                }
                if (read4 == null) {
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                    return;
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onError(read4);
                    return;
                }
            }
        }
    }

    private boolean write() {
        if (this.RatingCompat) {
            return true;
        }
        Throwable th = (Throwable) this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (this.MediaBrowserCompat$ItemReceiver || th == null) {
            return false;
        }
        MediaBrowserCompat$CustomActionResultReceiver();
        Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (read2 != HmlBusinessOccupationInfoActivity_ViewBinding.write) {
            this.write.onError(read2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        EasycashCarInformationActivity_ViewBinding.write<?, ?>[] writeArr;
        this.PlaybackStateCompat$CustomAction.dispose();
        EasycashCarInformationActivity_ViewBinding.write<?, ?>[] writeArr2 = (EasycashCarInformationActivity_ViewBinding.write[]) this.MediaSessionCompat$QueueItem.get();
        EasycashCarInformationActivity_ViewBinding.write<?, ?>[] writeArr3 = read;
        if (writeArr2 == writeArr3 || (writeArr = (EasycashCarInformationActivity_ViewBinding.write[]) this.MediaSessionCompat$QueueItem.getAndSet(writeArr3)) == read) {
            return false;
        }
        for (EasycashCarInformationActivity_ViewBinding.write<?, ?> read2 : writeArr) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2);
        }
        return true;
    }
}
