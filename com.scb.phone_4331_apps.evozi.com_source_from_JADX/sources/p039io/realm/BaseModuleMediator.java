package p039io.realm;

import io.realm.sync.Subscription;
import io.realm.sync.permissions.ClassPermissions;
import io.realm.sync.permissions.Permission;
import io.realm.sync.permissions.PermissionUser;
import io.realm.sync.permissions.RealmPermissions;
import io.realm.sync.permissions.Role;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p039io.realm.annotations.RealmModule;
import p039io.realm.exceptions.RealmException;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p040o.HmlETBSummaryActivity;
import p040o.HmlLaserIdAboutActivity;
import p040o.HmlNTBCaptureDocumentActivity;
import p040o.HmlNTBCompanyNameActivity;
import p040o.HmlNTBLoanReviewActivity;
import p040o.HmlNTBRepaymentMethodAboutActivity;
import p040o.HmlNTBReviewActivity;
import p040o.HmlNTBSimulatorTutorialActivity;
import p040o.HmlNTBSuccessActivity;
import p040o.HmlNTBVerifyEmailActivity;
import p040o.HmlNTBVerifyEmailSuccessfulActivity;
import p040o.HmlNTBWorkAddressActivity;
import p040o.HmlOTAinfoActivity;

@RealmModule
/* renamed from: io.realm.BaseModuleMediator */
class BaseModuleMediator extends HmlNTBRepaymentMethodAboutActivity {
    private static final Set<Class<? extends HmlNTBCaptureDocumentActivity>> MediaBrowserCompat$ItemReceiver;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return true;
    }

    BaseModuleMediator() {
    }

    static {
        HashSet hashSet = new HashSet(6);
        hashSet.add(PermissionUser.class);
        hashSet.add(RealmPermissions.class);
        hashSet.add(ClassPermissions.class);
        hashSet.add(Permission.class);
        hashSet.add(Role.class);
        hashSet.add(Subscription.class);
        MediaBrowserCompat$ItemReceiver = Collections.unmodifiableSet(hashSet);
    }

    public final Map<Class<? extends HmlNTBCaptureDocumentActivity>, OsObjectSchemaInfo> write() {
        HashMap hashMap = new HashMap(6);
        hashMap.put(PermissionUser.class, io_realm_sync_permissions_PermissionUserRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RealmPermissions.class, io_realm_sync_permissions_RealmPermissionsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ClassPermissions.class, io_realm_sync_permissions_ClassPermissionsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Permission.class, io_realm_sync_permissions_PermissionRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Role.class, io_realm_sync_permissions_RoleRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Subscription.class, io_realm_sync_SubscriptionRealmProxy.getExpectedObjectSchemaInfo());
        return hashMap;
    }

    public final HmlNTBLoanReviewActivity read(Class<? extends HmlNTBCaptureDocumentActivity> cls, OsSchemaInfo osSchemaInfo) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        } else if (cls.equals(PermissionUser.class)) {
            return io_realm_sync_permissions_PermissionUserRealmProxy.createColumnInfo(osSchemaInfo);
        } else {
            if (cls.equals(RealmPermissions.class)) {
                return io_realm_sync_permissions_RealmPermissionsRealmProxy.createColumnInfo(osSchemaInfo);
            }
            if (cls.equals(ClassPermissions.class)) {
                return io_realm_sync_permissions_ClassPermissionsRealmProxy.createColumnInfo(osSchemaInfo);
            }
            if (cls.equals(Permission.class)) {
                return io_realm_sync_permissions_PermissionRealmProxy.createColumnInfo(osSchemaInfo);
            }
            if (cls.equals(Role.class)) {
                return io_realm_sync_permissions_RoleRealmProxy.createColumnInfo(osSchemaInfo);
            }
            if (cls.equals(Subscription.class)) {
                return io_realm_sync_SubscriptionRealmProxy.createColumnInfo(osSchemaInfo);
            }
            throw new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{cls.toString()}));
        }
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        } else if (cls.equals(PermissionUser.class)) {
            return "__User";
        } else {
            if (cls.equals(RealmPermissions.class)) {
                return "__Realm";
            }
            if (cls.equals(ClassPermissions.class)) {
                return "__Class";
            }
            if (cls.equals(Permission.class)) {
                return "__Permission";
            }
            if (cls.equals(Role.class)) {
                return "__Role";
            }
            if (cls.equals(Subscription.class)) {
                return "__ResultSets";
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
            o.HmlEtbConfirmationOtpActivity r5 = (p040o.HmlEtbConfirmationOtpActivity) r5     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ all -> 0x00e9 }
            r0.read = r6     // Catch:{ all -> 0x00e9 }
            r0.IconCompatParcelizer = r7     // Catch:{ all -> 0x00e9 }
            r0.write = r8     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r9     // Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x00e1
            java.lang.Class<io.realm.sync.permissions.PermissionUser> r5 = io.realm.sync.permissions.PermissionUser.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x0036
            io.realm.io_realm_sync_permissions_PermissionUserRealmProxy r5 = new io.realm.io_realm_sync_permissions_PermissionUserRealmProxy     // Catch:{ all -> 0x00e9 }
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x00e9 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x0036:
            java.lang.Class<io.realm.sync.permissions.RealmPermissions> r5 = io.realm.sync.permissions.RealmPermissions.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x0054
            io.realm.io_realm_sync_permissions_RealmPermissionsRealmProxy r5 = new io.realm.io_realm_sync_permissions_RealmPermissionsRealmProxy     // Catch:{ all -> 0x00e9 }
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x00e9 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x0054:
            java.lang.Class<io.realm.sync.permissions.ClassPermissions> r5 = io.realm.sync.permissions.ClassPermissions.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x0072
            io.realm.io_realm_sync_permissions_ClassPermissionsRealmProxy r5 = new io.realm.io_realm_sync_permissions_ClassPermissionsRealmProxy     // Catch:{ all -> 0x00e9 }
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x00e9 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x0072:
            java.lang.Class<io.realm.sync.permissions.Permission> r5 = io.realm.sync.permissions.Permission.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x0090
            io.realm.io_realm_sync_permissions_PermissionRealmProxy r5 = new io.realm.io_realm_sync_permissions_PermissionRealmProxy     // Catch:{ all -> 0x00e9 }
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x00e9 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x0090:
            java.lang.Class<io.realm.sync.permissions.Role> r5 = io.realm.sync.permissions.Role.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x00ae
            io.realm.io_realm_sync_permissions_RoleRealmProxy r5 = new io.realm.io_realm_sync_permissions_RoleRealmProxy     // Catch:{ all -> 0x00e9 }
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x00e9 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x00ae:
            java.lang.Class<io.realm.sync.Subscription> r5 = io.realm.sync.Subscription.class
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x00cc
            io.realm.io_realm_sync_SubscriptionRealmProxy r5 = new io.realm.io_realm_sync_SubscriptionRealmProxy     // Catch:{ all -> 0x00e9 }
            r5.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ all -> 0x00e9 }
            o.HmlNTBCaptureDocumentActivity r4 = (p040o.HmlNTBCaptureDocumentActivity) r4     // Catch:{ all -> 0x00e9 }
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            return r4
        L_0x00cc:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e9 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00e9 }
            r5[r1] = r4     // Catch:{ all -> 0x00e9 }
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException     // Catch:{ all -> 0x00e9 }
            java.lang.String r6 = "'%s' is not part of the schema for this Realm."
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ all -> 0x00e9 }
            r4.<init>(r5)     // Catch:{ all -> 0x00e9 }
            throw r4     // Catch:{ all -> 0x00e9 }
        L_0x00e1:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = "A class extending RealmObject must be provided"
            r4.<init>(r5)     // Catch:{ all -> 0x00e9 }
            throw r4     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r4 = move-exception
            r0.MediaBrowserCompat$ItemReceiver = r2
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.write = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p039io.realm.BaseModuleMediator.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Class, java.lang.Object, io.realm.internal.Row, o.HmlNTBLoanReviewActivity, boolean, java.util.List):o.HmlNTBCaptureDocumentActivity");
    }

    public final Set<Class<? extends HmlNTBCaptureDocumentActivity>> IconCompatParcelizer() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$ItemReceiver(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, E e, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        Class superclass = e instanceof HmlNTBReviewActivity ? e.getClass().getSuperclass() : e.getClass();
        boolean z2 = true;
        if (superclass.equals(PermissionUser.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<PermissionUser> cls = PermissionUser.class;
            if (hmlNTBCompanyNameActivity.write == null) {
                z2 = false;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(io_realm_sync_permissions_PermissionUserRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (HmlOTAinfoActivity) hmlNTBCompanyNameActivity.write.MediaBrowserCompat$ItemReceiver(cls), (PermissionUser) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else if (superclass.equals(RealmPermissions.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity2 = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<RealmPermissions> cls2 = RealmPermissions.class;
            if (hmlNTBCompanyNameActivity2.write == null) {
                z2 = false;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(io_realm_sync_permissions_RealmPermissionsRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (HmlNTBWorkAddressActivity) hmlNTBCompanyNameActivity2.write.MediaBrowserCompat$ItemReceiver(cls2), (RealmPermissions) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else if (superclass.equals(ClassPermissions.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity3 = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<ClassPermissions> cls3 = ClassPermissions.class;
            if (hmlNTBCompanyNameActivity3.write == null) {
                z2 = false;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(io_realm_sync_permissions_ClassPermissionsRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (HmlNTBSimulatorTutorialActivity) hmlNTBCompanyNameActivity3.write.MediaBrowserCompat$ItemReceiver(cls3), (ClassPermissions) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else if (superclass.equals(Permission.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity4 = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<Permission> cls4 = Permission.class;
            if (hmlNTBCompanyNameActivity4.write == null) {
                z2 = false;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(io_realm_sync_permissions_PermissionRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (HmlNTBSuccessActivity) hmlNTBCompanyNameActivity4.write.MediaBrowserCompat$ItemReceiver(cls4), (Permission) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else if (superclass.equals(Role.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity5 = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<Role> cls5 = Role.class;
            if (hmlNTBCompanyNameActivity5.write == null) {
                z2 = false;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(io_realm_sync_permissions_RoleRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (HmlNTBVerifyEmailSuccessfulActivity) hmlNTBCompanyNameActivity5.write.MediaBrowserCompat$ItemReceiver(cls5), (Role) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else if (superclass.equals(Subscription.class)) {
            HmlNTBCompanyNameActivity hmlNTBCompanyNameActivity6 = hmlLaserIdAboutActivity.MediaMetadataCompat;
            Class<Subscription> cls6 = Subscription.class;
            if (hmlNTBCompanyNameActivity6.write == null) {
                z2 = false;
            }
            if (z2) {
                return (HmlNTBCaptureDocumentActivity) superclass.cast(io_realm_sync_SubscriptionRealmProxy.copyOrUpdate(hmlLaserIdAboutActivity, (HmlNTBVerifyEmailActivity) hmlNTBCompanyNameActivity6.write.MediaBrowserCompat$ItemReceiver(cls6), (Subscription) e, z, map, set));
            }
            throw new IllegalStateException("Attempt to use column index before set.");
        } else {
            throw new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{superclass.toString()}));
        }
    }
}
