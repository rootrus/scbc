package p040o;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.setSelector */
public class setSelector extends setAttachListener {
    /* access modifiers changed from: protected */
    public Typeface read(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.MediaBrowserCompat$ItemReceiver, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.read.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public Method read(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
