package p040o;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: o.setWeightSum */
public final class setWeightSum {
    public static setOrientation MediaBrowserCompat$ItemReceiver(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return setOrientation.write(configuration.getLocales());
        }
        return setOrientation.read(configuration.locale);
    }
}
