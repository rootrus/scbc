package p039io.realm.internal;

import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;
import p040o.onButtonClicked;

/* renamed from: io.realm.internal.OsObject */
public class OsObject implements HmlNTBMonthlyIncomeAboutActivity {
    private static final long MediaBrowserCompat$CustomActionResultReceiver = nativeGetFinalizerPtr();
    public onButtonClicked<OsObject$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver = new onButtonClicked<>();
    public final long write;

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateNewObject(long j, long j2);

    private static native long nativeCreateRow(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetObjectIdColumName();

    public native void nativeStartListening(long j);

    public native void nativeStopListening(long j);

    static {
        nativeGetObjectIdColumName();
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.write = nativeCreate(osSharedRealm.read, uncheckedRow.MediaBrowserCompat$ItemReceiver);
        new NativeObjectReference(osSharedRealm.IconCompatParcelizer, this, HmlNTBOperatingAccountActivity.read);
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public final long read() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static UncheckedRow IconCompatParcelizer(Table table) {
        OsSharedRealm osSharedRealm = table.write;
        return new UncheckedRow(osSharedRealm.IconCompatParcelizer, table, nativeCreateNewObject(osSharedRealm.read, table.IconCompatParcelizer));
    }

    public static long write(Table table) {
        return nativeCreateRow(table.write.read, table.IconCompatParcelizer);
    }
}
