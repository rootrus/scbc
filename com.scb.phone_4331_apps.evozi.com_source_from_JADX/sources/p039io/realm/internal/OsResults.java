package p039io.realm.internal;

import java.util.Iterator;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;
import p040o.onButtonClicked;

/* renamed from: io.realm.internal.OsResults */
public class OsResults implements HmlNTBMonthlyIncomeAboutActivity, ObservableCollection {
    private static final long write = nativeGetFinalizerPtr();
    public final Table IconCompatParcelizer;
    public final long MediaBrowserCompat$CustomActionResultReceiver;
    public final OsSharedRealm MediaBrowserCompat$ItemReceiver;
    public boolean read = false;

    /* renamed from: io.realm.internal.OsResults$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer<T> implements Iterator<T> {
        public OsResults read;
    }

    public static native long nativeCreateSnapshot(long j);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    /* renamed from: io.realm.internal.OsResults$write */
    public enum write {
        EMPTY,
        TABLE,
        QUERY,
        LINKVIEW,
        TABLEVIEW;

        static write read(byte b) {
            if (b == 0) {
                return EMPTY;
            }
            if (b == 1) {
                return TABLE;
            }
            if (b == 2) {
                return QUERY;
            }
            if (b == 3) {
                return LINKVIEW;
            }
            if (b == 4) {
                return TABLEVIEW;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid value: ");
            sb.append(b);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        new onButtonClicked();
        this.MediaBrowserCompat$ItemReceiver = osSharedRealm;
        HmlNTBOperatingAccountActivity hmlNTBOperatingAccountActivity = osSharedRealm.IconCompatParcelizer;
        this.IconCompatParcelizer = table;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        new NativeObjectReference(hmlNTBOperatingAccountActivity, this, HmlNTBOperatingAccountActivity.read);
        write.read(nativeGetMode(this.MediaBrowserCompat$CustomActionResultReceiver));
        write write2 = write.QUERY;
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final long read() {
        return write;
    }
}
