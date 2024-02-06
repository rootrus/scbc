package p040o;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.rsnAllocationRead */
public class rsnAllocationRead {
    public static <T> T read(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw write(e, cls);
        } catch (InstantiationException e2) {
            throw write(e2, cls);
        }
    }

    private static IllegalArgumentException write(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static <T> Iterable<T> read(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        Preconditions.checkArgument(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int MediaBrowserCompat$CustomActionResultReceiver = 0;
                    private int MediaBrowserCompat$ItemReceiver = Array.getLength(obj);

                    public final boolean hasNext() {
                        return this.MediaBrowserCompat$CustomActionResultReceiver < this.MediaBrowserCompat$ItemReceiver;
                    }

                    public final T next() {
                        if (hasNext()) {
                            Object obj = obj;
                            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
                            this.MediaBrowserCompat$CustomActionResultReceiver = i + 1;
                            return Array.get(obj, i);
                        }
                        throw new NoSuchElementException();
                    }

                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    private rsnAllocationRead() {
    }
}
