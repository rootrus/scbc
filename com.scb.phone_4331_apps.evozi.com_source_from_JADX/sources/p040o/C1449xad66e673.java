package p040o;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p040o.setAllowsGoneWidget;

/* renamed from: o.setAllowsGoneWidget$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
class C1449xad66e673 implements setAllowsGoneWidget.IconCompatParcelizer.write {
    private final Constructor<?> read;

    C1449xad66e673(Class<?> cls) throws SecurityException, NoSuchMethodException {
        Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
        this.read = constructor;
        constructor.setAccessible(true);
    }

    public Object read(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return this.read.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
    }
}
