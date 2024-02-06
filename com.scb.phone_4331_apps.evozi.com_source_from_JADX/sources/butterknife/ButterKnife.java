package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {
    private static Map<Class<?>, Constructor<? extends Unbinder>> MediaBrowserCompat$CustomActionResultReceiver = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder MediaBrowserCompat$ItemReceiver(Activity activity) {
        return IconCompatParcelizer(activity, activity.getWindow().getDecorView());
    }

    public static Unbinder IconCompatParcelizer(View view) {
        return IconCompatParcelizer(view, view);
    }

    public static Unbinder write(Dialog dialog) {
        return IconCompatParcelizer(dialog, dialog.getWindow().getDecorView());
    }

    public static Unbinder IconCompatParcelizer(Object obj, View view) {
        Constructor<? extends Unbinder> write = write(obj.getClass());
        if (write == null) {
            return Unbinder.read;
        }
        try {
            return (Unbinder) write.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to invoke ");
            sb.append(write);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to invoke ");
            sb2.append(write);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    private static Constructor<? extends Unbinder> write(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Constructor<? extends Unbinder> constructor2 = MediaBrowserCompat$CustomActionResultReceiver.get(cls);
        if (constructor2 != null || MediaBrowserCompat$CustomActionResultReceiver.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            return null;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("_ViewBinding");
            constructor = classLoader.loadClass(sb.toString()).getConstructor(new Class[]{cls, View.class});
        } catch (ClassNotFoundException unused) {
            constructor = write((Class<?>) cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to find binding constructor for ");
            sb2.append(name);
            throw new RuntimeException(sb2.toString(), e);
        }
        MediaBrowserCompat$CustomActionResultReceiver.put(cls, constructor);
        return constructor;
    }
}
