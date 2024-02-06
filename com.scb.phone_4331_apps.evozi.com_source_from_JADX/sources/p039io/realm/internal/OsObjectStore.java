package p039io.realm.internal;

import p040o.HmlNTBAdditionalDocumentActivity;

/* renamed from: io.realm.internal.OsObjectStore */
public class OsObjectStore {
    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native String nativeGetPrimaryKeyForObject(long j, String str);

    private static native long nativeGetSchemaVersion(long j);

    private static native void nativeSetSchemaVersion(long j, long j2);

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, Runnable runnable) {
        return nativeCallWithLock(hmlNTBAdditionalDocumentActivity.IconCompatParcelizer, runnable);
    }

    public static String MediaBrowserCompat$ItemReceiver(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.read, str);
    }

    public static long MediaBrowserCompat$CustomActionResultReceiver(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.read);
    }

    public static void write(OsSharedRealm osSharedRealm) {
        nativeSetSchemaVersion(osSharedRealm.read, -1);
    }
}
