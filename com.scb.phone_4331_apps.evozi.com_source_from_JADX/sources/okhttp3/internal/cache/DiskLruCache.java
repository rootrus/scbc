package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import okhttp3.internal.Util;
import okhttp3.internal.p060io.FileSystem;
import okhttp3.internal.platform.Platform;
import p040o.GoodToKnowActivity;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.LifestyleCustomizationActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String CLEAN = CLEAN;
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final String DIRTY = DIRTY;
    public static final String JOURNAL_FILE = JOURNAL_FILE;
    public static final String JOURNAL_FILE_BACKUP = JOURNAL_FILE_BACKUP;
    public static final String JOURNAL_FILE_TEMP = JOURNAL_FILE_TEMP;
    public static final LifestyleCustomizationActivity LEGAL_KEY_PATTERN = new LifestyleCustomizationActivity("[a-z0-9_-]{1,120}");
    public static final String MAGIC = MAGIC;
    public static final String READ = READ;
    public static final String REMOVE = REMOVE;
    public static final String VERSION_1 = VERSION_1;
    private final int appVersion;
    private final Runnable cleanupRunnable = new DiskLruCache$cleanupRunnable$1(this);
    private boolean closed;
    private final File directory;
    private final Executor executor;
    private final FileSystem fileSystem;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    private final File journalFile = new File(this.directory, JOURNAL_FILE);
    private final File journalFileBackup = new File(this.directory, JOURNAL_FILE_BACKUP);
    private final File journalFileTmp = new File(this.directory, JOURNAL_FILE_TEMP);
    /* access modifiers changed from: private */
    public NsipPartnerPaymentReviewActivity journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    /* access modifiers changed from: private */
    public boolean mostRecentRebuildFailed;
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size;
    private final int valueCount;

    public final Editor edit(String str) throws IOException {
        return edit$default(this, str, 0, 2, (Object) null);
    }

    public DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, Executor executor2) {
        onGetStartedClick.write((Object) fileSystem2, "fileSystem");
        onGetStartedClick.write((Object) file, "directory");
        onGetStartedClick.write((Object) executor2, "executor");
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.executor = executor2;
        this.maxSize = j;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.maxSize = j;
            if (this.initialized) {
                this.executor.execute(this.cleanupRunnable);
            }
        }
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final void initialize() throws IOException {
        synchronized (this) {
            boolean holdsLock = Thread.holdsLock(this);
            if (HmlBusinessOwnerDocumentSubmissionActivity.write) {
                if (!holdsLock) {
                    throw new AssertionError("Assertion failed");
                }
            }
            if (!this.initialized) {
                if (this.fileSystem.exists(this.journalFileBackup)) {
                    if (this.fileSystem.exists(this.journalFile)) {
                        this.fileSystem.delete(this.journalFileBackup);
                    } else {
                        this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    try {
                        readJournal();
                        processJournal();
                        this.initialized = true;
                        return;
                    } catch (IOException e) {
                        Platform platform = Platform.Companion.get();
                        StringBuilder sb = new StringBuilder();
                        sb.append("DiskLruCache ");
                        sb.append(this.directory);
                        sb.append(" is corrupt: ");
                        sb.append(e.getMessage());
                        sb.append(", removing");
                        platform.log(5, sb.toString(), e);
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
                rebuildJournal$okhttp();
                this.initialized = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r10.redundantOpCount = r8 - r10.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r2.MediaBrowserCompat$CustomActionResultReceiver() == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r10.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x006b=Splitter:B:18:0x006b, B:26:0x008b=Splitter:B:26:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r10.fileSystem
            java.io.File r2 = r10.journalFile
            o.HowToAddAccountStep2Activity r1 = r1.source(r2)
            o.NsipPartnerPaymentOtpActivity r1 = p040o.onSubmit.read((p040o.HowToAddAccountStep2Activity) r1)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            o.NsipPartnerPaymentOtpActivity r2 = (p040o.NsipPartnerPaymentOtpActivity) r2     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = r2.Keep()     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r2.Keep()     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r2.Keep()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r2.Keep()     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = r2.Keep()     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = MAGIC     // Catch:{ all -> 0x00bb }
            boolean r8 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r8, (java.lang.Object) r3)     // Catch:{ all -> 0x00bb }
            r9 = 1
            r8 = r8 ^ r9
            if (r8 != 0) goto L_0x008b
            java.lang.String r8 = VERSION_1     // Catch:{ all -> 0x00bb }
            boolean r8 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r8, (java.lang.Object) r4)     // Catch:{ all -> 0x00bb }
            r8 = r8 ^ r9
            if (r8 != 0) goto L_0x008b
            int r8 = r10.appVersion     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00bb }
            boolean r5 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r8, (java.lang.Object) r5)     // Catch:{ all -> 0x00bb }
            r5 = r5 ^ r9
            if (r5 != 0) goto L_0x008b
            int r5 = r10.valueCount     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00bb }
            boolean r5 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x00bb }
            r5 = r5 ^ r9
            if (r5 != 0) goto L_0x008b
            r5 = r7
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x00bb }
            int r5 = r5.length()     // Catch:{ all -> 0x00bb }
            r8 = 0
            if (r5 > 0) goto L_0x005f
            r9 = r8
        L_0x005f:
            if (r9 != 0) goto L_0x008b
        L_0x0061:
            java.lang.String r0 = r2.Keep()     // Catch:{ EOFException -> 0x006b }
            r10.readJournalLine(r0)     // Catch:{ EOFException -> 0x006b }
            int r8 = r8 + 1
            goto L_0x0061
        L_0x006b:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries     // Catch:{ all -> 0x00bb }
            int r0 = r0.size()     // Catch:{ all -> 0x00bb }
            int r8 = r8 - r0
            r10.redundantOpCount = r8     // Catch:{ all -> 0x00bb }
            boolean r0 = r2.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x007e
            r10.rebuildJournal$okhttp()     // Catch:{ all -> 0x00bb }
            goto L_0x0084
        L_0x007e:
            o.NsipPartnerPaymentReviewActivity r0 = r10.newJournalWriter()     // Catch:{ all -> 0x00bb }
            r10.journalWriter = r0     // Catch:{ all -> 0x00bb }
        L_0x0084:
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00bb }
            r0 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r1, (java.lang.Throwable) r0)
            return
        L_0x008b:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r5.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = "unexpected journal header: ["
            r5.append(r8)     // Catch:{ all -> 0x00bb }
            r5.append(r3)     // Catch:{ all -> 0x00bb }
            r5.append(r0)     // Catch:{ all -> 0x00bb }
            r5.append(r4)     // Catch:{ all -> 0x00bb }
            r5.append(r0)     // Catch:{ all -> 0x00bb }
            r5.append(r6)     // Catch:{ all -> 0x00bb }
            r5.append(r0)     // Catch:{ all -> 0x00bb }
            r5.append(r7)     // Catch:{ all -> 0x00bb }
            r0 = 93
            r5.append(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00bb }
            r2.<init>(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x00bb }
            throw r2     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r2 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r1, (java.lang.Throwable) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final NsipPartnerPaymentReviewActivity newJournalWriter() throws FileNotFoundException {
        return onSubmit.read((PinChangeActivity) new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void readJournalLine(String str) throws IOException {
        String str2;
        CharSequence charSequence = str;
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, ' ', 0, false);
        if (MediaBrowserCompat$CustomActionResultReceiver != -1) {
            int i = MediaBrowserCompat$CustomActionResultReceiver + 1;
            int MediaBrowserCompat$CustomActionResultReceiver2 = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, ' ', i, false);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == -1) {
                if (str != null) {
                    str2 = str.substring(i);
                    onGetStartedClick.IconCompatParcelizer((Object) str2, "(this as java.lang.String).substring(startIndex)");
                    if (MediaBrowserCompat$CustomActionResultReceiver == REMOVE.length() && GoodToKnowActivity.read(str, REMOVE, false)) {
                        this.lruEntries.remove(str2);
                        return;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str != null) {
                str2 = str.substring(i, MediaBrowserCompat$CustomActionResultReceiver2);
                onGetStartedClick.IconCompatParcelizer((Object) str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.lruEntries.put(str2, entry);
            }
            if (MediaBrowserCompat$CustomActionResultReceiver2 == -1 || MediaBrowserCompat$CustomActionResultReceiver != CLEAN.length() || !GoodToKnowActivity.read(str, CLEAN, false)) {
                if (MediaBrowserCompat$CustomActionResultReceiver2 == -1 && MediaBrowserCompat$CustomActionResultReceiver == DIRTY.length() && GoodToKnowActivity.read(str, DIRTY, false)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                } else if (MediaBrowserCompat$CustomActionResultReceiver2 != -1 || MediaBrowserCompat$CustomActionResultReceiver != READ.length() || !GoodToKnowActivity.read(str, READ, false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected journal line: ");
                    sb.append(str);
                    throw new IOException(sb.toString());
                }
            } else if (str != null) {
                String substring = str.substring(MediaBrowserCompat$CustomActionResultReceiver2 + 1);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                List<String> read = GoodToKnowActivity.read((CharSequence) substring, new char[]{' '}, false, 0);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp((Editor) null);
                entry.setLengths$okhttp(read);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unexpected journal line: ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            onGetStartedClick.IconCompatParcelizer((Object) next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void rebuildJournal$okhttp() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            o.NsipPartnerPaymentReviewActivity r0 = r7.journalWriter     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00ca }
        L_0x0008:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00ca }
            o.PinChangeActivity r0 = r0.sink(r1)     // Catch:{ all -> 0x00ca }
            o.NsipPartnerPaymentReviewActivity r0 = p040o.onSubmit.read((p040o.PinChangeActivity) r0)     // Catch:{ all -> 0x00ca }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x00ca }
            r1 = r0
            o.NsipPartnerPaymentReviewActivity r1 = (p040o.NsipPartnerPaymentReviewActivity) r1     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = MAGIC     // Catch:{ all -> 0x00c3 }
            o.NsipPartnerPaymentReviewActivity r2 = r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r2)     // Catch:{ all -> 0x00c3 }
            r3 = 10
            r2.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = VERSION_1     // Catch:{ all -> 0x00c3 }
            o.NsipPartnerPaymentReviewActivity r2 = r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r2)     // Catch:{ all -> 0x00c3 }
            r2.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            int r2 = r7.appVersion     // Catch:{ all -> 0x00c3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00c3 }
            o.NsipPartnerPaymentReviewActivity r2 = r1.RatingCompat(r4)     // Catch:{ all -> 0x00c3 }
            r2.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            int r2 = r7.valueCount     // Catch:{ all -> 0x00c3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00c3 }
            o.NsipPartnerPaymentReviewActivity r2 = r1.RatingCompat(r4)     // Catch:{ all -> 0x00c3 }
            r2.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            r1.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r7.lruEntries     // Catch:{ all -> 0x00c3 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x004e:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00c3 }
            r6 = 32
            if (r5 == 0) goto L_0x0076
            java.lang.String r5 = DIRTY     // Catch:{ all -> 0x00c3 }
            o.NsipPartnerPaymentReviewActivity r5 = r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r5)     // Catch:{ all -> 0x00c3 }
            r5.MediaBrowserCompat$ItemReceiver(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = r4.getKey$okhttp()     // Catch:{ all -> 0x00c3 }
            r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r4)     // Catch:{ all -> 0x00c3 }
            r1.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            goto L_0x004e
        L_0x0076:
            java.lang.String r5 = CLEAN     // Catch:{ all -> 0x00c3 }
            o.NsipPartnerPaymentReviewActivity r5 = r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r5)     // Catch:{ all -> 0x00c3 }
            r5.MediaBrowserCompat$ItemReceiver(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = r4.getKey$okhttp()     // Catch:{ all -> 0x00c3 }
            r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r5)     // Catch:{ all -> 0x00c3 }
            r4.writeLengths$okhttp(r1)     // Catch:{ all -> 0x00c3 }
            r1.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x00c3 }
            goto L_0x004e
        L_0x008d:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00c3 }
            r1 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00ca }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00a6
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00ca }
            java.io.File r2 = r7.journalFileBackup     // Catch:{ all -> 0x00ca }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00ca }
        L_0x00a6:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00ca }
            java.io.File r2 = r7.journalFile     // Catch:{ all -> 0x00ca }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00ca }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFileBackup     // Catch:{ all -> 0x00ca }
            r0.delete(r1)     // Catch:{ all -> 0x00ca }
            o.NsipPartnerPaymentReviewActivity r0 = r7.newJournalWriter()     // Catch:{ all -> 0x00ca }
            r7.journalWriter = r0     // Catch:{ all -> 0x00ca }
            r0 = 0
            r7.hasJournalErrors = r0     // Catch:{ all -> 0x00ca }
            r7.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r7)
            return
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r2 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00ca }
            throw r2     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            r3.initialize()     // Catch:{ all -> 0x0062 }
            r3.checkNotClosed()     // Catch:{ all -> 0x0062 }
            r3.validateKey(r4)     // Catch:{ all -> 0x0062 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0062 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0062 }
            r1 = 0
            if (r0 == 0) goto L_0x0060
            java.lang.String r2 = "lruEntries[key] ?: return null"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0062 }
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0027
            monitor-exit(r3)
            return r1
        L_0x0027:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005e
            int r1 = r3.redundantOpCount     // Catch:{ all -> 0x0062 }
            int r1 = r1 + 1
            r3.redundantOpCount = r1     // Catch:{ all -> 0x0062 }
            o.NsipPartnerPaymentReviewActivity r1 = r3.journalWriter     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x003a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0062 }
        L_0x003a:
            java.lang.String r2 = READ     // Catch:{ all -> 0x0062 }
            o.NsipPartnerPaymentReviewActivity r1 = r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r2)     // Catch:{ all -> 0x0062 }
            r2 = 32
            o.NsipPartnerPaymentReviewActivity r1 = r1.MediaBrowserCompat$ItemReceiver(r2)     // Catch:{ all -> 0x0062 }
            o.NsipPartnerPaymentReviewActivity r4 = r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r4)     // Catch:{ all -> 0x0062 }
            r1 = 10
            r4.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ all -> 0x0062 }
            boolean r4 = r3.journalRebuildRequired()     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x005c
            java.util.concurrent.Executor r4 = r3.executor     // Catch:{ all -> 0x0062 }
            java.lang.Runnable r1 = r3.cleanupRunnable     // Catch:{ all -> 0x0062 }
            r4.execute(r1)     // Catch:{ all -> 0x0062 }
        L_0x005c:
            monitor-exit(r3)
            return r0
        L_0x005e:
            monitor-exit(r3)
            return r1
        L_0x0060:
            monitor-exit(r3)
            return r1
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            r5.initialize()     // Catch:{ all -> 0x0085 }
            r5.checkNotClosed()     // Catch:{ all -> 0x0085 }
            r5.validateKey(r6)     // Catch:{ all -> 0x0085 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0085 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0085 }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x0085 }
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r3 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x0085 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r5)
            return r2
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            okhttp3.internal.cache.DiskLruCache$Editor r7 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0085 }
            goto L_0x0032
        L_0x0031:
            r7 = r2
        L_0x0032:
            if (r7 == 0) goto L_0x0036
            monitor-exit(r5)
            return r2
        L_0x0036:
            boolean r7 = r5.mostRecentTrimFailed     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x007c
            boolean r7 = r5.mostRecentRebuildFailed     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x003f
            goto L_0x007c
        L_0x003f:
            o.NsipPartnerPaymentReviewActivity r7 = r5.journalWriter     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0046
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0085 }
        L_0x0046:
            java.lang.String r8 = DIRTY     // Catch:{ all -> 0x0085 }
            o.NsipPartnerPaymentReviewActivity r8 = r7.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r8)     // Catch:{ all -> 0x0085 }
            r1 = 32
            o.NsipPartnerPaymentReviewActivity r8 = r8.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ all -> 0x0085 }
            o.NsipPartnerPaymentReviewActivity r8 = r8.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r6)     // Catch:{ all -> 0x0085 }
            r1 = 10
            r8.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ all -> 0x0085 }
            r7.flush()     // Catch:{ all -> 0x0085 }
            boolean r7 = r5.hasJournalErrors     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0064
            monitor-exit(r5)
            return r2
        L_0x0064:
            if (r0 != 0) goto L_0x0072
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x0085 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0085 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r7 = r5.lruEntries     // Catch:{ all -> 0x0085 }
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x0085 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0085 }
        L_0x0072:
            okhttp3.internal.cache.DiskLruCache$Editor r6 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0085 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0085 }
            r0.setCurrentEditor$okhttp(r6)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return r6
        L_0x007c:
            java.util.concurrent.Executor r6 = r5.executor     // Catch:{ all -> 0x0085 }
            java.lang.Runnable r7 = r5.cleanupRunnable     // Catch:{ all -> 0x0085 }
            r6.execute(r7)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return r2
        L_0x0085:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public final long size() throws IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch:{ all -> 0x0134 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0134 }
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r9)     // Catch:{ all -> 0x0134 }
            if (r1 == 0) goto L_0x0126
            r1 = 0
            if (r10 == 0) goto L_0x0065
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0134 }
            if (r2 != 0) goto L_0x0065
            int r2 = r8.valueCount     // Catch:{ all -> 0x0134 }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x0065
            boolean[] r4 = r9.getWritten$okhttp()     // Catch:{ all -> 0x0134 }
            if (r4 != 0) goto L_0x002b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0134 }
        L_0x002b:
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x0049
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0134 }
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0134 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0134 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0134 }
            boolean r4 = r4.exists(r5)     // Catch:{ all -> 0x0134 }
            if (r4 != 0) goto L_0x0046
            r9.abort()     // Catch:{ all -> 0x0134 }
            monitor-exit(r8)
            return
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0049:
            r9.abort()     // Catch:{ all -> 0x0134 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r10.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0134 }
            r10.append(r3)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0134 }
            r9.<init>(r10)     // Catch:{ all -> 0x0134 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0134 }
            throw r9     // Catch:{ all -> 0x0134 }
        L_0x0065:
            int r9 = r8.valueCount     // Catch:{ all -> 0x0134 }
        L_0x0067:
            if (r1 >= r9) goto L_0x00ad
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0134 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0134 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0134 }
            if (r10 == 0) goto L_0x00a5
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0134 }
            boolean r3 = r3.exists(r2)     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00aa
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x0134 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0134 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0134 }
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0134 }
            r4.rename(r2, r3)     // Catch:{ all -> 0x0134 }
            long[] r2 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0134 }
            r4 = r2[r1]     // Catch:{ all -> 0x0134 }
            okhttp3.internal.io.FileSystem r2 = r8.fileSystem     // Catch:{ all -> 0x0134 }
            long r2 = r2.size(r3)     // Catch:{ all -> 0x0134 }
            long[] r6 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0134 }
            r6[r1] = r2     // Catch:{ all -> 0x0134 }
            long r6 = r8.size     // Catch:{ all -> 0x0134 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch:{ all -> 0x0134 }
            goto L_0x00aa
        L_0x00a5:
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0134 }
            r3.delete(r2)     // Catch:{ all -> 0x0134 }
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x00ad:
            int r9 = r8.redundantOpCount     // Catch:{ all -> 0x0134 }
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch:{ all -> 0x0134 }
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch:{ all -> 0x0134 }
            o.NsipPartnerPaymentReviewActivity r9 = r8.journalWriter     // Catch:{ all -> 0x0134 }
            if (r9 != 0) goto L_0x00be
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0134 }
        L_0x00be:
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0134 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00e7
            if (r10 != 0) goto L_0x00e7
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0134 }
            r10.remove(r1)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = REMOVE     // Catch:{ all -> 0x0134 }
            o.NsipPartnerPaymentReviewActivity r10 = r9.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r10)     // Catch:{ all -> 0x0134 }
            r10.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = r0.getKey$okhttp()     // Catch:{ all -> 0x0134 }
            r9.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r10)     // Catch:{ all -> 0x0134 }
            r9.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x0134 }
            goto L_0x010c
        L_0x00e7:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x0134 }
            o.NsipPartnerPaymentReviewActivity r1 = r9.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r1)     // Catch:{ all -> 0x0134 }
            r1.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0134 }
            r9.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r1)     // Catch:{ all -> 0x0134 }
            r0.writeLengths$okhttp(r9)     // Catch:{ all -> 0x0134 }
            r9.MediaBrowserCompat$ItemReceiver(r3)     // Catch:{ all -> 0x0134 }
            if (r10 == 0) goto L_0x010c
            long r1 = r8.nextSequenceNumber     // Catch:{ all -> 0x0134 }
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch:{ all -> 0x0134 }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x0134 }
        L_0x010c:
            r9.flush()     // Catch:{ all -> 0x0134 }
            long r9 = r8.size     // Catch:{ all -> 0x0134 }
            long r0 = r8.maxSize     // Catch:{ all -> 0x0134 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x011d
            boolean r9 = r8.journalRebuildRequired()     // Catch:{ all -> 0x0134 }
            if (r9 == 0) goto L_0x0124
        L_0x011d:
            java.util.concurrent.Executor r9 = r8.executor     // Catch:{ all -> 0x0134 }
            java.lang.Runnable r10 = r8.cleanupRunnable     // Catch:{ all -> 0x0134 }
            r9.execute(r10)     // Catch:{ all -> 0x0134 }
        L_0x0124:
            monitor-exit(r8)
            return
        L_0x0126:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0134 }
            r9.<init>(r10)     // Catch:{ all -> 0x0134 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0134 }
            throw r9     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0033 }
            r5.initialize()     // Catch:{ all -> 0x0033 }
            r5.checkNotClosed()     // Catch:{ all -> 0x0033 }
            r5.validateKey(r6)     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0033 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0033 }
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r6 == 0) goto L_0x0031
            java.lang.String r1 = "lruEntries[key] ?: return false"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r1)     // Catch:{ all -> 0x0033 }
            boolean r6 = r5.removeEntry$okhttp(r6)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x002f
            long r1 = r5.size     // Catch:{ all -> 0x0033 }
            long r3 = r5.maxSize     // Catch:{ all -> 0x0033 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002f
            r5.mostRecentTrimFailed = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r5)
            return r6
        L_0x0031:
            monitor-exit(r5)
            return r0
        L_0x0033:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        onGetStartedClick.write((Object) entry, "entry");
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.journalWriter;
        if (nsipPartnerPaymentReviewActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        nsipPartnerPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(REMOVE).MediaBrowserCompat$ItemReceiver(32).MediaBrowserCompat$CustomActionResultReceiver(entry.getKey$okhttp()).MediaBrowserCompat$ItemReceiver(10);
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    private final void checkNotClosed() {
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("cache is closed".toString());
            }
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                checkNotClosed();
                trimToSize();
                NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.journalWriter;
                if (nsipPartnerPaymentReviewActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                nsipPartnerPaymentReviewActivity.flush();
            }
        }
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    public final void close() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                if (!this.closed) {
                    Collection<Entry> values = this.lruEntries.values();
                    onGetStartedClick.IconCompatParcelizer((Object) values, "lruEntries.values");
                    Object[] array = values.toArray(new Entry[0]);
                    if (array != null) {
                        for (Entry entry : (Entry[]) array) {
                            if (entry.getCurrentEditor$okhttp() != null) {
                                Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
                                if (currentEditor$okhttp == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                currentEditor$okhttp.abort();
                            }
                        }
                        trimToSize();
                        NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.journalWriter;
                        if (nsipPartnerPaymentReviewActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        nsipPartnerPaymentReviewActivity.close();
                        this.journalWriter = null;
                        this.closed = true;
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            this.closed = true;
        }
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            Entry next = this.lruEntries.values().iterator().next();
            onGetStartedClick.IconCompatParcelizer((Object) next, "lruEntries.values.iterator().next()");
            removeEntry$okhttp(next);
        }
        this.mostRecentTrimFailed = false;
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final void evictAll() throws IOException {
        synchronized (this) {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            onGetStartedClick.IconCompatParcelizer((Object) values, "lruEntries.values");
            Object[] array = values.toArray(new Entry[0]);
            if (array != null) {
                for (Entry entry : (Entry[]) array) {
                    onGetStartedClick.IconCompatParcelizer((Object) entry, "entry");
                    removeEntry$okhttp(entry);
                }
                this.mostRecentTrimFailed = false;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    private final void validateKey(String str) {
        LifestyleCustomizationActivity lifestyleCustomizationActivity = LEGAL_KEY_PATTERN;
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "input");
        if (!lifestyleCustomizationActivity.write.matcher(charSequence).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append('\"');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public final Iterator<Snapshot> snapshots() throws IOException {
        Iterator<Snapshot> diskLruCache$snapshots$1;
        synchronized (this) {
            initialize();
            diskLruCache$snapshots$1 = new DiskLruCache$snapshots$1(this);
        }
        return diskLruCache$snapshots$1;
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<HowToAddAccountStep2Activity> sources;
        final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends HowToAddAccountStep2Activity> list, long[] jArr) {
            onGetStartedClick.write((Object) str, "key");
            onGetStartedClick.write((Object) list, "sources");
            onGetStartedClick.write((Object) jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public final String key() {
            return this.key;
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final HowToAddAccountStep2Activity getSource(int i) {
            return this.sources.get(i);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final void close() {
            for (HowToAddAccountStep2Activity closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry2) {
            onGetStartedClick.write((Object) entry2, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry2;
            this.written = entry2.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final void detach$okhttp() {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i = 0; i < valueCount$okhttp; i++) {
                    try {
                        this.this$0.getFileSystem$okhttp().delete(this.entry.getDirtyFiles$okhttp().get(i));
                    } catch (IOException unused) {
                    }
                }
                this.entry.setCurrentEditor$okhttp((Editor) null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.HowToAddAccountStep2Activity newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x004b }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x003d
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004b }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x004b }
                r2 = 0
                if (r1 == 0) goto L_0x003b
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004b }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x004b }
                r3 = r4
                okhttp3.internal.cache.DiskLruCache$Editor r3 = (okhttp3.internal.cache.DiskLruCache.Editor) r3     // Catch:{ all -> 0x004b }
                boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x004b }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x003b
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ FileNotFoundException -> 0x0039 }
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0039 }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch:{ FileNotFoundException -> 0x0039 }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x0039 }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x0039 }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x0039 }
                o.HowToAddAccountStep2Activity r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x0039 }
            L_0x0039:
                monitor-exit(r0)
                return r2
            L_0x003b:
                monitor-exit(r0)
                return r2
            L_0x003d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004b }
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004b }
                r5.<init>(r1)     // Catch:{ all -> 0x004b }
                java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x004b }
                throw r5     // Catch:{ all -> 0x004b }
            L_0x004b:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):o.HowToAddAccountStep2Activity");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:24|25|26|27) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r5 = p040o.onSubmit.write();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0056 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.PinChangeActivity newSink(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x006a }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x005c
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x006a }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x006a }
                r3 = r4
                okhttp3.internal.cache.DiskLruCache$Editor r3 = (okhttp3.internal.cache.DiskLruCache.Editor) r3     // Catch:{ all -> 0x006a }
                boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x006a }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001f
                o.PinChangeActivity r5 = p040o.onSubmit.write()     // Catch:{ all -> 0x006a }
                monitor-exit(r0)
                return r5
            L_0x001f:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x006a }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x006a }
                if (r1 != 0) goto L_0x0030
                boolean[] r1 = r4.written     // Catch:{ all -> 0x006a }
                if (r1 != 0) goto L_0x002e
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x006a }
            L_0x002e:
                r1[r5] = r2     // Catch:{ all -> 0x006a }
            L_0x0030:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x006a }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x006a }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x006a }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x006a }
                okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ FileNotFoundException -> 0x0056 }
                okhttp3.internal.io.FileSystem r2 = r2.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0056 }
                o.PinChangeActivity r1 = r2.sink(r1)     // Catch:{ FileNotFoundException -> 0x0056 }
                okhttp3.internal.cache.FaultHidingSink r2 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x006a }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x006a }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x006a }
                o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3     // Catch:{ all -> 0x006a }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x006a }
                o.PinChangeActivity r2 = (p040o.PinChangeActivity) r2     // Catch:{ all -> 0x006a }
                monitor-exit(r0)
                return r2
            L_0x0056:
                o.PinChangeActivity r5 = p040o.onSubmit.write()     // Catch:{ all -> 0x006a }
                monitor-exit(r0)
                return r5
            L_0x005c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006a }
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
                r5.<init>(r1)     // Catch:{ all -> 0x006a }
                java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x006a }
                throw r5     // Catch:{ all -> 0x006a }
            L_0x006a:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):o.PinChangeActivity");
        }

        public final void commit() throws IOException {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        this.this$0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void abort() throws IOException {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        this.this$0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
    }

    public final class Entry {
        private final List<File> cleanFiles = new ArrayList();
        private Editor currentEditor;
        private final List<File> dirtyFiles = new ArrayList();
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;

        public Entry(DiskLruCache diskLruCache, String str) {
            onGetStartedClick.write((Object) str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(this.key);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            onGetStartedClick.write((Object) list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    throw invalidLengths(list);
                }
            } else {
                throw invalidLengths(list);
            }
        }

        public final void writeLengths$okhttp(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException {
            onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "writer");
            for (long RatingCompat : this.lengths) {
                nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(32).RatingCompat(RatingCompat);
            }
        }

        private final IOException invalidLengths(List<String> list) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(list);
            throw new IOException(sb.toString());
        }

        public final Snapshot snapshot$okhttp() {
            boolean holdsLock = Thread.holdsLock(this.this$0);
            if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
                List<HowToAddAccountStep2Activity> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i)));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (HowToAddAccountStep2Activity closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            } else {
                throw new AssertionError("Assertion failed");
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
            FileSystem fileSystem2 = fileSystem;
            onGetStartedClick.write((Object) fileSystem, "fileSystem");
            File file2 = file;
            onGetStartedClick.write((Object) file, "directory");
            boolean z = false;
            if (j > 0) {
                if (i2 > 0) {
                    z = true;
                }
                if (z) {
                    return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
                }
                throw new IllegalArgumentException("valueCount <= 0".toString());
            }
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
    }
}
