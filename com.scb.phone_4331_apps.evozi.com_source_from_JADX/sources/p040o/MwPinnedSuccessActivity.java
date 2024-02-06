package p040o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.MwPinnedSuccessActivity */
public final class MwPinnedSuccessActivity {
    public static final Handler IconCompatParcelizer(Looper looper) {
        onGetStartedClick.write((Object) looper, "$this$asHandler");
        if (Build.VERSION.SDK_INT < 16) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            Constructor<Handler> declaredConstructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
            onGetStartedClick.IconCompatParcelizer((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Handler newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.TRUE});
            onGetStartedClick.IconCompatParcelizer((Object) newInstance, "constructor.newInstance(this, null, true)");
            return newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    static {
        Object obj;
        try {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            Looper mainLooper = Looper.getMainLooper();
            onGetStartedClick.IconCompatParcelizer((Object) mainLooper, "Looper.getMainLooper()");
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new moveCameraToCurrentLocation(IconCompatParcelizer(mainLooper), "Main"));
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th));
        }
        HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(obj);
    }
}
