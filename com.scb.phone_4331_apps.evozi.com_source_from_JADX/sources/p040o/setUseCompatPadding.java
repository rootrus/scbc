package p040o;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p040o.entryRemoved;

/* renamed from: o.setUseCompatPadding */
public final class setUseCompatPadding {
    public static setUseCompatPadding MediaBrowserCompat$ItemReceiver = new setUseCompatPadding();
    private final Map<Class, C1568x428b6b77> read = new HashMap();
    private final Map<Class, Boolean> write = new HashMap();

    setUseCompatPadding() {
    }

    /* access modifiers changed from: package-private */
    public final boolean write(Class cls) {
        if (this.write.containsKey(cls)) {
            return this.write.get(cls).booleanValue();
        }
        Method[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(cls);
        for (Method annotation : MediaBrowserCompat$ItemReceiver2) {
            if (((put) annotation.getAnnotation(put.class)) != null) {
                MediaBrowserCompat$CustomActionResultReceiver(cls, MediaBrowserCompat$ItemReceiver2);
                return true;
            }
        }
        this.write.put(cls, Boolean.FALSE);
        return false;
    }

    private static Method[] MediaBrowserCompat$ItemReceiver(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public final C1568x428b6b77 read(Class cls) {
        C1568x428b6b77 setusecompatpadding_mediabrowsercompat_customactionresultreceiver = this.read.get(cls);
        if (setusecompatpadding_mediabrowsercompat_customactionresultreceiver != null) {
            return setusecompatpadding_mediabrowsercompat_customactionresultreceiver;
        }
        return MediaBrowserCompat$CustomActionResultReceiver(cls, (Method[]) null);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Map<IconCompatParcelizer, entryRemoved.write> map, IconCompatParcelizer iconCompatParcelizer, entryRemoved.write write2, Class cls) {
        entryRemoved.write write3 = map.get(iconCompatParcelizer);
        if (write3 != null && write2 != write3) {
            Method method = iconCompatParcelizer.read;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous");
            sb.append(" value ");
            sb.append(write3);
            sb.append(", new value ");
            sb.append(write2);
            throw new IllegalArgumentException(sb.toString());
        } else if (write3 == null) {
            map.put(iconCompatParcelizer, write2);
        }
    }

    private C1568x428b6b77 MediaBrowserCompat$CustomActionResultReceiver(Class cls, Method[] methodArr) {
        int i;
        C1568x428b6b77 read2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (read2 = read(superclass)) == null)) {
            hashMap.putAll(read2.IconCompatParcelizer);
        }
        for (Class read3 : cls.getInterfaces()) {
            for (Map.Entry next : read(read3).IconCompatParcelizer.entrySet()) {
                MediaBrowserCompat$CustomActionResultReceiver(hashMap, (IconCompatParcelizer) next.getKey(), (entryRemoved.write) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = MediaBrowserCompat$ItemReceiver(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            put put = (put) method.getAnnotation(put.class);
            if (put != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(maxSize.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                entryRemoved.write read4 = put.read();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(entryRemoved.write.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (read4 == entryRemoved.write.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    MediaBrowserCompat$CustomActionResultReceiver(hashMap, new IconCompatParcelizer(i, method), read4, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1568x428b6b77 setusecompatpadding_mediabrowsercompat_customactionresultreceiver = new C1568x428b6b77(hashMap);
        this.read.put(cls, setusecompatpadding_mediabrowsercompat_customactionresultreceiver);
        this.write.put(cls, Boolean.valueOf(z));
        return setusecompatpadding_mediabrowsercompat_customactionresultreceiver;
    }

    /* renamed from: o.setUseCompatPadding$IconCompatParcelizer */
    static class IconCompatParcelizer {
        final int MediaBrowserCompat$CustomActionResultReceiver;
        final Method read;

        IconCompatParcelizer(int i, Method method) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.read = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            if (this.MediaBrowserCompat$CustomActionResultReceiver != iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver || !this.read.getName().equals(iconCompatParcelizer.read.getName())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.MediaBrowserCompat$CustomActionResultReceiver * 31) + this.read.getName().hashCode();
        }
    }
}
