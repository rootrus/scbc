package p040o;

import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p039io.realm.log.RealmLog;

/* renamed from: o.HmlMonthlyIncomeAboutActivity */
final class HmlMonthlyIncomeAboutActivity {
    private static final List<WeakReference<HmlMonthlyIncomeAboutActivity>> IconCompatParcelizer = new ArrayList();
    static final Collection<HmlMonthlyIncomeAboutActivity> MediaBrowserCompat$ItemReceiver = new ConcurrentLinkedQueue();
    HmlNTBAdditionalDocumentActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    final EnumMap<C1203xdb38585a, HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver> read;
    final AtomicBoolean write = new AtomicBoolean(false);

    /* renamed from: o.HmlMonthlyIncomeAboutActivity$IconCompatParcelizer */
    interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver(int i);
    }

    private HmlMonthlyIncomeAboutActivity(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.read = new EnumMap<>(C1203xdb38585a.class);
        for (C1203xdb38585a put : C1203xdb38585a.values()) {
            this.read.put(put, new HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver((byte) 0));
        }
    }

    private static HmlMonthlyIncomeAboutActivity IconCompatParcelizer(String str, boolean z) {
        HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity;
        synchronized (IconCompatParcelizer) {
            Iterator<WeakReference<HmlMonthlyIncomeAboutActivity>> it = IconCompatParcelizer.iterator();
            hmlMonthlyIncomeAboutActivity = null;
            while (it.hasNext()) {
                HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity2 = (HmlMonthlyIncomeAboutActivity) it.next().get();
                if (hmlMonthlyIncomeAboutActivity2 == null) {
                    it.remove();
                } else if (hmlMonthlyIncomeAboutActivity2.MediaBrowserCompat$SearchResultReceiver.equals(str)) {
                    hmlMonthlyIncomeAboutActivity = hmlMonthlyIncomeAboutActivity2;
                }
            }
            if (hmlMonthlyIncomeAboutActivity == null && z) {
                hmlMonthlyIncomeAboutActivity = new HmlMonthlyIncomeAboutActivity(str);
                IconCompatParcelizer.add(new WeakReference(hmlMonthlyIncomeAboutActivity));
            }
        }
        return hmlMonthlyIncomeAboutActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: io.realm.internal.OsSharedRealm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: io.realm.internal.OsSharedRealm} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x010f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <E extends p040o.HmlEtbConfirmationOtpActivity> E IconCompatParcelizer(p040o.HmlNTBAdditionalDocumentActivity r9, java.lang.Class<E> r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.EnumMap<o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$CustomActionResultReceiver, o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver> r0 = r8.read     // Catch:{ all -> 0x015e }
            o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C1203xdb38585a.MediaBrowserCompat$ItemReceiver(r10)     // Catch:{ all -> 0x015e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x015e }
            o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver r0 = (p040o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver) r0     // Catch:{ all -> 0x015e }
            int r1 = r8.write()     // Catch:{ all -> 0x015e }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0017
            r1 = r3
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x015e }
            java.lang.String r5 = r9.IconCompatParcelizer     // Catch:{ all -> 0x015e }
            r4.<init>(r5)     // Catch:{ all -> 0x015e }
            boolean r4 = r4.exists()     // Catch:{ all -> 0x015e }
            r4 = r4 ^ r3
            r5 = 0
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x015e }
            boolean r1 = p039io.realm.internal.Util.MediaBrowserCompat$ItemReceiver((java.lang.String) r1)     // Catch:{ all -> 0x015e }
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x003a
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x015e }
            java.io.File r6 = r9.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x015e }
            java.lang.String r7 = r9.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x015e }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x015e }
            goto L_0x003b
        L_0x003a:
            r1 = r5
        L_0x003b:
            p040o.HmlNTBPinDisabledActivity_ViewBinding.read(r2)     // Catch:{ all -> 0x015e }
            boolean r6 = p039io.realm.internal.Util.MediaBrowserCompat$ItemReceiver((java.lang.String) r5)     // Catch:{ all -> 0x015e }
            r6 = r6 ^ r3
            if (r1 != 0) goto L_0x0047
            if (r6 == 0) goto L_0x004f
        L_0x0047:
            o.HmlMonthlyIncomeAboutActivity$3 r7 = new o.HmlMonthlyIncomeAboutActivity$3     // Catch:{ all -> 0x015e }
            r7.<init>(r1, r9, r6, r5)     // Catch:{ all -> 0x015e }
            p039io.realm.internal.OsObjectStore.MediaBrowserCompat$CustomActionResultReceiver(r9, r7)     // Catch:{ all -> 0x015e }
        L_0x004f:
            if (r4 != 0) goto L_0x0060
            io.realm.internal.OsSharedRealm r5 = p039io.realm.internal.OsSharedRealm.IconCompatParcelizer((p040o.HmlNTBAdditionalDocumentActivity) r9)     // Catch:{ all -> 0x0059 }
            p039io.realm.internal.Table.write((p039io.realm.internal.OsSharedRealm) r5)     // Catch:{ all -> 0x0059 }
            goto L_0x0060
        L_0x0059:
            r9 = move-exception
            if (r5 == 0) goto L_0x005f
            r5.close()     // Catch:{ all -> 0x015e }
        L_0x005f:
            throw r9     // Catch:{ all -> 0x015e }
        L_0x0060:
            if (r5 == 0) goto L_0x0065
            r5.close()     // Catch:{ all -> 0x015e }
        L_0x0065:
            r8.MediaBrowserCompat$CustomActionResultReceiver = r9     // Catch:{ all -> 0x015e }
            goto L_0x00f6
        L_0x0069:
            o.HmlNTBAdditionalDocumentActivity r1 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x015e }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x015e }
            if (r1 != 0) goto L_0x00f6
            o.HmlNTBAdditionalDocumentActivity r10 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x015e }
            byte[] r10 = r10.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x015e }
            if (r10 != 0) goto L_0x0079
            r10 = r5
            goto L_0x007e
        L_0x0079:
            int r0 = r10.length     // Catch:{ all -> 0x015e }
            byte[] r10 = java.util.Arrays.copyOf(r10, r0)     // Catch:{ all -> 0x015e }
        L_0x007e:
            byte[] r0 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            int r1 = r0.length     // Catch:{ all -> 0x015e }
            byte[] r5 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x015e }
        L_0x0088:
            boolean r10 = java.util.Arrays.equals(r10, r5)     // Catch:{ all -> 0x015e }
            if (r10 == 0) goto L_0x00ee
            o.HmlNTBApplyLoanEntryActivity r10 = r9.MediaDescriptionCompat     // Catch:{ all -> 0x015e }
            o.HmlNTBAdditionalDocumentActivity r0 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x015e }
            o.HmlNTBApplyLoanEntryActivity r0 = r0.MediaDescriptionCompat     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x00cd
            if (r10 == 0) goto L_0x00cd
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x015e }
            java.lang.Class r2 = r10.getClass()     // Catch:{ all -> 0x015e }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x015e }
            if (r1 == 0) goto L_0x00cd
            boolean r10 = r10.equals(r0)     // Catch:{ all -> 0x015e }
            if (r10 != 0) goto L_0x00cd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r10.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: "
            r10.append(r0)     // Catch:{ all -> 0x015e }
            o.HmlNTBApplyLoanEntryActivity r9 = r9.MediaDescriptionCompat     // Catch:{ all -> 0x015e }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x015e }
            java.lang.String r9 = r9.getCanonicalName()     // Catch:{ all -> 0x015e }
            r10.append(r9)     // Catch:{ all -> 0x015e }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x015e }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015e }
            r9.<init>(r10)     // Catch:{ all -> 0x015e }
            throw r9     // Catch:{ all -> 0x015e }
        L_0x00cd:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r10.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "Configurations cannot be different if used to open the same file. \nCached configuration: \n"
            r10.append(r0)     // Catch:{ all -> 0x015e }
            o.HmlNTBAdditionalDocumentActivity r0 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x015e }
            r10.append(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "\n\nNew configuration: \n"
            r10.append(r0)     // Catch:{ all -> 0x015e }
            r10.append(r9)     // Catch:{ all -> 0x015e }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x015e }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015e }
            r9.<init>(r10)     // Catch:{ all -> 0x015e }
            throw r9     // Catch:{ all -> 0x015e }
        L_0x00ee:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x015e }
            java.lang.String r10 = "Wrong key used to decrypt Realm."
            r9.<init>(r10)     // Catch:{ all -> 0x015e }
            throw r9     // Catch:{ all -> 0x015e }
        L_0x00f6:
            java.lang.ThreadLocal<o.HmlEtbConfirmationOtpActivity> r9 = r0.IconCompatParcelizer     // Catch:{ all -> 0x015e }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x015e }
            if (r9 != 0) goto L_0x013e
            java.lang.Class<o.HmlLaserIdAboutActivity> r9 = p040o.HmlLaserIdAboutActivity.class
            if (r10 != r9) goto L_0x011a
            o.HmlLaserIdAboutActivity r9 = p040o.HmlLaserIdAboutActivity.IconCompatParcelizer(r8)     // Catch:{ all -> 0x015e }
            r10 = r9
            o.HmlLaserIdAboutActivity r10 = (p040o.HmlLaserIdAboutActivity) r10     // Catch:{ all -> 0x015e }
            if (r4 == 0) goto L_0x0122
            p040o.HmlNTBPinDisabledActivity_ViewBinding.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x010f }
            goto L_0x0122
        L_0x010f:
            r10.close()     // Catch:{ all -> 0x015e }
            o.HmlNTBAdditionalDocumentActivity r10 = r10.write()     // Catch:{ all -> 0x015e }
            MediaBrowserCompat$CustomActionResultReceiver(r10)     // Catch:{ all -> 0x015e }
            goto L_0x0122
        L_0x011a:
            java.lang.Class<o.HmlETBReviewActivity> r9 = p040o.HmlETBReviewActivity.class
            if (r10 != r9) goto L_0x0136
            o.HmlETBReviewActivity r9 = p040o.HmlETBReviewActivity.write(r8)     // Catch:{ all -> 0x015e }
        L_0x0122:
            java.lang.ThreadLocal<o.HmlEtbConfirmationOtpActivity> r10 = r0.IconCompatParcelizer     // Catch:{ all -> 0x015e }
            r10.set(r9)     // Catch:{ all -> 0x015e }
            java.lang.ThreadLocal<java.lang.Integer> r9 = r0.write     // Catch:{ all -> 0x015e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x015e }
            r9.set(r10)     // Catch:{ all -> 0x015e }
            int r9 = r0.read     // Catch:{ all -> 0x015e }
            int r9 = r9 + r3
            r0.read = r9     // Catch:{ all -> 0x015e }
            goto L_0x013e
        L_0x0136:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x015e }
            java.lang.String r10 = "The type of Realm class must be Realm or DynamicRealm."
            r9.<init>(r10)     // Catch:{ all -> 0x015e }
            throw r9     // Catch:{ all -> 0x015e }
        L_0x013e:
            java.lang.ThreadLocal<java.lang.Integer> r9 = r0.write     // Catch:{ all -> 0x015e }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x015e }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x015e }
            java.lang.ThreadLocal<java.lang.Integer> r10 = r0.write     // Catch:{ all -> 0x015e }
            int r9 = r9.intValue()     // Catch:{ all -> 0x015e }
            int r9 = r9 + r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x015e }
            r10.set(r9)     // Catch:{ all -> 0x015e }
            java.lang.ThreadLocal<o.HmlEtbConfirmationOtpActivity> r9 = r0.IconCompatParcelizer     // Catch:{ all -> 0x015e }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x015e }
            o.HmlEtbConfirmationOtpActivity r9 = (p040o.HmlEtbConfirmationOtpActivity) r9     // Catch:{ all -> 0x015e }
            monitor-exit(r8)
            return r9
        L_0x015e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlMonthlyIncomeAboutActivity.IconCompatParcelizer(o.HmlNTBAdditionalDocumentActivity, java.lang.Class):o.HmlEtbConfirmationOtpActivity");
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
        int i = 5;
        boolean z = false;
        while (i > 0 && !z) {
            try {
                z = HmlEtbConfirmationOtpActivity.IconCompatParcelizer(hmlNTBAdditionalDocumentActivity);
            } catch (IllegalStateException unused) {
                i--;
                StringBuilder sb = new StringBuilder();
                sb.append("Sync server still holds a reference to the Realm. It cannot be deleted. Retrying ");
                sb.append(i);
                sb.append(" more times");
                RealmLog.IconCompatParcelizer(sb.toString(), new Object[0]);
                if (i > 0) {
                    SystemClock.sleep(15);
                }
            }
        }
        if (!z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to delete the underlying Realm file: ");
            sb2.append(hmlNTBAdditionalDocumentActivity.IconCompatParcelizer);
            RealmLog.MediaBrowserCompat$ItemReceiver(sb2.toString(), new Object[0]);
        }
    }

    static void IconCompatParcelizer(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, IconCompatParcelizer iconCompatParcelizer) {
        synchronized (IconCompatParcelizer) {
            HmlMonthlyIncomeAboutActivity IconCompatParcelizer2 = IconCompatParcelizer(hmlNTBAdditionalDocumentActivity.IconCompatParcelizer, false);
            if (IconCompatParcelizer2 == null) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(0);
                return;
            }
            synchronized (IconCompatParcelizer2) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.write());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int write() {
        int i = 0;
        for (HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver hmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver : this.read.values()) {
            i += hmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver.read;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.IOException} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087 A[SYNTHETIC, Splitter:B:46:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008c A[SYNTHETIC, Splitter:B:50:0x008c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r6, java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x0090
            r0 = 0
            android.content.Context r1 = p040o.HmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.io.InputStream r1 = r1.open(r6)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            if (r1 == 0) goto L_0x0045
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            r2.<init>(r7)     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
        L_0x001c:
            int r3 = r1.read(r7)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            if (r3 < 0) goto L_0x0027
            r4 = 0
            r2.write(r7, r4, r3)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            goto L_0x001c
        L_0x0027:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r0 = move-exception
        L_0x002e:
            r2.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r6 = move-exception
            if (r0 != 0) goto L_0x0036
            r0 = r6
        L_0x0036:
            if (r0 != 0) goto L_0x0039
            goto L_0x0090
        L_0x0039:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$IconCompatParcelizer r7 = p039io.realm.exceptions.RealmFileException.IconCompatParcelizer.ACCESS_ERROR
            r6.<init>((p039io.realm.exceptions.RealmFileException.IconCompatParcelizer) r7, (java.lang.Throwable) r0)
            throw r6
        L_0x0041:
            r6 = move-exception
            goto L_0x0060
        L_0x0043:
            r7 = move-exception
            goto L_0x0064
        L_0x0045:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            io.realm.exceptions.RealmFileException$IconCompatParcelizer r2 = p039io.realm.exceptions.RealmFileException.IconCompatParcelizer.ACCESS_ERROR     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            r3.<init>()     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            r3.append(r6)     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            r7.<init>((p039io.realm.exceptions.RealmFileException.IconCompatParcelizer) r2, (java.lang.String) r3)     // Catch:{ IOException -> 0x0062, all -> 0x005e }
            throw r7     // Catch:{ IOException -> 0x0062, all -> 0x005e }
        L_0x005e:
            r6 = move-exception
            r2 = r0
        L_0x0060:
            r0 = r1
            goto L_0x0085
        L_0x0062:
            r7 = move-exception
            r2 = r0
        L_0x0064:
            r0 = r1
            goto L_0x006b
        L_0x0066:
            r6 = move-exception
            r2 = r0
            goto L_0x0085
        L_0x0069:
            r7 = move-exception
            r2 = r0
        L_0x006b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch:{ all -> 0x0084 }
            io.realm.exceptions.RealmFileException$IconCompatParcelizer r3 = p039io.realm.exceptions.RealmFileException.IconCompatParcelizer.ACCESS_ERROR     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r4.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch:{ all -> 0x0084 }
            r4.append(r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0084 }
            r1.<init>(r3, r6, r7)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            throw r6
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlMonthlyIncomeAboutActivity.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String, java.io.File):void");
    }

    static <E extends HmlEtbConfirmationOtpActivity> E MediaBrowserCompat$ItemReceiver(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, Class<E> cls) {
        return IconCompatParcelizer(hmlNTBAdditionalDocumentActivity.IconCompatParcelizer, true).IconCompatParcelizer(hmlNTBAdditionalDocumentActivity, cls);
    }
}
