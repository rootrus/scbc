package okhttp3.repackaged.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: okhttp3.repackaged.internal.b */
class C10233b<T> {
    private final Class<?> ajj;
    private final String ajk;
    private final Class[] ajl;

    public C10233b(Class<?> cls, String str, Class... clsArr) {
        this.ajj = cls;
        this.ajk = str;
        this.ajl = clsArr;
    }

    public boolean isSupported(T t) {
        return m5964b(t.getClass()) != null;
    }

    public Object invokeOptional(T t, Object... objArr) throws InvocationTargetException {
        Method b = m5964b(t.getClass());
        if (b == null) {
            return null;
        }
        try {
            return b.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object invokeOptionalWithoutCheckedException(T t, Object... objArr) {
        try {
            return invokeOptional(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object invoke(T t, Object... objArr) throws InvocationTargetException {
        Method b = m5964b(t.getClass());
        if (b != null) {
            try {
                return b.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpectedly could not call: ");
                sb.append(b);
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Method ");
            sb2.append(this.ajk);
            sb2.append(" not supported for object ");
            sb2.append(t);
            throw new AssertionError(sb2.toString());
        }
    }

    public Object invokeWithoutCheckedException(T t, Object... objArr) {
        try {
            return invoke(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: b */
    private Method m5964b(Class<?> cls) {
        Class<?> cls2;
        String str = this.ajk;
        if (str == null) {
            return null;
        }
        Method publicMethod = getPublicMethod(cls, str, this.ajl);
        if (publicMethod == null || (cls2 = this.ajj) == null || cls2.isAssignableFrom(publicMethod.getReturnType())) {
            return publicMethod;
        }
        return null;
    }

    private static Method getPublicMethod(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}
