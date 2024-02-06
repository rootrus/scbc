package p040o;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.setBorderState */
public abstract class setBorderState<T> implements CustomInformationList_ViewBinding {
    private final long IconCompatParcelizer;
    Queue<T> MediaBrowserCompat$CustomActionResultReceiver;
    final int MediaBrowserCompat$ItemReceiver;
    private final AtomicReference<Future<?>> read;
    final int write;

    /* access modifiers changed from: protected */
    public abstract T read();

    public setBorderState() {
        this((byte) 0);
    }

    private setBorderState(byte b) {
        this.write = 0;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.IconCompatParcelizer = 67;
        this.read = new AtomicReference<>();
        if (setCloseButton.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new MonthYearPickerDialog$MonthYearDialogViewHolder(Math.max(0, 1024));
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentLinkedQueue();
        }
        IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Future andSet = this.read.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p040o.DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        p040o.setIvAvatar.IconCompatParcelizer(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void IconCompatParcelizer() {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r8.read
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.concurrent.ScheduledExecutorService r1 = p040o.setLabelTitle.write()
            o.setBorderState$2 r2 = new o.setBorderState$2     // Catch:{ RejectedExecutionException -> 0x002a }
            r2.<init>()     // Catch:{ RejectedExecutionException -> 0x002a }
            r3 = 67
            r5 = 67
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ RejectedExecutionException -> 0x002a }
            java.util.concurrent.ScheduledFuture r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7)     // Catch:{ RejectedExecutionException -> 0x002a }
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r1 = r8.read
            r2 = 0
            boolean r1 = r1.compareAndSet(r2, r0)
            if (r1 != 0) goto L_0x0036
            r1 = 0
            r0.cancel(r1)
            goto L_0x0000
        L_0x002a:
            o.DocumentInstructionsDetailCustomView r0 = p040o.DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0032 }
            r0.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r0 = move-exception
            p040o.setIvAvatar.IconCompatParcelizer(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setBorderState.IconCompatParcelizer():void");
    }
}
