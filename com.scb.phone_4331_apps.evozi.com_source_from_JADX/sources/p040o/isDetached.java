package p040o;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.isDetached */
public final class isDetached implements Closeable {
    int IconCompatParcelizer;
    final File MediaBrowserCompat$CustomActionResultReceiver;
    Writer MediaBrowserCompat$ItemReceiver;
    private final File MediaBrowserCompat$MediaItem;
    private final File MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private long f2603x50fd9e4a = 0;
    private ThreadPoolExecutor MediaDescriptionCompat = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new write((byte) 0));
    private final File MediaMetadataCompat;
    private long MediaSessionCompat$ResultReceiverWrapper;
    private final LinkedHashMap<String, isDetached$MediaBrowserCompat$ItemReceiver> MediaSessionCompat$Token = new LinkedHashMap<>(0, 0.75f, true);
    private long ParcelableVolumeInfo = 0;
    private final Callable<Void> RatingCompat = new Callable<Void>() {
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return null;
         */
        /* renamed from: write */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                o.isDetached r0 = p040o.isDetached.this
                monitor-enter(r0)
                o.isDetached r1 = p040o.isDetached.this     // Catch:{ all -> 0x0025 }
                java.io.Writer r1 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000c
                monitor-exit(r0)
                return r2
            L_0x000c:
                o.isDetached r1 = p040o.isDetached.this     // Catch:{ all -> 0x0025 }
                r1.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x0025 }
                o.isDetached r1 = p040o.isDetached.this     // Catch:{ all -> 0x0025 }
                boolean r1 = r1.read()     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0023
                o.isDetached r1 = p040o.isDetached.this     // Catch:{ all -> 0x0025 }
                r1.IconCompatParcelizer()     // Catch:{ all -> 0x0025 }
                o.isDetached r1 = p040o.isDetached.this     // Catch:{ all -> 0x0025 }
                r3 = 0
                r1.IconCompatParcelizer = r3     // Catch:{ all -> 0x0025 }
            L_0x0023:
                monitor-exit(r0)
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.isDetached.C13864.call():java.lang.Void");
        }
    };
    final int read;
    private final int write;

    private isDetached(File file, int i, int i2, long j) {
        File file2 = file;
        this.MediaBrowserCompat$CustomActionResultReceiver = file2;
        this.write = 1;
        this.MediaBrowserCompat$MediaItem = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.MediaMetadataCompat = new File(file2, DiskLruCache.JOURNAL_FILE_TEMP);
        this.MediaBrowserCompat$SearchResultReceiver = new File(file2, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.read = 1;
        this.MediaSessionCompat$ResultReceiverWrapper = j;
    }

    public static isDetached IconCompatParcelizer(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            isDetached isdetached = new isDetached(file, 1, 1, j);
            if (isdetached.MediaBrowserCompat$MediaItem.exists()) {
                try {
                    isdetached.MediaBrowserCompat$ItemReceiver();
                    isdetached.write();
                    return isdetached;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    isdetached.close();
                    instantiateChildFragmentManager.read(isdetached.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
            file.mkdirs();
            isDetached isdetached2 = new isDetached(file, 1, 1, j);
            isdetached2.IconCompatParcelizer();
            return isdetached2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:52|53|(1:55)|(1:57)(1:58)|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r12.IconCompatParcelizer = r2 - r12.MediaSessionCompat$Token.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        if (r1.MediaBrowserCompat$ItemReceiver == -1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r0 != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        IconCompatParcelizer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        r12.MediaBrowserCompat$ItemReceiver = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r12.MediaBrowserCompat$MediaItem, true), p040o.instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x010d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x013a=Splitter:B:61:0x013a, B:52:0x010d=Splitter:B:52:0x010d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$ItemReceiver() throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            o.isAdded r1 = new o.isAdded
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r12.MediaBrowserCompat$MediaItem
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p040o.instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.IconCompatParcelizer()     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = r1.IconCompatParcelizer()     // Catch:{ all -> 0x0169 }
            java.lang.String r4 = r1.IconCompatParcelizer()     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = r1.IconCompatParcelizer()     // Catch:{ all -> 0x0169 }
            java.lang.String r6 = r1.IconCompatParcelizer()     // Catch:{ all -> 0x0169 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x013a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x013a
            int r7 = r12.write     // Catch:{ all -> 0x0169 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0169 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0169 }
            if (r4 == 0) goto L_0x013a
            int r4 = r12.read     // Catch:{ all -> 0x0169 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0169 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0169 }
            if (r4 == 0) goto L_0x013a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0169 }
            if (r4 == 0) goto L_0x013a
            r0 = 0
            r2 = r0
        L_0x0056:
            r3 = 1
            r4 = -1
            java.lang.String r5 = r1.IconCompatParcelizer()     // Catch:{ EOFException -> 0x010d }
            r6 = 32
            int r7 = r5.indexOf(r6)     // Catch:{ EOFException -> 0x010d }
            java.lang.String r8 = "unexpected journal line: "
            if (r7 == r4) goto L_0x00f8
            int r9 = r7 + 1
            int r6 = r5.indexOf(r6, r9)     // Catch:{ EOFException -> 0x010d }
            if (r6 != r4) goto L_0x0084
            java.lang.String r9 = r5.substring(r9)     // Catch:{ EOFException -> 0x010d }
            r10 = 6
            if (r7 != r10) goto L_0x0088
            java.lang.String r10 = "REMOVE"
            boolean r10 = r5.startsWith(r10)     // Catch:{ EOFException -> 0x010d }
            if (r10 == 0) goto L_0x0088
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r5 = r12.MediaSessionCompat$Token     // Catch:{ EOFException -> 0x010d }
            r5.remove(r9)     // Catch:{ EOFException -> 0x010d }
            goto L_0x00df
        L_0x0084:
            java.lang.String r9 = r5.substring(r9, r6)     // Catch:{ EOFException -> 0x010d }
        L_0x0088:
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r10 = r12.MediaSessionCompat$Token     // Catch:{ EOFException -> 0x010d }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ EOFException -> 0x010d }
            o.isDetached$MediaBrowserCompat$ItemReceiver r10 = (p040o.isDetached$MediaBrowserCompat$ItemReceiver) r10     // Catch:{ EOFException -> 0x010d }
            if (r10 != 0) goto L_0x009c
            o.isDetached$MediaBrowserCompat$ItemReceiver r10 = new o.isDetached$MediaBrowserCompat$ItemReceiver     // Catch:{ EOFException -> 0x010d }
            r10.<init>(r12, r9, r0)     // Catch:{ EOFException -> 0x010d }
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r11 = r12.MediaSessionCompat$Token     // Catch:{ EOFException -> 0x010d }
            r11.put(r9, r10)     // Catch:{ EOFException -> 0x010d }
        L_0x009c:
            r9 = 5
            if (r6 == r4) goto L_0x00be
            if (r7 != r9) goto L_0x00be
            java.lang.String r11 = "CLEAN"
            boolean r11 = r5.startsWith(r11)     // Catch:{ EOFException -> 0x010d }
            if (r11 == 0) goto L_0x00be
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ EOFException -> 0x010d }
            java.lang.String r6 = " "
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ EOFException -> 0x010d }
            r10.MediaBrowserCompat$SearchResultReceiver = r3     // Catch:{ EOFException -> 0x010d }
            r6 = 0
            r10.MediaBrowserCompat$CustomActionResultReceiver = r6     // Catch:{ EOFException -> 0x010d }
            r10.MediaBrowserCompat$ItemReceiver(r5)     // Catch:{ EOFException -> 0x010d }
            goto L_0x00df
        L_0x00be:
            if (r6 != r4) goto L_0x00d2
            if (r7 != r9) goto L_0x00d2
            java.lang.String r9 = "DIRTY"
            boolean r9 = r5.startsWith(r9)     // Catch:{ EOFException -> 0x010d }
            if (r9 == 0) goto L_0x00d2
            o.isDetached$IconCompatParcelizer r5 = new o.isDetached$IconCompatParcelizer     // Catch:{ EOFException -> 0x010d }
            r5.<init>(r12, r10, r0)     // Catch:{ EOFException -> 0x010d }
            r10.MediaBrowserCompat$CustomActionResultReceiver = r5     // Catch:{ EOFException -> 0x010d }
            goto L_0x00df
        L_0x00d2:
            if (r6 != r4) goto L_0x00e3
            r6 = 4
            if (r7 != r6) goto L_0x00e3
            java.lang.String r6 = "READ"
            boolean r6 = r5.startsWith(r6)     // Catch:{ EOFException -> 0x010d }
            if (r6 == 0) goto L_0x00e3
        L_0x00df:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x00e3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x010d }
            r6.<init>()     // Catch:{ EOFException -> 0x010d }
            r6.append(r8)     // Catch:{ EOFException -> 0x010d }
            r6.append(r5)     // Catch:{ EOFException -> 0x010d }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ EOFException -> 0x010d }
            java.lang.String r6 = r6.toString()     // Catch:{ EOFException -> 0x010d }
            r5.<init>(r6)     // Catch:{ EOFException -> 0x010d }
            throw r5     // Catch:{ EOFException -> 0x010d }
        L_0x00f8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x010d }
            r6.<init>()     // Catch:{ EOFException -> 0x010d }
            r6.append(r8)     // Catch:{ EOFException -> 0x010d }
            r6.append(r5)     // Catch:{ EOFException -> 0x010d }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ EOFException -> 0x010d }
            java.lang.String r6 = r6.toString()     // Catch:{ EOFException -> 0x010d }
            r5.<init>(r6)     // Catch:{ EOFException -> 0x010d }
            throw r5     // Catch:{ EOFException -> 0x010d }
        L_0x010d:
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r5 = r12.MediaSessionCompat$Token     // Catch:{ all -> 0x0169 }
            int r5 = r5.size()     // Catch:{ all -> 0x0169 }
            int r2 = r2 - r5
            r12.IconCompatParcelizer = r2     // Catch:{ all -> 0x0169 }
            int r2 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0169 }
            if (r2 != r4) goto L_0x011b
            r0 = r3
        L_0x011b:
            if (r0 == 0) goto L_0x0121
            r12.IconCompatParcelizer()     // Catch:{ all -> 0x0169 }
            goto L_0x0136
        L_0x0121:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0169 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0169 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0169 }
            java.io.File r5 = r12.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x0169 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0169 }
            java.nio.charset.Charset r3 = p040o.instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0169 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0169 }
            r0.<init>(r2)     // Catch:{ all -> 0x0169 }
            r12.MediaBrowserCompat$ItemReceiver = r0     // Catch:{ all -> 0x0169 }
        L_0x0136:
            p040o.instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver(r1)
            return
        L_0x013a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r7.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0169 }
            r7.append(r2)     // Catch:{ all -> 0x0169 }
            r7.append(r0)     // Catch:{ all -> 0x0169 }
            r7.append(r3)     // Catch:{ all -> 0x0169 }
            r7.append(r0)     // Catch:{ all -> 0x0169 }
            r7.append(r5)     // Catch:{ all -> 0x0169 }
            r7.append(r0)     // Catch:{ all -> 0x0169 }
            r7.append(r6)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0169 }
            r4.<init>(r0)     // Catch:{ all -> 0x0169 }
            throw r4     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            p040o.instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isDetached.MediaBrowserCompat$ItemReceiver():void");
    }

    private void write() throws IOException {
        File file = this.MediaMetadataCompat;
        if (!file.exists() || file.delete()) {
            Iterator<isDetached$MediaBrowserCompat$ItemReceiver> it = this.MediaSessionCompat$Token.values().iterator();
            while (it.hasNext()) {
                isDetached$MediaBrowserCompat$ItemReceiver next = it.next();
                int i = 0;
                if (next.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    while (i < this.read) {
                        this.ParcelableVolumeInfo += next.read[i];
                        i++;
                    }
                } else {
                    next.MediaBrowserCompat$CustomActionResultReceiver = null;
                    while (i < this.read) {
                        File file2 = next.write[i];
                        if (!file2.exists() || file2.delete()) {
                            File file3 = next.IconCompatParcelizer[i];
                            if (!file3.exists() || file3.delete()) {
                                i++;
                            } else {
                                throw new IOException();
                            }
                        } else {
                            throw new IOException();
                        }
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IOException();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() throws IOException {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.MediaMetadataCompat), instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver));
            try {
                bufferedWriter.write(DiskLruCache.MAGIC);
                bufferedWriter.write("\n");
                bufferedWriter.write(DiskLruCache.VERSION_1);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.write));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.read));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (isDetached$MediaBrowserCompat$ItemReceiver next : this.MediaSessionCompat$Token.values()) {
                    if (next.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(next.MediaBrowserCompat$ItemReceiver);
                        sb.append(10);
                        bufferedWriter.write(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(next.MediaBrowserCompat$ItemReceiver);
                        sb2.append(next.IconCompatParcelizer());
                        sb2.append(10);
                        bufferedWriter.write(sb2.toString());
                    }
                }
                MediaBrowserCompat$ItemReceiver(bufferedWriter);
                if (this.MediaBrowserCompat$MediaItem.exists()) {
                    File file = this.MediaBrowserCompat$MediaItem;
                    File file2 = this.MediaBrowserCompat$SearchResultReceiver;
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            throw new IOException();
                        }
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.MediaMetadataCompat.renameTo(this.MediaBrowserCompat$MediaItem)) {
                    this.MediaBrowserCompat$SearchResultReceiver.delete();
                    this.MediaBrowserCompat$ItemReceiver = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.MediaBrowserCompat$MediaItem, true), instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver));
                } else {
                    throw new IOException();
                }
            } catch (Throwable th) {
                MediaBrowserCompat$ItemReceiver(bufferedWriter);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean read() {
        int i = this.IconCompatParcelizer;
        return i >= 2000 && i >= this.MediaSessionCompat$Token.size();
    }

    public final void close() throws IOException {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                Iterator it = new ArrayList(this.MediaSessionCompat$Token.values()).iterator();
                while (it.hasNext()) {
                    isDetached$MediaBrowserCompat$ItemReceiver isdetached_mediabrowsercompat_itemreceiver = (isDetached$MediaBrowserCompat$ItemReceiver) it.next();
                    if (isdetached_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        isdetached_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
                    }
                }
                MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        while (this.ParcelableVolumeInfo > this.MediaSessionCompat$ResultReceiverWrapper) {
            IconCompatParcelizer((String) this.MediaSessionCompat$Token.entrySet().iterator().next().getKey());
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: o.isDetached$IconCompatParcelizer */
    public final class IconCompatParcelizer {
        final isDetached$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        final boolean[] MediaBrowserCompat$ItemReceiver;
        public boolean write;

        /* synthetic */ IconCompatParcelizer(isDetached isdetached, isDetached$MediaBrowserCompat$ItemReceiver isdetached_mediabrowsercompat_itemreceiver, byte b) {
            this(isdetached_mediabrowsercompat_itemreceiver);
        }

        private IconCompatParcelizer(isDetached$MediaBrowserCompat$ItemReceiver isdetached_mediabrowsercompat_itemreceiver) {
            boolean[] zArr;
            this.IconCompatParcelizer = isdetached_mediabrowsercompat_itemreceiver;
            if (isdetached_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver) {
                zArr = null;
            } else {
                zArr = new boolean[isDetached.this.read];
            }
            this.MediaBrowserCompat$ItemReceiver = zArr;
        }

        public final File MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
            File file;
            synchronized (isDetached.this) {
                if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == this) {
                    if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver) {
                        this.MediaBrowserCompat$ItemReceiver[0] = true;
                    }
                    file = this.IconCompatParcelizer.IconCompatParcelizer[0];
                    if (!isDetached.this.MediaBrowserCompat$CustomActionResultReceiver.exists()) {
                        isDetached.this.MediaBrowserCompat$CustomActionResultReceiver.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }

        public final void MediaBrowserCompat$ItemReceiver() throws IOException {
            isDetached.this.MediaBrowserCompat$CustomActionResultReceiver(this, false);
        }
    }

    /* renamed from: o.isDetached$write */
    static final class write implements ThreadFactory {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread;
            synchronized (this) {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(p040o.isDetached.IconCompatParcelizer r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            o.isDetached$MediaBrowserCompat$ItemReceiver r0 = r10.IconCompatParcelizer     // Catch:{ all -> 0x010b }
            o.isDetached$IconCompatParcelizer r1 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x010b }
            if (r1 != r10) goto L_0x0105
            r1 = 0
            if (r11 == 0) goto L_0x0049
            boolean r2 = r0.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x010b }
            if (r2 != 0) goto L_0x0049
            r2 = r1
        L_0x000f:
            int r3 = r9.read     // Catch:{ all -> 0x010b }
            if (r2 >= r3) goto L_0x0049
            boolean[] r3 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010b }
            if (r3 == 0) goto L_0x002d
            java.io.File[] r3 = r0.IconCompatParcelizer     // Catch:{ all -> 0x010b }
            r3 = r3[r2]     // Catch:{ all -> 0x010b }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010b }
            if (r3 != 0) goto L_0x002a
            o.isDetached r11 = p040o.isDetached.this     // Catch:{ all -> 0x010b }
            r11.MediaBrowserCompat$CustomActionResultReceiver(r10, r1)     // Catch:{ all -> 0x010b }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            o.isDetached r11 = p040o.isDetached.this     // Catch:{ all -> 0x010b }
            r11.MediaBrowserCompat$CustomActionResultReceiver(r10, r1)     // Catch:{ all -> 0x010b }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010b }
            r11.<init>()     // Catch:{ all -> 0x010b }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010b }
            r11.append(r2)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010b }
            r10.<init>(r11)     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x0049:
            int r10 = r9.read     // Catch:{ all -> 0x010b }
            if (r1 >= r10) goto L_0x0089
            java.io.File[] r10 = r0.IconCompatParcelizer     // Catch:{ all -> 0x010b }
            r10 = r10[r1]     // Catch:{ all -> 0x010b }
            if (r11 == 0) goto L_0x0073
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0086
            java.io.File[] r2 = r0.write     // Catch:{ all -> 0x010b }
            r2 = r2[r1]     // Catch:{ all -> 0x010b }
            r10.renameTo(r2)     // Catch:{ all -> 0x010b }
            long[] r10 = r0.read     // Catch:{ all -> 0x010b }
            r3 = r10[r1]     // Catch:{ all -> 0x010b }
            long r5 = r2.length()     // Catch:{ all -> 0x010b }
            long[] r10 = r0.read     // Catch:{ all -> 0x010b }
            r10[r1] = r5     // Catch:{ all -> 0x010b }
            long r7 = r9.ParcelableVolumeInfo     // Catch:{ all -> 0x010b }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x010b }
            goto L_0x0086
        L_0x0073:
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0086
            boolean r10 = r10.delete()     // Catch:{ all -> 0x010b }
            if (r10 == 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x010b }
            r10.<init>()     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0089:
            int r10 = r9.IconCompatParcelizer     // Catch:{ all -> 0x010b }
            r1 = 1
            int r10 = r10 + r1
            r9.IconCompatParcelizer = r10     // Catch:{ all -> 0x010b }
            r10 = 0
            r0.MediaBrowserCompat$CustomActionResultReceiver = r10     // Catch:{ all -> 0x010b }
            boolean r10 = r0.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x010b }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00ca
            r0.MediaBrowserCompat$SearchResultReceiver = r1     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.append(r3)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            java.lang.String r1 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.append(r1)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            java.lang.String r1 = r0.IconCompatParcelizer()     // Catch:{ all -> 0x010b }
            r10.append(r1)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.append(r2)     // Catch:{ all -> 0x010b }
            if (r11 == 0) goto L_0x00e9
            long r10 = r9.f2603x50fd9e4a     // Catch:{ all -> 0x010b }
            r1 = 1
            long r1 = r1 + r10
            r9.f2603x50fd9e4a = r1     // Catch:{ all -> 0x010b }
            r0.MediaMetadataCompat = r10     // Catch:{ all -> 0x010b }
            goto L_0x00e9
        L_0x00ca:
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r10 = r9.MediaSessionCompat$Token     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.remove(r11)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.append(r3)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.append(r11)     // Catch:{ all -> 0x010b }
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            r10.append(r2)     // Catch:{ all -> 0x010b }
        L_0x00e9:
            java.io.Writer r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010b }
            MediaBrowserCompat$CustomActionResultReceiver(r10)     // Catch:{ all -> 0x010b }
            long r10 = r9.ParcelableVolumeInfo     // Catch:{ all -> 0x010b }
            long r0 = r9.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x010b }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00fc
            boolean r10 = r9.read()     // Catch:{ all -> 0x010b }
            if (r10 == 0) goto L_0x0103
        L_0x00fc:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.MediaDescriptionCompat     // Catch:{ all -> 0x010b }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.RatingCompat     // Catch:{ all -> 0x010b }
            r10.submit(r11)     // Catch:{ all -> 0x010b }
        L_0x0103:
            monitor-exit(r9)
            return
        L_0x0105:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010b }
            r10.<init>()     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x010b:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isDetached.MediaBrowserCompat$CustomActionResultReceiver(o.isDetached$IconCompatParcelizer, boolean):void");
    }

    public final IconCompatParcelizer write(String str) throws IOException {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                isDetached$MediaBrowserCompat$ItemReceiver isdetached_mediabrowsercompat_itemreceiver = this.MediaSessionCompat$Token.get(str);
                if (isdetached_mediabrowsercompat_itemreceiver == null) {
                    isdetached_mediabrowsercompat_itemreceiver = new isDetached$MediaBrowserCompat$ItemReceiver(this, str, (byte) 0);
                    this.MediaSessionCompat$Token.put(str, isdetached_mediabrowsercompat_itemreceiver);
                } else if (isdetached_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    return null;
                }
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, isdetached_mediabrowsercompat_itemreceiver, (byte) 0);
                isdetached_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
                this.MediaBrowserCompat$ItemReceiver.append(DiskLruCache.DIRTY);
                this.MediaBrowserCompat$ItemReceiver.append(' ');
                this.MediaBrowserCompat$ItemReceiver.append(str);
                this.MediaBrowserCompat$ItemReceiver.append(10);
                MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
                return iconCompatParcelizer;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final isDetached$MediaBrowserCompat$CustomActionResultReceiver read(String str) throws IOException {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                isDetached$MediaBrowserCompat$ItemReceiver isdetached_mediabrowsercompat_itemreceiver = this.MediaSessionCompat$Token.get(str);
                if (isdetached_mediabrowsercompat_itemreceiver == null) {
                    return null;
                }
                if (!isdetached_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver) {
                    return null;
                }
                for (File exists : isdetached_mediabrowsercompat_itemreceiver.write) {
                    if (!exists.exists()) {
                        return null;
                    }
                }
                this.IconCompatParcelizer++;
                this.MediaBrowserCompat$ItemReceiver.append(DiskLruCache.READ);
                this.MediaBrowserCompat$ItemReceiver.append(' ');
                this.MediaBrowserCompat$ItemReceiver.append(str);
                this.MediaBrowserCompat$ItemReceiver.append(10);
                if (read()) {
                    this.MediaDescriptionCompat.submit(this.RatingCompat);
                }
                isDetached$MediaBrowserCompat$CustomActionResultReceiver isdetached_mediabrowsercompat_customactionresultreceiver = new isDetached$MediaBrowserCompat$CustomActionResultReceiver(this, str, isdetached_mediabrowsercompat_itemreceiver.MediaMetadataCompat, isdetached_mediabrowsercompat_itemreceiver.write, isdetached_mediabrowsercompat_itemreceiver.read);
                return isdetached_mediabrowsercompat_customactionresultreceiver;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean IconCompatParcelizer(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.Writer r0 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0089
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r0 = r7.MediaSessionCompat$Token     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0091 }
            o.isDetached$MediaBrowserCompat$ItemReceiver r0 = (p040o.isDetached$MediaBrowserCompat$ItemReceiver) r0     // Catch:{ all -> 0x0091 }
            r1 = 0
            if (r0 == 0) goto L_0x0087
            o.isDetached$IconCompatParcelizer r2 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0015
            goto L_0x0087
        L_0x0015:
            int r2 = r7.read     // Catch:{ all -> 0x0091 }
            if (r1 >= r2) goto L_0x0053
            java.io.File[] r2 = r0.write     // Catch:{ all -> 0x0091 }
            r2 = r2[r1]     // Catch:{ all -> 0x0091 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0041
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x002a
            goto L_0x0041
        L_0x002a:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r0.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0091 }
            r0.append(r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0091 }
            r8.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0041:
            long r2 = r7.ParcelableVolumeInfo     // Catch:{ all -> 0x0091 }
            long[] r4 = r0.read     // Catch:{ all -> 0x0091 }
            r5 = r4[r1]     // Catch:{ all -> 0x0091 }
            long r2 = r2 - r5
            r7.ParcelableVolumeInfo = r2     // Catch:{ all -> 0x0091 }
            long[] r2 = r0.read     // Catch:{ all -> 0x0091 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0091 }
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0053:
            int r0 = r7.IconCompatParcelizer     // Catch:{ all -> 0x0091 }
            r1 = 1
            int r0 = r0 + r1
            r7.IconCompatParcelizer = r0     // Catch:{ all -> 0x0091 }
            java.io.Writer r0 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x0091 }
            java.io.Writer r0 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0091 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0091 }
            java.io.Writer r0 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0091 }
            r0.append(r8)     // Catch:{ all -> 0x0091 }
            java.io.Writer r0 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0091 }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashMap<java.lang.String, o.isDetached$MediaBrowserCompat$ItemReceiver> r0 = r7.MediaSessionCompat$Token     // Catch:{ all -> 0x0091 }
            r0.remove(r8)     // Catch:{ all -> 0x0091 }
            boolean r8 = r7.read()     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x0085
            java.util.concurrent.ThreadPoolExecutor r8 = r7.MediaDescriptionCompat     // Catch:{ all -> 0x0091 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.RatingCompat     // Catch:{ all -> 0x0091 }
            r8.submit(r0)     // Catch:{ all -> 0x0091 }
        L_0x0085:
            monitor-exit(r7)
            return r1
        L_0x0087:
            monitor-exit(r7)
            return r1
        L_0x0089:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "cache is closed"
            r8.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isDetached.IconCompatParcelizer(java.lang.String):boolean");
    }
}
