package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.ETBSetDetailNoteActivity;

/* renamed from: o.ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver */
final class ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private static ETBSetDetailNoteActivity.write<Object, Object> MediaBrowserCompat$SearchResultReceiver;
    final HmlBusinessETBPersonalInfoActivity IconCompatParcelizer;
    volatile long MediaBrowserCompat$CustomActionResultReceiver;
    volatile boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private volatile boolean MediaDescriptionCompat;
    private AtomicReference<ETBSetDetailNoteActivity.write<T, R>> MediaMetadataCompat = new AtomicReference<>();
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaSessionCompat$Token;
    private BankingAgentTransactionsDeepLinkActivity<? super R> RatingCompat;
    final boolean read;
    BulkTransferDeepLinkActivity write;

    static {
        ETBSetDetailNoteActivity.write<Object, Object> write2 = new ETBSetDetailNoteActivity.write<>((ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver) null, -1, 1);
        MediaBrowserCompat$SearchResultReceiver = write2;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write2);
    }

    ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, boolean z) {
        this.RatingCompat = bankingAgentTransactionsDeepLinkActivity;
        this.MediaSessionCompat$Token = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$MediaItem = i;
        this.read = z;
        this.IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.RatingCompat.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        ETBSetDetailNoteActivity.write<Object, Object> write2;
        long j = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        ETBSetDetailNoteActivity.write write3 = this.MediaMetadataCompat.get();
        if (write3 != null) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write3);
        }
        try {
            DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaSessionCompat$Token.write(t), "The ObservableSource returned is null");
            ETBSetDetailNoteActivity.write write4 = new ETBSetDetailNoteActivity.write(this, j, this.MediaBrowserCompat$MediaItem);
            do {
                write2 = this.MediaMetadataCompat.get();
                if (write2 == MediaBrowserCompat$SearchResultReceiver) {
                    return;
                }
            } while (!this.MediaMetadataCompat.compareAndSet(write2, write4));
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(write4);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.write.dispose();
            onError(th);
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver || !HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer, th)) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        if (!this.read) {
            IconCompatParcelizer();
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void dispose() {
        if (!this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = true;
            this.write.dispose();
            IconCompatParcelizer();
        }
    }

    public final boolean isDisposed() {
        return this.MediaDescriptionCompat;
    }

    private void IconCompatParcelizer() {
        ETBSetDetailNoteActivity.write<Object, Object> andSet;
        ETBSetDetailNoteActivity.write<Object, Object> write2 = this.MediaMetadataCompat.get();
        ETBSetDetailNoteActivity.write<Object, Object> write3 = MediaBrowserCompat$SearchResultReceiver;
        if (write2 != write3 && (andSet = this.MediaMetadataCompat.getAndSet(write3)) != MediaBrowserCompat$SearchResultReceiver && andSet != null) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x000f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            o.BankingAgentTransactionsDeepLinkActivity<? super R> r0 = r13.RatingCompat
            java.util.concurrent.atomic.AtomicReference<o.ETBSetDetailNoteActivity$write<T, R>> r1 = r13.MediaMetadataCompat
            boolean r2 = r13.read
            r3 = 1
            r4 = r3
        L_0x000f:
            boolean r5 = r13.MediaDescriptionCompat
            if (r5 == 0) goto L_0x0014
            return
        L_0x0014:
            boolean r5 = r13.MediaBrowserCompat$ItemReceiver
            r6 = 0
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r1.get()
            if (r5 != 0) goto L_0x0021
            r5 = r3
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r2 == 0) goto L_0x0038
            if (r5 == 0) goto L_0x0052
            o.HmlBusinessETBPersonalInfoActivity r1 = r13.IconCompatParcelizer
            java.lang.Object r1 = r1.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0034
            r0.onError(r1)
            return
        L_0x0034:
            r0.onComplete()
            return
        L_0x0038:
            o.HmlBusinessETBPersonalInfoActivity r7 = r13.IconCompatParcelizer
            java.lang.Object r7 = r7.get()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x004c
            o.HmlBusinessETBPersonalInfoActivity r1 = r13.IconCompatParcelizer
            java.lang.Throwable r1 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.read(r1)
            r0.onError(r1)
            return
        L_0x004c:
            if (r5 == 0) goto L_0x0052
            r0.onComplete()
            return
        L_0x0052:
            java.lang.Object r5 = r1.get()
            o.ETBSetDetailNoteActivity$write r5 = (p040o.ETBSetDetailNoteActivity.write) r5
            if (r5 == 0) goto L_0x00e9
            o.HmlSuccessfulDeepLinkActivity<R> r7 = r5.write
            if (r7 == 0) goto L_0x00e9
            boolean r8 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r9 = 0
            if (r8 == 0) goto L_0x0089
            boolean r8 = r7.write()
            if (r2 == 0) goto L_0x006f
            if (r8 == 0) goto L_0x0089
            r1.compareAndSet(r5, r9)
            goto L_0x000f
        L_0x006f:
            o.HmlBusinessETBPersonalInfoActivity r10 = r13.IconCompatParcelizer
            java.lang.Object r10 = r10.get()
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L_0x0083
            o.HmlBusinessETBPersonalInfoActivity r1 = r13.IconCompatParcelizer
            java.lang.Throwable r1 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.read(r1)
            r0.onError(r1)
            return
        L_0x0083:
            if (r8 == 0) goto L_0x0089
            r1.compareAndSet(r5, r9)
            goto L_0x000f
        L_0x0089:
            r8 = r6
        L_0x008a:
            boolean r10 = r13.MediaDescriptionCompat
            if (r10 == 0) goto L_0x008f
            return
        L_0x008f:
            java.lang.Object r10 = r1.get()
            if (r5 == r10) goto L_0x0096
            goto L_0x00dd
        L_0x0096:
            if (r2 != 0) goto L_0x00ac
            o.HmlBusinessETBPersonalInfoActivity r10 = r13.IconCompatParcelizer
            java.lang.Object r10 = r10.get()
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L_0x00ac
            o.HmlBusinessETBPersonalInfoActivity r1 = r13.IconCompatParcelizer
            java.lang.Throwable r1 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.read(r1)
            r0.onError(r1)
            return
        L_0x00ac:
            boolean r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r11 = r7.read()     // Catch:{ all -> 0x00b3 }
            goto L_0x00d1
        L_0x00b3:
            r8 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r8)
            o.HmlBusinessETBPersonalInfoActivity r11 = r13.IconCompatParcelizer
            p040o.HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(r11, r8)
            r1.compareAndSet(r5, r9)
            if (r2 != 0) goto L_0x00cc
            r13.IconCompatParcelizer()
            o.BulkTransferDeepLinkActivity r8 = r13.write
            r8.dispose()
            r13.MediaBrowserCompat$ItemReceiver = r3
            goto L_0x00cf
        L_0x00cc:
            p040o.HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(r5)
        L_0x00cf:
            r8 = r3
            r11 = r9
        L_0x00d1:
            if (r11 != 0) goto L_0x00d5
            r12 = r3
            goto L_0x00d6
        L_0x00d5:
            r12 = r6
        L_0x00d6:
            if (r10 == 0) goto L_0x00df
            if (r12 == 0) goto L_0x00df
            r1.compareAndSet(r5, r9)
        L_0x00dd:
            r8 = r3
            goto L_0x00e1
        L_0x00df:
            if (r12 == 0) goto L_0x00e5
        L_0x00e1:
            if (r8 == 0) goto L_0x00e9
            goto L_0x000f
        L_0x00e5:
            r0.onNext(r11)
            goto L_0x008a
        L_0x00e9:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto L_0x000f
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBSetDetailNoteActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver():void");
    }
}
