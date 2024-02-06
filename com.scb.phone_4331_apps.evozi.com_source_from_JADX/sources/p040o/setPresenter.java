package p040o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: o.setPresenter */
public final class setPresenter extends ContextWrapper {
    private static ArrayList<WeakReference<setPresenter>> MediaBrowserCompat$ItemReceiver;
    private static final Object write = new Object();
    private final Resources.Theme IconCompatParcelizer = null;
    private final Resources read;

    private setPresenter(Context context) {
        super(context);
        this.read = new onMenuItemClick(this, context.getResources());
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.IconCompatParcelizer;
        return theme == null ? super.getTheme() : theme;
    }

    public final void setTheme(int i) {
        Resources.Theme theme = this.IconCompatParcelizer;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        return this.read;
    }

    public final AssetManager getAssets() {
        return this.read.getAssets();
    }

    public static Context write(Context context) {
        boolean z = false;
        if (!(context instanceof setPresenter) && !(context.getResources() instanceof onMenuItemClick) && !(context.getResources() instanceof setExpandActivityOverflowButtonDrawable) && Build.VERSION.SDK_INT < 21) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (write) {
            if (MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver = new ArrayList<>();
            } else {
                for (int size = MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = MediaBrowserCompat$ItemReceiver.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        MediaBrowserCompat$ItemReceiver.remove(size);
                    }
                }
                for (int size2 = MediaBrowserCompat$ItemReceiver.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = MediaBrowserCompat$ItemReceiver.get(size2);
                    setPresenter setpresenter = weakReference2 != null ? (setPresenter) weakReference2.get() : null;
                    if (setpresenter != null && setpresenter.getBaseContext() == context) {
                        return setpresenter;
                    }
                }
            }
            setPresenter setpresenter2 = new setPresenter(context);
            MediaBrowserCompat$ItemReceiver.add(new WeakReference(setpresenter2));
            return setpresenter2;
        }
    }
}
