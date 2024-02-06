package p040o;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p040o.RttiJsonBill_MembersInjector;

/* renamed from: o.rsnAllocationData2D */
public final class rsnAllocationData2D {
    private static final Map<Field, rsnAllocationData2D> write = new WeakHashMap();
    public final boolean IconCompatParcelizer;
    private final Method[] MediaBrowserCompat$CustomActionResultReceiver;
    public final Field MediaBrowserCompat$ItemReceiver;
    public final String read;

    public static rsnAllocationData2D write(Enum<?> enumR) {
        try {
            rsnAllocationData2D read2 = read(enumR.getClass().getField(enumR.name()));
            Preconditions.checkArgument(read2 != null, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return read2;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.rsnAllocationData2D read(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, o.rsnAllocationData2D> r1 = write
            monitor-enter(r1)
            java.util.Map<java.lang.reflect.Field, o.rsnAllocationData2D> r2 = write     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x006b }
            o.rsnAllocationData2D r2 = (p040o.rsnAllocationData2D) r2     // Catch:{ all -> 0x006b }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0069
            if (r3 != 0) goto L_0x0021
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x006b }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0069
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            java.lang.Class<o.rsnAllocationSetSurface> r2 = p040o.rsnAllocationSetSurface.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            o.rsnAllocationSetSurface r2 = (p040o.rsnAllocationSetSurface) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = r2.IconCompatParcelizer()     // Catch:{ all -> 0x006b }
            goto L_0x0053
        L_0x0032:
            java.lang.Class<o.rsnAllocationGetStride> r2 = p040o.rsnAllocationGetStride.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            o.rsnAllocationGetStride r2 = (p040o.rsnAllocationGetStride) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            monitor-exit(r1)
            return r0
        L_0x003f:
            java.lang.Class<o.rsnAllocationIoSend> r2 = p040o.rsnAllocationIoSend.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            o.rsnAllocationIoSend r2 = (p040o.rsnAllocationIoSend) r2     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x004b
            monitor-exit(r1)
            return r0
        L_0x004b:
            java.lang.String r0 = r2.write()     // Catch:{ all -> 0x006b }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x006b }
        L_0x0053:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x006b }
        L_0x005f:
            o.rsnAllocationData2D r2 = new o.rsnAllocationData2D     // Catch:{ all -> 0x006b }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.reflect.Field, o.rsnAllocationData2D> r0 = write     // Catch:{ all -> 0x006b }
            r0.put(r5, r2)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r1)
            return r2
        L_0x006b:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnAllocationData2D.read(java.lang.reflect.Field):o.rsnAllocationData2D");
    }

    private rsnAllocationData2D(Field field, String str) {
        String str2;
        this.MediaBrowserCompat$ItemReceiver = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.read = str2;
        this.IconCompatParcelizer = RttiJsonBill_MembersInjector.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.getType());
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer(field);
    }

    private static Method[] IconCompatParcelizer(Field field) {
        ArrayList arrayList = new ArrayList();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            String lowerCase = Ascii.toLowerCase(method.getName());
            StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(Ascii.toLowerCase(field.getName()));
            if (lowerCase.equals(sb.toString()) && method.getParameterTypes().length == 1) {
                arrayList.add(method);
            }
        }
        return (Method[]) arrayList.toArray(new Method[0]);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj, Object obj2) {
        Method[] methodArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (methodArr.length > 0) {
            int length = methodArr.length;
            int i = 0;
            while (i < length) {
                Method method = methodArr[i];
                if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    try {
                        method.invoke(obj, new Object[]{obj2});
                        return;
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        continue;
                    }
                } else {
                    i++;
                }
            }
        }
        write(this.MediaBrowserCompat$ItemReceiver, obj, obj2);
    }

    public static Object write(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void write(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object write2 = write(field, obj);
            if (obj2 == null) {
                if (write2 == null) {
                    return;
                }
            } else if (obj2.equals(write2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected final value <");
            sb.append(write2);
            sb.append("> but was <");
            sb.append(obj2);
            sb.append("> on ");
            sb.append(field.getName());
            sb.append(" field in ");
            sb.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
