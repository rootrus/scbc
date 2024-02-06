package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Throwables {
    private Throwables() {
    }

    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th, Class<X> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void propagateIfPossible(Throwable th) {
        propagateIfInstanceOf(th, Error.class);
        propagateIfInstanceOf(th, RuntimeException.class);
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th);
    }

    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th, cls2);
    }

    public static RuntimeException propagate(Throwable th) {
        propagateIfPossible((Throwable) Preconditions.checkNotNull(th));
        throw new RuntimeException(th);
    }

    public static Throwable getRootCause(Throwable th) {
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            th = cause;
        }
    }

    public static List<Throwable> getCausalChain(Throwable th) {
        Preconditions.checkNotNull(th);
        ArrayList arrayList = new ArrayList(4);
        while (th != null) {
            arrayList.add(th);
            th = th.getCause();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String getStackTraceAsString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Exception throwCause(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                StackTraceElement[] stackTrace = cause.getStackTrace();
                StackTraceElement[] stackTrace2 = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[(stackTrace.length + stackTrace2.length)];
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, stackTrace.length);
                System.arraycopy(stackTrace2, 0, stackTraceElementArr, stackTrace.length, stackTrace2.length);
                cause.setStackTrace(stackTraceElementArr);
            }
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw exc;
            }
        } else {
            throw exc;
        }
    }
}
