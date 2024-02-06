package p040o;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p040o.setAllowsGoneWidget;

/* renamed from: o.setAllowsGoneWidget$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
class C1448x152df8a4 implements setAllowsGoneWidget.IconCompatParcelizer.write {
    private final Constructor<?> write;

    C1448x152df8a4(Class<?> cls) throws SecurityException, NoSuchMethodException {
        Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
        this.write = constructor;
        constructor.setAccessible(true);
    }

    public Object read(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return this.write.newInstance(new Object[]{file, file, dexFile});
    }
}
