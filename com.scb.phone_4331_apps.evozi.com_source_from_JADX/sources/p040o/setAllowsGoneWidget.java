package p040o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

/* renamed from: o.setAllowsGoneWidget */
public final class setAllowsGoneWidget {
    private static final Set<File> MediaBrowserCompat$ItemReceiver = new HashSet();
    private static final boolean read = IconCompatParcelizer(System.getProperty("java.vm.version"));

    public static void IconCompatParcelizer(Context context) {
        Log.i("MultiDex", "Installing application");
        if (read) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo read2 = read(context);
                if (read2 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                write(context, new File(read2.sourceDir), new File(read2.dataDir), "secondary-dexes", "");
                Log.i("MultiDex", "install done");
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                StringBuilder sb = new StringBuilder();
                sb.append("MultiDex installation failed (");
                sb.append(e.getMessage());
                sb.append(").");
                throw new RuntimeException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MultiDex installation failed. SDK ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(" is unsupported. Min SDK version is ");
            sb2.append(4);
            sb2.append(".");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:40|41|42|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void write(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = MediaBrowserCompat$ItemReceiver
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x009b }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x009b }
            r1.add(r6)     // Catch:{ all -> 0x009b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x009b }
            r2 = 20
            if (r1 <= r2) goto L_0x0055
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r3)     // Catch:{ all -> 0x009b }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x009b }
            r1.append(r3)     // Catch:{ all -> 0x009b }
            java.lang.String r3 = ": SDK version higher than "
            r1.append(r3)     // Catch:{ all -> 0x009b }
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r2 = " should be backed by "
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "case here: java.vm.version=\""
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x009b }
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "MultiDex"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x009b }
        L_0x0055:
            java.lang.ClassLoader r1 = write(r5)     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x005d
            monitor-exit(r0)
            return
        L_0x005d:
            MediaBrowserCompat$CustomActionResultReceiver(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x009b }
        L_0x0069:
            java.io.File r7 = write(r5, r7, r8)     // Catch:{ all -> 0x009b }
            o.setReferencedIds r8 = new o.setReferencedIds     // Catch:{ all -> 0x009b }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x009b }
            r6 = 0
            java.util.List r6 = r8.IconCompatParcelizer(r5, r9, r6)     // Catch:{ all -> 0x0096 }
            IconCompatParcelizer((java.lang.ClassLoader) r1, (java.io.File) r7, (java.util.List<? extends java.io.File>) r6)     // Catch:{ IOException -> 0x007b }
            goto L_0x008b
        L_0x007b:
            r6 = move-exception
            java.lang.String r2 = "MultiDex"
            java.lang.String r3 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r2, r3, r6)     // Catch:{ all -> 0x0096 }
            r6 = 1
            java.util.List r5 = r8.IconCompatParcelizer(r5, r9, r6)     // Catch:{ all -> 0x0096 }
            IconCompatParcelizer((java.lang.ClassLoader) r1, (java.io.File) r7, (java.util.List<? extends java.io.File>) r5)     // Catch:{ all -> 0x0096 }
        L_0x008b:
            r8.close()     // Catch:{ IOException -> 0x0090 }
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = move-exception
        L_0x0091:
            if (r5 != 0) goto L_0x0095
            monitor-exit(r0)
            return
        L_0x0095:
            throw r5     // Catch:{ all -> 0x009b }
        L_0x0096:
            r5 = move-exception
            r8.close()     // Catch:{ IOException -> 0x009a }
        L_0x009a:
            throw r5     // Catch:{ all -> 0x009b }
        L_0x009b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setAllowsGoneWidget.write(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String):void");
    }

    private static ClassLoader write(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static ApplicationInfo read(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static boolean IconCompatParcelizer(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    private static void IconCompatParcelizer(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            write.write(classLoader, list, file);
        } else if (Build.VERSION.SDK_INT >= 14) {
            IconCompatParcelizer.IconCompatParcelizer(classLoader, list);
        } else {
            read.read(classLoader, list);
        }
    }

    /* access modifiers changed from: private */
    public static Field MediaBrowserCompat$CustomActionResultReceiver(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    /* access modifiers changed from: private */
    public static Method IconCompatParcelizer(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            Log.i("MultiDex", sb.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                Log.w("MultiDex", sb2.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                Log.i("MultiDex", sb3.toString());
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                    Log.w("MultiDex", sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                    Log.i("MultiDex", sb5.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                Log.w("MultiDex", sb6.toString());
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Deleted old secondary dex dir ");
            sb7.append(file.getPath());
            Log.i("MultiDex", sb7.toString());
        }
    }

    private static File write(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            MediaBrowserCompat$ItemReceiver(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            MediaBrowserCompat$ItemReceiver(file2);
        }
        File file3 = new File(file2, str);
        MediaBrowserCompat$ItemReceiver(file3);
        return file3;
    }

    private static void MediaBrowserCompat$ItemReceiver(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
                Log.e("MultiDex", sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
                Log.e("MultiDex", sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to create directory ");
            sb3.append(file.getPath());
            throw new IOException(sb3.toString());
        }
    }

    /* renamed from: o.setAllowsGoneWidget$write */
    static final class write {
        static void write(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = setAllowsGoneWidget.MediaBrowserCompat$CustomActionResultReceiver(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            setAllowsGoneWidget.read(obj, "dexElements", MediaBrowserCompat$ItemReceiver(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field MediaBrowserCompat$ItemReceiver = setAllowsGoneWidget.MediaBrowserCompat$CustomActionResultReceiver(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) MediaBrowserCompat$ItemReceiver.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                MediaBrowserCompat$ItemReceiver.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] MediaBrowserCompat$ItemReceiver(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) setAllowsGoneWidget.IconCompatParcelizer(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: o.setAllowsGoneWidget$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        private final write MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.setAllowsGoneWidget$IconCompatParcelizer$write */
        interface write {
            Object read(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: o.setAllowsGoneWidget$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        static class C10572IconCompatParcelizer implements write {
            private final Constructor<?> write;

            C10572IconCompatParcelizer(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.write = constructor;
                constructor.setAccessible(true);
            }

            public Object read(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.write.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        static void IconCompatParcelizer(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = setAllowsGoneWidget.MediaBrowserCompat$CustomActionResultReceiver(classLoader, "pathList").get(classLoader);
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                write write2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                String path = file.getPath();
                File parentFile = file.getParentFile();
                String name = file.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(name.substring(0, name.length() - 4));
                sb.append(".dex");
                objArr[i] = write2.read(file, DexFile.loadDex(path, new File(parentFile, sb.toString()).getPath(), 0));
            }
            try {
                setAllowsGoneWidget.read(obj, "dexElements", objArr);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                setAllowsGoneWidget.read(obj, "pathElements", objArr);
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private IconCompatParcelizer() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                o.setAllowsGoneWidget$IconCompatParcelizer$IconCompatParcelizer r1 = new o.setAllowsGoneWidget$IconCompatParcelizer$IconCompatParcelizer     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                o.setAllowsGoneWidget$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.setAllowsGoneWidget$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                o.setAllowsGoneWidget$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver r1 = new o.setAllowsGoneWidget$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver
                r1.<init>(r0)
            L_0x001a:
                r2.MediaBrowserCompat$ItemReceiver = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setAllowsGoneWidget.IconCompatParcelizer.<init>():void");
        }
    }

    /* renamed from: o.setAllowsGoneWidget$read */
    static final class read {
        static void read(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field MediaBrowserCompat$ItemReceiver = setAllowsGoneWidget.MediaBrowserCompat$CustomActionResultReceiver(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) MediaBrowserCompat$ItemReceiver.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                sb2.append(".dex");
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            MediaBrowserCompat$ItemReceiver.set(classLoader, sb.toString());
            setAllowsGoneWidget.read(classLoader, "mPaths", strArr);
            setAllowsGoneWidget.read(classLoader, "mFiles", fileArr);
            setAllowsGoneWidget.read(classLoader, "mZips", zipFileArr);
            setAllowsGoneWidget.read(classLoader, "mDexs", dexFileArr);
        }
    }

    static /* synthetic */ void read(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(obj, str);
        Object[] objArr2 = (Object[]) MediaBrowserCompat$CustomActionResultReceiver.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        MediaBrowserCompat$CustomActionResultReceiver.set(obj, objArr3);
    }
}
