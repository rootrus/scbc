package p040o;

import p040o.set;

/* renamed from: o.setBannerImage */
public final class setBannerImage<T> implements CustomCheckboxGroupView<T> {
    private boolean IconCompatParcelizer;
    private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final CustomCheckboxGroupView<? super T> read;
    private setBannerImage$MediaBrowserCompat$CustomActionResultReceiver write;

    public setBannerImage(CustomCheckboxGroupView<? super T> customCheckboxGroupView) {
        set.Cdefault.IconCompatParcelizer();
        this.read = customCheckboxGroupView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.read.IconCompatParcelizer(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1 = r6.write;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0033, code lost:
        r6.IconCompatParcelizer = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0035, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6.write = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x003a, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x003b, code lost:
        r1 = r1.IconCompatParcelizer;
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x003e, code lost:
        if (r2 >= r3) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0040, code lost:
        r4 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0042, code lost:
        if (r4 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004a, code lost:
        if (p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r6.read, r4) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x004c, code lost:
        r6.MediaBrowserCompat$CustomActionResultReceiver = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x004f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0053, code lost:
        r6.MediaBrowserCompat$CustomActionResultReceiver = true;
        p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(r1);
        r6.read.IconCompatParcelizer(p043rx.exceptions.OnErrorThrowable.write(r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0065, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0066, code lost:
        r6.MediaBrowserCompat$CustomActionResultReceiver = true;
        r0 = r6.read;
        p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(r1);
        r0.IconCompatParcelizer(p043rx.exceptions.OnErrorThrowable.write(r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r6)
            boolean r0 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r6)
            return
        L_0x000c:
            boolean r0 = r6.IconCompatParcelizer     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0024
            o.setBannerImage$MediaBrowserCompat$CustomActionResultReceiver r0 = r6.write     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x001b
            o.setBannerImage$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.setBannerImage$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            r6.write = r0     // Catch:{ all -> 0x0075 }
        L_0x001b:
            java.lang.Object r7 = p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r7)     // Catch:{ all -> 0x0075 }
            r0.write(r7)     // Catch:{ all -> 0x0075 }
            monitor-exit(r6)
            return
        L_0x0024:
            r0 = 1
            r6.IconCompatParcelizer = r0     // Catch:{ all -> 0x0075 }
            monitor-exit(r6)
            o.CustomCheckboxGroupView<? super T> r1 = r6.read     // Catch:{ all -> 0x0065 }
            r1.IconCompatParcelizer(r7)     // Catch:{ all -> 0x0065 }
        L_0x002d:
            monitor-enter(r6)
            o.setBannerImage$MediaBrowserCompat$CustomActionResultReceiver r1 = r6.write     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0037
            r6.IconCompatParcelizer = r2     // Catch:{ all -> 0x0062 }
            monitor-exit(r6)
            return
        L_0x0037:
            r3 = 0
            r6.write = r3     // Catch:{ all -> 0x0062 }
            monitor-exit(r6)
            java.lang.Object[] r1 = r1.IconCompatParcelizer
            int r3 = r1.length
        L_0x003e:
            if (r2 >= r3) goto L_0x002d
            r4 = r1[r2]
            if (r4 == 0) goto L_0x002d
            o.CustomCheckboxGroupView<? super T> r5 = r6.read     // Catch:{ all -> 0x0052 }
            boolean r4 = p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r5, r4)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004f
            r6.MediaBrowserCompat$CustomActionResultReceiver = r0     // Catch:{ all -> 0x0052 }
            return
        L_0x004f:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0052:
            r1 = move-exception
            r6.MediaBrowserCompat$CustomActionResultReceiver = r0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1)
            o.CustomCheckboxGroupView<? super T> r0 = r6.read
            java.lang.Throwable r7 = p043rx.exceptions.OnErrorThrowable.write(r1, r7)
            r0.IconCompatParcelizer((java.lang.Throwable) r7)
            return
        L_0x0062:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0065:
            r1 = move-exception
            r6.MediaBrowserCompat$CustomActionResultReceiver = r0
            o.CustomCheckboxGroupView<? super T> r0 = r6.read
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1)
            java.lang.Throwable r7 = p043rx.exceptions.OnErrorThrowable.write(r1, r7)
            r0.IconCompatParcelizer((java.lang.Throwable) r7)
            return
        L_0x0075:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setBannerImage.IconCompatParcelizer(java.lang.Object):void");
    }

    public final void IconCompatParcelizer(Throwable th) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            synchronized (this) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    if (this.IconCompatParcelizer) {
                        setBannerImage$MediaBrowserCompat$CustomActionResultReceiver setbannerimage_mediabrowsercompat_customactionresultreceiver = this.write;
                        if (setbannerimage_mediabrowsercompat_customactionresultreceiver == null) {
                            setbannerimage_mediabrowsercompat_customactionresultreceiver = new setBannerImage$MediaBrowserCompat$CustomActionResultReceiver();
                            this.write = setbannerimage_mediabrowsercompat_customactionresultreceiver;
                        }
                        setbannerimage_mediabrowsercompat_customactionresultreceiver.write(set.Cdefault.IconCompatParcelizer(th));
                        return;
                    }
                    this.IconCompatParcelizer = true;
                    this.read.IconCompatParcelizer(th);
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            synchronized (this) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    if (this.IconCompatParcelizer) {
                        setBannerImage$MediaBrowserCompat$CustomActionResultReceiver setbannerimage_mediabrowsercompat_customactionresultreceiver = this.write;
                        if (setbannerimage_mediabrowsercompat_customactionresultreceiver == null) {
                            setbannerimage_mediabrowsercompat_customactionresultreceiver = new setBannerImage$MediaBrowserCompat$CustomActionResultReceiver();
                            this.write = setbannerimage_mediabrowsercompat_customactionresultreceiver;
                        }
                        setbannerimage_mediabrowsercompat_customactionresultreceiver.write(set.Cdefault.MediaBrowserCompat$ItemReceiver());
                        return;
                    }
                    this.IconCompatParcelizer = true;
                    this.read.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }
    }
}
