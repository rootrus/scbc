package p040o;

import android.content.Context;
import java.io.File;

/* renamed from: o.restoreViewState */
public final class restoreViewState extends requireFragmentManager {
    public restoreViewState(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private restoreViewState(final Context context, final String str) {
        super(new C1429xbcccb1a5() {
            public final File MediaBrowserCompat$CustomActionResultReceiver() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, 262144000);
    }
}
