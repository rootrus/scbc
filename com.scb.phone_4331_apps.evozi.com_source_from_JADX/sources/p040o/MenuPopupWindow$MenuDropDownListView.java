package p040o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: o.MenuPopupWindow$MenuDropDownListView */
public final class MenuPopupWindow$MenuDropDownListView implements Handler.Callback {
    final int IconCompatParcelizer;
    private Handler MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$MediaItem;
    private final String MediaMetadataCompat;
    private HandlerThread RatingCompat;
    private Handler.Callback read = this;
    final Object write = new Object();

    /* renamed from: o.MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer */
    public interface IconCompatParcelizer<T> {
        void MediaBrowserCompat$CustomActionResultReceiver(T t);
    }

    public MenuPopupWindow$MenuDropDownListView(String str) {
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompat$MediaItem = 10;
        this.IconCompatParcelizer = 10000;
        this.MediaBrowserCompat$ItemReceiver = 0;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Runnable runnable) {
        synchronized (this.write) {
            if (this.RatingCompat == null) {
                HandlerThread handlerThread = new HandlerThread(this.MediaMetadataCompat, this.MediaBrowserCompat$MediaItem);
                this.RatingCompat = handlerThread;
                handlerThread.start();
                this.MediaBrowserCompat$CustomActionResultReceiver = new Handler(this.RatingCompat.getLooper(), this.read);
                this.MediaBrowserCompat$ItemReceiver++;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.removeMessages(0);
            this.MediaBrowserCompat$CustomActionResultReceiver.sendMessage(this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T read(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            o.MenuPopupWindow$MenuDropDownListView$2 r11 = new o.MenuPopupWindow$MenuDropDownListView$2
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.MediaBrowserCompat$ItemReceiver(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005d }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005d }
            long r0 = (long) r14     // Catch:{ all -> 0x005d }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005d }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005d }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005d }
            throw r13     // Catch:{ all -> 0x005d }
        L_0x005d:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MenuPopupWindow$MenuDropDownListView.read(java.util.concurrent.Callable, int):java.lang.Object");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.write) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver.hasMessages(1)) {
                    this.RatingCompat.quit();
                    this.RatingCompat = null;
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            ((Runnable) message.obj).run();
            synchronized (this.write) {
                this.MediaBrowserCompat$CustomActionResultReceiver.removeMessages(0);
                this.MediaBrowserCompat$CustomActionResultReceiver.sendMessageDelayed(this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(0), (long) this.IconCompatParcelizer);
            }
            return true;
        }
    }
}
