package p040o;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: o.setAdapter */
public final class setAdapter {
    public static IBinder MediaBrowserCompat$CustomActionResultReceiver(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return setAdapter$MediaBrowserCompat$ItemReceiver.write(bundle, str);
    }
}
