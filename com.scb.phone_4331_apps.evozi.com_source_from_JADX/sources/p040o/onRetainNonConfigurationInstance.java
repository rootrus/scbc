package p040o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p040o.CheckParameters;
import p040o.onMenuItemSelected;

/* renamed from: o.onRetainNonConfigurationInstance */
public final class onRetainNonConfigurationInstance implements isVisible<InputStream, Bitmap> {
    private final CheckParameters.CheckCountry MediaBrowserCompat$ItemReceiver;
    private final onMenuItemSelected write;

    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        return true;
    }

    public onRetainNonConfigurationInstance(onMenuItemSelected onmenuitemselected, CheckParameters.CheckCountry checkCountry) {
        this.write = onmenuitemselected;
        this.MediaBrowserCompat$ItemReceiver = checkCountry;
    }

    /* access modifiers changed from: private */
    /* renamed from: read */
    public performOptionsMenuClosed<Bitmap> MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, int i, int i2, onActivityResult onactivityresult) throws IOException {
        onStateNotSaved onstatenotsaved;
        boolean z;
        if (inputStream instanceof onStateNotSaved) {
            onstatenotsaved = (onStateNotSaved) inputStream;
            z = false;
        } else {
            z = true;
            onstatenotsaved = new onStateNotSaved(inputStream, this.MediaBrowserCompat$ItemReceiver);
        }
        GridLayoutManager MediaBrowserCompat$ItemReceiver2 = GridLayoutManager.MediaBrowserCompat$ItemReceiver(onstatenotsaved);
        try {
            return this.write.IconCompatParcelizer(new RecyclerView(MediaBrowserCompat$ItemReceiver2), i, i2, onactivityresult, new read(onstatenotsaved, MediaBrowserCompat$ItemReceiver2));
        } finally {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer();
            if (z) {
                onstatenotsaved.IconCompatParcelizer();
            }
        }
    }

    /* renamed from: o.onRetainNonConfigurationInstance$read */
    static class read implements onMenuItemSelected.IconCompatParcelizer {
        private final onStateNotSaved MediaBrowserCompat$ItemReceiver;
        private final GridLayoutManager write;

        read(onStateNotSaved onstatenotsaved, GridLayoutManager gridLayoutManager) {
            this.MediaBrowserCompat$ItemReceiver = onstatenotsaved;
            this.write = gridLayoutManager;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            onStateNotSaved onstatenotsaved = this.MediaBrowserCompat$ItemReceiver;
            synchronized (onstatenotsaved) {
                onstatenotsaved.read = onstatenotsaved.write.length;
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap) throws IOException {
            IOException iOException = this.write.read;
            if (iOException != null) {
                if (bitmap != null) {
                    checkParameters_MembersInjector.write(bitmap);
                }
                throw iOException;
            }
        }
    }
}
