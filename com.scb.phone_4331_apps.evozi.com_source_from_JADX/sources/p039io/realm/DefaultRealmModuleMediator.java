package p039io.realm;

import com.scb.phone.data.entity.billpayment.RealmString;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p039io.realm.annotations.RealmModule;
import p039io.realm.exceptions.RealmException;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p040o.C6890x2027e421;
import p040o.HmlETBSummaryActivity;
import p040o.HmlLaserIdAboutActivity;
import p040o.HmlNTBCaptureDocumentActivity;
import p040o.HmlNTBCompanyNameActivity;
import p040o.HmlNTBConsentActivity;
import p040o.HmlNTBLoanReviewActivity;
import p040o.HmlNTBRepaymentMethodAboutActivity;
import p040o.HmlNTBReviewActivity;
import p040o.setOnPageChangeListener;

@RealmModule
/* renamed from: io.realm.DefaultRealmModuleMediator */
class DefaultRealmModuleMediator extends HmlNTBRepaymentMethodAboutActivity {
    private static final Set<Class<? extends HmlNTBCaptureDocumentActivity>> MediaBrowserCompat$ItemReceiver;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return true;
    }

    DefaultRealmModuleMediator() {
    }

    static {
        HashSet hashSet = new HashSet(2);
        hashSet.add(RealmString.class);
        hashSet.add(setOnPageChangeListener.class);
        MediaBrowserCompat$ItemReceiver = Collections.unmodifiableSet(hashSet);
    }

    public final Map<Class<? extends HmlNTBCaptureDocumentActivity>, OsObjectSchemaInfo> write() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(RealmString.class, com_scb_phone_data_entity_billpayment_RealmStringRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(setOnPageChangeListener.class, HmlNTBConsentActivity.MediaDescriptionCompat());
        return hashMap;
    }

    public final HmlNTBLoanReviewActivity read(Class<? extends HmlNTBCaptureDocumentActivity> cls, OsSchemaInfo osSchemaInfo) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        } else if (cls.equals(RealmString.class)) {
            return com_scb_phone_data_entity_billpayment_RealmStringRealmProxy.createColumnInfo(osSchemaInfo);
        } else {
            if (cls.equals(setOnPageChangeListener.class)) {
                return HmlNTBConsentActivity.write(osSchemaInfo);
            }
            throw new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{cls.toString()}));
        }
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        } else if (cls.equals(RealmString.class)) {
            return "RealmString";
        } else {
            if (cls.equals(setOnPageChangeListener.class)) {
                return "CodeDescriptionEntity";
            }
            throw new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{cls.toString()}));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v0, types: [o.HmlNTBLoanReviewActivity, io.realm.internal.Row, o.HmlEtbConfirmationOtpActivity, java.util.List<java.lang.String>] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r8v0, types: [boolean] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=io.realm.internal.Row, code=o.HmlEtbConfirmationOtpActivity, for r6v0, types: [io.realm.internal.Row] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List<java.lang.String>, code=o.HmlEtbConfirmationOtpActivity, for r9v0, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=o.HmlNTBLoanReviewActivity, code=o.HmlEtbConfirmationOtpActivity, for r7v0, types: [o.HmlNTBLoanReviewActivity] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends p040o.HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$CustomActionResultReceiver(java.lang.Class<E> r4, java.lang.Object r5, p040o.HmlEtbConfirmationOtpActivity r6, p040o.HmlEtbConfirmationOtpActivity r6, boolean r8, p040o.HmlEtbConfirmationOtpActivity r6) {
        /*
            r3 = this;
            o.HmlEtbConfirmationOtpActivity$IconCompatParcelizer r0 = p040o.HmlEtbConfirmationOtpActivity.read
            java.lang.Object r0 = r0.get()
            o.HmlEtbConfirmationOtpActivity$write r0 = (p040o.HmlEtbConfirmationOtpActivity.write) r0
            r1 = 0
            r2 = 0
            o.HmlEtbConfirmationOtpActivity r5 = (p040o.HmlEtbConfirmationOtpActivity) r5     // Catch:{ all -> 0x0071 }
            r0.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ all -> 0x0071 }
            r0.read = r6     // Catch:{ all -> 0x0071 }
            r0.IconCompatParcelizer = r7     // Catch:{ all -> 0x0071 }
            r0.write = r8     // Catch:{ all -> 0x0071 }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r9     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0069
            java.lang.Class<com.scb.phone.data.entity.billpayment.RealmString> r5 = com.scb.phone.data.entity.billpayment.RealmString.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0071 }
            if (r5 == 0) goto L_0x0036
            io.realm.com_scb_phone_data_entity_billpayment_RealmStringRealmProxy r5 = new io.realm.com_scb_phone_data_entity_billpayment_RealmStringRealmProxy     // Catch:{ all -> 0x0071 }
            r5.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x0071 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x0071 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x0036:
            java.lang.Class<o.setOnPageChangeListener> r5 = p040o.setOnPageChangeListener.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0071 }
            if (r5 == 0) goto L_0x0054
            o.HmlNTBConsentActivity r5 = new o.HmlNTBConsentActivity     // Catch:{ all -> 0x0071 }
            r5.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x0071 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x0071 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x0054:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0071 }
            r5[r1] = r4     // Catch:{ all -> 0x0071 }
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = "'%s' is not part of the schema for this Realm."
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ all -> 0x0071 }
            r4.<init>(r5)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0069:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = "A class extending RealmObject must be provided"
            r4.<init>(r5)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p039io.realm.DefaultRealmModuleMediator.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Class, java.lang.Object, io.realm.internal.Row, o.HmlNTBLoanReviewActivity, boolean, java.util.List):o.HmlNTBCaptureDocumentActivity");
    }

    public final Set<Class<? extends HmlNTBCaptureDocumentActivity>> IconCompatParcelizer() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$ItemReceiver(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, E e, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        Class superclass = e instanceof HmlNTBReviewActivity ? e.getClass().getSuperclass() : e.getClass();
        boolean z2 = false;
        if (superclass.equals(RealmString.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<RealmString> cls = RealmString.class;
            if (hmlNTBCompanyNameActivity.write != null) {
                z2 = true;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(com_scb_phone_data_entity_billpayment_RealmStringRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (C9654xbbda94b8) hmlNTBCompanyNameActivity.write.MediaBrowserCompat$ItemReceiver(cls), (RealmString) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else if (superclass.equals(setOnPageChangeListener.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity2 = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<setOnPageChangeListener> cls2 = setOnPageChangeListener.class;
            if (hmlNTBCompanyNameActivity2.write != null) {
                z2 = true;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(HmlNTBConsentActivity.read(hmlLaserIdAboutActivity, (C6890x2027e421) hmlNTBCompanyNameActivity2.write.MediaBrowserCompat$ItemReceiver(cls2), (setOnPageChangeListener) e, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else {
            throw new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{superclass.toString()}));
        }
    }
}
