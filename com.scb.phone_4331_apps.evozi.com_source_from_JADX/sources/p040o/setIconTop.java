package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.CameraSource;
import p040o.DocumentUploadedCustomView;
import p040o.set;

/* renamed from: o.setIconTop */
public final class setIconTop<T> extends DocumentInstructionsDetailCustomView_ViewBinding<T, T> {
    private DocumentUploadedCustomView<T> MediaBrowserCompat$CustomActionResultReceiver;

    public static <T> setIconTop<T> IconCompatParcelizer() {
        final DocumentUploadedCustomView documentUploadedCustomView = new DocumentUploadedCustomView();
        documentUploadedCustomView.MediaBrowserCompat$ItemReceiver = new setDefaultBorder<DocumentUploadedCustomView.write<T>>() {
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
                if (r0 == null) goto L_0x005f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
                r4 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
                if (r4 == null) goto L_0x003c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                r4 = r4.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
                if (r4.hasNext() == false) goto L_0x003c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
                r5 = r4.next();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
                if (r5 == null) goto L_0x002a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
                p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r8.MediaBrowserCompat$ItemReceiver, r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
                if (r2 == false) goto L_0x0046;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
                if (r0 == null) goto L_0x0045;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
                p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r8.MediaBrowserCompat$ItemReceiver, r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
                r2 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
                monitor-enter(r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
                r4 = r8.IconCompatParcelizer;
                r8.IconCompatParcelizer = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
                if (r4 != null) goto L_0x0051;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
                r8.MediaBrowserCompat$CustomActionResultReceiver = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
                monitor-exit(r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0051, code lost:
                monitor-exit(r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0056, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0057, code lost:
                monitor-enter(r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                r8.MediaBrowserCompat$CustomActionResultReceiver = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x005b, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x005f, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x0061, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(java.lang.Object r8) {
                /*
                    r7 = this;
                    o.DocumentUploadedCustomView$write r8 = (p040o.DocumentUploadedCustomView.write) r8
                    o.DocumentUploadedCustomView r0 = r0
                    java.lang.Object r0 = r0.write
                    o.DocumentUploadedCustomView r1 = r0
                    o.set$default<T> r1 = r1.read
                    monitor-enter(r8)
                    boolean r1 = r8.write     // Catch:{ all -> 0x0062 }
                    if (r1 == 0) goto L_0x0060
                    boolean r1 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0062 }
                    if (r1 == 0) goto L_0x0014
                    goto L_0x0060
                L_0x0014:
                    r1 = 0
                    r8.write = r1     // Catch:{ all -> 0x0062 }
                    r2 = 1
                    if (r0 == 0) goto L_0x001c
                    r3 = r2
                    goto L_0x001d
                L_0x001c:
                    r3 = r1
                L_0x001d:
                    r8.MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ all -> 0x0062 }
                    monitor-exit(r8)
                    if (r0 == 0) goto L_0x005f
                    r3 = 0
                    r4 = r3
                L_0x0024:
                    if (r4 == 0) goto L_0x003c
                    java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0056 }
                L_0x002a:
                    boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0056 }
                    if (r5 == 0) goto L_0x003c
                    java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0056 }
                    if (r5 == 0) goto L_0x002a
                    o.CustomCheckboxGroupView_ViewBinding<? super T> r6 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0056 }
                    p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r6, r5)     // Catch:{ all -> 0x0056 }
                    goto L_0x002a
                L_0x003c:
                    if (r2 == 0) goto L_0x0046
                    if (r0 == 0) goto L_0x0045
                    o.CustomCheckboxGroupView_ViewBinding<? super T> r2 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0056 }
                    p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r2, r0)     // Catch:{ all -> 0x0056 }
                L_0x0045:
                    r2 = r1
                L_0x0046:
                    monitor-enter(r8)     // Catch:{ all -> 0x0056 }
                    java.util.List<java.lang.Object> r4 = r8.IconCompatParcelizer     // Catch:{ all -> 0x0053 }
                    r8.IconCompatParcelizer = r3     // Catch:{ all -> 0x0053 }
                    if (r4 != 0) goto L_0x0051
                    r8.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x0053 }
                    monitor-exit(r8)
                    return
                L_0x0051:
                    monitor-exit(r8)
                    goto L_0x0024
                L_0x0053:
                    r0 = move-exception
                    monitor-exit(r8)
                    throw r0     // Catch:{ all -> 0x0056 }
                L_0x0056:
                    r0 = move-exception
                    monitor-enter(r8)
                    r8.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x005c }
                    monitor-exit(r8)
                    throw r0
                L_0x005c:
                    r0 = move-exception
                    monitor-exit(r8)
                    throw r0
                L_0x005f:
                    return
                L_0x0060:
                    monitor-exit(r8)
                    return
                L_0x0062:
                    r0 = move-exception
                    monitor-exit(r8)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.setIconTop.C74631.MediaBrowserCompat$ItemReceiver(java.lang.Object):void");
            }
        };
        return new setIconTop<>(documentUploadedCustomView, documentUploadedCustomView);
    }

    private setIconTop(CameraSource.CameraSourceException.write<T> write, DocumentUploadedCustomView<T> documentUploadedCustomView) {
        super(write);
        set.Cdefault.IconCompatParcelizer();
        this.MediaBrowserCompat$CustomActionResultReceiver = documentUploadedCustomView;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            Object MediaBrowserCompat$ItemReceiver = set.Cdefault.MediaBrowserCompat$ItemReceiver();
            for (DocumentUploadedCustomView.write MediaBrowserCompat$CustomActionResultReceiver2 : this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver)) {
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final void IconCompatParcelizer(Throwable th) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            Object IconCompatParcelizer = set.Cdefault.IconCompatParcelizer(th);
            ArrayList arrayList = null;
            for (DocumentUploadedCustomView.write MediaBrowserCompat$CustomActionResultReceiver2 : this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer)) {
                try {
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            AlertController$RecycleListView.read((List<? extends Throwable>) arrayList);
        }
    }

    public final void IconCompatParcelizer(T t) {
        for (DocumentUploadedCustomView.write IconCompatParcelizer : ((DocumentUploadedCustomView.read) this.MediaBrowserCompat$CustomActionResultReceiver.get()).read) {
            IconCompatParcelizer.IconCompatParcelizer(t);
        }
    }
}
