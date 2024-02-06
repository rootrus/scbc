package p040o;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: o.setVBorder */
public final class setVBorder {
    private static final boolean MediaBrowserCompat$ItemReceiver;
    private static final int write;

    static {
        int write2 = write();
        write = write2;
        MediaBrowserCompat$ItemReceiver = write2 != 0;
    }

    public static boolean read() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static int MediaBrowserCompat$ItemReceiver() {
        return write;
    }

    private static int write() {
        ClassLoader classLoader;
        try {
            if (System.getSecurityManager() == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            } else {
                classLoader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
                    public final /* synthetic */ Object run() {
                        return ClassLoader.getSystemClassLoader();
                    }
                });
            }
            return ((Integer) Class.forName("android.os.Build$VERSION", true, classLoader).getField("SDK_INT").get((Object) null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
