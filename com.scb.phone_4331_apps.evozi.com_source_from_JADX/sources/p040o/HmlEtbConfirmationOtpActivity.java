package p040o;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p039io.realm.internal.OsObjectStore;
import p039io.realm.internal.OsRealmConfig;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.Row;
import p039io.realm.internal.Util;
import p039io.realm.log.RealmLog;

/* renamed from: o.HmlEtbConfirmationOtpActivity */
public abstract class HmlEtbConfirmationOtpActivity implements Closeable {
    static volatile Context MediaBrowserCompat$ItemReceiver;
    public static final IconCompatParcelizer read = new IconCompatParcelizer();
    public final long IconCompatParcelizer;
    protected final HmlNTBAdditionalDocumentActivity MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private HmlMonthlyIncomeAboutActivity MediaDescriptionCompat;
    private OsSharedRealm.SchemaChangedCallback RatingCompat;
    public OsSharedRealm write;

    /* renamed from: o.HmlEtbConfirmationOtpActivity$write */
    public static final class write {
        public HmlNTBLoanReviewActivity IconCompatParcelizer;
        public List<String> MediaBrowserCompat$CustomActionResultReceiver;
        public HmlEtbConfirmationOtpActivity MediaBrowserCompat$ItemReceiver;
        public Row read;
        public boolean write;
    }

    public abstract HmlNTBCompanyNameActivity read();

