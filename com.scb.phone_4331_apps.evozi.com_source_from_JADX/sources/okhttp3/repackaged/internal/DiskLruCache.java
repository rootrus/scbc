package okhttp3.repackaged.internal;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.repackaged.internal.p090io.FileSystem;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.ModifyQuickPromptPayActivity;
import p040o.QuickPromptPayActivity;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    static final String VERSION_1 = "1";
    private static final String aiO = "CLEAN";
    private static final String aiP = "REMOVE";
    /* access modifiers changed from: private */
    public static final QuickPromptPayActivity aiY = new QuickPromptPayActivity() {
        public final void close() throws IOException {
        }

        public final void flush() throws IOException {
        }

        public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            onmenupromptpayclick.MediaMetadataCompat(j);
        }

        public final ModifyQuickPromptPayActivity timeout() {
            return ModifyQuickPromptPayActivity.NONE;
        }
    };
    private final Executor ahj;
    private final Runnable ahm = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|(1:15)) */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                okhttp3.repackaged.internal.DiskLruCache r0 = okhttp3.repackaged.internal.DiskLruCache.this
                monitor-enter(r0)
                okhttp3.repackaged.internal.DiskLruCache r1 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ all -> 0x003d }
                boolean r1 = r1.initialized     // Catch:{ all -> 0x003d }
                r2 = 1
                r1 = r1 ^ r2
                okhttp3.repackaged.internal.DiskLruCache r3 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ all -> 0x003d }
                boolean r3 = r3.closed     // Catch:{ all -> 0x003d }
                r1 = r1 | r3
                if (r1 == 0) goto L_0x0016
                monitor-exit(r0)
                return
            L_0x0016:
                okhttp3.repackaged.internal.DiskLruCache r1 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ IOException -> 0x001c }
                r1.trimToSize()     // Catch:{ IOException -> 0x001c }
                goto L_0x0021
            L_0x001c:
                okhttp3.repackaged.internal.DiskLruCache r1 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ all -> 0x003d }
                boolean unused = r1.mostRecentTrimFailed = r2     // Catch:{ all -> 0x003d }
            L_0x0021:
                okhttp3.repackaged.internal.DiskLruCache r1 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ IOException -> 0x0036 }
                boolean r1 = r1.journalRebuildRequired()     // Catch:{ IOException -> 0x0036 }
                if (r1 == 0) goto L_0x0034
                okhttp3.repackaged.internal.DiskLruCache r1 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ IOException -> 0x0036 }
                r1.rebuildJournal()     // Catch:{ IOException -> 0x0036 }
                okhttp3.repackaged.internal.DiskLruCache r1 = okhttp3.repackaged.internal.DiskLruCache.this     // Catch:{ IOException -> 0x0036 }
                r2 = 0
                int unused = r1.redundantOpCount = r2     // Catch:{ IOException -> 0x0036 }
            L_0x0034:
                monitor-exit(r0)
                return
            L_0x0036:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x003d }
                r2.<init>(r1)     // Catch:{ all -> 0x003d }
                throw r2     // Catch:{ all -> 0x003d }
            L_0x003d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.DiskLruCache.C102211.run():void");
        }
    };
    /* access modifiers changed from: private */
    public final FileSystem aiQ;
    private final File aiR;
    private final File aiS;
    private final File aiT;
    private final int aiU;
    private long aiV;
    private onLoginButtonClick aiW;
    private long aiX = 0;
    /* access modifiers changed from: private */
    public boolean closed;
    /* access modifiers changed from: private */
    public final File directory;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    /* access modifiers changed from: private */
    public final LinkedHashMap<String, C10226a> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size = 0;
    /* access modifiers changed from: private */
    public final int valueCount;

    DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.aiQ = fileSystem;
        this.directory = file;
        this.aiU = i;
        this.aiR = new File(file, "journal");
        this.aiS = new File(file, "journal.tmp");
        this.aiT = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.aiV = j;
        this.ahj = executor;
    }

    public final void initialize() throws IOException {
        synchronized (this) {
            if (!this.initialized) {
                if (this.aiQ.exists(this.aiT)) {
                    if (this.aiQ.exists(this.aiR)) {
                        this.aiQ.delete(this.aiT);
                    } else {
                        this.aiQ.rename(this.aiT, this.aiR);
                    }
                }
                if (this.aiQ.exists(this.aiR)) {
                    try {
                        m5935ut();
                        m5937uv();
                        this.initialized = true;
                        return;
                    } catch (IOException e) {
                        Platform platform = Platform.get();
                        StringBuilder sb = new StringBuilder();
                        sb.append("DiskLruCache ");
                        sb.append(this.directory);
                        sb.append(" is corrupt: ");
                        sb.append(e.getMessage());
                        sb.append(", removing");
                        platform.logW(sb.toString());
                        delete();
                        this.closed = false;
                    }
                }
                rebuildJournal();
                this.initialized = true;
            }
        }
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.redundantOpCount = r0 - r9.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.read() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        rebuildJournal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.aiW = m5936uu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: ut */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5935ut() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.repackaged.internal.io.FileSystem r1 = r9.aiQ
            java.io.File r2 = r9.aiR
            o.HowToAddAccountActivity r1 = r1.source(r2)
            o.PinLoginActivity r1 = p040o.ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((p040o.HowToAddAccountActivity) r1)
            java.lang.String r2 = r1.PlaybackStateCompat$CustomAction()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.PlaybackStateCompat$CustomAction()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r1.PlaybackStateCompat$CustomAction()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r1.PlaybackStateCompat$CustomAction()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r1.PlaybackStateCompat$CustomAction()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.aiU     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.valueCount     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.PlaybackStateCompat$CustomAction()     // Catch:{ EOFException -> 0x005d }
            r9.m5924aY(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, okhttp3.repackaged.internal.DiskLruCache$a> r2 = r9.lruEntries     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.redundantOpCount = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.read()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.rebuildJournal()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            o.onLoginButtonClick r0 = r9.m5936uu()     // Catch:{ all -> 0x00a8 }
            r9.aiW = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            okhttp3.repackaged.internal.Util.closeQuietly((java.io.Closeable) r1)
            return
        L_0x007a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r7.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a8 }
            r7.append(r2)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r3)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r5)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a8 }
            throw r4     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            okhttp3.repackaged.internal.Util.closeQuietly((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.DiskLruCache.m5935ut():void");
    }

    /* renamed from: uu */
    private onLoginButtonClick m5936uu() throws FileNotFoundException {
        return ModifyQuickBalanceActivity.read((QuickPromptPayActivity) new C10232a(this.aiQ.appendingSink(this.aiR)) {
            static final /* synthetic */ boolean $assertionsDisabled = false;

            /* access modifiers changed from: protected */
            public void onException(IOException iOException) {
                boolean unused = DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    /* renamed from: aY */
    private void m5924aY(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C10226a aVar = this.lruEntries.get(str2);
            if (aVar == null) {
                aVar = new C10226a(str2);
                this.lruEntries.put(str2, aVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = aVar.readable = true;
                Editor unused2 = aVar.ajg = null;
                aVar.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                Editor unused3 = aVar.ajg = new Editor(aVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal line: ");
                sb.append(str);
                throw new IOException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unexpected journal line: ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: uv */
    private void m5937uv() throws IOException {
        this.aiQ.delete(this.aiS);
        Iterator<C10226a> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            C10226a next = it.next();
            int i = 0;
            if (next.ajg == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                Editor unused = next.ajg = null;
                while (i < this.valueCount) {
                    this.aiQ.delete(next.cleanFiles[i]);
                    this.aiQ.delete(next.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public void rebuildJournal() throws IOException {
        synchronized (this) {
            if (this.aiW != null) {
                this.aiW.close();
            }
            onLoginButtonClick read = ModifyQuickBalanceActivity.read(this.aiQ.sink(this.aiS));
            try {
                read.IconCompatParcelizer("libcore.io.DiskLruCache").MediaBrowserCompat$ItemReceiver(10);
                read.IconCompatParcelizer("1").MediaBrowserCompat$ItemReceiver(10);
                read.RatingCompat((long) this.aiU).MediaBrowserCompat$ItemReceiver(10);
                read.RatingCompat((long) this.valueCount).MediaBrowserCompat$ItemReceiver(10);
                read.MediaBrowserCompat$ItemReceiver(10);
                for (C10226a next : this.lruEntries.values()) {
                    if (next.ajg != null) {
                        read.IconCompatParcelizer("DIRTY").MediaBrowserCompat$ItemReceiver(32);
                        read.IconCompatParcelizer(next.key);
                        read.MediaBrowserCompat$ItemReceiver(10);
                    } else {
                        read.IconCompatParcelizer("CLEAN").MediaBrowserCompat$ItemReceiver(32);
                        read.IconCompatParcelizer(next.key);
                        next.mo58654a(read);
                        read.MediaBrowserCompat$ItemReceiver(10);
                    }
                }
                read.close();
                if (this.aiQ.exists(this.aiR)) {
                    this.aiQ.rename(this.aiR, this.aiT);
                }
                this.aiQ.rename(this.aiS, this.aiR);
                this.aiQ.delete(this.aiT);
                this.aiW = m5936uu();
                this.hasJournalErrors = false;
            } catch (Throwable th) {
                read.close();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.repackaged.internal.DiskLruCache.Snapshot get(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.initialize()     // Catch:{ all -> 0x0052 }
            r3.m5938uw()     // Catch:{ all -> 0x0052 }
            r3.m5925aZ(r4)     // Catch:{ all -> 0x0052 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.repackaged.internal.DiskLruCache$a> r0 = r3.lruEntries     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0052 }
            okhttp3.repackaged.internal.DiskLruCache$a r0 = (okhttp3.repackaged.internal.DiskLruCache.C10226a) r0     // Catch:{ all -> 0x0052 }
            r1 = 0
            if (r0 == 0) goto L_0x0050
            boolean r2 = r0.readable     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x001c
            goto L_0x0050
        L_0x001c:
            okhttp3.repackaged.internal.DiskLruCache$Snapshot r0 = r0.mo58655uz()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r3)
            return r1
        L_0x0024:
            int r1 = r3.redundantOpCount     // Catch:{ all -> 0x0052 }
            int r1 = r1 + 1
            r3.redundantOpCount = r1     // Catch:{ all -> 0x0052 }
            o.onLoginButtonClick r1 = r3.aiW     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "READ"
            o.onLoginButtonClick r1 = r1.IconCompatParcelizer((java.lang.String) r2)     // Catch:{ all -> 0x0052 }
            r2 = 32
            o.onLoginButtonClick r1 = r1.MediaBrowserCompat$ItemReceiver((int) r2)     // Catch:{ all -> 0x0052 }
            o.onLoginButtonClick r4 = r1.IconCompatParcelizer((java.lang.String) r4)     // Catch:{ all -> 0x0052 }
            r1 = 10
            r4.MediaBrowserCompat$ItemReceiver((int) r1)     // Catch:{ all -> 0x0052 }
            boolean r4 = r3.journalRebuildRequired()     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004e
            java.util.concurrent.Executor r4 = r3.ahj     // Catch:{ all -> 0x0052 }
            java.lang.Runnable r1 = r3.ahm     // Catch:{ all -> 0x0052 }
            r4.execute(r1)     // Catch:{ all -> 0x0052 }
        L_0x004e:
            monitor-exit(r3)
            return r0
        L_0x0050:
            monitor-exit(r3)
            return r1
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.DiskLruCache.get(java.lang.String):okhttp3.repackaged.internal.DiskLruCache$Snapshot");
    }

    public final Editor edit(String str) throws IOException {
        return m5916a(str, -1);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.repackaged.internal.DiskLruCache.Editor m5916a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x0074 }
            r5.m5938uw()     // Catch:{ all -> 0x0074 }
            r5.m5925aZ(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.repackaged.internal.DiskLruCache$a> r0 = r5.lruEntries     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            okhttp3.repackaged.internal.DiskLruCache$a r0 = (okhttp3.repackaged.internal.DiskLruCache.C10226a) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0025
            if (r0 == 0) goto L_0x0023
            long r3 = r0.sequenceNumber     // Catch:{ all -> 0x0074 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0025
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            if (r0 == 0) goto L_0x002f
            okhttp3.repackaged.internal.DiskLruCache$Editor r7 = r0.ajg     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002f
            monitor-exit(r5)
            return r2
        L_0x002f:
            boolean r7 = r5.mostRecentTrimFailed     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x003c
            java.util.concurrent.Executor r6 = r5.ahj     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.ahm     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r2
        L_0x003c:
            o.onLoginButtonClick r7 = r5.aiW     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            o.onLoginButtonClick r7 = r7.IconCompatParcelizer((java.lang.String) r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            o.onLoginButtonClick r7 = r7.MediaBrowserCompat$ItemReceiver((int) r8)     // Catch:{ all -> 0x0074 }
            o.onLoginButtonClick r7 = r7.IconCompatParcelizer((java.lang.String) r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.MediaBrowserCompat$ItemReceiver((int) r8)     // Catch:{ all -> 0x0074 }
            o.onLoginButtonClick r7 = r5.aiW     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.hasJournalErrors     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x005e
            monitor-exit(r5)
            return r2
        L_0x005e:
            if (r0 != 0) goto L_0x006a
            okhttp3.repackaged.internal.DiskLruCache$a r0 = new okhttp3.repackaged.internal.DiskLruCache$a     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.repackaged.internal.DiskLruCache$a> r7 = r5.lruEntries     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x006a:
            okhttp3.repackaged.internal.DiskLruCache$Editor r6 = new okhttp3.repackaged.internal.DiskLruCache$Editor     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            okhttp3.repackaged.internal.DiskLruCache.Editor unused = r0.ajg = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.DiskLruCache.m5916a(java.lang.String, long):okhttp3.repackaged.internal.DiskLruCache$Editor");
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.aiV;
        }
        return j;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.aiV = j;
            if (this.initialized) {
                this.ahj.execute(this.ahm);
            }
        }
    }

    public final long size() throws IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0111, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5918a(okhttp3.repackaged.internal.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            okhttp3.repackaged.internal.DiskLruCache$a r0 = r10.ajc     // Catch:{ all -> 0x0118 }
            okhttp3.repackaged.internal.DiskLruCache$Editor r1 = r0.ajg     // Catch:{ all -> 0x0118 }
            if (r1 != r10) goto L_0x0112
            r1 = 0
            if (r11 == 0) goto L_0x0051
            boolean r2 = r0.readable     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0051
            r2 = r1
        L_0x0015:
            int r3 = r9.valueCount     // Catch:{ all -> 0x0118 }
            if (r2 >= r3) goto L_0x0051
            boolean[] r3 = r10.written     // Catch:{ all -> 0x0118 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x0037
            okhttp3.repackaged.internal.io.FileSystem r3 = r9.aiQ     // Catch:{ all -> 0x0118 }
            java.io.File[] r4 = r0.dirtyFiles     // Catch:{ all -> 0x0118 }
            r4 = r4[r2]     // Catch:{ all -> 0x0118 }
            boolean r3 = r3.exists(r4)     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x0034
            r10.abort()     // Catch:{ all -> 0x0118 }
            monitor-exit(r9)
            return
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0037:
            r10.abort()     // Catch:{ all -> 0x0118 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r11.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0118 }
            r11.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0118 }
            r10.<init>(r11)     // Catch:{ all -> 0x0118 }
            throw r10     // Catch:{ all -> 0x0118 }
        L_0x0051:
            int r10 = r9.valueCount     // Catch:{ all -> 0x0118 }
            if (r1 >= r10) goto L_0x0091
            java.io.File[] r10 = r0.dirtyFiles     // Catch:{ all -> 0x0118 }
            r10 = r10[r1]     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x0089
            okhttp3.repackaged.internal.io.FileSystem r2 = r9.aiQ     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.exists(r10)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x008e
            java.io.File[] r2 = r0.cleanFiles     // Catch:{ all -> 0x0118 }
            r2 = r2[r1]     // Catch:{ all -> 0x0118 }
            okhttp3.repackaged.internal.io.FileSystem r3 = r9.aiQ     // Catch:{ all -> 0x0118 }
            r3.rename(r10, r2)     // Catch:{ all -> 0x0118 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x0118 }
            r3 = r10[r1]     // Catch:{ all -> 0x0118 }
            okhttp3.repackaged.internal.io.FileSystem r10 = r9.aiQ     // Catch:{ all -> 0x0118 }
            long r5 = r10.size(r2)     // Catch:{ all -> 0x0118 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x0118 }
            r10[r1] = r5     // Catch:{ all -> 0x0118 }
            long r7 = r9.size     // Catch:{ all -> 0x0118 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.size = r7     // Catch:{ all -> 0x0118 }
            goto L_0x008e
        L_0x0089:
            okhttp3.repackaged.internal.io.FileSystem r2 = r9.aiQ     // Catch:{ all -> 0x0118 }
            r2.delete(r10)     // Catch:{ all -> 0x0118 }
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0091:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x0118 }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x0118 }
            r10 = 0
            okhttp3.repackaged.internal.DiskLruCache.Editor unused = r0.ajg = r10     // Catch:{ all -> 0x0118 }
            boolean r10 = r0.readable     // Catch:{ all -> 0x0118 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00d4
            boolean unused = r0.readable = r1     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "CLEAN"
            o.onLoginButtonClick r10 = r10.IconCompatParcelizer((java.lang.String) r1)     // Catch:{ all -> 0x0118 }
            r10.MediaBrowserCompat$ItemReceiver((int) r3)     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r0.key     // Catch:{ all -> 0x0118 }
            r10.IconCompatParcelizer((java.lang.String) r1)     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            r0.mo58654a(r10)     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            r10.MediaBrowserCompat$ItemReceiver((int) r2)     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x00f6
            long r10 = r9.aiX     // Catch:{ all -> 0x0118 }
            r1 = 1
            long r1 = r1 + r10
            r9.aiX = r1     // Catch:{ all -> 0x0118 }
            long unused = r0.sequenceNumber = r10     // Catch:{ all -> 0x0118 }
            goto L_0x00f6
        L_0x00d4:
            java.util.LinkedHashMap<java.lang.String, okhttp3.repackaged.internal.DiskLruCache$a> r10 = r9.lruEntries     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x0118 }
            r10.remove(r11)     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = "REMOVE"
            o.onLoginButtonClick r10 = r10.IconCompatParcelizer((java.lang.String) r11)     // Catch:{ all -> 0x0118 }
            r10.MediaBrowserCompat$ItemReceiver((int) r3)     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x0118 }
            r10.IconCompatParcelizer((java.lang.String) r11)     // Catch:{ all -> 0x0118 }
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            r10.MediaBrowserCompat$ItemReceiver((int) r2)     // Catch:{ all -> 0x0118 }
        L_0x00f6:
            o.onLoginButtonClick r10 = r9.aiW     // Catch:{ all -> 0x0118 }
            r10.flush()     // Catch:{ all -> 0x0118 }
            long r10 = r9.size     // Catch:{ all -> 0x0118 }
            long r0 = r9.aiV     // Catch:{ all -> 0x0118 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0109
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x0110
        L_0x0109:
            java.util.concurrent.Executor r10 = r9.ahj     // Catch:{ all -> 0x0118 }
            java.lang.Runnable r11 = r9.ahm     // Catch:{ all -> 0x0118 }
            r10.execute(r11)     // Catch:{ all -> 0x0118 }
        L_0x0110:
            monitor-exit(r9)
            return
        L_0x0112:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0118 }
            r10.<init>()     // Catch:{ all -> 0x0118 }
            throw r10     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.DiskLruCache.m5918a(okhttp3.repackaged.internal.DiskLruCache$Editor, boolean):void");
    }

    /* access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x0029 }
            r5.m5938uw()     // Catch:{ all -> 0x0029 }
            r5.m5925aZ(r6)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.repackaged.internal.DiskLruCache$a> r0 = r5.lruEntries     // Catch:{ all -> 0x0029 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0029 }
            okhttp3.repackaged.internal.DiskLruCache$a r6 = (okhttp3.repackaged.internal.DiskLruCache.C10226a) r6     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r6 != 0) goto L_0x0017
            monitor-exit(r5)
            return r0
        L_0x0017:
            boolean r6 = r5.m5920a((okhttp3.repackaged.internal.DiskLruCache.C10226a) r6)     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x0027
            long r1 = r5.size     // Catch:{ all -> 0x0029 }
            long r3 = r5.aiV     // Catch:{ all -> 0x0029 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0027
            r5.mostRecentTrimFailed = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r5)
            return r6
        L_0x0029:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.DiskLruCache.remove(java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5920a(C10226a aVar) throws IOException {
        if (aVar.ajg != null) {
            boolean unused = aVar.ajg.ajd = true;
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.aiQ.delete(aVar.cleanFiles[i]);
            this.size -= aVar.lengths[i];
            aVar.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.aiW.IconCompatParcelizer("REMOVE").MediaBrowserCompat$ItemReceiver(32).IconCompatParcelizer(aVar.key).MediaBrowserCompat$ItemReceiver(10);
        this.lruEntries.remove(aVar.key);
        if (journalRebuildRequired()) {
            this.ahj.execute(this.ahm);
        }
        return true;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    /* renamed from: uw */
    private void m5938uw() {
        synchronized (this) {
            if (isClosed()) {
                throw new IllegalStateException("cache is closed");
            }
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                m5938uw();
                trimToSize();
                this.aiW.flush();
            }
        }
    }

    public final void close() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                if (!this.closed) {
                    for (C10226a aVar : (C10226a[]) this.lruEntries.values().toArray(new C10226a[this.lruEntries.size()])) {
                        if (aVar.ajg != null) {
                            aVar.ajg.abort();
                        }
                    }
                    trimToSize();
                    this.aiW.close();
                    this.aiW = null;
                    this.closed = true;
                    return;
                }
            }
            this.closed = true;
        }
    }

    /* access modifiers changed from: private */
    public void trimToSize() throws IOException {
        while (this.size > this.aiV) {
            m5920a(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public final void delete() throws IOException {
        close();
        this.aiQ.deleteContents(this.directory);
    }

    public final void evictAll() throws IOException {
        synchronized (this) {
            initialize();
            for (C10226a a : (C10226a[]) this.lruEntries.values().toArray(new C10226a[this.lruEntries.size()])) {
                m5920a(a);
            }
            this.mostRecentTrimFailed = false;
        }
    }

    /* renamed from: aZ */
    private void m5925aZ(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final Iterator<Snapshot> snapshots() throws IOException {
        C102233 r0;
        synchronized (this) {
            initialize();
            r0 = new Iterator<Snapshot>() {
                Snapshot aja;
                Snapshot ajb;
                final Iterator<C10226a> delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();

                public boolean hasNext() {
                    if (this.aja != null) {
                        return true;
                    }
                    synchronized (DiskLruCache.this) {
                        if (DiskLruCache.this.closed) {
                            return false;
                        }
                        while (this.delegate.hasNext()) {
                            Snapshot uz = this.delegate.next().mo58655uz();
                            if (uz != null) {
                                this.aja = uz;
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: uy */
                public Snapshot next() {
                    if (hasNext()) {
                        Snapshot snapshot = this.aja;
                        this.ajb = snapshot;
                        this.aja = null;
                        return snapshot;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    Snapshot snapshot = this.ajb;
                    if (snapshot != null) {
                        try {
                            DiskLruCache.this.remove(snapshot.key);
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            this.ajb = null;
                            throw th;
                        }
                        this.ajb = null;
                        return;
                    }
                    throw new IllegalStateException("remove() before next()");
                }
            };
        }
        return r0;
    }

    public final class Snapshot implements Closeable {
        private final HowToAddAccountActivity[] ajh;
        /* access modifiers changed from: private */
        public final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        private Snapshot(String str, long j, HowToAddAccountActivity[] howToAddAccountActivityArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.ajh = howToAddAccountActivityArr;
            this.lengths = jArr;
        }

        public final String key() {
            return this.key;
        }

        public final Editor edit() throws IOException {
            return DiskLruCache.this.m5916a(this.key, this.sequenceNumber);
        }

        public final HowToAddAccountActivity getSource(int i) {
            return this.ajh[i];
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final void close() {
            for (HowToAddAccountActivity closeQuietly : this.ajh) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }
    }

    public final class Editor {
        /* access modifiers changed from: private */
        public final C10226a ajc;
        /* access modifiers changed from: private */
        public boolean ajd;
        private boolean aje;
        /* access modifiers changed from: private */
        public final boolean[] written;

        private Editor(C10226a aVar) {
            this.ajc = aVar;
            this.written = aVar.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        public final HowToAddAccountActivity newSource(int i) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.ajc.ajg != this) {
                    throw new IllegalStateException();
                } else if (!this.ajc.readable) {
                    return null;
                } else {
                    try {
                        HowToAddAccountActivity source = DiskLruCache.this.aiQ.source(this.ajc.cleanFiles[i]);
                        return source;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        public final QuickPromptPayActivity newSink(int i) throws IOException {
            C102251 r1;
            synchronized (DiskLruCache.this) {
                if (this.ajc.ajg == this) {
                    if (!this.ajc.readable) {
                        this.written[i] = true;
                    }
                    try {
                        r1 = new C10232a(DiskLruCache.this.aiQ.sink(this.ajc.dirtyFiles[i])) {
                            /* access modifiers changed from: protected */
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    boolean unused = Editor.this.ajd = true;
                                }
                            }
                        };
                    } catch (FileNotFoundException unused) {
                        return DiskLruCache.aiY;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return r1;
        }

        public final void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.ajd) {
                    DiskLruCache.this.m5918a(this, false);
                    boolean unused = DiskLruCache.this.m5920a(this.ajc);
                } else {
                    DiskLruCache.this.m5918a(this, true);
                }
                this.aje = true;
            }
        }

        public final void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                DiskLruCache.this.m5918a(this, false);
            }
        }

        public final void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.aje) {
                    try {
                        DiskLruCache.this.m5918a(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.DiskLruCache$a */
    final class C10226a {
        /* access modifiers changed from: private */
        public Editor ajg;
        /* access modifiers changed from: private */
        public final File[] cleanFiles;
        /* access modifiers changed from: private */
        public final File[] dirtyFiles;
        /* access modifiers changed from: private */
        public final String key;
        /* access modifiers changed from: private */
        public final long[] lengths;
        /* access modifiers changed from: private */
        public boolean readable;
        /* access modifiers changed from: private */
        public long sequenceNumber;

        private C10226a(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m5951d(strArr);
                    }
                }
                return;
            }
            throw m5951d(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo58654a(onLoginButtonClick onloginbuttonclick) throws IOException {
            for (long RatingCompat : this.lengths) {
                onloginbuttonclick.MediaBrowserCompat$ItemReceiver(32).RatingCompat(RatingCompat);
            }
        }

        /* renamed from: d */
        private IOException m5951d(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: uz */
        public final Snapshot mo58655uz() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                HowToAddAccountActivity[] howToAddAccountActivityArr = new HowToAddAccountActivity[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < DiskLruCache.this.valueCount) {
                    try {
                        howToAddAccountActivityArr[i2] = DiskLruCache.this.aiQ.source(this.cleanFiles[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < DiskLruCache.this.valueCount && howToAddAccountActivityArr[i] != null) {
                            Util.closeQuietly((Closeable) howToAddAccountActivityArr[i]);
                            i++;
                        }
                        return null;
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, howToAddAccountActivityArr, jArr);
            }
            throw new AssertionError();
        }
    }
}
