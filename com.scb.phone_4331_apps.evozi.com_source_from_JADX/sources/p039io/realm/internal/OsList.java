package p039io.realm.internal;

import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;
import p040o.onButtonClicked;

/* renamed from: io.realm.internal.OsList */
public class OsList implements HmlNTBMonthlyIncomeAboutActivity, ObservableCollection {
    private static final long MediaBrowserCompat$CustomActionResultReceiver = nativeGetFinalizerPtr();
    public final long read;

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    public static native long nativeSize(long j);

    public OsList(UncheckedRow uncheckedRow, long j) {
        new onButtonClicked();
        OsSharedRealm osSharedRealm = uncheckedRow.getTable().write;
        long[] nativeCreate = nativeCreate(osSharedRealm.read, uncheckedRow.MediaBrowserCompat$ItemReceiver, j);
        this.read = nativeCreate[0];
        new NativeObjectReference(osSharedRealm.IconCompatParcelizer, this, HmlNTBOperatingAccountActivity.read);
        if (nativeCreate[1] != 0) {
            new Table(osSharedRealm, nativeCreate[1]);
        }
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final long read() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
