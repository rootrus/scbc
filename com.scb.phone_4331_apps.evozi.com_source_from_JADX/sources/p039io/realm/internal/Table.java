package p039io.realm.internal;

import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.Table */
public class Table implements HmlNTBMonthlyIncomeAboutActivity {
    private static final long MediaBrowserCompat$CustomActionResultReceiver = nativeGetFinalizerPtr();
    private static final String read = Util.read();
    public final long IconCompatParcelizer;
    public final OsSharedRealm write;

    private native long nativeGetColumnCount(long j);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeMigratePrimaryKeyTableIfNeeded(long j);

    public static native void nativeSetNull(long j, long j2, long j3, boolean z);

    public static native void nativeSetString(long j, long j2, long j3, String str, boolean z);

    private native long nativeSize(long j);

    /* access modifiers changed from: package-private */
    public native String nativeGetColumnName(long j, long j2);

    public native long nativeGetLinkTarget(long j, long j2);

    public native String nativeGetName(long j);

    public native boolean nativeIsValid(long j);

    public native void nativeMoveLastOver(long j, long j2);

    public Table(OsSharedRealm osSharedRealm, long j) {
        HmlNTBOperatingAccountActivity hmlNTBOperatingAccountActivity = osSharedRealm.IconCompatParcelizer;
        this.write = osSharedRealm;
        this.IconCompatParcelizer = j;
        new NativeObjectReference(hmlNTBOperatingAccountActivity, this, HmlNTBOperatingAccountActivity.read);
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(long j, long j2, String str) {
        IconCompatParcelizer();
        if (str == null) {
            nativeSetNull(this.IconCompatParcelizer, j, j2, true);
        } else {
            nativeSetString(this.IconCompatParcelizer, j, j2, str, true);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    public static String MediaBrowserCompat$ItemReceiver(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(read)) {
            return str;
        }
        return str.substring(read.length());
    }

    public static String write(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(read);
        sb.append(str);
        return sb.toString();
    }

    public static void write(OsSharedRealm osSharedRealm) {
        nativeMigratePrimaryKeyTableIfNeeded(osSharedRealm.read);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        OsSharedRealm osSharedRealm = this.write;
        if (osSharedRealm != null && !OsSharedRealm.nativeIsInTransaction(osSharedRealm.read)) {
            throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
        }
    }

    public String toString() {
        long nativeGetColumnCount = nativeGetColumnCount(this.IconCompatParcelizer);
        String nativeGetName = nativeGetName(this.IconCompatParcelizer);
        StringBuilder sb = new StringBuilder("The Table ");
        if (nativeGetName != null && !nativeGetName.isEmpty()) {
            sb.append(nativeGetName(this.IconCompatParcelizer));
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(nativeGetColumnCount);
        sb.append(" columns: ");
        int i = 0;
        while (true) {
            long j = (long) i;
            if (j < nativeGetColumnCount) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(nativeGetColumnName(this.IconCompatParcelizer, j));
                i++;
            } else {
                sb.append(".");
                sb.append(" And ");
                sb.append(nativeSize(this.IconCompatParcelizer));
                sb.append(" rows.");
                return sb.toString();
            }
        }
    }
}
