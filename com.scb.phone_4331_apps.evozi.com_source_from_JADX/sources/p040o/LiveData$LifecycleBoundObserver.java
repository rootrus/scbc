package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.LiveData$LifecycleBoundObserver */
public final class LiveData$LifecycleBoundObserver {
    private final List<write<?, ?>> write = new ArrayList();

    public final <Z, R> void IconCompatParcelizer(Class<Z> cls, Class<R> cls2, ReflectiveGenericLifecycleObserver<Z, R> reflectiveGenericLifecycleObserver) {
        synchronized (this) {
            this.write.add(new write(cls, cls2, reflectiveGenericLifecycleObserver));
        }
    }

    public final <Z, R> ReflectiveGenericLifecycleObserver<Z, R> write(Class<Z> cls, Class<R> cls2) {
        boolean z;
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                ReflectiveGenericLifecycleObserver<Z, R> read = ReportFragment.read();
                return read;
            }
            for (write next : this.write) {
                if (!next.MediaBrowserCompat$CustomActionResultReceiver.isAssignableFrom(cls) || !cls2.isAssignableFrom(next.read)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    ReflectiveGenericLifecycleObserver<Z, R> reflectiveGenericLifecycleObserver = next.write;
                    return reflectiveGenericLifecycleObserver;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No transcoder registered to transcode from ");
            sb.append(cls);
            sb.append(" to ");
            sb.append(cls2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final <Z, R> List<Class<R>> read(Class<Z> cls, Class<R> cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (write next : this.write) {
                if (next.MediaBrowserCompat$CustomActionResultReceiver.isAssignableFrom(cls) && cls2.isAssignableFrom(next.read)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: o.LiveData$LifecycleBoundObserver$write */
    static final class write<Z, R> {
        final Class<Z> MediaBrowserCompat$CustomActionResultReceiver;
        final Class<R> read;
        final ReflectiveGenericLifecycleObserver<Z, R> write;

        write(Class<Z> cls, Class<R> cls2, ReflectiveGenericLifecycleObserver<Z, R> reflectiveGenericLifecycleObserver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = cls;
            this.read = cls2;
            this.write = reflectiveGenericLifecycleObserver;
        }
    }
}
