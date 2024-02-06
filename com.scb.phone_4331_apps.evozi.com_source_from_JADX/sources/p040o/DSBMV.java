package p040o;

import android.graphics.Bitmap;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.DSBMV */
public final class DSBMV<T> implements DSPMV<T> {
    private final Class<? extends T> IconCompatParcelizer;
    private final Bitmap.Config MediaBrowserCompat$ItemReceiver;

    public DSBMV(Class<? extends T> cls) {
        this(cls, (byte) 0);
    }

    private DSBMV(Class<? extends T> cls, byte b) {
        this.IconCompatParcelizer = cls;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final T MediaBrowserCompat$CustomActionResultReceiver() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return this.IconCompatParcelizer.newInstance();
    }
}
