package p040o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: o.setPopupCallback */
public final class setPopupCallback extends ContextWrapper {
    public int MediaBrowserCompat$CustomActionResultReceiver;
    private Resources.Theme MediaBrowserCompat$ItemReceiver;
    private Resources read;
    private LayoutInflater write;

    public setPopupCallback() {
        super((Context) null);
    }

    public setPopupCallback(Context context, int i) {
        super(context);
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public setPopupCallback(Context context, Resources.Theme theme) {
        super(context);
        this.MediaBrowserCompat$ItemReceiver = theme;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void setTheme(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            write();
        }
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.MediaBrowserCompat$ItemReceiver;
        if (theme != null) {
            return theme;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = C1134xe5b94a38.Theme_AppCompat_Light;
        }
        write();
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.write == null) {
            this.write = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.write;
    }

    private void write() {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.MediaBrowserCompat$ItemReceiver.setTo(theme);
            }
        }
        this.MediaBrowserCompat$ItemReceiver.applyStyle(this.MediaBrowserCompat$CustomActionResultReceiver, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.read == null) {
            this.read = super.getResources();
        }
        return this.read;
    }
}
