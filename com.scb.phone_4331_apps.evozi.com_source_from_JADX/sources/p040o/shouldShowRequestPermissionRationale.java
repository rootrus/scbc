package p040o;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p040o.setOnCloseListener;

/* renamed from: o.shouldShowRequestPermissionRationale */
public final class shouldShowRequestPermissionRationale {
    private static final setSharedElementEnterTransition<Object, Object> MediaBrowserCompat$CustomActionResultReceiver = new C1585xf7559916();
    private static final C1586xf2525665 write = new C1586xf2525665();
    public final List<write<?, ?>> IconCompatParcelizer;
    private final Set<write<?, ?>> MediaBrowserCompat$ItemReceiver;
    private final setOnCloseListener.read<List<Throwable>> read;

    public shouldShowRequestPermissionRationale(setOnCloseListener.read<List<Throwable>> read2) {
        this(read2, write);
    }

    private shouldShowRequestPermissionRationale(setOnCloseListener.read<List<Throwable>> read2, C1586xf2525665 shouldshowrequestpermissionrationale_mediabrowsercompat_itemreceiver) {
        this.IconCompatParcelizer = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = new HashSet();
        this.read = read2;
    }

    /* access modifiers changed from: package-private */
    public final <Model> List<setSharedElementEnterTransition<Model, ?>> MediaBrowserCompat$CustomActionResultReceiver(Class<Model> cls) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (write next : this.IconCompatParcelizer) {
                    if (!this.MediaBrowserCompat$ItemReceiver.contains(next)) {
                        if (next.MediaBrowserCompat$CustomActionResultReceiver.isAssignableFrom(cls)) {
                            this.MediaBrowserCompat$ItemReceiver.add(next);
                            arrayList.add(IconCompatParcelizer(next));
                            this.MediaBrowserCompat$ItemReceiver.remove(next);
                        }
                    }
                }
            } catch (Throwable th) {
                this.MediaBrowserCompat$ItemReceiver.clear();
                throw th;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List<Class<?>> write(Class<?> cls) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (write next : this.IconCompatParcelizer) {
                if (!arrayList.contains(next.IconCompatParcelizer) && next.MediaBrowserCompat$CustomActionResultReceiver.isAssignableFrom(cls)) {
                    arrayList.add(next.IconCompatParcelizer);
                }
            }
        }
        return arrayList;
    }

    public final <Model, Data> setSharedElementEnterTransition<Model, Data> read(Class<Model> cls, Class<Data> cls2) {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (write next : this.IconCompatParcelizer) {
                    if (this.MediaBrowserCompat$ItemReceiver.contains(next)) {
                        z = true;
                    } else {
                        if (next.MediaBrowserCompat$CustomActionResultReceiver.isAssignableFrom(cls) && next.IconCompatParcelizer.isAssignableFrom(cls2)) {
                            this.MediaBrowserCompat$ItemReceiver.add(next);
                            arrayList.add(IconCompatParcelizer(next));
                            this.MediaBrowserCompat$ItemReceiver.remove(next);
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    setReturnTransition setreturntransition = new setReturnTransition(arrayList, this.read);
                    return setreturntransition;
                } else if (arrayList.size() == 1) {
                    setSharedElementEnterTransition<Model, Data> setsharedelemententertransition = (setSharedElementEnterTransition) arrayList.get(0);
                    return setsharedelemententertransition;
                } else if (z) {
                    setSharedElementEnterTransition<Object, Object> setsharedelemententertransition2 = MediaBrowserCompat$CustomActionResultReceiver;
                    return setsharedelemententertransition2;
                } else {
                    throw new Registry.NoModelLoaderAvailableException(cls, cls2);
                }
            } catch (Throwable th) {
                this.MediaBrowserCompat$ItemReceiver.clear();
                throw th;
            }
        }
    }

    private <Model, Data> setSharedElementEnterTransition<Model, Data> IconCompatParcelizer(write<?, ?> write2) {
        setSharedElementEnterTransition<? extends Model, ? extends Data> MediaBrowserCompat$CustomActionResultReceiver2 = write2.read.MediaBrowserCompat$CustomActionResultReceiver(this);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* renamed from: o.shouldShowRequestPermissionRationale$write */
    public static class write<Model, Data> {
        final Class<Data> IconCompatParcelizer;
        final Class<Model> MediaBrowserCompat$CustomActionResultReceiver;
        final setReenterTransition<? extends Model, ? extends Data> read;

        public write(Class<Model> cls, Class<Data> cls2, setReenterTransition<? extends Model, ? extends Data> setreentertransition) {
            this.MediaBrowserCompat$CustomActionResultReceiver = cls;
            this.IconCompatParcelizer = cls2;
            this.read = setreentertransition;
        }
    }
}
