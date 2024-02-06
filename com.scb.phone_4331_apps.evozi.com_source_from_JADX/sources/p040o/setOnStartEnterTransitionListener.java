package p040o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.setOnCloseListener;

/* renamed from: o.setOnStartEnterTransitionListener */
public final class setOnStartEnterTransitionListener {
    public final read MediaBrowserCompat$ItemReceiver;
    public final shouldShowRequestPermissionRationale write;

    public setOnStartEnterTransitionListener(setOnCloseListener.read<List<Throwable>> read2) {
        this(new shouldShowRequestPermissionRationale(read2));
    }

    private setOnStartEnterTransitionListener(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        this.MediaBrowserCompat$ItemReceiver = new read();
        this.write = shouldshowrequestpermissionrationale;
    }

    public final List<Class<?>> read(Class<?> cls) {
        List<Class<?>> write2;
        synchronized (this) {
            write2 = this.write.write(cls);
        }
        return write2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<A>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A> java.util.List<p040o.setSharedElementEnterTransition<A, ?>> IconCompatParcelizer(java.lang.Class<A> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            o.setOnStartEnterTransitionListener$read r0 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.Class<?>, o.setOnStartEnterTransitionListener$read$write<?>> r0 = r0.read     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0048 }
            o.setOnStartEnterTransitionListener$read$write r0 = (p040o.setOnStartEnterTransitionListener.read.write) r0     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0011
        L_0x000f:
            java.util.List<o.setSharedElementEnterTransition<Model, ?>> r0 = r0.read     // Catch:{ all -> 0x0048 }
        L_0x0011:
            if (r0 != 0) goto L_0x0046
            o.shouldShowRequestPermissionRationale r0 = r3.write     // Catch:{ all -> 0x0048 }
            java.util.List r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ all -> 0x0048 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0048 }
            o.setOnStartEnterTransitionListener$read r1 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.Class<?>, o.setOnStartEnterTransitionListener$read$write<?>> r1 = r1.read     // Catch:{ all -> 0x0048 }
            o.setOnStartEnterTransitionListener$read$write r2 = new o.setOnStartEnterTransitionListener$read$write     // Catch:{ all -> 0x0048 }
            r2.<init>(r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r1.put(r4, r2)     // Catch:{ all -> 0x0048 }
            o.setOnStartEnterTransitionListener$read$write r1 = (p040o.setOnStartEnterTransitionListener.read.write) r1     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "Already cached loaders for model: "
            r0.append(r1)     // Catch:{ all -> 0x0048 }
            r0.append(r4)     // Catch:{ all -> 0x0048 }
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0048 }
            r4.<init>(r0)     // Catch:{ all -> 0x0048 }
            throw r4     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r3)
            return r0
        L_0x0048:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setOnStartEnterTransitionListener.IconCompatParcelizer(java.lang.Class):java.util.List");
    }

    /* renamed from: o.setOnStartEnterTransitionListener$read */
    public static class read {
        public final Map<Class<?>, write<?>> read = new HashMap();

        read() {
        }

        /* renamed from: o.setOnStartEnterTransitionListener$read$write */
        static class write<Model> {
            final List<setSharedElementEnterTransition<Model, ?>> read;

            public write(List<setSharedElementEnterTransition<Model, ?>> list) {
                this.read = list;
            }
        }
    }
}
