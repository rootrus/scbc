package p040o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.MwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class C6962x37aca1ed<E> extends showDialogDeletePinLocation<E> {
    private final MwPinnedSuccessActivity_ViewBinding<E> MediaBrowserCompat$ItemReceiver;
    volatile long _subHead = 0;
    private final ReentrantLock write = new ReentrantLock();

    /* access modifiers changed from: protected */
    public final boolean write() {
        return false;
    }

    public C6962x37aca1ed(MwPinnedSuccessActivity_ViewBinding<E> mwPinnedSuccessActivity_ViewBinding) {
        onGetStartedClick.write((Object) mwPinnedSuccessActivity_ViewBinding, "broadcastChannel");
        this.MediaBrowserCompat$ItemReceiver = mwPinnedSuccessActivity_ViewBinding;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo42858x50fd9e4a() {
        throw new IllegalStateException("Should not be used".toString());
    }

    /* access modifiers changed from: protected */
    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        throw new IllegalStateException("Should not be used".toString());
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            MwPinnedSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, (C6962x37aca1ed) null, this, 1);
            Lock lock = this.write;
            lock.lock();
            try {
                this._subHead = this.MediaBrowserCompat$ItemReceiver._tail;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } finally {
                lock.unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$ItemReceiver() {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.write
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            java.lang.Object r1 = r8.AlertController$RecycleListView()     // Catch:{ all -> 0x0042 }
            boolean r2 = r1 instanceof p040o.MwShopAddressActivity
            r3 = 1
            if (r2 != 0) goto L_0x001e
            java.lang.Object r4 = p040o.MwReviewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0042 }
            if (r1 != r4) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            long r4 = r8._subHead     // Catch:{ all -> 0x0042 }
            r6 = 1
            long r4 = r4 + r6
            r8._subHead = r4     // Catch:{ all -> 0x0042 }
            r4 = r3
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            r0.unlock()
            r0 = 0
            if (r2 != 0) goto L_0x0027
            r2 = r0
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            o.MwShopAddressActivity r2 = (p040o.MwShopAddressActivity) r2
            if (r2 == 0) goto L_0x0031
            java.lang.Throwable r2 = r2.read
            r8.write((java.lang.Throwable) r2)
        L_0x0031:
            boolean r2 = r8.MediaSessionCompat$QueueItem()
            if (r2 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            if (r3 == 0) goto L_0x0041
            o.MwPinnedSuccessActivity_ViewBinding<E> r2 = r8.MediaBrowserCompat$ItemReceiver
            r3 = 3
            p040o.MwPinnedSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r2, r0, r0, r3)
        L_0x0041:
            return r1
        L_0x0042:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6962x37aca1ed.MediaBrowserCompat$ItemReceiver():java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Object read(OccupationSearchActivity<?> occupationSearchActivity) {
        onGetStartedClick.write((Object) occupationSearchActivity, "select");
        Lock lock = this.write;
        lock.lock();
        try {
            Object AlertController$RecycleListView = AlertController$RecycleListView();
            boolean z = false;
            boolean z2 = true;
            if (!(AlertController$RecycleListView instanceof MwShopAddressActivity)) {
                if (AlertController$RecycleListView != MwReviewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (!occupationSearchActivity.read()) {
                        AlertController$RecycleListView = BaseTouchPointBreadcrumbActivity.IconCompatParcelizer();
                    } else {
                        this._subHead++;
                        z = true;
                    }
                }
            }
            lock.unlock();
            MwShopAddressActivity mwShopAddressActivity = (MwShopAddressActivity) (!(AlertController$RecycleListView instanceof MwShopAddressActivity) ? null : AlertController$RecycleListView);
            if (mwShopAddressActivity != null) {
                write(mwShopAddressActivity.read);
            }
            if (!MediaSessionCompat$QueueItem()) {
                z2 = z;
            }
            if (z2) {
                MwPinnedSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, (C6962x37aca1ed) null, (C6962x37aca1ed) null, 3);
            }
            return AlertController$RecycleListView;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private final Object AlertController$RecycleListView() {
        long j = this._subHead;
        MwShopAddressActivity<?> MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
        if (j >= this.MediaBrowserCompat$ItemReceiver._tail) {
            if (MediaBrowserCompat$SearchResultReceiver == null) {
                MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver();
            }
            return MediaBrowserCompat$SearchResultReceiver == null ? MwReviewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver : MediaBrowserCompat$SearchResultReceiver;
        }
        MwPinnedSuccessActivity_ViewBinding<E> mwPinnedSuccessActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        Object obj = mwPinnedSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver[(int) (j % ((long) mwPinnedSuccessActivity_ViewBinding.write))];
        MwShopAddressActivity<?> MediaBrowserCompat$SearchResultReceiver2 = MediaBrowserCompat$SearchResultReceiver();
        return MediaBrowserCompat$SearchResultReceiver2 != null ? MediaBrowserCompat$SearchResultReceiver2 : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = (p040o.MwShopAddressActivity) r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaSessionCompat$QueueItem() {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = r1
        L_0x0003:
            o.MwShopAddressActivity r3 = r10.MediaBrowserCompat$SearchResultReceiver()
            if (r3 == 0) goto L_0x000b
        L_0x0009:
            r3 = r1
            goto L_0x0024
        L_0x000b:
            long r3 = r10._subHead
            o.MwPinnedSuccessActivity_ViewBinding<E> r5 = r10.MediaBrowserCompat$ItemReceiver
            long r5 = r5._tail
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0017
            r3 = r0
            goto L_0x0018
        L_0x0017:
            r3 = r1
        L_0x0018:
            if (r3 == 0) goto L_0x0023
            o.MwPinnedSuccessActivity_ViewBinding<E> r3 = r10.MediaBrowserCompat$ItemReceiver
            o.MwShopAddressActivity r3 = r3.MediaBrowserCompat$SearchResultReceiver()
            if (r3 != 0) goto L_0x0023
            goto L_0x0009
        L_0x0023:
            r3 = r0
        L_0x0024:
            r4 = 0
            if (r3 == 0) goto L_0x0095
            java.util.concurrent.locks.ReentrantLock r3 = r10.write
            boolean r3 = r3.tryLock()
            if (r3 != 0) goto L_0x0031
            goto L_0x0095
        L_0x0031:
            java.lang.Object r3 = r10.AlertController$RecycleListView()     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = p040o.MwReviewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x008e }
            if (r3 != r5) goto L_0x003a
            goto L_0x0081
        L_0x003a:
            boolean r5 = r3 instanceof p040o.MwShopAddressActivity
            if (r5 == 0) goto L_0x0042
            o.MwShopAddressActivity r3 = (p040o.MwShopAddressActivity) r3     // Catch:{ all -> 0x008e }
            r4 = r3
            goto L_0x0088
        L_0x0042:
            o.MwShopTypeActivity_ViewBinding r5 = r10.MediaMetadataCompat()     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0088
            boolean r6 = r5 instanceof p040o.MwShopAddressActivity
            if (r6 == 0) goto L_0x004d
            goto L_0x0088
        L_0x004d:
            o.EkycOtpActivity r4 = r5.IconCompatParcelizer()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x0081
            boolean r2 = p040o.MwChangeCasaSuccessActivity.write()     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x006b
            o.EkycOtpActivity r2 = p040o.MailingAddressLandingActivity.write     // Catch:{ all -> 0x008e }
            if (r4 != r2) goto L_0x005f
            r2 = r0
            goto L_0x0060
        L_0x005f:
            r2 = r1
        L_0x0060:
            if (r2 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            r0.<init>()     // Catch:{ all -> 0x008e }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x006b:
            long r6 = r10._subHead     // Catch:{ all -> 0x008e }
            r8 = 1
            long r6 = r6 + r8
            r10._subHead = r6     // Catch:{ all -> 0x008e }
            java.util.concurrent.locks.ReentrantLock r2 = r10.write
            r2.unlock()
            if (r5 != 0) goto L_0x007c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x007c:
            r5.MediaBrowserCompat$ItemReceiver(r3)
            r2 = r0
            goto L_0x0003
        L_0x0081:
            java.util.concurrent.locks.ReentrantLock r3 = r10.write
            r3.unlock()
            goto L_0x0003
        L_0x0088:
            java.util.concurrent.locks.ReentrantLock r0 = r10.write
            r0.unlock()
            goto L_0x0095
        L_0x008e:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r10.write
            r1.unlock()
            throw r0
        L_0x0095:
            if (r4 == 0) goto L_0x009c
            java.lang.Throwable r0 = r4.read
            r10.write((java.lang.Throwable) r0)
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6962x37aca1ed.MediaSessionCompat$QueueItem():boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean IconCompatParcelizer() {
        return this._subHead >= this.MediaBrowserCompat$ItemReceiver._tail;
    }
}
