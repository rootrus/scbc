package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.WelcomeAboardActivity_ViewBinding */
public final class WelcomeAboardActivity_ViewBinding<T, U extends Collection<? super T>> extends NtbUserInfoActivity<T, U> {
    private BankingAgentDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$MediaItem;
    private long MediaDescriptionCompat;
    private TimeUnit MediaMetadataCompat;
    private Callable<U> read;
    private int write;

    public WelcomeAboardActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, Callable<U> callable, int i, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaDescriptionCompat = j;
        this.MediaBrowserCompat$MediaItem = j2;
        this.MediaMetadataCompat = timeUnit;
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentDeepLinkActivity;
        this.read = callable;
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        if (this.MediaDescriptionCompat == this.MediaBrowserCompat$MediaItem && this.write == Integer.MAX_VALUE) {
            this.IconCompatParcelizer.subscribe(new C9835x91c14493(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.read, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaBrowserCompat$CustomActionResultReceiver));
            return;
        }
        BankingAgentDeepLinkActivity.read write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (this.MediaDescriptionCompat == this.MediaBrowserCompat$MediaItem) {
            this.IconCompatParcelizer.subscribe(new C9834x20791ec4(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.read, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.write, this.MediaBrowserCompat$ItemReceiver, write2));
        } else {
            this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.read, this.MediaDescriptionCompat, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat, write2));
        }
    }

    /* renamed from: o.WelcomeAboardActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U extends Collection<? super T>> extends OprRenewDeepLinkActivity<T, U, U> implements Runnable, BulkTransferDeepLinkActivity {
        final BankingAgentDeepLinkActivity.read MediaBrowserCompat$MediaItem;
        private Callable<U> MediaBrowserCompat$SearchResultReceiver;
        final List<U> MediaDescriptionCompat = new LinkedList();
        private TimeUnit MediaSessionCompat$QueueItem;
        private long MediaSessionCompat$Token;
        private BulkTransferDeepLinkActivity ParcelableVolumeInfo;
        private long RatingCompat;

        public final /* synthetic */ void write(BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity, Object obj) {
            bankingAgentTransactionsDeepLinkActivity.onNext((Collection) obj);
        }

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, Callable<U> callable, long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2) {
            super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
            this.MediaBrowserCompat$SearchResultReceiver = callable;
            this.MediaSessionCompat$Token = j;
            this.RatingCompat = j2;
            this.MediaSessionCompat$QueueItem = timeUnit;
            this.MediaBrowserCompat$MediaItem = read2;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.ParcelableVolumeInfo, bulkTransferDeepLinkActivity)) {
                this.ParcelableVolumeInfo = bulkTransferDeepLinkActivity;
                try {
                    Collection collection = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
                    this.MediaDescriptionCompat.add(collection);
                    this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                    BankingAgentDeepLinkActivity.read read2 = this.MediaBrowserCompat$MediaItem;
                    long j = this.RatingCompat;
                    read2.MediaBrowserCompat$ItemReceiver(this, j, j, this.MediaSessionCompat$QueueItem);
                    this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(new read(collection), this.MediaSessionCompat$Token, this.MediaSessionCompat$QueueItem);
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    bulkTransferDeepLinkActivity.dispose();
                    HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$ItemReceiver);
                    this.MediaBrowserCompat$MediaItem.dispose();
                }
            }
        }

        public final void onNext(T t) {
            synchronized (this) {
                for (U add : this.MediaDescriptionCompat) {
                    add.add(t);
                }
            }
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            synchronized (this) {
                this.MediaDescriptionCompat.clear();
            }
            this.MediaBrowserCompat$ItemReceiver.onError(th);
            this.MediaBrowserCompat$MediaItem.dispose();
        }

        public final void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.MediaDescriptionCompat);
                this.MediaDescriptionCompat.clear();
            }
            for (Collection IconCompatParcelizer : arrayList) {
                this.write.IconCompatParcelizer(IconCompatParcelizer);
            }
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                AlertController$RecycleListView.write(this.write, this.MediaBrowserCompat$ItemReceiver, false, (BulkTransferDeepLinkActivity) this.MediaBrowserCompat$MediaItem, this);
            }
        }

        public final void dispose() {
            if (!this.read) {
                this.read = true;
                synchronized (this) {
                    this.MediaDescriptionCompat.clear();
                }
                this.ParcelableVolumeInfo.dispose();
                this.MediaBrowserCompat$MediaItem.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.read;
        }

        public final void run() {
            if (!this.read) {
                try {
                    Collection collection = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (!this.read) {
                            this.MediaDescriptionCompat.add(collection);
                            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(new C10813IconCompatParcelizer(collection), this.MediaSessionCompat$Token, this.MediaSessionCompat$QueueItem);
                        }
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.MediaBrowserCompat$ItemReceiver.onError(th);
                    dispose();
                }
            }
        }

        /* renamed from: o.WelcomeAboardActivity_ViewBinding$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        final class C10813IconCompatParcelizer implements Runnable {
            private final U IconCompatParcelizer;

            C10813IconCompatParcelizer(U u) {
                this.IconCompatParcelizer = u;
            }

            public final void run() {
                synchronized (IconCompatParcelizer.this) {
                    IconCompatParcelizer.this.MediaDescriptionCompat.remove(this.IconCompatParcelizer);
                }
                IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.this;
                iconCompatParcelizer.write(this.IconCompatParcelizer, false, iconCompatParcelizer.MediaBrowserCompat$MediaItem);
            }
        }

        /* renamed from: o.WelcomeAboardActivity_ViewBinding$IconCompatParcelizer$read */
        final class read implements Runnable {
            private final U IconCompatParcelizer;

            read(U u) {
                this.IconCompatParcelizer = u;
            }

            public final void run() {
                synchronized (IconCompatParcelizer.this) {
                    IconCompatParcelizer.this.MediaDescriptionCompat.remove(this.IconCompatParcelizer);
                }
                IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.this;
                iconCompatParcelizer.write(this.IconCompatParcelizer, false, iconCompatParcelizer.MediaBrowserCompat$MediaItem);
            }
        }
    }
}
