package p040o;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import p040o.onCreateOptionsMenu;

/* renamed from: o.onLowMemory */
public abstract class onLowMemory<T> implements onCreateOptionsMenu<T> {
    private final ContentResolver IconCompatParcelizer;
    private final Uri MediaBrowserCompat$CustomActionResultReceiver;
    private T read;

    /* access modifiers changed from: protected */
    public abstract T IconCompatParcelizer(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(T t) throws IOException;

    public onLowMemory(ContentResolver contentResolver, Uri uri) {
        this.IconCompatParcelizer = contentResolver;
        this.MediaBrowserCompat$CustomActionResultReceiver = uri;
    }

    public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super T> iconCompatParcelizer) {
        try {
            T IconCompatParcelizer2 = IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
            this.read = IconCompatParcelizer2;
            iconCompatParcelizer.read(IconCompatParcelizer2);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
        }
    }

    public final void read() {
        T t = this.read;
        if (t != null) {
            try {
                MediaBrowserCompat$ItemReceiver(t);
            } catch (IOException unused) {
            }
        }
    }

    public final isPostponed MediaBrowserCompat$ItemReceiver() {
        return isPostponed.LOCAL;
    }
}
