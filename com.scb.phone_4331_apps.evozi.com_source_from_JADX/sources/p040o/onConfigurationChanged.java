package p040o;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import p040o.onCreateOptionsMenu;

/* renamed from: o.onConfigurationChanged */
public abstract class onConfigurationChanged<T> implements onCreateOptionsMenu<T> {
    private T MediaBrowserCompat$CustomActionResultReceiver;
    private final AssetManager MediaBrowserCompat$ItemReceiver;
    private final String read;

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(T t) throws IOException;

    /* access modifiers changed from: protected */
    public abstract T read(AssetManager assetManager, String str) throws IOException;

    public onConfigurationChanged(AssetManager assetManager, String str) {
        this.MediaBrowserCompat$ItemReceiver = assetManager;
        this.read = str;
    }

    public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super T> iconCompatParcelizer) {
        try {
            T read2 = read(this.MediaBrowserCompat$ItemReceiver, this.read);
            this.MediaBrowserCompat$CustomActionResultReceiver = read2;
            iconCompatParcelizer.read(read2);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
        }
    }

    public final void read() {
        T t = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (t != null) {
            try {
                MediaBrowserCompat$CustomActionResultReceiver(t);
            } catch (IOException unused) {
            }
        }
    }

    public final isPostponed MediaBrowserCompat$ItemReceiver() {
        return isPostponed.LOCAL;
    }
}
