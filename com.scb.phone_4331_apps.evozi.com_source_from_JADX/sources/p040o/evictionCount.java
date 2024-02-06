package p040o;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.Keep;

/* renamed from: o.evictionCount */
public final class evictionCount {
    private static Map<Class, Integer> IconCompatParcelizer = new HashMap();
    private static Map<Class, List<Constructor<? extends Keep.read>>> MediaBrowserCompat$ItemReceiver = new HashMap();

    static createCount MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj instanceof safeSizeOf) {
            return new FullLifecycleObserverAdapter((safeSizeOf) obj);
        }
        if (obj instanceof createCount) {
            return (createCount) obj;
        }
        Class<?> cls = obj.getClass();
        if (read(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = MediaBrowserCompat$ItemReceiver.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(read((Constructor) list.get(0), obj));
        }
        Keep.read[] readArr = new Keep.read[list.size()];
        for (int i = 0; i < list.size(); i++) {
            readArr[i] = read((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(readArr);
    }

    private static Keep.read read(Constructor<? extends Keep.read> constructor, Object obj) {
        try {
            return (Keep.read) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Constructor<? extends Keep.read> MediaBrowserCompat$CustomActionResultReceiver(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(".", "_"));
            sb.append("_LifecycleAdapter");
            String obj = sb.toString();
            if (!name.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                obj = sb2.toString();
            }
            Constructor<?> declaredConstructor = Class.forName(obj).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static int read(Class<?> cls) {
        if (IconCompatParcelizer.containsKey(cls)) {
            return IconCompatParcelizer.get(cls).intValue();
        }
        int write = write(cls);
        IconCompatParcelizer.put(cls, Integer.valueOf(write));
        return write;
    }

    private static int write(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends Keep.read> MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(cls);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            MediaBrowserCompat$ItemReceiver.put(cls, Collections.singletonList(MediaBrowserCompat$CustomActionResultReceiver));
            return 2;
        } else if (setUseCompatPadding.MediaBrowserCompat$ItemReceiver.write(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (superclass != null && evictAll.class.isAssignableFrom(superclass)) {
                if (read(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(MediaBrowserCompat$ItemReceiver.get(superclass));
            }
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class cls2 = interfaces[i];
                if (cls2 != null && evictAll.class.isAssignableFrom(cls2)) {
                    if (read(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(MediaBrowserCompat$ItemReceiver.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            MediaBrowserCompat$ItemReceiver.put(cls, arrayList);
            return 2;
        }
    }
}
