package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p040o.setFirstBaselineToTopHeight;
import p040o.setTabSelected;

/* renamed from: o.DropDownListView */
class DropDownListView extends setDecorPadding {
    private static final Class IconCompatParcelizer;
    private static final Method MediaBrowserCompat$CustomActionResultReceiver;
    private static final Constructor MediaBrowserCompat$ItemReceiver;
    private static final Method read;

    DropDownListView() {
    }

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        MediaBrowserCompat$ItemReceiver = constructor;
        IconCompatParcelizer = cls;
        read = method;
        MediaBrowserCompat$CustomActionResultReceiver = method2;
    }

    public static boolean read() {
        if (read == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return read != null;
    }

    private static Object MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            return MediaBrowserCompat$ItemReceiver.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean IconCompatParcelizer(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) read.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface write(Object obj) {
        try {
            Object newInstance = Array.newInstance(IconCompatParcelizer, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) MediaBrowserCompat$CustomActionResultReceiver.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Typeface write(Context context, CancellationSignal cancellationSignal, setTabSelected.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        Object MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox();
        for (setTabSelected.IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
            Uri MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            ByteBuffer byteBuffer = (ByteBuffer) appCompatCheckBox.get(MediaBrowserCompat$ItemReceiver2);
            if (byteBuffer == null) {
                byteBuffer = DialogTitle.write(context, cancellationSignal, MediaBrowserCompat$ItemReceiver2);
                appCompatCheckBox.put(MediaBrowserCompat$ItemReceiver2, byteBuffer);
            }
            if (!IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, byteBuffer, iconCompatParcelizer.write(), iconCompatParcelizer.read(), iconCompatParcelizer.IconCompatParcelizer())) {
                return null;
            }
        }
        return Typeface.create(write(MediaBrowserCompat$CustomActionResultReceiver2), i);
    }

    public Typeface MediaBrowserCompat$CustomActionResultReceiver(Context context, setFirstBaselineToTopHeight.write write, Resources resources, int i) {
        Object MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        for (setFirstBaselineToTopHeight.read read2 : write.MediaBrowserCompat$CustomActionResultReceiver()) {
            ByteBuffer read3 = DialogTitle.read(context, resources, read2.read());
            if (read3 == null || !IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, read3, read2.write(), read2.IconCompatParcelizer(), read2.MediaBrowserCompat$SearchResultReceiver())) {
                return null;
            }
        }
        return write(MediaBrowserCompat$CustomActionResultReceiver2);
    }
}
