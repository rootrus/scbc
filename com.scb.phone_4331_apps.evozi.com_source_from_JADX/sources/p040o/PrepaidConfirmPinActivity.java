package p040o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.UndeclaredThrowableException;

/* renamed from: o.PrepaidConfirmPinActivity */
public final class PrepaidConfirmPinActivity {
    static {
        new String[]{"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};
    }

    public static String MediaBrowserCompat$ItemReceiver(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static <R> R MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new UndeclaredThrowableException(th);
        }
    }

    public static <R> R read(Throwable th) {
        throw th;
    }
}
