package p040o;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.rsnAllocationData3D */
public final class rsnAllocationData3D {
    private static final ConcurrentMap<Class<?>, rsnAllocationData3D> IconCompatParcelizer = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, rsnAllocationData3D> write = new ConcurrentHashMap();
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final IdentityHashMap<String, rsnAllocationData2D> MediaBrowserCompat$ItemReceiver = new IdentityHashMap<>();
    final boolean read;

    public static rsnAllocationData3D MediaBrowserCompat$ItemReceiver(Class<?> cls) {
        return IconCompatParcelizer(cls, false);
    }

    public static rsnAllocationData3D IconCompatParcelizer(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, rsnAllocationData3D> concurrentMap = z ? IconCompatParcelizer : write;
        rsnAllocationData3D rsnallocationdata3d = (rsnAllocationData3D) concurrentMap.get(cls);
        if (rsnallocationdata3d != null) {
            return rsnallocationdata3d;
        }
        rsnAllocationData3D rsnallocationdata3d2 = new rsnAllocationData3D(cls, z);
        rsnAllocationData3D putIfAbsent = concurrentMap.putIfAbsent(cls, rsnallocationdata3d2);
        return putIfAbsent != null ? putIfAbsent : rsnallocationdata3d2;
    }

    public final rsnAllocationData2D read(String str) {
        if (str != null) {
            if (this.read) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.MediaBrowserCompat$ItemReceiver.get(str);
    }

    private rsnAllocationData3D(Class<?> cls, boolean z) {
        List<String> list;
        this.read = z;
        boolean z2 = !z || !cls.isEnum();
        StringBuilder sb = new StringBuilder();
        sb.append("cannot ignore case on an enum: ");
        sb.append(cls);
        Preconditions.checkArgument(z2, sb.toString());
        TreeSet treeSet = new TreeSet(new Comparator<String>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (Objects.equal(str, str2)) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field : cls.getDeclaredFields()) {
            rsnAllocationData2D read2 = rsnAllocationData2D.read(field);
            if (read2 != null) {
                String str = read2.read;
                str = z ? str.toLowerCase(Locale.US).intern() : str;
                rsnAllocationData2D rsnallocationdata2d = this.MediaBrowserCompat$ItemReceiver.get(str);
                boolean z3 = rsnallocationdata2d == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = str;
                objArr[2] = field;
                objArr[3] = rsnallocationdata2d == null ? null : rsnallocationdata2d.MediaBrowserCompat$ItemReceiver;
                Preconditions.checkArgument(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.MediaBrowserCompat$ItemReceiver.put(str, read2);
                treeSet.add(str);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            rsnAllocationData3D IconCompatParcelizer2 = IconCompatParcelizer(superclass, z);
            treeSet.addAll(IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
            for (Map.Entry next : IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.entrySet()) {
                String str2 = (String) next.getKey();
                if (!this.MediaBrowserCompat$ItemReceiver.containsKey(str2)) {
                    this.MediaBrowserCompat$ItemReceiver.put(str2, next.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
