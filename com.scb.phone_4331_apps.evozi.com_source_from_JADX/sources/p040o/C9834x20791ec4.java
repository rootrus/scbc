package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.WelcomeAboardActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C9834x20791ec4<T, U extends Collection<? super T>> extends OprRenewDeepLinkActivity<T, U, U> implements Runnable, BulkTransferDeepLinkActivity {
    private BankingAgentDeepLinkActivity.read AlertController$RecycleListView;
    private int MediaBrowserCompat$MediaItem;
    private Callable<U> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private long f5532x50fd9e4a;
    private U MediaDescriptionCompat;
    private BulkTransferDeepLinkActivity MediaSessionCompat$QueueItem;
    private TimeUnit MediaSessionCompat$ResultReceiverWrapper;
    private long MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private long RatingCompat;
    private BulkTransferDeepLinkActivity setHasDecor;

    public final /* synthetic */ void write(BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity, Object obj) {
        bankingAgentTransactionsDeepLinkActivity.onNext((Collection) obj);
    }

    C9834x20791ec4(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, BankingAgentDeepLinkActivity.read read) {
        super(bankingAgentTransactionsDeepLinkActivity, new HmlApplicationOutcomeActivity());
        this.MediaBrowserCompat$SearchResultReceiver = callable;
        this.MediaSessionCompat$Token = j;
        this.MediaSessionCompat$ResultReceiverWrapper = timeUnit;
        this.MediaBrowserCompat$MediaItem = i;
        this.ParcelableVolumeInfo = z;
        this.AlertController$RecycleListView = read;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.setHasDecor, bulkTransferDeepLinkActivity)) {
            this.setHasDecor = bulkTransferDeepLinkActivity;
            try {
                this.MediaDescriptionCompat = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                BankingAgentDeepLinkActivity.read read = this.AlertController$RecycleListView;
                long j = this.MediaSessionCompat$Token;
                this.MediaSessionCompat$QueueItem = read.MediaBrowserCompat$ItemReceiver(this, j, j, this.MediaSessionCompat$ResultReceiverWrapper);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                bulkTransferDeepLinkActivity.dispose();
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$ItemReceiver);
                this.AlertController$RecycleListView.dispose();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r7.ParcelableVolumeInfo == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r7.MediaSessionCompat$QueueItem.dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        write(r0, false, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8 = (java.util.Collection) p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r7.MediaBrowserCompat$SearchResultReceiver.call(), "The buffer supplied is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.MediaDescriptionCompat = r8;
        r7.RatingCompat++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r7.ParcelableVolumeInfo == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r0 = r7.AlertController$RecycleListView;
        r4 = r7.MediaSessionCompat$Token;
        r7.MediaSessionCompat$QueueItem = r0.MediaBrowserCompat$ItemReceiver(r7, r4, r4, r7.MediaSessionCompat$ResultReceiverWrapper);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        p040o.AlertController$RecycleListView.read.write(r8);
        r7.MediaBrowserCompat$ItemReceiver.onError(r8);
        dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            U r0 = r7.MediaDescriptionCompat     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            r0.add(r8)     // Catch:{ all -> 0x0066 }
            int r8 = r0.size()     // Catch:{ all -> 0x0066 }
            int r1 = r7.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x0066 }
            if (r8 >= r1) goto L_0x0014
            monitor-exit(r7)
            return
        L_0x0014:
            r8 = 0
            r7.MediaDescriptionCompat = r8     // Catch:{ all -> 0x0066 }
            long r1 = r7.f5532x50fd9e4a     // Catch:{ all -> 0x0066 }
            r3 = 1
            long r1 = r1 + r3
            r7.f5532x50fd9e4a = r1     // Catch:{ all -> 0x0066 }
            monitor-exit(r7)
            boolean r8 = r7.ParcelableVolumeInfo
            if (r8 == 0) goto L_0x0028
            o.BulkTransferDeepLinkActivity r8 = r7.MediaSessionCompat$QueueItem
            r8.dispose()
        L_0x0028:
            r8 = 0
            r7.write(r0, r8, r7)
            java.util.concurrent.Callable<U> r8 = r7.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0059 }
            java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "The buffer supplied is null"
            java.lang.Object r8 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r8, r0)     // Catch:{ all -> 0x0059 }
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0059 }
            monitor-enter(r7)
            r7.MediaDescriptionCompat = r8     // Catch:{ all -> 0x0056 }
            long r0 = r7.RatingCompat     // Catch:{ all -> 0x0056 }
            long r0 = r0 + r3
            r7.RatingCompat = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r7)
            boolean r8 = r7.ParcelableVolumeInfo
            if (r8 == 0) goto L_0x0055
            o.BankingAgentDeepLinkActivity$read r0 = r7.AlertController$RecycleListView
            long r4 = r7.MediaSessionCompat$Token
            java.util.concurrent.TimeUnit r6 = r7.MediaSessionCompat$ResultReceiverWrapper
            r1 = r7
            r2 = r4
            o.BulkTransferDeepLinkActivity r8 = r0.MediaBrowserCompat$ItemReceiver(r1, r2, r4, r6)
            r7.MediaSessionCompat$QueueItem = r8
        L_0x0055:
            return
        L_0x0056:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0059:
            r8 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r8)
            o.BankingAgentTransactionsDeepLinkActivity<? super V> r0 = r7.MediaBrowserCompat$ItemReceiver
            r0.onError(r8)
            r7.dispose()
            return
        L_0x0066:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9834x20791ec4.onNext(java.lang.Object):void");
    }

    public final void onError(Throwable th) {
        synchronized (this) {
            this.MediaDescriptionCompat = null;
        }
        this.MediaBrowserCompat$ItemReceiver.onError(th);
        this.AlertController$RecycleListView.dispose();
    }

    public final void onComplete() {
        U u;
        this.AlertController$RecycleListView.dispose();
        synchronized (this) {
            u = this.MediaDescriptionCompat;
            this.MediaDescriptionCompat = null;
        }
        if (u != null) {
            this.write.IconCompatParcelizer(u);
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaMetadataCompat.getAndIncrement() != 0) {
                z = false;
            }
            if (z) {
                AlertController$RecycleListView.write(this.write, this.MediaBrowserCompat$ItemReceiver, false, (BulkTransferDeepLinkActivity) this, this);
            }
        }
    }

    public final void dispose() {
        if (!this.read) {
            this.read = true;
            this.setHasDecor.dispose();
            this.AlertController$RecycleListView.dispose();
            synchronized (this) {
                this.MediaDescriptionCompat = null;
            }
        }
    }

    public final boolean isDisposed() {
        return this.read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.util.concurrent.Callable<U> r0 = r6.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "The bufferSupplier returned a null buffer"
            java.lang.Object r0 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r0, r1)     // Catch:{ all -> 0x0029 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0029 }
            monitor-enter(r6)
            U r1 = r6.MediaDescriptionCompat     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0024
            long r2 = r6.f5532x50fd9e4a     // Catch:{ all -> 0x0026 }
            long r4 = r6.RatingCompat     // Catch:{ all -> 0x0026 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            r6.MediaDescriptionCompat = r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r6)
            r0 = 0
            r6.write(r1, r0, r6)
            return
        L_0x0024:
            monitor-exit(r6)
            return
        L_0x0026:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0029:
            r0 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r0)
            r6.dispose()
            o.BankingAgentTransactionsDeepLinkActivity<? super V> r1 = r6.MediaBrowserCompat$ItemReceiver
            r1.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9834x20791ec4.run():void");
    }
}
