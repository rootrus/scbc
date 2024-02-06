package p040o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p039io.realm.exceptions.RealmException;
import p039io.realm.exceptions.RealmMigrationNeededException;
import p039io.realm.exceptions.RealmPrimaryKeyConstraintException;
import p039io.realm.internal.OsObject;
import p039io.realm.internal.OsObjectStore;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.Table;
import p039io.realm.internal.UncheckedRow;

/* renamed from: o.HmlLaserIdAboutActivity */
public class HmlLaserIdAboutActivity extends HmlEtbConfirmationOtpActivity {
    private static final Object MediaBrowserCompat$MediaItem = new Object();
    public final HmlNTBCompanyNameActivity MediaMetadataCompat = new HmlETBSuccessActivity(this, new HmlNTBExternalAuthenticationActivity(this.MediaBrowserCompat$CustomActionResultReceiver.f2550x50fd9e4a, this.write.RatingCompat));

    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer() {
        return super.IconCompatParcelizer();
    }

    public final /* bridge */ /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver() {
        return super.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$SearchResultReceiver() {
        return super.MediaBrowserCompat$SearchResultReceiver();
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public final /* bridge */ /* synthetic */ HmlNTBAdditionalDocumentActivity write() {
        return super.write();
    }

    public final HmlNTBCompanyNameActivity read() {
        return this.MediaMetadataCompat;
    }

    public static HmlLaserIdAboutActivity read(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
        if (hmlNTBAdditionalDocumentActivity != null) {
            return (HmlLaserIdAboutActivity) HmlMonthlyIncomeAboutActivity.MediaBrowserCompat$ItemReceiver(hmlNTBAdditionalDocumentActivity, HmlLaserIdAboutActivity.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static void MediaBrowserCompat$ItemReceiver(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
        if (hmlNTBAdditionalDocumentActivity != null) {
            synchronized (MediaBrowserCompat$MediaItem) {
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    static HmlLaserIdAboutActivity IconCompatParcelizer(HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity) {
        return new HmlLaserIdAboutActivity(hmlMonthlyIncomeAboutActivity);
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E write(Class<E> cls, List<String> list) {
        Table read = this.MediaMetadataCompat.read(cls);
        boolean z = false;
        if (OsObjectStore.MediaBrowserCompat$ItemReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver.f2550x50fd9e4a.MediaBrowserCompat$ItemReceiver(cls)) == null) {
            HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity = this.MediaBrowserCompat$CustomActionResultReceiver.f2550x50fd9e4a;
            UncheckedRow IconCompatParcelizer = OsObject.IconCompatParcelizer(read);
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity = this.MediaMetadataCompat;
            if (hmlNTBCompanyNameActivity.write != null) {
                z = true;
            }
            if (z) {
                return hmlNTBRepaymentMethodAboutActivity.MediaBrowserCompat$CustomActionResultReceiver(cls, this, IconCompatParcelizer, hmlNTBCompanyNameActivity.write.MediaBrowserCompat$ItemReceiver(cls), true, list);
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key, use 'createObject(Class<E>, Object)' instead.", new Object[]{Table.MediaBrowserCompat$ItemReceiver(read.nativeGetName(read.IconCompatParcelizer))}));
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$CustomActionResultReceiver(E e, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        MediaBrowserCompat$ItemReceiver();
        if (super.MediaBrowserCompat$SearchResultReceiver()) {
            try {
                return this.MediaBrowserCompat$CustomActionResultReceiver.f2550x50fd9e4a.MediaBrowserCompat$ItemReceiver(this, e, false, map, set);
            } catch (IllegalStateException e2) {
                if (e2.getMessage().startsWith("Attempting to create an object of type")) {
                    throw new RealmPrimaryKeyConstraintException(e2.getMessage());
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        }
    }

    public static Object RatingCompat() {
        try {
            Constructor constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (InvocationTargetException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create an instance of ");
            sb.append("io.realm.DefaultRealmModule");
            throw new RealmException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not create an instance of ");
            sb2.append("io.realm.DefaultRealmModule");
            throw new RealmException(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not create an instance of ");
            sb3.append("io.realm.DefaultRealmModule");
            throw new RealmException(sb3.toString(), e3);
        }
    }

    private HmlLaserIdAboutActivity(HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity) {
        super(hmlMonthlyIncomeAboutActivity, new OsSchemaInfo(hmlMonthlyIncomeAboutActivity.MediaBrowserCompat$CustomActionResultReceiver.f2550x50fd9e4a.write().values()));
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat) {
            HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity = this.MediaBrowserCompat$CustomActionResultReceiver.f2550x50fd9e4a;
            for (Class<? extends HmlNTBCaptureDocumentActivity> MediaBrowserCompat$ItemReceiver : hmlNTBRepaymentMethodAboutActivity.IconCompatParcelizer()) {
                String write = Table.write(hmlNTBRepaymentMethodAboutActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
                if (!OsSharedRealm.nativeHasTable(this.write.read, write)) {
                    this.write.close();
                    throw new RealmMigrationNeededException(String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", new Object[]{Table.MediaBrowserCompat$ItemReceiver(write)}));
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void MediaBrowserCompat$CustomActionResultReceiver(android.content.Context r9) {
        /*
            java.lang.Class<o.HmlLaserIdAboutActivity> r0 = p040o.HmlLaserIdAboutActivity.class
            monitor-enter(r0)
            android.content.Context r1 = p040o.HmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x00be
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00c0 }
            if (r2 != 0) goto L_0x006e
            r1.mkdirs()     // Catch:{ SecurityException -> 0x0016 }
        L_0x0016:
            if (r1 == 0) goto L_0x001e
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x005e
        L_0x001e:
            r1 = 5
            long[] r1 = new long[r1]     // Catch:{ all -> 0x00c0 }
            r2 = 0
            r3 = 1
            r1[r2] = r3     // Catch:{ all -> 0x00c0 }
            r2 = 2
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x00c0 }
            r2 = 2
            r5 = 5
            r1[r2] = r5     // Catch:{ all -> 0x00c0 }
            r2 = 3
            r5 = 10
            r1[r2] = r5     // Catch:{ all -> 0x00c0 }
            r2 = 16
            r5 = 4
            r1[r5] = r2     // Catch:{ all -> 0x00c0 }
            r2 = 0
            r6 = -1
        L_0x003d:
            java.io.File r7 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            if (r7 == 0) goto L_0x004d
            java.io.File r7 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            boolean r7 = r7.exists()     // Catch:{ all -> 0x00c0 }
            if (r7 != 0) goto L_0x005e
        L_0x004d:
            int r6 = r6 + r4
            int r7 = java.lang.Math.min(r6, r5)     // Catch:{ all -> 0x00c0 }
            r7 = r1[r7]     // Catch:{ all -> 0x00c0 }
            android.os.SystemClock.sleep(r7)     // Catch:{ all -> 0x00c0 }
            long r2 = r2 + r7
            r7 = 200(0xc8, double:9.9E-322)
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x003d
        L_0x005e:
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x009e
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x009e
        L_0x006e:
            p040o.HmlNTBPinConsentActivity.IconCompatParcelizer(r9)     // Catch:{ all -> 0x00c0 }
            o.HmlNTBAdditionalDocumentActivity$IconCompatParcelizer r1 = new o.HmlNTBAdditionalDocumentActivity$IconCompatParcelizer     // Catch:{ all -> 0x00c0 }
            r1.<init>(r9)     // Catch:{ all -> 0x00c0 }
            r1.read()     // Catch:{ all -> 0x00c0 }
            java.lang.Object r1 = MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00c0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c0 }
            p040o.HmlNTBPinDisabledActivity_ViewBinding.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00c0 }
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x008d
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ all -> 0x00c0 }
            p040o.HmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver = r1     // Catch:{ all -> 0x00c0 }
            goto L_0x008f
        L_0x008d:
            p040o.HmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver = r9     // Catch:{ all -> 0x00c0 }
        L_0x008f:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c0 }
            java.io.File r9 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = ".realm.temp"
            r1.<init>(r9, r2)     // Catch:{ all -> 0x00c0 }
            p039io.realm.internal.OsSharedRealm.IconCompatParcelizer((java.io.File) r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x00be
        L_0x009e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "Context.getFilesDir() returns "
            r1.append(r2)     // Catch:{ all -> 0x00c0 }
            java.io.File r9 = r9.getFilesDir()     // Catch:{ all -> 0x00c0 }
            r1.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r9 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            r1.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c0 }
            r9.<init>(r1)     // Catch:{ all -> 0x00c0 }
            throw r9     // Catch:{ all -> 0x00c0 }
        L_0x00be:
            monitor-exit(r0)
            return
        L_0x00c0:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver(android.content.Context):void");
    }
}
