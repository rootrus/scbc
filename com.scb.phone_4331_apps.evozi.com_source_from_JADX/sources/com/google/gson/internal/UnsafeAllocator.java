package com.google.gson.internal;

import java.lang.reflect.Modifier;

public abstract class UnsafeAllocator {
    public abstract <T> T newInstance(Class<T> cls) throws Exception;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", new java.lang.Class[]{java.lang.Class.class, java.lang.Class.class});
        r0.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007e, code lost:
        return new com.google.gson.internal.UnsafeAllocator.C03743();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        return new com.google.gson.internal.UnsafeAllocator.C03754();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.internal.UnsafeAllocator create() {
        /*
            java.lang.String r0 = "newInstance"
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "sun.misc.Unsafe"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x002b }
            java.lang.String r5 = "theUnsafe"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch:{ Exception -> 0x002b }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x002b }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x002b }
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            r6[r2] = r7     // Catch:{ Exception -> 0x002b }
            java.lang.String r7 = "allocateInstance"
            java.lang.reflect.Method r4 = r4.getMethod(r7, r6)     // Catch:{ Exception -> 0x002b }
            com.google.gson.internal.UnsafeAllocator$1 r6 = new com.google.gson.internal.UnsafeAllocator$1     // Catch:{ Exception -> 0x002b }
            r6.<init>(r4, r5)     // Catch:{ Exception -> 0x002b }
            return r6
        L_0x002b:
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r2] = r6     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.io.ObjectStreamClass> r6 = java.io.ObjectStreamClass.class
            java.lang.String r7 = "getConstructorId"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x0066 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r2] = r7     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch:{ Exception -> 0x0066 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0066 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0066 }
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r2] = r6     // Catch:{ Exception -> 0x0066 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0066 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.io.ObjectStreamClass> r6 = java.io.ObjectStreamClass.class
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r0, r5)     // Catch:{ Exception -> 0x0066 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0066 }
            com.google.gson.internal.UnsafeAllocator$2 r6 = new com.google.gson.internal.UnsafeAllocator$2     // Catch:{ Exception -> 0x0066 }
            r6.<init>(r5, r1)     // Catch:{ Exception -> 0x0066 }
            return r6
        L_0x0066:
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x007f }
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r1[r2] = r4     // Catch:{ Exception -> 0x007f }
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r1[r3] = r2     // Catch:{ Exception -> 0x007f }
            java.lang.Class<java.io.ObjectInputStream> r2 = java.io.ObjectInputStream.class
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r1)     // Catch:{ Exception -> 0x007f }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x007f }
            com.google.gson.internal.UnsafeAllocator$3 r1 = new com.google.gson.internal.UnsafeAllocator$3     // Catch:{ Exception -> 0x007f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x007f }
            return r1
        L_0x007f:
            com.google.gson.internal.UnsafeAllocator$4 r0 = new com.google.gson.internal.UnsafeAllocator$4
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.UnsafeAllocator.create():com.google.gson.internal.UnsafeAllocator");
    }

    static void assertInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }
}
