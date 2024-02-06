package p040o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import p040o.setFirstBaselineToTopHeight;

/* renamed from: o.setAttachListener */
public class setAttachListener extends setAllowStacking {
    protected final Method IconCompatParcelizer;
    protected final Method MediaBrowserCompat$CustomActionResultReceiver;
    protected final Class MediaBrowserCompat$ItemReceiver;
    protected final Method MediaBrowserCompat$MediaItem;
    protected final Constructor MediaDescriptionCompat;
    protected final Method read;
    protected final Method write;

    public setAttachListener() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class IconCompatParcelizer2 = IconCompatParcelizer();
            constructor = MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2);
            method4 = MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            method3 = write(IconCompatParcelizer2);
            method2 = MediaBrowserCompat$MediaItem(IconCompatParcelizer2);
            method = IconCompatParcelizer(IconCompatParcelizer2);
            Class cls2 = IconCompatParcelizer2;
            method5 = read(IconCompatParcelizer2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.MediaBrowserCompat$ItemReceiver = cls;
        this.MediaDescriptionCompat = constructor;
        this.write = method4;
        this.MediaBrowserCompat$CustomActionResultReceiver = method3;
        this.MediaBrowserCompat$MediaItem = method2;
        this.IconCompatParcelizer = method;
        this.read = method5;
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        if (this.write == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.write != null;
    }

    private Object write() {
        try {
            return this.MediaDescriptionCompat.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean read(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.write.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.MediaBrowserCompat$CustomActionResultReceiver.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface read(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.MediaBrowserCompat$ItemReceiver, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.read.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean IconCompatParcelizer(Object obj) {
        try {
            return ((Boolean) this.MediaBrowserCompat$MediaItem.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private void write(Object obj) {
        try {
            this.IconCompatParcelizer.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Typeface MediaBrowserCompat$CustomActionResultReceiver(Context context, setFirstBaselineToTopHeight.write write2, Resources resources, int i) {
        if (!MediaBrowserCompat$ItemReceiver()) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(context, write2, resources, i);
        }
        Object write3 = write();
        for (setFirstBaselineToTopHeight.read read2 : write2.MediaBrowserCompat$CustomActionResultReceiver()) {
            if (!read(context, write3, read2.MediaBrowserCompat$CustomActionResultReceiver(), read2.write(), read2.IconCompatParcelizer(), read2.MediaBrowserCompat$SearchResultReceiver() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(read2.MediaBrowserCompat$ItemReceiver()))) {
                write(write3);
                return null;
            }
        }
        if (!IconCompatParcelizer(write3)) {
            return null;
        }
        return read(write3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r10 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface write(android.content.Context r10, android.os.CancellationSignal r11, p040o.setTabSelected.IconCompatParcelizer[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            boolean r0 = r9.MediaBrowserCompat$ItemReceiver()
            if (r0 != 0) goto L_0x0057
            o.setTabSelected$IconCompatParcelizer r12 = r9.MediaBrowserCompat$CustomActionResultReceiver(r12, r13)
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.net.Uri r13 = r12.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r13, r0, r11)     // Catch:{ IOException -> 0x0056 }
            if (r10 != 0) goto L_0x0025
            if (r10 == 0) goto L_0x0024
            r10.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0024:
            return r1
        L_0x0025:
            android.graphics.Typeface$Builder r11 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0048 }
            java.io.FileDescriptor r13 = r10.getFileDescriptor()     // Catch:{ all -> 0x0048 }
            r11.<init>(r13)     // Catch:{ all -> 0x0048 }
            int r13 = r12.read()     // Catch:{ all -> 0x0048 }
            android.graphics.Typeface$Builder r11 = r11.setWeight(r13)     // Catch:{ all -> 0x0048 }
            boolean r12 = r12.IconCompatParcelizer()     // Catch:{ all -> 0x0048 }
            android.graphics.Typeface$Builder r11 = r11.setItalic(r12)     // Catch:{ all -> 0x0048 }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ all -> 0x0048 }
            if (r10 == 0) goto L_0x0047
            r10.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0047:
            return r11
        L_0x0048:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x004a }
        L_0x004a:
            r12 = move-exception
            if (r10 == 0) goto L_0x0055
            r10.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch:{ IOException -> 0x0056 }
        L_0x0055:
            throw r12     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r1
        L_0x0057:
            java.util.Map r10 = p040o.setTabSelected.MediaBrowserCompat$CustomActionResultReceiver((android.content.Context) r10, (p040o.setTabSelected.IconCompatParcelizer[]) r12, (android.os.CancellationSignal) r11)
            java.lang.Object r11 = r9.write()
            int r0 = r12.length
            r2 = 0
            r8 = r2
        L_0x0062:
            if (r8 >= r0) goto L_0x008e
            r3 = r12[r8]
            android.net.Uri r4 = r3.MediaBrowserCompat$ItemReceiver()
            java.lang.Object r4 = r10.get(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 == 0) goto L_0x008b
            int r5 = r3.write()
            int r6 = r3.read()
            boolean r7 = r3.IconCompatParcelizer()
            r2 = r9
            r3 = r11
            boolean r2 = r2.MediaBrowserCompat$CustomActionResultReceiver(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x008a
            r9.write((java.lang.Object) r11)
            return r1
        L_0x008a:
            r2 = 1
        L_0x008b:
            int r8 = r8 + 1
            goto L_0x0062
        L_0x008e:
            if (r2 != 0) goto L_0x0094
            r9.write((java.lang.Object) r11)
            return r1
        L_0x0094:
            boolean r10 = r9.IconCompatParcelizer((java.lang.Object) r11)
            if (r10 != 0) goto L_0x009b
            return r1
        L_0x009b:
            android.graphics.Typeface r10 = r9.read((java.lang.Object) r11)
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setAttachListener.write(android.content.Context, android.os.CancellationSignal, o.setTabSelected$IconCompatParcelizer[], int):android.graphics.Typeface");
    }

    public Typeface MediaBrowserCompat$ItemReceiver(Context context, Resources resources, int i, String str, int i2) {
        if (!MediaBrowserCompat$ItemReceiver()) {
            return super.MediaBrowserCompat$ItemReceiver(context, resources, i, str, i2);
        }
        Object write2 = write();
        if (!read(context, write2, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            write(write2);
            return null;
        } else if (!IconCompatParcelizer(write2)) {
            return null;
        } else {
            return read(write2);
        }
    }

    /* access modifiers changed from: protected */
    public Class IconCompatParcelizer() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor MediaBrowserCompat$ItemReceiver(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method MediaBrowserCompat$CustomActionResultReceiver(Class cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method write(Class cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    public Method MediaBrowserCompat$MediaItem(Class cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method IconCompatParcelizer(Class cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method read(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
