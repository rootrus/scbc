package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class CloseGuard {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Method getMethod;
    private final Method openMethod;
    private final Method warnIfOpenMethod;

    public CloseGuard(Method method, Method method2, Method method3) {
        this.getMethod = method;
        this.openMethod = method2;
        this.warnIfOpenMethod = method3;
    }

    public final Object createAndOpen(String str) {
        onGetStartedClick.write((Object) str, "closer");
        Method method = this.getMethod;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.openMethod;
                if (method2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean warnIfOpen(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.warnIfOpenMethod;
            if (method == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final CloseGuard get() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new CloseGuard(method3, method, method2);
        }
    }
}
