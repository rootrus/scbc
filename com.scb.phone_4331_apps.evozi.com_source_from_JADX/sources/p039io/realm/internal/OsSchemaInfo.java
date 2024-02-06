package p039io.realm.internal;

import java.util.Collection;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.OsSchemaInfo */
public class OsSchemaInfo implements HmlNTBMonthlyIncomeAboutActivity {
    private static final long MediaBrowserCompat$ItemReceiver = nativeGetFinalizerPtr();
    public long IconCompatParcelizer;

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    public static native long nativeGetObjectSchemaInfo(long j, String str);

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.IconCompatParcelizer = nativeCreateFromList(MediaBrowserCompat$ItemReceiver(collection));
        new NativeObjectReference(HmlNTBOperatingAccountActivity.write, this, HmlNTBOperatingAccountActivity.read);
    }

    OsSchemaInfo(long j) {
        this.IconCompatParcelizer = j;
    }

    private static long[] MediaBrowserCompat$ItemReceiver(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (OsObjectSchemaInfo osObjectSchemaInfo : collection) {
            jArr[i] = osObjectSchemaInfo.write;
            i++;
        }
        return jArr;
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return MediaBrowserCompat$ItemReceiver;
    }
}