    static {
        HmlNTBRepaymentAboutActivity.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private HmlEtbConfirmationOtpActivity(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, OsSchemaInfo osSchemaInfo) {
        this.RatingCompat = new OsSharedRealm.SchemaChangedCallback() {
        };
        this.IconCompatParcelizer = Thread.currentThread().getId();
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBAdditionalDocumentActivity;
        C11981 r0 = null;
        this.MediaDescriptionCompat = null;
        C12004 r1 = (osSchemaInfo == null || hmlNTBAdditionalDocumentActivity.MediaDescriptionCompat == null) ? null : new OsSharedRealm.MigrationCallback() {
        };
        r0 = hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$SearchResultReceiver != null ? new OsSharedRealm.InitializationCallback() {
        } : r0;
        OsRealmConfig.write write2 = new OsRealmConfig.write(hmlNTBAdditionalDocumentActivity);
        write2.IconCompatParcelizer = new File(MediaBrowserCompat$ItemReceiver.getFilesDir(), ".realm.temp").getAbsolutePath();
        write2.MediaBrowserCompat$CustomActionResultReceiver = true;
        write2.write = r1;
        write2.MediaBrowserCompat$ItemReceiver = osSchemaInfo;
        write2.read = r0;
        OsSharedRealm read2 = OsSharedRealm.read(write2);
        this.write = read2;
        this.MediaBrowserCompat$SearchResultReceiver = true;
        OsSharedRealm.nativeRegisterSchemaChangedCallback(read2.read, this.RatingCompat);
    }

    public boolean MediaBrowserCompat$SearchResultReceiver() {
        MediaBrowserCompat$ItemReceiver();
        return OsSharedRealm.nativeIsInTransaction(this.write.read);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        OsSharedRealm osSharedRealm = this.write;
        if (osSharedRealm == null || OsSharedRealm.nativeIsClosed(osSharedRealm.read)) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        } else if (this.IconCompatParcelizer != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    public String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
    }

    public HmlNTBAdditionalDocumentActivity write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r8 = this;
            long r0 = r8.IconCompatParcelizer
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            o.HmlMonthlyIncomeAboutActivity r0 = r8.MediaDescriptionCompat
            r1 = 0
            if (r0 == 0) goto L_0x00b5
            monitor-enter(r0)
            java.lang.String r2 = r8.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x00b2 }
            java.util.EnumMap<o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$CustomActionResultReceiver, o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver> r3 = r0.read     // Catch:{ all -> 0x00b2 }
            java.lang.Class r4 = r8.getClass()     // Catch:{ all -> 0x00b2 }
            o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$CustomActionResultReceiver r4 = p040o.C1203xdb38585a.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x00b2 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00b2 }
            o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver r3 = (p040o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver) r3     // Catch:{ all -> 0x00b2 }
            java.lang.ThreadLocal<java.lang.Integer> r4 = r3.write     // Catch:{ all -> 0x00b2 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00b2 }
            r5 = 0
            if (r4 != 0) goto L_0x0037
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00b2 }
        L_0x0037:
            int r6 = r4.intValue()     // Catch:{ all -> 0x00b2 }
            r7 = 1
            if (r6 > 0) goto L_0x004c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b2 }
            r1[r5] = r2     // Catch:{ all -> 0x00b2 }
            r1[r7] = r4     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "%s has been closed already. refCount is %s"
            p039io.realm.log.RealmLog.IconCompatParcelizer(r2, r1)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)
            return
        L_0x004c:
            int r4 = r4.intValue()     // Catch:{ all -> 0x00b2 }
            int r4 = r4 - r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            int r6 = r4.intValue()     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x00ab
            java.lang.ThreadLocal<java.lang.Integer> r4 = r3.write     // Catch:{ all -> 0x00b2 }
            r4.set(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.ThreadLocal<o.HmlEtbConfirmationOtpActivity> r4 = r3.IconCompatParcelizer     // Catch:{ all -> 0x00b2 }
            r4.set(r1)     // Catch:{ all -> 0x00b2 }
            int r4 = r3.read     // Catch:{ all -> 0x00b2 }
            int r4 = r4 - r7
            r3.read = r4     // Catch:{ all -> 0x00b2 }
            int r3 = r3.read     // Catch:{ all -> 0x00b2 }
            if (r3 < 0) goto L_0x008f
            r8.MediaDescriptionCompat = r1     // Catch:{ all -> 0x00b2 }
            io.realm.internal.OsSharedRealm r2 = r8.write     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x007d
            boolean r3 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x007d
            r2.close()     // Catch:{ all -> 0x00b2 }
            r8.write = r1     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            int r2 = r0.write()     // Catch:{ all -> 0x00b2 }
            if (r2 != 0) goto L_0x00b0
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x00b2 }
            r8.write()     // Catch:{ all -> 0x00b2 }
            p040o.HmlNTBPinDisabledActivity_ViewBinding.read(r5)     // Catch:{ all -> 0x00b2 }
            r8.write()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x008f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r3.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = "Global reference counter of Realm"
            r3.append(r4)     // Catch:{ all -> 0x00b2 }
            r3.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = " got corrupted."
            r3.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00b2 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00ab:
            java.lang.ThreadLocal<java.lang.Integer> r1 = r3.write     // Catch:{ all -> 0x00b2 }
            r1.set(r4)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r0)
            return
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00b5:
            r8.MediaDescriptionCompat = r1
            io.realm.internal.OsSharedRealm r0 = r8.write
            if (r0 == 0) goto L_0x00c4
            boolean r2 = r8.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x00c4
            r0.close()
            r8.write = r1
        L_0x00c4:
            return
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Realm access from incorrect thread. Realm instance can only be closed on the thread it was created."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlEtbConfirmationOtpActivity.close():void");
    }

    public boolean IconCompatParcelizer() {
        if (this.IconCompatParcelizer == Thread.currentThread().getId()) {
            OsSharedRealm osSharedRealm = this.write;
            return osSharedRealm == null || OsSharedRealm.nativeIsClosed(osSharedRealm.read);
        }
        throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
    }

    static boolean IconCompatParcelizer(final HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.MediaBrowserCompat$CustomActionResultReceiver(hmlNTBAdditionalDocumentActivity, new Runnable() {
            public final void run() {
                atomicBoolean.set(Util.write(HmlNTBAdditionalDocumentActivity.this.IconCompatParcelizer, HmlNTBAdditionalDocumentActivity.this.MediaSessionCompat$QueueItem, HmlNTBAdditionalDocumentActivity.this.MediaSessionCompat$ResultReceiverWrapper));
            }
        })) {
            return atomicBoolean.get();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: ");
        sb.append(hmlNTBAdditionalDocumentActivity.IconCompatParcelizer);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.MediaBrowserCompat$SearchResultReceiver && (osSharedRealm = this.write) != null && !OsSharedRealm.nativeIsClosed(osSharedRealm.read)) {
            RealmLog.IconCompatParcelizer("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
            HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity = this.MediaDescriptionCompat;
            if (hmlMonthlyIncomeAboutActivity != null && !hmlMonthlyIncomeAboutActivity.write.getAndSet(true)) {
                HmlMonthlyIncomeAboutActivity.MediaBrowserCompat$ItemReceiver.add(hmlMonthlyIncomeAboutActivity);
            }
        }
        super.finalize();
    }

    /* renamed from: o.HmlEtbConfirmationOtpActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends ThreadLocal<write> {
        IconCompatParcelizer() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new write();
        }
    }

    HmlEtbConfirmationOtpActivity(HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity, OsSchemaInfo osSchemaInfo) {
        this(hmlMonthlyIncomeAboutActivity.MediaBrowserCompat$CustomActionResultReceiver, osSchemaInfo);
        this.MediaDescriptionCompat = hmlMonthlyIncomeAboutActivity;
    }
}
