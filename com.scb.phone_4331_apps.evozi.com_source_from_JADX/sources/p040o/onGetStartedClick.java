package p040o;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: o.onGetStartedClick */
public class onGetStartedClick {
    public static int IconCompatParcelizer(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private onGetStartedClick() {
    }

    public static String write(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        throw ((KotlinNullPointerException) write(new KotlinNullPointerException()));
    }

    private static void write(String str) {
        throw ((UninitializedPropertyAccessException) MediaBrowserCompat$ItemReceiver(new UninitializedPropertyAccessException(str), onGetStartedClick.class.getName()));
    }

    public static void MediaBrowserCompat$ItemReceiver(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        write(sb.toString());
    }

    public static void IconCompatParcelizer(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) write(new IllegalStateException(sb.toString())));
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((NullPointerException) write(new NullPointerException(sb.toString())));
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) write(new NullPointerException(str)));
        }
    }

    public static boolean MediaBrowserCompat$ItemReceiver(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Double d) {
        return d != null && d.doubleValue() == 0.0d;
    }

    private static <T extends Throwable> T write(T t) {
        return MediaBrowserCompat$ItemReceiver(t, onGetStartedClick.class.getName());
    }

    static <T extends Throwable> T MediaBrowserCompat$ItemReceiver(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void write(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            StringBuilder sb = new StringBuilder();
            sb.append("Parameter specified as non-null is null: method ");
            sb.append(className);
            sb.append(".");
            sb.append(methodName);
            sb.append(", parameter ");
            sb.append(str);
            throw ((IllegalArgumentException) write(new IllegalArgumentException(sb.toString())));
        }
    }

    public static void write() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
