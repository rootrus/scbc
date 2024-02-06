package p040o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.onCanceled */
public final class onCanceled {
    private final Map<String, List<write<?, ?>>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private final List<String> write = new ArrayList();

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<String> list) {
        synchronized (this) {
            ArrayList<String> arrayList = new ArrayList<>(this.write);
            this.write.clear();
            this.write.addAll(list);
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.write.add(str);
                }
            }
        }
    }

    public final <T, R> List<isVisible<T, R>> read(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (String str : this.write) {
                List<write> list = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
                if (list != null) {
                    for (write write2 : list) {
                        if (write2.IconCompatParcelizer(cls, cls2)) {
                            arrayList.add(write2.IconCompatParcelizer);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final <T, R> List<Class<R>> MediaBrowserCompat$ItemReceiver(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (String str : this.write) {
                List<write> list = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
                if (list != null) {
                    for (write write2 : list) {
                        if (write2.IconCompatParcelizer(cls, cls2) && !arrayList.contains(write2.read)) {
                            arrayList.add(write2.read);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final <T, R> void read(String str, isVisible<T, R> isvisible, Class<T> cls, Class<R> cls2) {
        synchronized (this) {
            IconCompatParcelizer(str).add(new write(cls, cls2, isvisible));
        }
    }

    private List<write<?, ?>> IconCompatParcelizer(String str) {
        List<write<?, ?>> list;
        synchronized (this) {
            if (!this.write.contains(str)) {
                this.write.add(str);
            }
            list = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.MediaBrowserCompat$CustomActionResultReceiver.put(str, list);
            }
        }
        return list;
    }

    /* renamed from: o.onCanceled$write */
    static class write<T, R> {
        final isVisible<T, R> IconCompatParcelizer;
        final Class<R> read;
        private final Class<T> write;

        public write(Class<T> cls, Class<R> cls2, isVisible<T, R> isvisible) {
            this.write = cls;
            this.read = cls2;
            this.IconCompatParcelizer = isvisible;
        }

        public final boolean IconCompatParcelizer(Class<?> cls, Class<?> cls2) {
            return this.write.isAssignableFrom(cls) && cls2.isAssignableFrom(this.read);
        }
    }
}
