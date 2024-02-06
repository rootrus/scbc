package p040o;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p040o.nAllocationGetStride;

/* renamed from: o.RttiJsonBill_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7039x355e6121 implements Executor, nAllocationGetStride.write {
    private final Map write;

    /* renamed from: o.RttiJsonBill_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver$read */
    public enum read {
        SCB,
        DLT
    }

    C7039x355e6121() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public C7039x355e6121(Map map) {
        this.write = map;
    }

    public final Object read(Object obj) {
        Map map = this.write;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C7269xebfa684e(cursor.getString(1), cursor.getString(2), (byte) 0));
        }
        return null;
    }
}
