package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.onBtnSaveClicked;

/* renamed from: o.onBtnSaveClicked$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C10092xcc48bf53<T> implements DebitCardResetPinSuccessActivity_ViewBinding<T> {
    private final onBtnSaveClicked.read<T> IconCompatParcelizer;
    private final AtomicReference<onBtnSaveClicked.MediaMetadataCompat<T>> MediaBrowserCompat$ItemReceiver;

    C10092xcc48bf53(AtomicReference<onBtnSaveClicked.MediaMetadataCompat<T>> atomicReference, onBtnSaveClicked.read<T> read) {
        this.MediaBrowserCompat$ItemReceiver = atomicReference;
        this.IconCompatParcelizer = read;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribe(p040o.BankingAgentTransactionsDeepLinkActivity<? super T> r6) {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.onBtnSaveClicked$MediaMetadataCompat<T>> r0 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.Object r0 = r0.get()
            o.onBtnSaveClicked$MediaMetadataCompat r0 = (p040o.onBtnSaveClicked.MediaMetadataCompat) r0
            if (r0 != 0) goto L_0x001f
            o.onBtnSaveClicked$read<T> r0 = r5.IconCompatParcelizer
            o.onBtnSaveClicked$MediaBrowserCompat$MediaItem r0 = r0.read()
            o.onBtnSaveClicked$MediaMetadataCompat r1 = new o.onBtnSaveClicked$MediaMetadataCompat
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReference<o.onBtnSaveClicked$MediaMetadataCompat<T>> r0 = r5.MediaBrowserCompat$ItemReceiver
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x001f:
            o.onBtnSaveClicked$IconCompatParcelizer r1 = new o.onBtnSaveClicked$IconCompatParcelizer
            r1.<init>(r0, r6)
            r6.onSubscribe(r1)
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference<o.onBtnSaveClicked$IconCompatParcelizer[]> r6 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.Object r6 = r6.get()
            o.onBtnSaveClicked$IconCompatParcelizer[] r6 = (p040o.onBtnSaveClicked.IconCompatParcelizer[]) r6
            o.onBtnSaveClicked$IconCompatParcelizer[] r2 = p040o.onBtnSaveClicked.MediaMetadataCompat.read
            if (r6 == r2) goto L_0x0046
            int r2 = r6.length
            int r3 = r2 + 1
            o.onBtnSaveClicked$IconCompatParcelizer[] r3 = new p040o.onBtnSaveClicked.IconCompatParcelizer[r3]
            r4 = 0
            java.lang.System.arraycopy(r6, r4, r3, r4, r2)
            r3[r2] = r1
            java.util.concurrent.atomic.AtomicReference<o.onBtnSaveClicked$IconCompatParcelizer[]> r2 = r0.MediaBrowserCompat$ItemReceiver
            boolean r6 = r2.compareAndSet(r6, r3)
            if (r6 == 0) goto L_0x0027
        L_0x0046:
            boolean r6 = r1.isDisposed()
            if (r6 == 0) goto L_0x0050
            r0.read(r1)
            return
        L_0x0050:
            o.onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r6.IconCompatParcelizer(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10092xcc48bf53.subscribe(o.BankingAgentTransactionsDeepLinkActivity):void");
    }
}
