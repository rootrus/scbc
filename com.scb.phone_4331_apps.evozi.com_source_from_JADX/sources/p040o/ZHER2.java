package p040o;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;

/* renamed from: o.ZHER2 */
public final class ZHER2 extends onCheckBoxClick$MediaBrowserCompat$CustomActionResultReceiver {
    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        return i >= 4;
    }

    public final void read(int i, String str, Throwable th) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        onGetStartedClick.IconCompatParcelizer((Object) instance, "FirebaseCrashlytics.getInstance()");
        if (i < 5) {
            instance.log(str);
        } else if (th == null) {
            instance.recordException(new Exception(str));
        } else {
            instance.recordException(th);
        }
    }
}
