package p039io.realm.internal.objectstore;

import java.io.Closeable;
import java.util.Set;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.Table;
import p039io.realm.internal.UncheckedRow;
import p040o.HmlETBSummaryActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.objectstore.OsObjectBuilder */
public class OsObjectBuilder implements Closeable {
    private final HmlNTBOperatingAccountActivity IconCompatParcelizer;
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    public final long MediaBrowserCompat$ItemReceiver;
    private final Table read;
    private final long write;

    public static native void nativeAddNull(long j, long j2);

    public static native void nativeAddString(long j, long j2, String str);

    private static native long nativeCreateBuilder(long j);

    private static native long nativeCreateOrUpdate(long j, long j2, long j3, boolean z, boolean z2);

    private static native void nativeDestroyBuilder(long j);

    public OsObjectBuilder(Table table, long j, Set<HmlETBSummaryActivity> set) {
        OsSharedRealm osSharedRealm = table.write;
        this.write = osSharedRealm.read;
        this.read = table;
        this.MediaBrowserCompat$CustomActionResultReceiver = table.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = nativeCreateBuilder(j + 1);
        this.IconCompatParcelizer = osSharedRealm.IconCompatParcelizer;
        set.contains(HmlETBSummaryActivity.CHECK_SAME_VALUES_BEFORE_SET);
    }

    public final UncheckedRow MediaBrowserCompat$ItemReceiver() {
        try {
            return new UncheckedRow(this.IconCompatParcelizer, this.read, nativeCreateOrUpdate(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, false, false));
        } finally {
            close();
        }
    }

    public void close() {
        nativeDestroyBuilder(this.MediaBrowserCompat$ItemReceiver);
    }
}
