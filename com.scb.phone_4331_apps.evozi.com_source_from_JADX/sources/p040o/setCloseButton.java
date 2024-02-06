package p040o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: o.setCloseButton */
public final class setCloseButton {
    public static final Unsafe IconCompatParcelizer;
    private static final boolean MediaBrowserCompat$ItemReceiver = (System.getProperty("rx.unsafe-disable") != null);

    static {
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get((Object) null);
        } catch (Throwable unused) {
        }
        IconCompatParcelizer = unsafe;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return IconCompatParcelizer != null && !MediaBrowserCompat$ItemReceiver;
    }

    public static long write(Class<?> cls, String str) {
        try {
            return IconCompatParcelizer.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }
}
