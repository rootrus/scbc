package okhttp3.repackaged.internal.http;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RouteException extends Exception {
    private static final Method amu;
    private IOException amv;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        amu = method;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.amv = iOException;
    }

    public final IOException getLastConnectException() {
        return this.amv;
    }

    public final void addConnectException(IOException iOException) {
        m6147a(iOException, this.amv);
        this.amv = iOException;
    }

    /* renamed from: a */
    private void m6147a(IOException iOException, IOException iOException2) {
        Method method = amu;
        if (method != null) {
            try {
                method.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
