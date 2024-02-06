package p040o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p040o.CameraSource;
import p040o.set;

/* renamed from: o.DocumentUploadedCustomView */
final class DocumentUploadedCustomView<T> extends AtomicReference<read<T>> implements CameraSource.CameraSourceException.write<T> {
    private setDefaultBorder<write<T>> IconCompatParcelizer = setBorderWidth.read();
    boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    setDefaultBorder<write<T>> MediaBrowserCompat$ItemReceiver = setBorderWidth.read();
    private setDefaultBorder<write<T>> MediaBrowserCompat$SearchResultReceiver = setBorderWidth.read();
    public final set.Cdefault<T> read = set.Cdefault.IconCompatParcelizer();
    volatile Object write;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        boolean z;
        CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) obj;
        final write write2 = new write(customCheckboxGroupView_ViewBinding);
        customCheckboxGroupView_ViewBinding.read.MediaBrowserCompat$ItemReceiver(setAddButton.write(new setImageWidth() {
            public final void IconCompatParcelizer() {
                DocumentUploadedCustomView.this.read(write2);
            }
        }));
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(write2);
        if (!customCheckboxGroupView_ViewBinding.read.read) {
            while (true) {
                read read2 = (read) get();
                z = false;
                if (!read2.MediaBrowserCompat$CustomActionResultReceiver) {
                    write[] writeArr = read2.read;
                    int length = writeArr.length;
                    write[] writeArr2 = new write[(length + 1)];
                    System.arraycopy(writeArr, 0, writeArr2, 0, length);
                    writeArr2[length] = write2;
                    if (compareAndSet(read2, new read(read2.MediaBrowserCompat$CustomActionResultReceiver, writeArr2))) {
                        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(write2);
                        z = true;
                        break;
                    }
                } else {
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(write2);
                    break;
                }
            }
            if (z && customCheckboxGroupView_ViewBinding.read.read) {
                read(write2);
            }
        }
    }

    public DocumentUploadedCustomView() {
        super(read.write);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.DocumentUploadedCustomView.write<T> r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.get()
            o.DocumentUploadedCustomView$read r0 = (p040o.DocumentUploadedCustomView.read) r0
            boolean r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            o.DocumentUploadedCustomView$read r1 = r0.MediaBrowserCompat$ItemReceiver(r3)
            if (r1 == r0) goto L_0x0017
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DocumentUploadedCustomView.read(o.DocumentUploadedCustomView$write):void");
    }

    /* renamed from: o.DocumentUploadedCustomView$read */
    public static final class read<T> {
        static final read IconCompatParcelizer = new read(true, MediaBrowserCompat$ItemReceiver);
        static final write[] MediaBrowserCompat$ItemReceiver = new write[0];
        static final read write = new read(false, MediaBrowserCompat$ItemReceiver);
        final boolean MediaBrowserCompat$CustomActionResultReceiver;
        final write[] read;

        public read(boolean z, write[] writeArr) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.read = writeArr;
        }

        public final read MediaBrowserCompat$ItemReceiver(write write2) {
            write[] writeArr = this.read;
            if (r1 == 1 && writeArr[0] == write2) {
                return write;
            }
            if (r1 == 0) {
                return this;
            }
            int i = r1 - 1;
            write[] writeArr2 = new write[i];
            int i2 = 0;
            for (write write3 : writeArr) {
                if (write3 != write2) {
                    if (i2 == i) {
                        return this;
                    }
                    writeArr2[i2] = write3;
                    i2++;
                }
            }
            if (i2 == 0) {
                return write;
            }
            if (i2 < i) {
                write[] writeArr3 = new write[i2];
                System.arraycopy(writeArr2, 0, writeArr3, 0, i2);
                writeArr2 = writeArr3;
            }
            return new read(this.MediaBrowserCompat$CustomActionResultReceiver, writeArr2);
        }
    }

    /* renamed from: o.DocumentUploadedCustomView$write */
    public static final class write<T> implements CustomCheckboxGroupView<T> {
        List<Object> IconCompatParcelizer;
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        CustomCheckboxGroupView_ViewBinding<? super T> MediaBrowserCompat$ItemReceiver;
        private boolean read;
        boolean write = true;

        public write(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding) {
            this.MediaBrowserCompat$ItemReceiver = customCheckboxGroupView_ViewBinding;
        }

        public final void IconCompatParcelizer(T t) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(t);
        }

        public final void IconCompatParcelizer(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1.read = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r1.read
                if (r0 != 0) goto L_0x0026
                monitor-enter(r1)
                r0 = 0
                r1.write = r0     // Catch:{ all -> 0x0023 }
                boolean r0 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x001e
                java.util.List<java.lang.Object> r0 = r1.IconCompatParcelizer     // Catch:{ all -> 0x0023 }
                if (r0 != 0) goto L_0x0017
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0023 }
                r0.<init>()     // Catch:{ all -> 0x0023 }
                r1.IconCompatParcelizer = r0     // Catch:{ all -> 0x0023 }
            L_0x0017:
                java.util.List<java.lang.Object> r0 = r1.IconCompatParcelizer     // Catch:{ all -> 0x0023 }
                r0.add(r2)     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)
                return
            L_0x001e:
                monitor-exit(r1)
                r0 = 1
                r1.read = r0
                goto L_0x0026
            L_0x0023:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            L_0x0026:
                o.CustomCheckboxGroupView_ViewBinding<? super T> r0 = r1.MediaBrowserCompat$ItemReceiver
                p040o.set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DocumentUploadedCustomView.write.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    public final write<T>[] MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.write = obj;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        if (((read) get()).MediaBrowserCompat$CustomActionResultReceiver) {
            return read.MediaBrowserCompat$ItemReceiver;
        }
        return ((read) getAndSet(read.IconCompatParcelizer)).read;
    }
}
