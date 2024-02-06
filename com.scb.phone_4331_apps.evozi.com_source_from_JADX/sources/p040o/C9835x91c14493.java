package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.WelcomeAboardActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class C9835x91c14493<T, U extends Collection<? super T>> extends OprRenewDeepLinkActivity<T, U, U> implements Runnable, BulkTransferDeepLinkActivity {
    private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$MediaItem = new AtomicReference<>();
    private BankingAgentDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private Callable<U> MediaDescriptionCompat;
    private BulkTransferDeepLinkActivity MediaSessionCompat$QueueItem;
    private TimeUnit MediaSessionCompat$ResultReceiverWrapper;
    private long MediaSessionCompat$Token;
    private U RatingCompat;

    public final /* synthetic */ void write(BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity, Object obj) {
        this.MediaBrowserCompat$ItemReceiver.onNext((Collection) obj);
    }

    C9835x91c14493(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, Callable<U> callable, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
        this.MediaDescriptionCompat = callable;
        this.MediaSessionCompat$Token = j;
        this.MediaSessionCompat$ResultReceiverWrapper = timeUnit;
        this.MediaBrowserCompat$SearchResultReceiver = bankingAgentDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$QueueItem, bulkTransferDeepLinkActivity)) {
            this.MediaSessionCompat$QueueItem = bulkTransferDeepLinkActivity;
            try {
                this.RatingCompat = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaDescriptionCompat.call(), "The buffer supplied is null");
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                if (!this.read) {
                    BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
                    long j = this.MediaSessionCompat$Token;
                    BulkTransferDeepLinkActivity write = bankingAgentDeepLinkActivity.write(this, j, j, this.MediaSessionCompat$ResultReceiverWrapper);
                    if (!this.MediaBrowserCompat$MediaItem.compareAndSet((Object) null, write)) {
                        write.dispose();
                    }
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                dispose();
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final void onNext(T t) {
        synchronized (this) {
            U u = this.RatingCompat;
            if (u != null) {
                u.add(t);
            }
        }
    }

    public final void onError(Throwable th) {
        synchronized (this) {
            this.RatingCompat = null;
        }
        this.MediaBrowserCompat$ItemReceiver.onError(th);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$MediaItem);
    }

    public final void onComplete() {
        U u;
        synchronized (this) {
            u = this.RatingCompat;
            this.RatingCompat = null;
        }
        if (u != null) {
            this.write.IconCompatParcelizer(u);
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                AlertController$RecycleListView.write(this.write, this.MediaBrowserCompat$ItemReceiver, false, (BulkTransferDeepLinkActivity) null, this);
            }
        }
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$MediaItem);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$MediaItem);
        this.MediaSessionCompat$QueueItem.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$MediaItem.get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }

    public final void run() {
        U u;
        try {
            U u2 = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaDescriptionCompat.call(), "The bufferSupplier returned a null buffer");
            synchronized (this) {
                u = this.RatingCompat;
                if (u != null) {
                    this.RatingCompat = u2;
                }
            }
            if (u == null) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$MediaItem);
            } else {
                write(u, (BulkTransferDeepLinkActivity) this);
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.MediaBrowserCompat$ItemReceiver.onError(th);
            dispose();
        }
    }
}
